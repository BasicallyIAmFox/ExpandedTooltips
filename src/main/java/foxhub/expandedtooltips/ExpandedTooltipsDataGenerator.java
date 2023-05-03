package foxhub.expandedtooltips;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
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
            var nyliumFlavorText = new String[] {
                    "A block of netherrack made part of a network of Nether fungus.",
                    "Unlike its Overworld counterpart, one can use bone meal on it to spread the fungus."
            };
            add(translationBuilder, Blocks.CRIMSON_NYLIUM, nyliumFlavorText);
            add(translationBuilder, Blocks.WARPED_NYLIUM, nyliumFlavorText);
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
            // ## Stone
            add(translationBuilder, Blocks.ANDESITE,
                    new String[] {
                            "An igneous rock found in the Overworld.",
                            "Its palette seems to blend in with regular stone, so don’t get fooled if looking for crafting materials."
                    });
            add(translationBuilder, Blocks.BEDROCK,
                    new String[] {
                            "A strong rock found at the bottom of the world.",
                            "It is rendered impossible to break due to the immense pressure compacting it nigh-infinitely, so mining it would be a fool’s errand."
                    });
            add(translationBuilder, Blocks.BASALT,
                    new String[] {
                            "A volcanic rock found in the Nether.",
                            "It tends to form large pillars, which can come together to create Basalt Deltas."
                    });
            add(translationBuilder, Blocks.SMOOTH_BASALT,
                    new String[] {
                            "A volcanic rock that surrounds amethyst geodes.",
                            "It holds relation to the basalt formations found in the Nether."
                    });
            add(translationBuilder, Blocks.BLACKSTONE,
                    new String[] {
                            "A charred type of black stone found in the Nether.",
                            "It is most commonly found in Basalt Deltas, but the denizens of the Nether seem to have found a way to extract it en masse."
                    });
            add(translationBuilder, Blocks.GILDED_BLACKSTONE,
                    new String[] {
                            "A block of Blackstone with veins of gold forged into it.",
                            "The Piglins seem to have created it simply for the purpose of vanity, like much of their crude society."
                    });
            add(translationBuilder, Blocks.CALCITE,
                    new String[] {
                            "A carbonate rock that surrounds amethyst geodes.",
                            "It is very brittle, making it near-impossible to craft into new building blocks."
                    });
            add(translationBuilder, Blocks.COBBLESTONE,
                    new String[] {
                            "A building material made of large rocks.",
                            "It has a very wide array of uses, making it a requirement for virtually anybody making their way in the world."
                    });
            add(translationBuilder, Blocks.MOSSY_COBBLESTONE,
                    new String[] {
                            "A block of cobblestone, covered in moss.",
                            "The moss does not seem to get as many nutrients from the stone, so it has a more subdued appearance."
                    });
            add(translationBuilder, Blocks.DEEPSLATE,
                    new String[] {
                            "A hard form of stone found in the deepest caverns of the Overworld.",
                            "Many rare materials can be found embedded in it, if one is so lucky."
                    });
            add(translationBuilder, Blocks.DIORITE,
                    new String[] {
                            "An igneous rock found in the Overworld.",
                            "It can be crafted with stone and quartz in a pinch, but it is so abundant that this is simply a waste of materials under normal circumstances."
                    });
            add(translationBuilder, Blocks.DRIPSTONE_BLOCK,
                    new String[] {
                            "A strange rock, formed over unknowable amounts of time in the Dripstone Caves.",
                            "Despite this, it is incredibly brittle, and so it cannot be used to craft more advanced building blocks."
                    });
            add(translationBuilder, Blocks.END_STONE,
                    new String[] {
                            "A strange type of rock found in the End.",
                            "It has the capability of harboring many twisted forms of life native to the dimension."
                    });
            add(translationBuilder, Blocks.GLOWSTONE,
                    new String[] {
                            "A glowing crystal found growing on the ceiling of the Nether.",
                            "It holds many magical properties, including the potential to strengthen a potion."
                    });
            add(translationBuilder, Blocks.GRANITE,
                    new String[] {
                            "An igneous rock found in the Overworld.",
                            "It can be used by miners as a signal for a large copper vein."
                    });
            var infectedText = new String[] {
                "A block of stone infested by a Silverfish.",
                "Mining typically makes the Silverfish break out, however it seems this sample was harvested in a different way."
            };
            add(translationBuilder, Blocks.INFESTED_COBBLESTONE, infectedText);
            add(translationBuilder, Blocks.INFESTED_DEEPSLATE, infectedText);
            add(translationBuilder, Blocks.INFESTED_STONE, infectedText);
            add(translationBuilder, Blocks.INFESTED_CHISELED_STONE_BRICKS, infectedText);
            add(translationBuilder, Blocks.INFESTED_CRACKED_STONE_BRICKS, infectedText);
            add(translationBuilder, Blocks.INFESTED_MOSSY_STONE_BRICKS, infectedText);
            add(translationBuilder, Blocks.INFESTED_STONE_BRICKS, infectedText);
            add(translationBuilder, Blocks.MAGMA_BLOCK,
                    new String[] {
                        "Molten rock found ubiquitously throughout the Nether.",
                        "It is also found in deep aquifers and underwater areas, though less common."
                    });
            add(translationBuilder, Blocks.NETHERRACK,
                    new String[] {
                            "A flesh-like rock making up the majority of the Nether.",
                            "It can be smelted to make a unique type of brick."
                    });
            add(translationBuilder, Blocks.OBSIDIAN,
                    new String[] {
                            "A very tough glass with otherworldly potential.",
                            "Formed when water flows into lava.",
                            "Lighting a frame with it allows for passage into another dimension."
                    });
            add(translationBuilder, Blocks.CRYING_OBSIDIAN,
                    new String[] {
                            "A cracked block of obsidian, overflowing with dimensional energy.",
                            "It appears to be quite unstable compared to its normal counterpart.",
                    });
            add(translationBuilder, Blocks.POINTED_DRIPSTONE,
                    new String[] {
                            "A sharp form of dripstone, dealing damage to those unlucky enough to fall on it, or worse, get struck on the head.",
                            "A good hit from a trident can dislodge a stalactite from the ceiling.",
                    });
            add(translationBuilder, Blocks.SANDSTONE,
                    new String[] {
                            "A sedimentary rock commonly found below sand.",
                            "Makes for a good path block, in lieu of dirt.",
                    });
            add(translationBuilder, Blocks.RED_SANDSTONE,
                    new String[] {
                            "A sedimentary rock commonly found below red sand.",
                            "Trace amounts of iron give it a more reddish appearance.",
                    });
            add(translationBuilder, Blocks.STONE,
                    new String[] {
                            "A very versatile material, making up the majority of the Overworld’s upper layers."
                    });
            add(translationBuilder, Blocks.TERRACOTTA,
                    new String[] {
                            "A hardened block of clay.",
                            "It can be found in Badlands biomes, making beautiful multi-colored stripes.",
                    });
            add(translationBuilder, Blocks.TUFF,
                    new String[] {
                            "An ornamental rock formed from volcanic ash.",
                            "It is found most commonly in the Deepslate layer, and can signal the presence of a large iron vein.",
                    });
            // ## Mineral
            add(translationBuilder, Blocks.AMETHYST_CLUSTER,
                    new String[] {
                            "A crystal found growing in amethyst geodes.",
                            "It makes a satisfying ringing noise when mined.",
                    });
            add(translationBuilder, Blocks.ANCIENT_DEBRIS,
                    new String[] {
                            "Remains of an unknown metal found buried deep in the Nether.",
                            "The dimension’s inhabitants seem to have abandoned it for the more common gold.",
                    });
            add(translationBuilder, Blocks.BUDDING_AMETHYST,
                    new String[] {
                            "A crystal block, which amethyst clusters grow from.",
                            "Shatters under even the most delicate touch, rendering it unobtainable through normal means.",
                    });
            add(translationBuilder, Blocks.COAL_ORE,
                    new String[] {
                            "A block of stone, with chunks of Coal inside.",
                            "It is most common throughout the surface of the Overworld.",
                    });
            add(translationBuilder, Blocks.COPPER_ORE,
                    new String[] {
                            "A block of stone, with chunks of Copper inside.",
                            "It is most common in higher-level caves, especially in Dripstone Caves.",
                    });
            add(translationBuilder, Blocks.DIAMOND_ORE,
                    new String[] {
                            "A block of stone, with chunks of Diamond inside.",
                            "It is most common in the Deepslate layer, so finding it in normal stone is a rarity.",
                            "It tends to appear less in blocks exposed to air."
                    });
            add(translationBuilder, Blocks.EMERALD_ORE,
                    new String[] {
                            "A block of stone, with chunks of Emerald inside.",
                            "It is most common in high mountains, so finding it in a block of deepslate is a rarity."
                    });
            add(translationBuilder, Blocks.GOLD_ORE,
                    new String[] {
                            "A block of stone, with chunks of Gold inside.",
                            "It is most common in Badlands, outside of which it tends to be found lower down."
                    });
            add(translationBuilder, Blocks.NETHER_GOLD_ORE,
                    new String[] {
                            "A block of netherrack, with small chunks of Gold inside.",
                            "It can be found all throughout the Nether."
                    });
            add(translationBuilder, Blocks.IRON_ORE,
                    new String[] {
                            "A block of stone, with chunks of Iron inside.",
                            "It is most common in mountains and higher caves, but large veins can be found in the deepslate layer."
                    });
            add(translationBuilder, Blocks.LAPIS_ORE,
                    new String[] {
                            "A block of stone, with chunks of Lapis Lazuli inside.",
                            "It is rare, spread throughout every layer of the Overworld."
                    });
            add(translationBuilder, Blocks.NETHER_QUARTZ_ORE,
                    new String[] {
                            "A block of netherrack, with chunks of Quartz inside.",
                            "It can be found all throughout the Nether."
                    });
            add(translationBuilder, Blocks.REDSTONE_ORE,
                    new String[] {
                            "A block of stone, with chunks of Redstone inside.",
                            "It is most common in the deepslate layer, getting even more common as depth increases."
                    });
            // ## Liquid
            add(translationBuilder, Blocks.ICE,
                    new String[] {
                            "Water in its solid, frozen form."
                    });
            add(translationBuilder, Blocks.BLUE_ICE,
                    new String[] {
                            "Compressed, slippery ice found underwater in icebergs."
                    });
            add(translationBuilder, Blocks.PACKED_ICE,
                    new String[] {
                            "Compressed ice found in glaciers and icebergs."
                    });
            add(translationBuilder, Blocks.LAVA,
                    new String[] {
                            "Superheated rock in liquid form."
                    });
            add(translationBuilder, Blocks.POWDER_SNOW,
                    new String[] {
                            "A light fluffy snow.",
                            "Don't fall in!"
                    });
            add(translationBuilder, Blocks.SNOW,
                    new String[] {
                            "The top layers of snow on the ground."
                    });
            add(translationBuilder, Blocks.SNOW_BLOCK,
                    new String[] {
                            "A thick layer of snow found in cold biomes."
                    });
            add(translationBuilder, Blocks.WATER,
                    new String[] {
                            "A common liquid found in the Overworld.",
                            "Evaporates in the Nether."
                    });
            // ## Non-Physical
            /*
            add(translationBuilder, Blocks.AIR,
                    new String[] {
                            "A gas found everywhere in the Overworld, Nether and The End."
                    });
            */
            add(translationBuilder, Blocks.FIRE,
                    new String[] {
                            "A very hot substance.",
                            "It burns!"
                    });
            add(translationBuilder, Blocks.LIGHT,
                    new String[] {
                            "A very hot substance.",
                            "It burns!"
                    });
            add(translationBuilder, Blocks.SOUL_FIRE,
                    new String[] {
                            "A very hot substance created when burning souls."
                    });
            add(translationBuilder, Blocks.STRUCTURE_VOID,
                    new String[] {
                            "A mysterious block that has not been found to have any use."
                    });
            // ### Biota
            // ## Wood/Hyphae
            var overworldLogFlavorText = new String[] {
                    "The log of a tree found in the Overworld."
            };
            add(translationBuilder, Blocks.OAK_LOG, overworldLogFlavorText);
            add(translationBuilder, Blocks.SPRUCE_LOG, overworldLogFlavorText);
            add(translationBuilder, Blocks.BIRCH_LOG, overworldLogFlavorText);
            add(translationBuilder, Blocks.JUNGLE_LOG, overworldLogFlavorText);
            add(translationBuilder, Blocks.ACACIA_LOG, overworldLogFlavorText);
            add(translationBuilder, Blocks.DARK_OAK_LOG, overworldLogFlavorText);
            add(translationBuilder, Blocks.MANGROVE_LOG, overworldLogFlavorText);
            add(translationBuilder, Blocks.CHERRY_LOG, overworldLogFlavorText);
            overworldLogFlavorText[0] = "Overworld log removed of its bark.";
            add(translationBuilder, Blocks.STRIPPED_OAK_LOG, overworldLogFlavorText);
            add(translationBuilder, Blocks.STRIPPED_SPRUCE_LOG, overworldLogFlavorText);
            add(translationBuilder, Blocks.STRIPPED_BIRCH_LOG, overworldLogFlavorText);
            add(translationBuilder, Blocks.STRIPPED_JUNGLE_LOG, overworldLogFlavorText);
            add(translationBuilder, Blocks.STRIPPED_ACACIA_LOG, overworldLogFlavorText);
            add(translationBuilder, Blocks.STRIPPED_DARK_OAK_LOG, overworldLogFlavorText);
            add(translationBuilder, Blocks.STRIPPED_MANGROVE_LOG, overworldLogFlavorText);
            add(translationBuilder, Blocks.STRIPPED_CHERRY_LOG, overworldLogFlavorText);
            overworldLogFlavorText[0] = "An Overworld log with all sides covered in bark.";
            add(translationBuilder, Blocks.OAK_WOOD, overworldLogFlavorText);
            add(translationBuilder, Blocks.SPRUCE_WOOD, overworldLogFlavorText);
            add(translationBuilder, Blocks.BIRCH_WOOD, overworldLogFlavorText);
            add(translationBuilder, Blocks.JUNGLE_WOOD, overworldLogFlavorText);
            add(translationBuilder, Blocks.ACACIA_WOOD, overworldLogFlavorText);
            add(translationBuilder, Blocks.DARK_OAK_WOOD, overworldLogFlavorText);
            add(translationBuilder, Blocks.MANGROVE_WOOD, overworldLogFlavorText);
            add(translationBuilder, Blocks.CHERRY_WOOD, overworldLogFlavorText);
            overworldLogFlavorText[0] = "Overworld wood removed of its bark.";
            add(translationBuilder, Blocks.STRIPPED_OAK_WOOD, overworldLogFlavorText);
            add(translationBuilder, Blocks.STRIPPED_SPRUCE_WOOD, overworldLogFlavorText);
            add(translationBuilder, Blocks.STRIPPED_BIRCH_WOOD, overworldLogFlavorText);
            add(translationBuilder, Blocks.STRIPPED_JUNGLE_WOOD, overworldLogFlavorText);
            add(translationBuilder, Blocks.STRIPPED_ACACIA_WOOD, overworldLogFlavorText);
            add(translationBuilder, Blocks.STRIPPED_DARK_OAK_WOOD, overworldLogFlavorText);
            add(translationBuilder, Blocks.STRIPPED_MANGROVE_WOOD, overworldLogFlavorText);
            add(translationBuilder, Blocks.STRIPPED_CHERRY_WOOD, overworldLogFlavorText);
            add(translationBuilder, Blocks.MANGROVE_ROOTS,
                    new String[] {
                            "Large above ground roots from Mangrove Trees."
                    });
            add(translationBuilder, Blocks.MUDDY_MANGROVE_ROOTS,
                    new String[] {
                            "Mangrove Roots filled with Mud."
                    });
            var hyphaeLogFlavorText = new String[] {
                    "The stem of a huge fungus found in the Nether."
            };
            add(translationBuilder, Blocks.CRIMSON_STEM, hyphaeLogFlavorText);
            add(translationBuilder, Blocks.WARPED_STEM, hyphaeLogFlavorText);
            hyphaeLogFlavorText[0] = "Nether stem removed of its outer layer.";
            add(translationBuilder, Blocks.STRIPPED_CRIMSON_STEM, hyphaeLogFlavorText);
            add(translationBuilder, Blocks.STRIPPED_WARPED_STEM, hyphaeLogFlavorText);
            hyphaeLogFlavorText[0] = "A Nether stem with an outer layer on all sides.";
            add(translationBuilder, Blocks.CRIMSON_HYPHAE, hyphaeLogFlavorText);
            add(translationBuilder, Blocks.WARPED_HYPHAE, hyphaeLogFlavorText);
            hyphaeLogFlavorText[0] = "Nether hyphae removed of its outer layer.";
            add(translationBuilder, Blocks.STRIPPED_CRIMSON_HYPHAE, hyphaeLogFlavorText);
            add(translationBuilder, Blocks.STRIPPED_WARPED_HYPHAE, hyphaeLogFlavorText);
            // ## Plant
            add(translationBuilder, Blocks.AZALEA,
                    new String[] {
                            "A bush that grows in the Lush Caves biome."
                    });
            add(translationBuilder, Blocks.FLOWERING_AZALEA,
                    new String[] {
                            "Azalea but with flowers."
                    });
            add(translationBuilder, Blocks.BAMBOO,
                    new String[] {
                            "A tall & sturdy plant found in the Jungle biome."
                    });
            var dripleavesFlavorText = new String[] {
                    "A strange plant found in the Lush Caves.",
                    "It thrives in moist environments."
            };
            add(translationBuilder, Blocks.SMALL_DRIPLEAF, dripleavesFlavorText);
            add(translationBuilder, Blocks.BIG_DRIPLEAF, dripleavesFlavorText);
            add(translationBuilder, Blocks.CACTUS,
                    new String[] {
                            "Prickly on the outside, wet on the inside."
                    });
            add(translationBuilder, Blocks.CAVE_VINES,
                    new String[] {
                            "Glow Berry vines that grow on the ceilings of Lush Caves."
                    });
            add(translationBuilder, Items.COCOA_BEANS,
                    new String[] {
                            "A bean found on the side of Jungle trees, used to make chocolate."
                    });
            add(translationBuilder, Blocks.CHORUS_PLANT,
                    new String[] {
                            "The main stalk of tIslands. Commonly found in the Outer End islands."
                    });
            add(translationBuilder, Blocks.CHORUS_FLOWER,
                    new String[] {
                            "A flowering Chorus Plant that can be used to grow a new Chorus Plant."
                    });
            add(translationBuilder, Blocks.DEAD_BUSH,
                    new String[] {
                            "A dried-out shrub found in some biomes."
                    });
            var plantFlavorText = new String[] {
                    "A flowerless plant found in Taiga biomes."
            };
            add(translationBuilder, Blocks.FERN, plantFlavorText);
            add(translationBuilder, Blocks.LARGE_FERN, plantFlavorText);
            plantFlavorText[0] = "A flower found in the Overworld.";
            add(translationBuilder, Blocks.POPPY, plantFlavorText);
            add(translationBuilder, Blocks.DANDELION, plantFlavorText);
            add(translationBuilder, Blocks.BLUE_ORCHID, plantFlavorText);
            add(translationBuilder, Blocks.ALLIUM, plantFlavorText);
            add(translationBuilder, Blocks.AZURE_BLUET, plantFlavorText);
            add(translationBuilder, Blocks.OXEYE_DAISY, plantFlavorText);
            add(translationBuilder, Blocks.ORANGE_TULIP, plantFlavorText);
            add(translationBuilder, Blocks.PINK_TULIP, plantFlavorText);
            add(translationBuilder, Blocks.RED_TULIP, plantFlavorText);
            add(translationBuilder, Blocks.WHITE_TULIP, plantFlavorText);
            add(translationBuilder, Blocks.CORNFLOWER, plantFlavorText);
            add(translationBuilder, Blocks.LILY_OF_THE_VALLEY, plantFlavorText);
            add(translationBuilder, Blocks.WITHER_ROSE,
                    new String[] {
                            "A flower created when a soul is harvested by The Wither."
                    });
            plantFlavorText[0] = "A small plant found all over the Overworld.";
            add(translationBuilder, Blocks.GRASS, plantFlavorText);
            add(translationBuilder, Blocks.TALL_GRASS, plantFlavorText);
            add(translationBuilder, Blocks.HANGING_ROOTS,
                    new String[] {
                            "The roots of Azalea trees hanging down from blocks."
                    });
            plantFlavorText[0] = "Leaves from a tree found in the Overworld.";
            add(translationBuilder, Blocks.OAK_LEAVES, plantFlavorText);
            add(translationBuilder, Blocks.SPRUCE_LEAVES, plantFlavorText);
            add(translationBuilder, Blocks.BIRCH_LEAVES, plantFlavorText);
            add(translationBuilder, Blocks.JUNGLE_LEAVES, plantFlavorText);
            add(translationBuilder, Blocks.ACACIA_LEAVES, plantFlavorText);
            add(translationBuilder, Blocks.DARK_OAK_LEAVES, plantFlavorText);
            add(translationBuilder, Blocks.MANGROVE_LEAVES, plantFlavorText);
            add(translationBuilder, Blocks.CHERRY_LEAVES, plantFlavorText);
            add(translationBuilder, Blocks.LILY_PAD,
                    new String[] {
                            "Floating plants found in Overworld swamps."
                    });
            add(translationBuilder, Blocks.MELON,
                    new String[] {
                            "A large fruit found in the Jungle biome."
                    });
            plantFlavorText[0] = "A plant that grows in some places in the Overworld.";
            add(translationBuilder, Blocks.MOSS_BLOCK, plantFlavorText);
            add(translationBuilder, Blocks.MOSS_CARPET, plantFlavorText);
            add(translationBuilder, Blocks.PUMPKIN,
                    new String[] {
                            "Large orange gourds often used in Golem creation."
                    });
            add(translationBuilder, Blocks.CARVED_PUMPKIN,
                    new String[] {
                            "A Pumpkin carved with a spooky face."
                    });
            plantFlavorText[0] = "The sapling of a tree found in the Overworld.";
            add(translationBuilder, Blocks.OAK_SAPLING, plantFlavorText);
            add(translationBuilder, Blocks.SPRUCE_SAPLING, plantFlavorText);
            add(translationBuilder, Blocks.BIRCH_SAPLING, plantFlavorText);
            add(translationBuilder, Blocks.JUNGLE_SAPLING, plantFlavorText);
            add(translationBuilder, Blocks.ACACIA_SAPLING, plantFlavorText);
            add(translationBuilder, Blocks.DARK_OAK_SAPLING, plantFlavorText);
            add(translationBuilder, Blocks.MANGROVE_PROPAGULE, plantFlavorText);
            add(translationBuilder, Blocks.CHERRY_SAPLING, plantFlavorText);
            plantFlavorText[0] = "A small plant found under the Overworld’s oceans and rivers.";
            add(translationBuilder, Blocks.SEAGRASS, plantFlavorText);
            add(translationBuilder, Blocks.TALL_SEAGRASS, plantFlavorText);
            add(translationBuilder, Blocks.SPORE_BLOSSOM,
                    new String[] {
                            "Large pink flowers found hanging from the ceilings of Lush caves."
                    });
            add(translationBuilder, Items.SUGAR_CANE,
                    new String[] {
                            "A reed found near water that can be crushed into sugar."
                    });
            add(translationBuilder, Items.SWEET_BERRIES,
                    new String[] {
                            "A prickly bush of small red berries found in Taiga biomes."
                    });
            add(translationBuilder, Items.VINE,
                    new String[] {
                            "A plant that grows on the sides of other blocks."
                    });
            add(translationBuilder, Blocks.HAY_BLOCK,
                    new String[] {
                            "A bundled block of nine bunches of wheat."
                    });
            // ## Fungus
            plantFlavorText[0] = "A fungus that grows in Nether forests.";
            add(translationBuilder, Blocks.CRIMSON_FUNGUS, plantFlavorText);
            add(translationBuilder, Blocks.WARPED_FUNGUS, plantFlavorText);
            add(translationBuilder, Blocks.GLOW_LICHEN,
                    new String[] {
                            "A glowing fungus that is found in the Overworld‘s caves."
                    });
            plantFlavorText[0] = "A small fungus found in the Overworld and Nether.";
            add(translationBuilder, Blocks.RED_MUSHROOM, plantFlavorText);
            add(translationBuilder, Blocks.BROWN_MUSHROOM, plantFlavorText);
            plantFlavorText[0] = "The cap of a huge mushroom, found in some Overworld biomes.";
            add(translationBuilder, Blocks.RED_MUSHROOM_BLOCK, plantFlavorText);
            add(translationBuilder, Blocks.BROWN_MUSHROOM_BLOCK, plantFlavorText);
            add(translationBuilder, Blocks.MUSHROOM_STEM,
                    new String[] {
                            "The stem of a huge mushroom from the Overworld."
                    });
            add(translationBuilder, Blocks.NETHER_SPROUTS,
                    new String[] {
                            "Small fungus found in the Warped Forest biome."
                    });
            add(translationBuilder, Items.NETHER_WART,
                    new String[] {
                            "A fungus sprout found in the Nether."
                    });
            plantFlavorText[0] = "A compact block of Nether Wart.";
            add(translationBuilder, Blocks.NETHER_WART_BLOCK, plantFlavorText);
            add(translationBuilder, Blocks.WARPED_WART_BLOCK, plantFlavorText);
            add(translationBuilder, Blocks.CRIMSON_ROOTS,
                    new String[] {
                            "Small roots found in Nether forests."
                    });
            add(translationBuilder, Items.SHROOMLIGHT,
                    new String[] {
                            "A glowing mushroom found on huge fungi in the Nether."
                    });
            add(translationBuilder, Items.TWISTING_VINES,
                    new String[] {
                            "Tall stalks found growing upwards, commonly in the Nether’s Warped Forests."
                    });
            add(translationBuilder, Items.WEEPING_VINES,
                    new String[] {
                            "Vine growing from the ceiling, commonly found in the Nether’s Crimson Forest."
                    });
            // ## Fauna
            plantFlavorText[0] = "An underwater creature found in reefs.";
            add(translationBuilder, Blocks.TUBE_CORAL, plantFlavorText);
            add(translationBuilder, Blocks.BRAIN_CORAL, plantFlavorText);
            add(translationBuilder, Blocks.BUBBLE_CORAL, plantFlavorText);
            add(translationBuilder, Blocks.FIRE_CORAL, plantFlavorText);
            add(translationBuilder, Blocks.HORN_CORAL, plantFlavorText);
            plantFlavorText[0] = "Dried-out coral created when there isn’t enough water.";
            add(translationBuilder, Blocks.DEAD_TUBE_CORAL, plantFlavorText);
            add(translationBuilder, Blocks.DEAD_BRAIN_CORAL, plantFlavorText);
            add(translationBuilder, Blocks.DEAD_BUBBLE_CORAL, plantFlavorText);
            add(translationBuilder, Blocks.DEAD_FIRE_CORAL, plantFlavorText);
            add(translationBuilder, Blocks.DEAD_HORN_CORAL, plantFlavorText);
            plantFlavorText[0] = "A block-like underwater creature.";
            add(translationBuilder, Blocks.TUBE_CORAL_BLOCK, plantFlavorText);
            add(translationBuilder, Blocks.BRAIN_CORAL_BLOCK, plantFlavorText);
            add(translationBuilder, Blocks.BUBBLE_CORAL_BLOCK, plantFlavorText);
            add(translationBuilder, Blocks.FIRE_CORAL_BLOCK, plantFlavorText);
            add(translationBuilder, Blocks.HORN_CORAL_BLOCK, plantFlavorText);
            plantFlavorText[0] = "A coral block without enough water.";
            add(translationBuilder, Blocks.DEAD_TUBE_CORAL_BLOCK, plantFlavorText);
            add(translationBuilder, Blocks.DEAD_BRAIN_CORAL_BLOCK, plantFlavorText);
            add(translationBuilder, Blocks.DEAD_BUBBLE_CORAL_BLOCK, plantFlavorText);
            add(translationBuilder, Blocks.DEAD_FIRE_CORAL_BLOCK, plantFlavorText);
            add(translationBuilder, Blocks.DEAD_HORN_CORAL_BLOCK, plantFlavorText);
            plantFlavorText[0] = "A small piece of coral.";
            add(translationBuilder, Items.TUBE_CORAL_FAN, plantFlavorText);
            add(translationBuilder, Items.BRAIN_CORAL_FAN, plantFlavorText);
            add(translationBuilder, Items.BUBBLE_CORAL_FAN, plantFlavorText);
            add(translationBuilder, Items.FIRE_CORAL_FAN, plantFlavorText);
            add(translationBuilder, Items.HORN_CORAL_FAN, plantFlavorText);
            plantFlavorText[0] = "A coral fan without enough water.";
            add(translationBuilder, Items.DEAD_TUBE_CORAL_FAN, plantFlavorText);
            add(translationBuilder, Items.DEAD_BRAIN_CORAL_FAN, plantFlavorText);
            add(translationBuilder, Items.DEAD_BUBBLE_CORAL_FAN, plantFlavorText);
            add(translationBuilder, Items.DEAD_FIRE_CORAL_FAN, plantFlavorText);
            add(translationBuilder, Items.DEAD_HORN_CORAL_FAN, plantFlavorText);
            add(translationBuilder, Blocks.SEA_PICKLE,
                    new String[] {
                            "A glowing, marine creature found on the seafloor."
                    });
            add(translationBuilder, Blocks.SPONGE,
                    new String[] {
                            "A porous block able to soak up water.",
                            "Due to their rarity, this may be the true treasure that the Elder Guardians were hiding."
                    });
            add(translationBuilder, Blocks.WET_SPONGE,
                    new String[] {
                            "A sponge made useless by absorbed water.",
                            "It can be dried out via exposure to hot environments, allowing the moisture to be collected in a bucket."
                    });
            // ## Fauna Product
            add(translationBuilder, Blocks.BEE_NEST,
                    new String[] {
                            "A hive found on the side of trees that holds up to three bees."
                    });
            add(translationBuilder, Blocks.BONE_BLOCK,
                    new String[] {
                            "A solid block of bone found in fossils in multiple dimensions."
                    });
            add(translationBuilder, Blocks.COBWEB,
                    new String[] {
                            "A strong web created by the Overworld’s Spiders and Cave Spiders."
                    });
            add(translationBuilder, Blocks.DRAGON_EGG,
                    new String[] {
                            "The one and only egg of the Ender Dragon.",
                            "Obtained after defeating it."
                    });
            add(translationBuilder, Blocks.FROGSPAWN,
                    new String[] {
                            "The eggs of a Frog, laid on top of water."
                    });
            plantFlavorText[0] = "A strange, colorful glowing block that is created when a Frog eats a small Magma Cube.";
            add(translationBuilder, Blocks.OCHRE_FROGLIGHT, plantFlavorText);
            add(translationBuilder, Blocks.VERDANT_FROGLIGHT, plantFlavorText);
            add(translationBuilder, Blocks.PEARLESCENT_FROGLIGHT, plantFlavorText);
            add(translationBuilder, Blocks.HONEY_BLOCK,
                    new String[] {
                            "A solid block of honey.",
                            "It's sticky!"
                    });
            add(translationBuilder, Blocks.SLIME_BLOCK,
                    new String[] {
                            "A block of slime that can be used to stick other blocks together."
                    });
            add(translationBuilder, Blocks.TURTLE_EGG,
                    new String[] {
                            "The eggs of a Turtle, found on beaches."
                    });
            plantFlavorText[0] = "The head of a hostile creature found in the Overworld.";
            add(translationBuilder, Blocks.ZOMBIE_HEAD, plantFlavorText);
            add(translationBuilder, Blocks.SKELETON_SKULL, plantFlavorText);
            add(translationBuilder, Blocks.CREEPER_HEAD, plantFlavorText);
            add(translationBuilder, Blocks.PIGLIN_HEAD, plantFlavorText);
            add(translationBuilder, Blocks.WITHER_SKELETON_SKULL,
                    new String[] {
                            "The skull of a Wither Skeleton, used to summon the Wither."
                    });
            add(translationBuilder, Blocks.DRAGON_HEAD,
                    new String[] {
                            "A replica of an Ender Dragon’s head."
                    });
            add(translationBuilder, Blocks.PLAYER_HEAD,
                    new String[] {
                            "A human head.",
                            "We’re not sure how it got here."
                    });
            // ## Algae
            add(translationBuilder, Blocks.KELP,
                    new String[] {
                            "An algae found growing in many ocean biomes."
                    });
            add(translationBuilder, Blocks.DRIED_KELP_BLOCK,
                    new String[] {
                            "A block of compacted dried kelp."
                    });
            // ### Building
            // ## Decorative
            var carpetFlavorText = new String[] {
                    "A thin layer of wool used for decoration."
            };
            add(translationBuilder, Blocks.WHITE_CARPET, carpetFlavorText);
            add(translationBuilder, Blocks.ORANGE_CARPET, carpetFlavorText);
            add(translationBuilder, Blocks.MAGENTA_CARPET, carpetFlavorText);
            add(translationBuilder, Blocks.LIGHT_BLUE_CARPET, carpetFlavorText);
            add(translationBuilder, Blocks.YELLOW_CARPET, carpetFlavorText);
            add(translationBuilder, Blocks.LIME_CARPET, carpetFlavorText);
            add(translationBuilder, Blocks.PINK_CARPET, carpetFlavorText);
            add(translationBuilder, Blocks.GRAY_CARPET, carpetFlavorText);
            add(translationBuilder, Blocks.LIGHT_GRAY_CARPET, carpetFlavorText);
            add(translationBuilder, Blocks.CYAN_CARPET, carpetFlavorText);
            add(translationBuilder, Blocks.PURPLE_CARPET, carpetFlavorText);
            add(translationBuilder, Blocks.BLUE_CARPET, carpetFlavorText);
            add(translationBuilder, Blocks.BROWN_CARPET, carpetFlavorText);
            add(translationBuilder, Blocks.GREEN_CARPET, carpetFlavorText);
            add(translationBuilder, Blocks.RED_CARPET, carpetFlavorText);
            add(translationBuilder, Blocks.BLACK_CARPET, carpetFlavorText);
            add(translationBuilder, Blocks.CHAIN,
                    new String[] {
                            "Links of iron, usually used to hang things."
                    });
            add(translationBuilder, Blocks.IRON_BARS,
                    new String[] {
                            "Metal bars, used as windows or fences."
                    });
            add(translationBuilder, Blocks.GLASS,
                    new String[] {
                            "A transparent block smelted from sand."
                    });
            add(translationBuilder, Blocks.GLASS_PANE,
                    new String[] {
                            "A thin layer of glass."
                    });
            carpetFlavorText[0] = "Colorful dyed glass block.";
            add(translationBuilder, Blocks.WHITE_STAINED_GLASS, carpetFlavorText);
            add(translationBuilder, Blocks.ORANGE_STAINED_GLASS, carpetFlavorText);
            add(translationBuilder, Blocks.MAGENTA_STAINED_GLASS, carpetFlavorText);
            add(translationBuilder, Blocks.LIGHT_BLUE_STAINED_GLASS, carpetFlavorText);
            add(translationBuilder, Blocks.YELLOW_STAINED_GLASS, carpetFlavorText);
            add(translationBuilder, Blocks.LIME_STAINED_GLASS, carpetFlavorText);
            add(translationBuilder, Blocks.PINK_STAINED_GLASS, carpetFlavorText);
            add(translationBuilder, Blocks.GRAY_STAINED_GLASS, carpetFlavorText);
            add(translationBuilder, Blocks.LIGHT_GRAY_STAINED_GLASS, carpetFlavorText);
            add(translationBuilder, Blocks.CYAN_STAINED_GLASS, carpetFlavorText);
            add(translationBuilder, Blocks.PURPLE_STAINED_GLASS, carpetFlavorText);
            add(translationBuilder, Blocks.BLUE_STAINED_GLASS, carpetFlavorText);
            add(translationBuilder, Blocks.BROWN_STAINED_GLASS, carpetFlavorText);
            add(translationBuilder, Blocks.GREEN_STAINED_GLASS, carpetFlavorText);
            add(translationBuilder, Blocks.RED_STAINED_GLASS, carpetFlavorText);
            add(translationBuilder, Blocks.BLACK_STAINED_GLASS, carpetFlavorText);
            carpetFlavorText[0] = "Colorful dyed glass pane.";
            add(translationBuilder, Blocks.WHITE_STAINED_GLASS_PANE, carpetFlavorText);
            add(translationBuilder, Blocks.ORANGE_STAINED_GLASS_PANE, carpetFlavorText);
            add(translationBuilder, Blocks.MAGENTA_STAINED_GLASS_PANE, carpetFlavorText);
            add(translationBuilder, Blocks.LIGHT_BLUE_STAINED_GLASS_PANE, carpetFlavorText);
            add(translationBuilder, Blocks.YELLOW_STAINED_GLASS_PANE, carpetFlavorText);
            add(translationBuilder, Blocks.LIME_STAINED_GLASS_PANE, carpetFlavorText);
            add(translationBuilder, Blocks.PINK_STAINED_GLASS_PANE, carpetFlavorText);
            add(translationBuilder, Blocks.GRAY_STAINED_GLASS_PANE, carpetFlavorText);
            add(translationBuilder, Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, carpetFlavorText);
            add(translationBuilder, Blocks.CYAN_STAINED_GLASS_PANE, carpetFlavorText);
            add(translationBuilder, Blocks.PURPLE_STAINED_GLASS_PANE, carpetFlavorText);
            add(translationBuilder, Blocks.BLUE_STAINED_GLASS_PANE, carpetFlavorText);
            add(translationBuilder, Blocks.BROWN_STAINED_GLASS_PANE, carpetFlavorText);
            add(translationBuilder, Blocks.GREEN_STAINED_GLASS_PANE, carpetFlavorText);
            add(translationBuilder, Blocks.RED_STAINED_GLASS_PANE, carpetFlavorText);
            add(translationBuilder, Blocks.BLACK_STAINED_GLASS_PANE, carpetFlavorText);
            add(translationBuilder, Blocks.TINTED_GLASS,
                    new String[] {
                            "A glass block made with amethyst that doesn’t let light through."
                    });
            carpetFlavorText[0] = "A decorative, colorful terracotta block.";
            add(translationBuilder, Blocks.WHITE_GLAZED_TERRACOTTA, carpetFlavorText);
            add(translationBuilder, Blocks.ORANGE_GLAZED_TERRACOTTA, carpetFlavorText);
            add(translationBuilder, Blocks.MAGENTA_GLAZED_TERRACOTTA, carpetFlavorText);
            add(translationBuilder, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, carpetFlavorText);
            add(translationBuilder, Blocks.YELLOW_GLAZED_TERRACOTTA, carpetFlavorText);
            add(translationBuilder, Blocks.LIME_GLAZED_TERRACOTTA, carpetFlavorText);
            add(translationBuilder, Blocks.PINK_GLAZED_TERRACOTTA, carpetFlavorText);
            add(translationBuilder, Blocks.GRAY_GLAZED_TERRACOTTA, carpetFlavorText);
            add(translationBuilder, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, carpetFlavorText);
            add(translationBuilder, Blocks.CYAN_GLAZED_TERRACOTTA, carpetFlavorText);
            add(translationBuilder, Blocks.PURPLE_GLAZED_TERRACOTTA, carpetFlavorText);
            add(translationBuilder, Blocks.BLUE_GLAZED_TERRACOTTA, carpetFlavorText);
            add(translationBuilder, Blocks.BROWN_GLAZED_TERRACOTTA, carpetFlavorText);
            add(translationBuilder, Blocks.GREEN_GLAZED_TERRACOTTA, carpetFlavorText);
            add(translationBuilder, Blocks.RED_GLAZED_TERRACOTTA, carpetFlavorText);
            add(translationBuilder, Blocks.BLACK_GLAZED_TERRACOTTA, carpetFlavorText);
            add(translationBuilder, Blocks.HONEYCOMB_BLOCK,
                    new String[] {
                            "A solid block of four honeycombs."
                    });
            add(translationBuilder, Items.PAINTING,
                    new String[] {
                            "A canvas with a mysterious pattern painted on it."
                    });
            carpetFlavorText[0] = "The block that makes up the coat of a sheep.";
            add(translationBuilder, Blocks.WHITE_WOOL, carpetFlavorText);
            add(translationBuilder, Blocks.ORANGE_WOOL, carpetFlavorText);
            add(translationBuilder, Blocks.MAGENTA_WOOL, carpetFlavorText);
            add(translationBuilder, Blocks.LIGHT_BLUE_WOOL, carpetFlavorText);
            add(translationBuilder, Blocks.YELLOW_WOOL, carpetFlavorText);
            add(translationBuilder, Blocks.LIME_WOOL, carpetFlavorText);
            add(translationBuilder, Blocks.PINK_WOOL, carpetFlavorText);
            add(translationBuilder, Blocks.GRAY_WOOL, carpetFlavorText);
            add(translationBuilder, Blocks.LIGHT_GRAY_WOOL, carpetFlavorText);
            add(translationBuilder, Blocks.CYAN_WOOL, carpetFlavorText);
            add(translationBuilder, Blocks.PURPLE_WOOL, carpetFlavorText);
            add(translationBuilder, Blocks.BLUE_WOOL, carpetFlavorText);
            add(translationBuilder, Blocks.BROWN_WOOL, carpetFlavorText);
            add(translationBuilder, Blocks.GREEN_WOOL, carpetFlavorText);
            add(translationBuilder, Blocks.RED_WOOL, carpetFlavorText);
            add(translationBuilder, Blocks.BLACK_WOOL, carpetFlavorText);
            // ## Mineral Blocks
            add(translationBuilder, Blocks.AMETHYST_BLOCK,
                    new String[] {
                            "A block of crystal found in Amethyst Geodes."
                    });
            add(translationBuilder, Blocks.COAL_BLOCK,
                    new String[] {
                            "A solid block made of pieces of coal."
                    });
            add(translationBuilder, Blocks.COPPER_BLOCK,
                    new String[] {
                            "A solid block made of copper ingots."
                    });
            add(translationBuilder, Blocks.CUT_COPPER,
                    new String[] {
                            "A chiseled copper block."
                    });
            add(translationBuilder, Blocks.RAW_COPPER_BLOCK,
                    new String[] {
                            "A solid block made of raw copper."
                    });
            add(translationBuilder, Blocks.DIAMOND_BLOCK,
                    new String[] {
                            "A solid block made of diamonds."
                    });
            add(translationBuilder, Blocks.EMERALD_BLOCK,
                    new String[] {
                            "A solid block made of emeralds."
                    });
            add(translationBuilder, Blocks.GOLD_BLOCK,
                    new String[] {
                            "A solid block made of gold ingots."
                    });
            add(translationBuilder, Blocks.RAW_GOLD_BLOCK,
                    new String[] {
                            "A solid block made of raw gold."
                    });
            add(translationBuilder, Blocks.IRON_BLOCK,
                    new String[] {
                            "A solid block made of iron ingots."
                    });
            add(translationBuilder, Blocks.RAW_IRON_BLOCK,
                    new String[] {
                            "A solid block made of raw iron."
                    });
            add(translationBuilder, Blocks.LAPIS_BLOCK,
                    new String[] {
                            "A solid block made of lapis lazuli."
                    });
            add(translationBuilder, Blocks.QUARTZ_BLOCK,
                    new String[] {
                            "A solid block made of pieces of quartz."
                    });
            add(translationBuilder, Blocks.CHISELED_QUARTZ_BLOCK,
                    new String[] {
                            "A quartz block cut with a specific pattern."
                    });
            add(translationBuilder, Blocks.QUARTZ_PILLAR,
                    new String[] {
                            "A quartz block cut in the shape of a pillar."
                    });
            add(translationBuilder, Blocks.QUARTZ_BRICKS,
                    new String[] {
                            "A quartz block cut into bricks."
                    });
            add(translationBuilder, Blocks.REDSTONE_BLOCK,
                    new String[] {
                            "A solid block made of compacted redstone dust."
                    });
            // TODO: Manufactured and everything past that
            // ## Manufactured
            // ## Lighting
            // ### Utility
            // ## Interactable
            // ## Utilizable
            // ## Mechanical
            // ### Other
            // #### Items
            // ### Materials
            // ### Processed
            // ### Food
            // ### Seeds
            // ### Dyes
            // ### Tools
            // ### Informational
            // ### Weapons
            // ### Armor
            // ### Transportation
            // ### Utility
            // ### Other
        }

        private void add(TranslationBuilder translationBuilder, Block block, String[] lines) {
            translationBuilder.add(block.getTranslationKey() + ".expanded_tooltips.desc", String.join("\n", lines));
        }

        private void add(TranslationBuilder translationBuilder, Item item, String[] lines) {
            translationBuilder.add(item.getTranslationKey() + ".expanded_tooltips.desc", String.join("\n", lines));
        }
    }
}
