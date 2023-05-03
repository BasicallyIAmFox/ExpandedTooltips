package foxhub.expandedtooltips.mixin;

import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Environment(EnvType.CLIENT)
@Mixin(ItemStack.class)
public abstract class ItemStackMixin {
    @Shadow
    public abstract String getTranslationKey();

    @ModifyVariable(method = "getTooltip", at = @At(value = "STORE", ordinal = 0), index = 3, print = true)
    private List saveList(List list, @Share("list") LocalRef<List<Text>> listRef) {
        listRef.set(list);
        return list;
    }

    @Inject(method = "getTooltip", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;getHideFlags()I"))
    private void getTooltip(PlayerEntity player, TooltipContext context, CallbackInfoReturnable<List<Text>> cir, @Share("list") LocalRef<List<Text>> listRef) {
        var key = getTranslationKey() + ".expanded_tooltips.desc";
        if (I18n.hasTranslation(key)) {
            var split = I18n.translate(key).split("\\n");
            for (var text : split) {
                listRef.get().add(Text.literal(text));
            }
        }
    }
}