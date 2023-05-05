package com.uraneptus.expanded_tooltips;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.LanguageProvider;

public class ETLanguageProvider extends LanguageProvider {

    public ETLanguageProvider(PackOutput output) {
        super(output, ExpandedTooltips.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // #### Blocks
        // ### Natural
        // ## Soil
        add(Blocks.CLAY, new String[] {
                "A wet block of fine-grained natural soil.",
                "When smelted, it can be used in many building applications."
        });
    }

    private void add(Block block, String[] tooltip) {
        add(block.getDescriptionId() + ".expanded_tooltips.desc", String.join("\n", tooltip));
    }

    private void add(Item item, String[] tooltip) {
        add(item.getDescriptionId() + ".expanded_tooltips.desc", String.join("\n", tooltip));
    }
}
