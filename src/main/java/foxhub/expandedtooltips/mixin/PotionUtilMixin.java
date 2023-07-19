package foxhub.expandedtooltips.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtil;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Environment(EnvType.CLIENT)
@Mixin(PotionUtil.class)
public abstract class PotionUtilMixin {
    @Inject(method = "buildTooltip(Lnet/minecraft/item/ItemStack;Ljava/util/List;F)V", at = @At("HEAD"))
    private static void expanded_tooltips$buildTooltip(ItemStack stack, List<Text> list, float durationMultiplier, CallbackInfo ci) {
    }
}
