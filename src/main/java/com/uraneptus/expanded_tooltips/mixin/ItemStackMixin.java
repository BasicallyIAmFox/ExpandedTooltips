package com.uraneptus.expanded_tooltips.mixin;

import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@OnlyIn(Dist.CLIENT)
@Mixin(ItemStack.class)
public abstract class ItemStackMixin {
    @Unique
    private static final Style DESCRIPTION_STYLE = Style.EMPTY.withColor(TextColor.fromRgb(14606046)).withItalic(true);

    @Shadow
    public abstract String getDescriptionId();

    @ModifyVariable(method = "getTooltipLines(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/TooltipFlag;)Ljava/util/List;", at = @At(value = "STORE", ordinal = 0), index = 3)
    private List saveList(List list, @Share("list") LocalRef<List<Component>> listRef) {
        listRef.set(list);
        return list;
    }

    @Inject(method = "getTooltipLines(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/TooltipFlag;)Ljava/util/List;", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;getHideFlags()I"))
    private void getTooltip(Player player, TooltipFlag context, CallbackInfoReturnable<List<Component>> cir, @Share("list") LocalRef<List<Component>> listRef) {
        var key = getDescriptionId() + ".expanded_tooltips.desc";
        if (I18n.exists(key)) {
            var split = I18n.get(key).split("\\n");
            for (var text : split) {
                listRef.get().add(Component.literal(text).withStyle(DESCRIPTION_STYLE));
            }
        }
    }
}
