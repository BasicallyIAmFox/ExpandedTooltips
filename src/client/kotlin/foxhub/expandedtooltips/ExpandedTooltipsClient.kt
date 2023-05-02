package foxhub.expandedtooltips

import com.llamalad7.mixinextras.MixinExtrasBootstrap
import net.fabricmc.api.ClientModInitializer
import org.objectweb.asm.tree.ClassNode
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin
import org.spongepowered.asm.mixin.extensibility.IMixinInfo

class ExpandedTooltipsClient : ClientModInitializer {
    override fun onInitializeClient() {
        MixinExtrasBootstrap.init()
    }
}