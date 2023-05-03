package foxhub.expandedtooltips;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public class ExpandedTooltipsDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        var pack = fabricDataGenerator.createPack();
        pack.addProvider(EnglishLangProvider::new);
    }

    private static class EnglishLangProvider extends FabricLanguageProvider {
        private EnglishLangProvider(FabricDataOutput dataOutput) {
            super(dataOutput, "en_us");
        }

        @Override
        public void generateTranslations(TranslationBuilder translationBuilder) {
            // #### Blocks
            // ### Natural
            // ## Soil
            add(translationBuilder, Blocks.CLAY,
                    new String[] {
                            "A wet block of fine-grained natural soil.",
                            "When smelted, it can be used in many building applications."
                    });
            add(translationBuilder, Blocks.DIRT,
                    new String[] {
                            "A block of soil uprooted from the Overworld.",
                            "Despite its weakness as a block, it is very versatile for many natural applications."
                    });
            add(translationBuilder, Blocks.COARSE_DIRT,
                    new String[] {
                            "A block of soil uprooted from the Overworld.",
                            "It is rendered incapable of growing plants due to its coarser complexion."
                    });
            add(translationBuilder, Blocks.ROOTED_DIRT,
                    new String[] {
                            "A block of soil, pierced by Azalea roots.",
                            "Following a trail of this block downward tends to lead to a lush cave."
                    });
            add(translationBuilder, Blocks.DIRT_PATH,
                    new String[] {
                            "A well-worn path made in the dirt.",
                            "Its top has the appearance of dead grass, no matter what material the path was created from."
                    });
            add(translationBuilder, Blocks.GRASS_BLOCK,
                    new String[] {
                            "A block of soil which has sprung life.",
                            "Its color depends on the temperature of the biome."
                    });
            add(translationBuilder, Blocks.GRAVEL,
                    new String[] {
                            "A block made up of many tiny stones.",
                            "It seems to abide by the laws of gravity that govern entities, with a little poking and prodding."
                    });
            add(translationBuilder, Blocks.MUD,
                    new String[] {
                            "A block of wet dirt, rich with minerals.",
                            "It can be found covering the ground in Mangrove Swamps, supporting their unique plant life."
                    });
            add(translationBuilder, Blocks.MYCELIUM,
                    new String[] {
                            "A block of dirt made part of a network of mushrooms.",
                            "It can support the growth of mushrooms even in the brightest of areas."
                    });
            add(translationBuilder, Blocks.CRIMSON_NYLIUM,
                    new String[] {
                            "A block of netherrack made part of a network of Nether fungus.",
                            "Unlike its Overworld counterpart, one can use bone meal on it to spread the fungus."
                    });
            add(translationBuilder, Blocks.WARPED_NYLIUM,
                    new String[] {
                            "A block of netherrack made part of a network of Nether fungus.",
                            "Unlike its Overworld counterpart, one can use bone meal on it to spread the fungus."
                    });
            add(translationBuilder, Blocks.PODZOL,
                    new String[] {
                            "A block of dirt found in dense, wooded areas.",
                            "It holds many organic compounds due to the presence of dead plant matter."
                    });
            add(translationBuilder, Blocks.SAND,
                    new String[] {
                            "A block made up of minuscule minerals, containing trace amounts of quartz.",
                            "It seems to abide by the laws of gravity that govern entities, with a little poking and prodding."
                    });
            add(translationBuilder, Blocks.RED_SAND,
                    new String[] {
                            "A block made up of minuscule minerals, containing trace amounts of iron.",
                            "It seems to abide by the laws of gravity that govern entities, with a little poking and prodding."
                    });
            add(translationBuilder, Blocks.SOUL_SAND,
                    new String[] {
                            "A common sediment in the Nether.",
                            "The faces which can be seen come from the many souls captured inside of it."
                    });
            add(translationBuilder, Blocks.SOUL_SOIL,
                    new String[] {
                            "A less compact form of soul sand, common in the Soul Sand Valley.",
                            "It seems to have been swept up by some sort of wind, as the faces signature of soul sand are stretched out."
                    });
        }

        private void add(TranslationBuilder translationBuilder, Block block, String[] lines) {
            translationBuilder.add(block.getTranslationKey() + ".expanded_tooltips.desc", String.join("\n", lines));
        }
    }
}
