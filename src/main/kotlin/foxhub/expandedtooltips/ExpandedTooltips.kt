package foxhub.expandedtooltips

import com.llamalad7.mixinextras.MixinExtrasBootstrap
import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object ExpandedTooltips : ModInitializer {
    //private val logger = LoggerFactory.getLogger("expanded_tooltips")

    override fun onInitialize() {
        MixinExtrasBootstrap.init()
    }
}