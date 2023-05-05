package foxhub.expandedtooltips;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public class ExpandedTooltipsDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        var pack = fabricDataGenerator.createPack();
        pack.addProvider(EnglishLangProvider::new);
    }

    private static class EnglishLangProvider extends FabricLanguageProvider {
        private TranslationBuilder translationBuilder;

        private EnglishLangProvider(FabricDataOutput dataOutput) {
            super(dataOutput, "en_us");
        }

        @Override
        public void generateTranslations(TranslationBuilder translationBuilder) {
            this.translationBuilder = translationBuilder;

            addBlocks();
            addItems();
        }

        private void addBlocks() {
            addNatural();
            addBiota();
            addBuilding();
            addUtilityBlocks();
            addOtherBlocks();
        }

        private void addNatural() {
            addSoil();
            addStone();
            addMineral();
            addLiquid();
            addNonPhysical();
        }

        private void addSoil() {
            add(Blocks.CLAY,
                    new String[] {
                            "A wet block of fine-grained natural soil.",
                            "When smelted, it can be used in many building applications."
                    });
            add(Blocks.DIRT,
                    new String[] {
                            "A block of soil uprooted from the Overworld.",
                            "Despite its weakness as a block, it is very versatile for many natural applications."
                    });
            add(Blocks.COARSE_DIRT,
                    new String[] {
                            "A block of soil uprooted from the Overworld.",
                            "It is rendered incapable of growing plants due to its coarser complexion."
                    });
            add(Blocks.ROOTED_DIRT,
                    new String[] {
                            "A block of soil, pierced by Azalea roots.",
                            "Following a trail of this block downward tends to lead to a lush cave."
                    });
            add(Blocks.DIRT_PATH,
                    new String[] {
                            "A well-worn path made in the dirt.",
                            "Its top has the appearance of dead grass, no matter what material the path was created from."
                    });
            add(Blocks.GRASS_BLOCK,
                    new String[] {
                            "A block of soil which has sprung life.",
                            "Its color depends on the temperature of the biome."
                    });
            add(Blocks.GRAVEL,
                    new String[] {
                            "A block made up of many tiny stones.",
                            "It seems to abide by the laws of gravity that govern entities, with a little poking and prodding."
                    });
            add(Blocks.MUD,
                    new String[] {
                            "A block of wet dirt, rich with minerals.",
                            "It can be found covering the ground in Mangrove Swamps, supporting their unique plant life."
                    });
            add(Blocks.MYCELIUM,
                    new String[] {
                            "A block of dirt made part of a network of mushrooms.",
                            "It can support the growth of mushrooms even in the brightest of areas."
                    });
            var nyliumFlavorText = new String[] {
                    "A block of netherrack made part of a network of Nether fungus.",
                    "Unlike its Overworld counterpart, one can use bone meal on it to spread the fungus."
            };
            add(Blocks.CRIMSON_NYLIUM, nyliumFlavorText);
            add(Blocks.WARPED_NYLIUM, nyliumFlavorText);
            add(Blocks.PODZOL,
                    new String[] {
                            "A block of dirt found in dense, wooded areas.",
                            "It holds many organic compounds due to the presence of dead plant matter."
                    });
            add(Blocks.SAND,
                    new String[] {
                            "A block made up of minuscule minerals, containing trace amounts of quartz.",
                            "It seems to abide by the laws of gravity that govern entities, with a little poking and prodding."
                    });
            add(Blocks.RED_SAND,
                    new String[] {
                            "A block made up of minuscule minerals, containing trace amounts of iron.",
                            "It seems to abide by the laws of gravity that govern entities, with a little poking and prodding."
                    });
            add(Blocks.SOUL_SAND,
                    new String[] {
                            "A common sediment in the Nether.",
                            "The faces which can be seen come from the many souls captured inside of it."
                    });
            add(Blocks.SOUL_SOIL,
                    new String[] {
                            "A less compact form of soul sand, common in the Soul Sand Valley.",
                            "It seems to have been swept up by some sort of wind, as the faces signature of soul sand are stretched out."
                    });
        }
        private void addStone() {
            add(Blocks.ANDESITE,
                    new String[] {
                            "An igneous rock found in the Overworld.",
                            "Its palette seems to blend in with regular stone, so don’t get fooled if looking for crafting materials."
                    });
            add(Blocks.BEDROCK,
                    new String[] {
                            "A strong rock found at the bottom of the world.",
                            "It is rendered impossible to break due to the immense pressure compacting it nigh-infinitely, so mining it would be a fool’s errand."
                    });
            add(Blocks.BASALT,
                    new String[] {
                            "A volcanic rock found in the Nether.",
                            "It tends to form large pillars, which can come together to create Basalt Deltas."
                    });
            add(Blocks.SMOOTH_BASALT,
                    new String[] {
                            "A volcanic rock that surrounds amethyst geodes.",
                            "It holds relation to the basalt formations found in the Nether."
                    });
            add(Blocks.BLACKSTONE,
                    new String[] {
                            "A charred type of black stone found in the Nether.",
                            "It is most commonly found in Basalt Deltas, but the denizens of the Nether seem to have found a way to extract it en masse."
                    });
            add(Blocks.GILDED_BLACKSTONE,
                    new String[] {
                            "A block of Blackstone with veins of gold forged into it.",
                            "The Piglins seem to have created it simply for the purpose of vanity, like much of their crude society."
                    });
            add(Blocks.CALCITE,
                    new String[] {
                            "A carbonate rock that surrounds amethyst geodes.",
                            "It is very brittle, making it near-impossible to craft into new building blocks."
                    });
            add(Blocks.COBBLESTONE,
                    new String[] {
                            "A building material made of large rocks.",
                            "It has a very wide array of uses, making it a requirement for virtually anybody making their way in the world."
                    });
            add(Blocks.MOSSY_COBBLESTONE,
                    new String[] {
                            "A block of cobblestone, covered in moss.",
                            "The moss does not seem to get as many nutrients from the stone, so it has a more subdued appearance."
                    });
            add(Blocks.DEEPSLATE,
                    new String[] {
                            "A hard form of stone found in the deepest caverns of the Overworld.",
                            "Many rare materials can be found embedded in it, if one is so lucky."
                    });
            add(Blocks.DIORITE,
                    new String[] {
                            "An igneous rock found in the Overworld.",
                            "It can be crafted with stone and quartz in a pinch, but it is so abundant that this is simply a waste of materials under normal circumstances."
                    });
            add(Blocks.DRIPSTONE_BLOCK,
                    new String[] {
                            "A strange rock, formed over unknowable amounts of time in the Dripstone Caves.",
                            "Despite this, it is incredibly brittle, and so it cannot be used to craft more advanced building blocks."
                    });
            add(Blocks.END_STONE,
                    new String[] {
                            "A strange type of rock found in the End.",
                            "It has the capability of harboring many twisted forms of life native to the dimension."
                    });
            add(Blocks.GLOWSTONE,
                    new String[] {
                            "A glowing crystal found growing on the ceiling of the Nether.",
                            "It holds many magical properties, including the potential to strengthen a potion."
                    });
            add(Blocks.GRANITE,
                    new String[] {
                            "An igneous rock found in the Overworld.",
                            "It can be used by miners as a signal for a large copper vein."
                    });
            var infectedText = new String[] {
                    "A block of stone infested by a Silverfish.",
                    "Mining typically makes the Silverfish break out, however it seems this sample was harvested in a different way."
            };
            add(Blocks.INFESTED_COBBLESTONE, infectedText);
            add(Blocks.INFESTED_DEEPSLATE, infectedText);
            add(Blocks.INFESTED_STONE, infectedText);
            add(Blocks.INFESTED_CHISELED_STONE_BRICKS, infectedText);
            add(Blocks.INFESTED_CRACKED_STONE_BRICKS, infectedText);
            add(Blocks.INFESTED_MOSSY_STONE_BRICKS, infectedText);
            add(Blocks.INFESTED_STONE_BRICKS, infectedText);
            add(Blocks.MAGMA_BLOCK,
                    new String[] {
                            "Molten rock found ubiquitously throughout the Nether.",
                            "It is also found in deep aquifers and underwater areas, though less common."
                    });
            add(Blocks.NETHERRACK,
                    new String[] {
                            "A flesh-like rock making up the majority of the Nether.",
                            "It can be smelted to make a unique type of brick."
                    });
            add(Blocks.OBSIDIAN,
                    new String[] {
                            "A very tough glass with otherworldly potential.",
                            "Formed when water flows into lava.",
                            "Lighting a frame with it allows for passage into another dimension."
                    });
            add(Blocks.CRYING_OBSIDIAN,
                    new String[] {
                            "A cracked block of obsidian, overflowing with dimensional energy.",
                            "It appears to be quite unstable compared to its normal counterpart.",
                    });
            add(Blocks.POINTED_DRIPSTONE,
                    new String[] {
                            "A sharp form of dripstone, dealing damage to those unlucky enough to fall on it, or worse, get struck on the head.",
                            "A good hit from a trident can dislodge a stalactite from the ceiling.",
                    });
            add(Blocks.SANDSTONE,
                    new String[] {
                            "A sedimentary rock commonly found below sand.",
                            "Makes for a good path block, in lieu of dirt.",
                    });
            add(Blocks.RED_SANDSTONE,
                    new String[] {
                            "A sedimentary rock commonly found below red sand.",
                            "Trace amounts of iron give it a more reddish appearance.",
                    });
            add(Blocks.STONE,
                    new String[] {
                            "A very versatile material, making up the majority of the Overworld’s upper layers."
                    });
            add(Blocks.TERRACOTTA,
                    new String[] {
                            "A hardened block of clay.",
                            "It can be found in Badlands biomes, making beautiful multi-colored stripes.",
                    });
            add(Blocks.TUFF,
                    new String[] {
                            "An ornamental rock formed from volcanic ash.",
                            "It is found most commonly in the Deepslate layer, and can signal the presence of a large iron vein.",
                    });
        }
        private void addMineral() {
            add(Blocks.AMETHYST_CLUSTER,
                    new String[] {
                            "A crystal found growing in amethyst geodes.",
                            "It makes a satisfying ringing noise when mined.",
                    });
            add(Blocks.ANCIENT_DEBRIS,
                    new String[] {
                            "Remains of an unknown metal found buried deep in the Nether.",
                            "The dimension’s inhabitants seem to have abandoned it for the more common gold.",
                    });
            add(Blocks.BUDDING_AMETHYST,
                    new String[] {
                            "A crystal block, which amethyst clusters grow from.",
                            "Shatters under even the most delicate touch, rendering it unobtainable through normal means.",
                    });
            add(Blocks.COAL_ORE,
                    new String[] {
                            "A block of stone, with chunks of Coal inside.",
                            "It is most common throughout the surface of the Overworld.",
                    });
            add(Blocks.COPPER_ORE,
                    new String[] {
                            "A block of stone, with chunks of Copper inside.",
                            "It is most common in higher-level caves, especially in Dripstone Caves.",
                    });
            add(Blocks.DIAMOND_ORE,
                    new String[] {
                            "A block of stone, with chunks of Diamond inside.",
                            "It is most common in the Deepslate layer, so finding it in normal stone is a rarity.",
                            "It tends to appear less in blocks exposed to air."
                    });
            add(Blocks.EMERALD_ORE,
                    new String[] {
                            "A block of stone, with chunks of Emerald inside.",
                            "It is most common in high mountains, so finding it in a block of deepslate is a rarity."
                    });
            add(Blocks.GOLD_ORE,
                    new String[] {
                            "A block of stone, with chunks of Gold inside.",
                            "It is most common in Badlands, outside of which it tends to be found lower down."
                    });
            add(Blocks.NETHER_GOLD_ORE,
                    new String[] {
                            "A block of netherrack, with small chunks of Gold inside.",
                            "It can be found all throughout the Nether."
                    });
            add(Blocks.IRON_ORE,
                    new String[] {
                            "A block of stone, with chunks of Iron inside.",
                            "It is most common in mountains and higher caves, but large veins can be found in the deepslate layer."
                    });
            add(Blocks.LAPIS_ORE,
                    new String[] {
                            "A block of stone, with chunks of Lapis Lazuli inside.",
                            "It is rare, spread throughout every layer of the Overworld."
                    });
            add(Blocks.NETHER_QUARTZ_ORE,
                    new String[] {
                            "A block of netherrack, with chunks of Quartz inside.",
                            "It can be found all throughout the Nether."
                    });
            add(Blocks.REDSTONE_ORE,
                    new String[] {
                            "A block of stone, with chunks of Redstone inside.",
                            "It is most common in the deepslate layer, getting even more common as depth increases."
                    });
        }
        private void addLiquid() {
            add(Blocks.ICE,
                    new String[] {
                            "Water in its solid, frozen form."
                    });
            add(Blocks.BLUE_ICE,
                    new String[] {
                            "Compressed, slippery ice found underwater in icebergs."
                    });
            add(Blocks.PACKED_ICE,
                    new String[] {
                            "Compressed ice found in glaciers and icebergs."
                    });
            add(Blocks.LAVA,
                    new String[] {
                            "Superheated rock in liquid form."
                    });
            add(Blocks.POWDER_SNOW,
                    new String[] {
                            "A light fluffy snow.",
                            "Don't fall in!"
                    });
            add(Blocks.SNOW,
                    new String[] {
                            "The top layers of snow on the ground."
                    });
            add(Blocks.SNOW_BLOCK,
                    new String[] {
                            "A thick layer of snow found in cold biomes."
                    });
            add(Blocks.WATER,
                    new String[] {
                            "A common liquid found in the Overworld.",
                            "Evaporates in the Nether."
                    });
        }
        private void addNonPhysical() {
            /*
            add(Blocks.AIR,
                    new String[] {
                            "A gas found everywhere in the Overworld, Nether and The End."
                    });
            */
            add(Blocks.FIRE,
                    new String[] {
                            "A very hot substance.",
                            "It burns!"
                    });
            add(Blocks.LIGHT,
                    new String[] {
                            "A very hot substance.",
                            "It burns!"
                    });
            add(Blocks.SOUL_FIRE,
                    new String[] {
                            "A very hot substance created when burning souls."
                    });
            add(Blocks.STRUCTURE_VOID,
                    new String[] {
                            "A mysterious block that has not been found to have any use."
                    });
        }

        private void addBiota() {
            addWood();
            addPlant();
            addFungus();
            addFauna();
            addFaunaProduct();
            addAlgae();
        }

        private void addWood() {
            var overworldLogFlavorText = new String[] {
                    "The log of a tree found in the Overworld."
            };
            add(Blocks.OAK_LOG, overworldLogFlavorText);
            add(Blocks.SPRUCE_LOG, overworldLogFlavorText);
            add(Blocks.BIRCH_LOG, overworldLogFlavorText);
            add(Blocks.JUNGLE_LOG, overworldLogFlavorText);
            add(Blocks.ACACIA_LOG, overworldLogFlavorText);
            add(Blocks.DARK_OAK_LOG, overworldLogFlavorText);
            add(Blocks.MANGROVE_LOG, overworldLogFlavorText);
            add(Blocks.CHERRY_LOG, overworldLogFlavorText);
            overworldLogFlavorText[0] = "Overworld log removed of its bark.";
            add(Blocks.STRIPPED_OAK_LOG, overworldLogFlavorText);
            add(Blocks.STRIPPED_SPRUCE_LOG, overworldLogFlavorText);
            add(Blocks.STRIPPED_BIRCH_LOG, overworldLogFlavorText);
            add(Blocks.STRIPPED_JUNGLE_LOG, overworldLogFlavorText);
            add(Blocks.STRIPPED_ACACIA_LOG, overworldLogFlavorText);
            add(Blocks.STRIPPED_DARK_OAK_LOG, overworldLogFlavorText);
            add(Blocks.STRIPPED_MANGROVE_LOG, overworldLogFlavorText);
            add(Blocks.STRIPPED_CHERRY_LOG, overworldLogFlavorText);
            overworldLogFlavorText[0] = "An Overworld log with all sides covered in bark.";
            add(Blocks.OAK_WOOD, overworldLogFlavorText);
            add(Blocks.SPRUCE_WOOD, overworldLogFlavorText);
            add(Blocks.BIRCH_WOOD, overworldLogFlavorText);
            add(Blocks.JUNGLE_WOOD, overworldLogFlavorText);
            add(Blocks.ACACIA_WOOD, overworldLogFlavorText);
            add(Blocks.DARK_OAK_WOOD, overworldLogFlavorText);
            add(Blocks.MANGROVE_WOOD, overworldLogFlavorText);
            add(Blocks.CHERRY_WOOD, overworldLogFlavorText);
            overworldLogFlavorText[0] = "Overworld wood removed of its bark.";
            add(Blocks.STRIPPED_OAK_WOOD, overworldLogFlavorText);
            add(Blocks.STRIPPED_SPRUCE_WOOD, overworldLogFlavorText);
            add(Blocks.STRIPPED_BIRCH_WOOD, overworldLogFlavorText);
            add(Blocks.STRIPPED_JUNGLE_WOOD, overworldLogFlavorText);
            add(Blocks.STRIPPED_ACACIA_WOOD, overworldLogFlavorText);
            add(Blocks.STRIPPED_DARK_OAK_WOOD, overworldLogFlavorText);
            add(Blocks.STRIPPED_MANGROVE_WOOD, overworldLogFlavorText);
            add(Blocks.STRIPPED_CHERRY_WOOD, overworldLogFlavorText);
            add(Blocks.MANGROVE_ROOTS,
                    new String[] {
                            "Large above ground roots from Mangrove Trees."
                    });
            add(Blocks.MUDDY_MANGROVE_ROOTS,
                    new String[] {
                            "Mangrove Roots filled with Mud."
                    });
            var hyphaeLogFlavorText = new String[] {
                    "The stem of a huge fungus found in the Nether."
            };
            add(Blocks.CRIMSON_STEM, hyphaeLogFlavorText);
            add(Blocks.WARPED_STEM, hyphaeLogFlavorText);
            hyphaeLogFlavorText[0] = "Nether stem removed of its outer layer.";
            add(Blocks.STRIPPED_CRIMSON_STEM, hyphaeLogFlavorText);
            add(Blocks.STRIPPED_WARPED_STEM, hyphaeLogFlavorText);
            hyphaeLogFlavorText[0] = "A Nether stem with an outer layer on all sides.";
            add(Blocks.CRIMSON_HYPHAE, hyphaeLogFlavorText);
            add(Blocks.WARPED_HYPHAE, hyphaeLogFlavorText);
            hyphaeLogFlavorText[0] = "Nether hyphae removed of its outer layer.";
            add(Blocks.STRIPPED_CRIMSON_HYPHAE, hyphaeLogFlavorText);
            add(Blocks.STRIPPED_WARPED_HYPHAE, hyphaeLogFlavorText);
        }
        private void addPlant() {
            add(Blocks.AZALEA,
                    new String[] {
                            "A bush that grows in the Lush Caves biome."
                    });
            add(Blocks.FLOWERING_AZALEA,
                    new String[] {
                            "Azalea but with flowers."
                    });
            add(Blocks.BAMBOO,
                    new String[] {
                            "A tall & sturdy plant found in the Jungle biome."
                    });
            var dripleavesFlavorText = new String[] {
                    "A strange plant found in the Lush Caves.",
                    "It thrives in moist environments."
            };
            add(Blocks.SMALL_DRIPLEAF, dripleavesFlavorText);
            add(Blocks.BIG_DRIPLEAF, dripleavesFlavorText);
            add(Blocks.CACTUS,
                    new String[] {
                            "Prickly on the outside, wet on the inside."
                    });
            add(Blocks.CAVE_VINES,
                    new String[] {
                            "Glow Berry vines that grow on the ceilings of Lush Caves."
                    });
            add(Items.COCOA_BEANS,
                    new String[] {
                            "A bean found on the side of Jungle trees, used to make chocolate."
                    });
            add(Blocks.CHORUS_PLANT,
                    new String[] {
                            "The main stalk of tIslands. Commonly found in the Outer End islands."
                    });
            add(Blocks.CHORUS_FLOWER,
                    new String[] {
                            "A flowering Chorus Plant that can be used to grow a new Chorus Plant."
                    });
            add(Blocks.DEAD_BUSH,
                    new String[] {
                            "A dried-out shrub found in some biomes."
                    });
            var plantFlavorText = new String[] {
                    "A flowerless plant found in Taiga biomes."
            };
            add(Blocks.FERN, plantFlavorText);
            add(Blocks.LARGE_FERN, plantFlavorText);
            plantFlavorText[0] = "A flower found in the Overworld.";
            add(Blocks.POPPY, plantFlavorText);
            add(Blocks.DANDELION, plantFlavorText);
            add(Blocks.BLUE_ORCHID, plantFlavorText);
            add(Blocks.ALLIUM, plantFlavorText);
            add(Blocks.AZURE_BLUET, plantFlavorText);
            add(Blocks.OXEYE_DAISY, plantFlavorText);
            add(Blocks.ORANGE_TULIP, plantFlavorText);
            add(Blocks.PINK_TULIP, plantFlavorText);
            add(Blocks.RED_TULIP, plantFlavorText);
            add(Blocks.WHITE_TULIP, plantFlavorText);
            add(Blocks.CORNFLOWER, plantFlavorText);
            add(Blocks.LILY_OF_THE_VALLEY, plantFlavorText);
            add(Blocks.WITHER_ROSE,
                    new String[] {
                            "A flower created when a soul is harvested by The Wither."
                    });
            plantFlavorText[0] = "A small plant found all over the Overworld.";
            add(Blocks.GRASS, plantFlavorText);
            add(Blocks.TALL_GRASS, plantFlavorText);
            add(Blocks.HANGING_ROOTS,
                    new String[] {
                            "The roots of Azalea trees hanging down from blocks."
                    });
            plantFlavorText[0] = "Leaves from a tree found in the Overworld.";
            add(Blocks.OAK_LEAVES, plantFlavorText);
            add(Blocks.SPRUCE_LEAVES, plantFlavorText);
            add(Blocks.BIRCH_LEAVES, plantFlavorText);
            add(Blocks.JUNGLE_LEAVES, plantFlavorText);
            add(Blocks.ACACIA_LEAVES, plantFlavorText);
            add(Blocks.DARK_OAK_LEAVES, plantFlavorText);
            add(Blocks.MANGROVE_LEAVES, plantFlavorText);
            add(Blocks.CHERRY_LEAVES, plantFlavorText);
            add(Blocks.LILY_PAD,
                    new String[] {
                            "Floating plants found in Overworld swamps."
                    });
            add(Blocks.MELON,
                    new String[] {
                            "A large fruit found in the Jungle biome."
                    });
            plantFlavorText[0] = "A plant that grows in some places in the Overworld.";
            add(Blocks.MOSS_BLOCK, plantFlavorText);
            add(Blocks.MOSS_CARPET, plantFlavorText);
            add(Blocks.PUMPKIN,
                    new String[] {
                            "Large orange gourds often used in Golem creation."
                    });
            add(Blocks.CARVED_PUMPKIN,
                    new String[] {
                            "A Pumpkin carved with a spooky face."
                    });
            plantFlavorText[0] = "The sapling of a tree found in the Overworld.";
            add(Blocks.OAK_SAPLING, plantFlavorText);
            add(Blocks.SPRUCE_SAPLING, plantFlavorText);
            add(Blocks.BIRCH_SAPLING, plantFlavorText);
            add(Blocks.JUNGLE_SAPLING, plantFlavorText);
            add(Blocks.ACACIA_SAPLING, plantFlavorText);
            add(Blocks.DARK_OAK_SAPLING, plantFlavorText);
            add(Blocks.MANGROVE_PROPAGULE, plantFlavorText);
            add(Blocks.CHERRY_SAPLING, plantFlavorText);
            plantFlavorText[0] = "A small plant found under the Overworld’s oceans and rivers.";
            add(Blocks.SEAGRASS, plantFlavorText);
            add(Blocks.TALL_SEAGRASS, plantFlavorText);
            add(Blocks.SPORE_BLOSSOM,
                    new String[] {
                            "Large pink flowers found hanging from the ceilings of Lush caves."
                    });
            add(Items.SUGAR_CANE,
                    new String[] {
                            "A reed found near water that can be crushed into sugar."
                    });
            add(Items.SWEET_BERRIES,
                    new String[] {
                            "A prickly bush of small red berries found in Taiga biomes."
                    });
            add(Items.VINE,
                    new String[] {
                            "A plant that grows on the sides of other blocks."
                    });
            add(Blocks.HAY_BLOCK,
                    new String[] {
                            "A bundled block of nine bunches of wheat."
                    });
        }
        private void addFungus() {
            var plantFlavorText = new String[] {
                    "A fungus that grows in Nether forests."
            };
            add(Blocks.CRIMSON_FUNGUS, plantFlavorText);
            add(Blocks.WARPED_FUNGUS, plantFlavorText);
            add(Blocks.GLOW_LICHEN,
                    new String[] {
                            "A glowing fungus that is found in the Overworld‘s caves."
                    });
            plantFlavorText[0] = "A small fungus found in the Overworld and Nether.";
            add(Blocks.RED_MUSHROOM, plantFlavorText);
            add(Blocks.BROWN_MUSHROOM, plantFlavorText);
            plantFlavorText[0] = "The cap of a huge mushroom, found in some Overworld biomes.";
            add(Blocks.RED_MUSHROOM_BLOCK, plantFlavorText);
            add(Blocks.BROWN_MUSHROOM_BLOCK, plantFlavorText);
            add(Blocks.MUSHROOM_STEM,
                    new String[] {
                            "The stem of a huge mushroom from the Overworld."
                    });
            add(Blocks.NETHER_SPROUTS,
                    new String[] {
                            "Small fungus found in the Warped Forest biome."
                    });
            add(Items.NETHER_WART,
                    new String[] {
                            "A fungus sprout found in the Nether."
                    });
            plantFlavorText[0] = "A compact block of Nether Wart.";
            add(Blocks.NETHER_WART_BLOCK, plantFlavorText);
            add(Blocks.WARPED_WART_BLOCK, plantFlavorText);
            add(Blocks.CRIMSON_ROOTS,
                    new String[] {
                            "Small roots found in Nether forests."
                    });
            add(Items.SHROOMLIGHT,
                    new String[] {
                            "A glowing mushroom found on huge fungi in the Nether."
                    });
            add(Items.TWISTING_VINES,
                    new String[] {
                            "Tall stalks found growing upwards, commonly in the Nether’s Warped Forests."
                    });
            add(Items.WEEPING_VINES,
                    new String[] {
                            "Vine growing from the ceiling, commonly found in the Nether’s Crimson Forest."
                    });
        }
        private void addFauna() {
            var plantFlavorText = new String[] {
                    "An underwater creature found in reefs."
            };
            add(Blocks.TUBE_CORAL, plantFlavorText);
            add(Blocks.BRAIN_CORAL, plantFlavorText);
            add(Blocks.BUBBLE_CORAL, plantFlavorText);
            add(Blocks.FIRE_CORAL, plantFlavorText);
            add(Blocks.HORN_CORAL, plantFlavorText);
            plantFlavorText[0] = "Dried-out coral created when there isn’t enough water.";
            add(Blocks.DEAD_TUBE_CORAL, plantFlavorText);
            add(Blocks.DEAD_BRAIN_CORAL, plantFlavorText);
            add(Blocks.DEAD_BUBBLE_CORAL, plantFlavorText);
            add(Blocks.DEAD_FIRE_CORAL, plantFlavorText);
            add(Blocks.DEAD_HORN_CORAL, plantFlavorText);
            plantFlavorText[0] = "A block-like underwater creature.";
            add(Blocks.TUBE_CORAL_BLOCK, plantFlavorText);
            add(Blocks.BRAIN_CORAL_BLOCK, plantFlavorText);
            add(Blocks.BUBBLE_CORAL_BLOCK, plantFlavorText);
            add(Blocks.FIRE_CORAL_BLOCK, plantFlavorText);
            add(Blocks.HORN_CORAL_BLOCK, plantFlavorText);
            plantFlavorText[0] = "A coral block without enough water.";
            add(Blocks.DEAD_TUBE_CORAL_BLOCK, plantFlavorText);
            add(Blocks.DEAD_BRAIN_CORAL_BLOCK, plantFlavorText);
            add(Blocks.DEAD_BUBBLE_CORAL_BLOCK, plantFlavorText);
            add(Blocks.DEAD_FIRE_CORAL_BLOCK, plantFlavorText);
            add(Blocks.DEAD_HORN_CORAL_BLOCK, plantFlavorText);
            plantFlavorText[0] = "A small piece of coral.";
            add(Items.TUBE_CORAL_FAN, plantFlavorText);
            add(Items.BRAIN_CORAL_FAN, plantFlavorText);
            add(Items.BUBBLE_CORAL_FAN, plantFlavorText);
            add(Items.FIRE_CORAL_FAN, plantFlavorText);
            add(Items.HORN_CORAL_FAN, plantFlavorText);
            plantFlavorText[0] = "A coral fan without enough water.";
            add(Items.DEAD_TUBE_CORAL_FAN, plantFlavorText);
            add(Items.DEAD_BRAIN_CORAL_FAN, plantFlavorText);
            add(Items.DEAD_BUBBLE_CORAL_FAN, plantFlavorText);
            add(Items.DEAD_FIRE_CORAL_FAN, plantFlavorText);
            add(Items.DEAD_HORN_CORAL_FAN, plantFlavorText);
            add(Blocks.SEA_PICKLE,
                    new String[] {
                            "A glowing, marine creature found on the seafloor."
                    });
            add(Blocks.SPONGE,
                    new String[] {
                            "A porous block able to soak up water.",
                            "Due to their rarity, this may be the true treasure that the Elder Guardians were hiding."
                    });
            add(Blocks.WET_SPONGE,
                    new String[] {
                            "A sponge made useless by absorbed water.",
                            "It can be dried out via exposure to hot environments, allowing the moisture to be collected in a bucket."
                    });
        }
        private void addFaunaProduct() {
            add(Blocks.BEE_NEST,
                    new String[] {
                            "A hive found on the side of trees that holds up to three bees."
                    });
            add(Blocks.BONE_BLOCK,
                    new String[] {
                            "A solid block of bone found in fossils in multiple dimensions."
                    });
            add(Blocks.COBWEB,
                    new String[] {
                            "A strong web created by the Overworld’s Spiders and Cave Spiders."
                    });
            add(Blocks.DRAGON_EGG,
                    new String[] {
                            "The one and only egg of the Ender Dragon.",
                            "Obtained after defeating it."
                    });
            add(Blocks.FROGSPAWN,
                    new String[] {
                            "The eggs of a Frog, laid on top of water."
                    });
            var plantFlavorText = new String[] {
                    "A strange, colorful glowing block that is created when a Frog eats a small Magma Cube."
            };
            add(Blocks.OCHRE_FROGLIGHT, plantFlavorText);
            add(Blocks.VERDANT_FROGLIGHT, plantFlavorText);
            add(Blocks.PEARLESCENT_FROGLIGHT, plantFlavorText);
            add(Blocks.HONEY_BLOCK,
                    new String[] {
                            "A solid block of honey.",
                            "It's sticky!"
                    });
            add(Blocks.SLIME_BLOCK,
                    new String[] {
                            "A block of slime that can be used to stick other blocks together."
                    });
            add(Blocks.TURTLE_EGG,
                    new String[] {
                            "The eggs of a Turtle, found on beaches."
                    });
            plantFlavorText[0] = "The head of a hostile creature found in the Overworld.";
            add(Blocks.ZOMBIE_HEAD, plantFlavorText);
            add(Blocks.SKELETON_SKULL, plantFlavorText);
            add(Blocks.CREEPER_HEAD, plantFlavorText);
            add(Blocks.PIGLIN_HEAD, plantFlavorText);
            add(Blocks.WITHER_SKELETON_SKULL,
                    new String[] {
                            "The skull of a Wither Skeleton, used to summon the Wither."
                    });
            add(Blocks.DRAGON_HEAD,
                    new String[] {
                            "A replica of an Ender Dragon’s head."
                    });
            add(Blocks.PLAYER_HEAD,
                    new String[] {
                            "A human head.",
                            "We’re not sure how it got here."
                    });
        }
        private void addAlgae() {
            add(Blocks.KELP,
                    new String[] {
                            "An algae found growing in many ocean biomes."
                    });
            add(Blocks.DRIED_KELP_BLOCK,
                    new String[] {
                            "A block of compacted dried kelp."
                    });
        }

        private void addBuilding() {
            addDecorative();
            addMineralBlocks();
            addManufactured();
            addLighting();
        }

        private void addDecorative() {
            var carpetFlavorText = new String[] {
                    "A thin layer of wool used for decoration."
            };
            add(Blocks.WHITE_CARPET, carpetFlavorText);
            add(Blocks.ORANGE_CARPET, carpetFlavorText);
            add(Blocks.MAGENTA_CARPET, carpetFlavorText);
            add(Blocks.LIGHT_BLUE_CARPET, carpetFlavorText);
            add(Blocks.YELLOW_CARPET, carpetFlavorText);
            add(Blocks.LIME_CARPET, carpetFlavorText);
            add(Blocks.PINK_CARPET, carpetFlavorText);
            add(Blocks.GRAY_CARPET, carpetFlavorText);
            add(Blocks.LIGHT_GRAY_CARPET, carpetFlavorText);
            add(Blocks.CYAN_CARPET, carpetFlavorText);
            add(Blocks.PURPLE_CARPET, carpetFlavorText);
            add(Blocks.BLUE_CARPET, carpetFlavorText);
            add(Blocks.BROWN_CARPET, carpetFlavorText);
            add(Blocks.GREEN_CARPET, carpetFlavorText);
            add(Blocks.RED_CARPET, carpetFlavorText);
            add(Blocks.BLACK_CARPET, carpetFlavorText);
            add(Blocks.CHAIN,
                    new String[] {
                            "Links of iron, usually used to hang things."
                    });
            add(Blocks.IRON_BARS,
                    new String[] {
                            "Metal bars, used as windows or fences."
                    });
            add(Blocks.GLASS,
                    new String[] {
                            "A transparent block smelted from sand."
                    });
            add(Blocks.GLASS_PANE,
                    new String[] {
                            "A thin layer of glass."
                    });
            carpetFlavorText[0] = "Colorful dyed glass block.";
            add(Blocks.WHITE_STAINED_GLASS, carpetFlavorText);
            add(Blocks.ORANGE_STAINED_GLASS, carpetFlavorText);
            add(Blocks.MAGENTA_STAINED_GLASS, carpetFlavorText);
            add(Blocks.LIGHT_BLUE_STAINED_GLASS, carpetFlavorText);
            add(Blocks.YELLOW_STAINED_GLASS, carpetFlavorText);
            add(Blocks.LIME_STAINED_GLASS, carpetFlavorText);
            add(Blocks.PINK_STAINED_GLASS, carpetFlavorText);
            add(Blocks.GRAY_STAINED_GLASS, carpetFlavorText);
            add(Blocks.LIGHT_GRAY_STAINED_GLASS, carpetFlavorText);
            add(Blocks.CYAN_STAINED_GLASS, carpetFlavorText);
            add(Blocks.PURPLE_STAINED_GLASS, carpetFlavorText);
            add(Blocks.BLUE_STAINED_GLASS, carpetFlavorText);
            add(Blocks.BROWN_STAINED_GLASS, carpetFlavorText);
            add(Blocks.GREEN_STAINED_GLASS, carpetFlavorText);
            add(Blocks.RED_STAINED_GLASS, carpetFlavorText);
            add(Blocks.BLACK_STAINED_GLASS, carpetFlavorText);
            carpetFlavorText[0] = "Colorful dyed glass pane.";
            add(Blocks.WHITE_STAINED_GLASS_PANE, carpetFlavorText);
            add(Blocks.ORANGE_STAINED_GLASS_PANE, carpetFlavorText);
            add(Blocks.MAGENTA_STAINED_GLASS_PANE, carpetFlavorText);
            add(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE, carpetFlavorText);
            add(Blocks.YELLOW_STAINED_GLASS_PANE, carpetFlavorText);
            add(Blocks.LIME_STAINED_GLASS_PANE, carpetFlavorText);
            add(Blocks.PINK_STAINED_GLASS_PANE, carpetFlavorText);
            add(Blocks.GRAY_STAINED_GLASS_PANE, carpetFlavorText);
            add(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, carpetFlavorText);
            add(Blocks.CYAN_STAINED_GLASS_PANE, carpetFlavorText);
            add(Blocks.PURPLE_STAINED_GLASS_PANE, carpetFlavorText);
            add(Blocks.BLUE_STAINED_GLASS_PANE, carpetFlavorText);
            add(Blocks.BROWN_STAINED_GLASS_PANE, carpetFlavorText);
            add(Blocks.GREEN_STAINED_GLASS_PANE, carpetFlavorText);
            add(Blocks.RED_STAINED_GLASS_PANE, carpetFlavorText);
            add(Blocks.BLACK_STAINED_GLASS_PANE, carpetFlavorText);
            add(Blocks.TINTED_GLASS,
                    new String[] {
                            "A glass block made with amethyst that doesn’t let light through."
                    });
            carpetFlavorText[0] = "A decorative, colorful terracotta block.";
            add(Blocks.WHITE_GLAZED_TERRACOTTA, carpetFlavorText);
            add(Blocks.ORANGE_GLAZED_TERRACOTTA, carpetFlavorText);
            add(Blocks.MAGENTA_GLAZED_TERRACOTTA, carpetFlavorText);
            add(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, carpetFlavorText);
            add(Blocks.YELLOW_GLAZED_TERRACOTTA, carpetFlavorText);
            add(Blocks.LIME_GLAZED_TERRACOTTA, carpetFlavorText);
            add(Blocks.PINK_GLAZED_TERRACOTTA, carpetFlavorText);
            add(Blocks.GRAY_GLAZED_TERRACOTTA, carpetFlavorText);
            add(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, carpetFlavorText);
            add(Blocks.CYAN_GLAZED_TERRACOTTA, carpetFlavorText);
            add(Blocks.PURPLE_GLAZED_TERRACOTTA, carpetFlavorText);
            add(Blocks.BLUE_GLAZED_TERRACOTTA, carpetFlavorText);
            add(Blocks.BROWN_GLAZED_TERRACOTTA, carpetFlavorText);
            add(Blocks.GREEN_GLAZED_TERRACOTTA, carpetFlavorText);
            add(Blocks.RED_GLAZED_TERRACOTTA, carpetFlavorText);
            add(Blocks.BLACK_GLAZED_TERRACOTTA, carpetFlavorText);
            add(Blocks.HONEYCOMB_BLOCK,
                    new String[] {
                            "A solid block of four honeycombs."
                    });
            add(Items.PAINTING,
                    new String[] {
                            "A canvas with a mysterious pattern painted on it."
                    });
            carpetFlavorText[0] = "The block that makes up the coat of a sheep.";
            add(Blocks.WHITE_WOOL, carpetFlavorText);
            add(Blocks.ORANGE_WOOL, carpetFlavorText);
            add(Blocks.MAGENTA_WOOL, carpetFlavorText);
            add(Blocks.LIGHT_BLUE_WOOL, carpetFlavorText);
            add(Blocks.YELLOW_WOOL, carpetFlavorText);
            add(Blocks.LIME_WOOL, carpetFlavorText);
            add(Blocks.PINK_WOOL, carpetFlavorText);
            add(Blocks.GRAY_WOOL, carpetFlavorText);
            add(Blocks.LIGHT_GRAY_WOOL, carpetFlavorText);
            add(Blocks.CYAN_WOOL, carpetFlavorText);
            add(Blocks.PURPLE_WOOL, carpetFlavorText);
            add(Blocks.BLUE_WOOL, carpetFlavorText);
            add(Blocks.BROWN_WOOL, carpetFlavorText);
            add(Blocks.GREEN_WOOL, carpetFlavorText);
            add(Blocks.RED_WOOL, carpetFlavorText);
            add(Blocks.BLACK_WOOL, carpetFlavorText);
        }
        private void addMineralBlocks() {
            add(Blocks.AMETHYST_BLOCK,
                    new String[] {
                            "A block of crystal found in Amethyst Geodes."
                    });
            add(Blocks.COAL_BLOCK,
                    new String[] {
                            "A solid block made of pieces of coal."
                    });
            add(Blocks.COPPER_BLOCK,
                    new String[] {
                            "A solid block made of copper ingots."
                    });
            add(Blocks.CUT_COPPER,
                    new String[] {
                            "A chiseled copper block."
                    });
            add(Blocks.RAW_COPPER_BLOCK,
                    new String[] {
                            "A solid block made of raw copper."
                    });
            add(Blocks.DIAMOND_BLOCK,
                    new String[] {
                            "A solid block made of diamonds."
                    });
            add(Blocks.EMERALD_BLOCK,
                    new String[] {
                            "A solid block made of emeralds."
                    });
            add(Blocks.GOLD_BLOCK,
                    new String[] {
                            "A solid block made of gold ingots."
                    });
            add(Blocks.RAW_GOLD_BLOCK,
                    new String[] {
                            "A solid block made of raw gold."
                    });
            add(Blocks.IRON_BLOCK,
                    new String[] {
                            "A solid block made of iron ingots."
                    });
            add(Blocks.RAW_IRON_BLOCK,
                    new String[] {
                            "A solid block made of raw iron."
                    });
            add(Blocks.LAPIS_BLOCK,
                    new String[] {
                            "A solid block made of lapis lazuli."
                    });
            add(Blocks.QUARTZ_BLOCK,
                    new String[] {
                            "A solid block made of pieces of quartz."
                    });
            add(Blocks.CHISELED_QUARTZ_BLOCK,
                    new String[] {
                            "A quartz block cut with a specific pattern."
                    });
            add(Blocks.QUARTZ_PILLAR,
                    new String[] {
                            "A quartz block cut in the shape of a pillar."
                    });
            add(Blocks.QUARTZ_BRICKS,
                    new String[] {
                            "A quartz block cut into bricks."
                    });
            add(Blocks.REDSTONE_BLOCK,
                    new String[] {
                            "A solid block made of compacted redstone dust."
                    });
        }
        private void addManufactured() {
            add(Blocks.BOOKSHELF,
                    new String[] {
                            "A wooden shelf filled with books.",
                            "Some villagers keep large collections of them."
                    });
            add(Blocks.BRICKS,
                    new String[] {
                            "Smelted clay bricks used for building."
                    });
            add(Blocks.CHISELED_DEEPSLATE,
                    new String[] {
                            "Deepslate cut with a specific pattern.",
                            "It is unknown what this pattern attempts to represent, though it appears to be some kind of skull."
                    });
            add(Blocks.COBBLED_DEEPSLATE,
                    new String[] {
                            "A natural building material made of deepslate."
                    });
            add(Blocks.REINFORCED_DEEPSLATE,
                    new String[] {
                            "A block of deepslate reinforced by a strange material.",
                            "Due to its strength, it is rendered unobtainable by normal means.",
                            "It is found in mysterious frames at the heart of Ancient Cities."
                    });
            var concreteFlavorText = new String[] {
                    "A colorful block of concrete, hardened by water.",
                    "This process seems to have prevented the effects of gravity."
            };
            add(Blocks.WHITE_CONCRETE, concreteFlavorText);
            add(Blocks.ORANGE_CONCRETE, concreteFlavorText);
            add(Blocks.MAGENTA_CONCRETE, concreteFlavorText);
            add(Blocks.LIGHT_BLUE_CONCRETE, concreteFlavorText);
            add(Blocks.YELLOW_CONCRETE, concreteFlavorText);
            add(Blocks.LIME_CONCRETE, concreteFlavorText);
            add(Blocks.PINK_CONCRETE, concreteFlavorText);
            add(Blocks.GRAY_CONCRETE, concreteFlavorText);
            add(Blocks.LIGHT_GRAY_CONCRETE, concreteFlavorText);
            add(Blocks.CYAN_CONCRETE, concreteFlavorText);
            add(Blocks.PURPLE_CONCRETE, concreteFlavorText);
            add(Blocks.BLUE_CONCRETE, concreteFlavorText);
            add(Blocks.BROWN_CONCRETE, concreteFlavorText);
            add(Blocks.GREEN_CONCRETE, concreteFlavorText);
            add(Blocks.RED_CONCRETE, concreteFlavorText);
            add(Blocks.BLACK_CONCRETE, concreteFlavorText);
            concreteFlavorText[0] = "A powder of sand and gravel used to make concrete.";
            concreteFlavorText[1] = "Like its ingredients, it abides by the laws of gravity that govern entities, given enough force.";
            add(Blocks.WHITE_CONCRETE_POWDER, concreteFlavorText);
            add(Blocks.ORANGE_CONCRETE_POWDER, concreteFlavorText);
            add(Blocks.MAGENTA_CONCRETE_POWDER, concreteFlavorText);
            add(Blocks.LIGHT_BLUE_CONCRETE_POWDER, concreteFlavorText);
            add(Blocks.YELLOW_CONCRETE_POWDER, concreteFlavorText);
            add(Blocks.LIME_CONCRETE_POWDER, concreteFlavorText);
            add(Blocks.PINK_CONCRETE_POWDER, concreteFlavorText);
            add(Blocks.GRAY_CONCRETE_POWDER, concreteFlavorText);
            add(Blocks.LIGHT_GRAY_CONCRETE_POWDER, concreteFlavorText);
            add(Blocks.CYAN_CONCRETE_POWDER, concreteFlavorText);
            add(Blocks.PURPLE_CONCRETE_POWDER, concreteFlavorText);
            add(Blocks.BLUE_CONCRETE_POWDER, concreteFlavorText);
            add(Blocks.BROWN_CONCRETE_POWDER, concreteFlavorText);
            add(Blocks.GREEN_CONCRETE_POWDER, concreteFlavorText);
            add(Blocks.RED_CONCRETE_POWDER, concreteFlavorText);
            add(Blocks.BLACK_CONCRETE_POWDER, concreteFlavorText);
            add(Blocks.CUT_SANDSTONE,
                    new String[] {
                            "Compacted, smooth sandstone.",
                            "Used in the architecture of Desert Villages and Pyramids."
                    });
            add(Blocks.CHISELED_SANDSTONE,
                    new String[] {
                            "Sandstone cut with the face of a Creeper.",
                            "Exclusively found in the walls of Desert Pyramids."
                    });
            add(Blocks.SMOOTH_SANDSTONE,
                    new String[] {
                            "Sandstone polished and smoothened.",
                            "Commonly used in Desert Villages’ architecture."
                    });
            add(Blocks.CUT_RED_SANDSTONE,
                    new String[] {
                            "Compacted, smooth red sandstone.",
                            "Not used in any structures discovered so far."
                    });
            add(Blocks.CHISELED_RED_SANDSTONE,
                    new String[] {
                            "Red sandstone carved with the likeness of a strange beast.",
                            "Not used in any structures discovered so far."
                    });
            add(Blocks.SMOOTH_RED_SANDSTONE,
                    new String[] {
                            "Red sandstone polished and smoothened.",
                            "Not used in any structures discovered so far."
                    });
            add(Blocks.DEEPSLATE_BRICKS,
                    new String[] {
                            "Deepslate cut into bricks with a pattern similar to that of stone bricks."
                    });
            add(Blocks.CRACKED_DEEPSLATE_BRICKS,
                    new String[] {
                            "Deepslate bricks cracked from age.",
                            "Useful for decorative purposes."
                    });
            add(Blocks.DEEPSLATE_TILES,
                    new String[] {
                            "Tiled deepslate used for decorative purposes."
                    });
            add(Blocks.CRACKED_DEEPSLATE_TILES,
                    new String[] {
                            "Deepslate tiles cracked from age.",
                            "Useful for decorative purposes."
                    });
            add(Blocks.END_STONE_BRICKS,
                    new String[] {
                            "End stone cut into bricks with a pattern similar to that of stone bricks."
                    });
            add(Blocks.MUD_BRICKS,
                    new String[] {
                            "Packed mud shaped into bricks with a unique pattern."
                    });
            add(Blocks.NETHER_BRICKS,
                    new String[] {
                            "Block of smelted netherrack bricks with a unique pattern."
                    });
            add(Blocks.CRACKED_NETHER_BRICKS,
                    new String[] {
                            "Nether bricks cracked from age.",
                            "Useful for decorative purposes."
                    });
            add(Blocks.CHISELED_NETHER_BRICKS,
                    new String[] {
                            "Nether bricks carved with a skull pattern."
                    });
            add(Blocks.RED_NETHER_BRICKS,
                    new String[] {
                            "Nether bricks dyed with nether wart.",
                            "Useful for decorative purposes."
                    });
            var planksFlavorText = new String[] {
                    "Planks crafted from an Overworld log.",
                    "Very versatile in crafting."
            };
            add(Blocks.OAK_PLANKS, planksFlavorText);
            add(Blocks.SPRUCE_PLANKS, planksFlavorText);
            add(Blocks.BIRCH_PLANKS, planksFlavorText);
            add(Blocks.JUNGLE_PLANKS, planksFlavorText);
            add(Blocks.DARK_OAK_PLANKS, planksFlavorText);
            add(Blocks.ACACIA_PLANKS, planksFlavorText);
            add(Blocks.MANGROVE_PLANKS, planksFlavorText);
            add(Blocks.CHERRY_PLANKS, planksFlavorText);
            planksFlavorText[0] = "Planks crafted from a Nether stem.";
            add(Blocks.CRIMSON_PLANKS, planksFlavorText);
            add(Blocks.WARPED_PLANKS, planksFlavorText);
            add(Blocks.PACKED_MUD,
                    new String[] {
                            "Dried mud packed together with wheat."
                    });
            add(Blocks.POLISHED_ANDESITE,
                    new String[] {
                            "Compacted, smooth andesite.",
                            "Useful for decorative purposes."
                    });
            add(Blocks.POLISHED_BASALT,
                    new String[] {
                            "Basalt found in large pillars and in Basalt Deltas."
                    });
            add(Blocks.POLISHED_BLACKSTONE,
                    new String[] {
                            "Compacted, smooth blackstone.",
                            "Useful for decorative purposes."
                    });
            add(Blocks.POLISHED_BLACKSTONE_BRICKS,
                    new String[] {
                            "Polished blackstone cut into bricks."
                    });
            add(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,
                    new String[] {
                            "Polished blackstone bricks cracked from age."
                    });
            add(Blocks.CHISELED_POLISHED_BLACKSTONE,
                    new String[] {
                            "Polished blackstone bricks carved with a snout pattern."
                    });
            add(Blocks.POLISHED_DIORITE,
                    new String[] {
                            "Compacted, smooth diorite.",
                            "Useful for decorative purposes."
                    });
            add(Blocks.POLISHED_GRANITE,
                    new String[] {
                            "Compacted, smooth granite.",
                            "Useful for decorative purposes."
                    });
            add(Blocks.POLISHED_DEEPSLATE,
                    new String[] {
                            "Compacted, smooth deepslate.",
                            "Useful for decorative purposes."
                    });
            add(Blocks.PRISMARINE,
                    new String[] {
                            "A strange, color-changing stone found exclusively in Ocean Monuments and Ocean Ruins."
                    });
            add(Blocks.PRISMARINE_BRICKS,
                    new String[] {
                            "Prismarine cut into bricks, only found in Ocean Monuments."
                    });
            add(Blocks.DARK_PRISMARINE,
                    new String[] {
                            "Prismarine dyed with Squid Ink, found only in wall patterns of Ocean Monuments."
                    });
            add(Blocks.PURPUR_BLOCK,
                    new String[] {
                            "A block found in End Cities made of popped chorus fruit."
                    });
            add(Blocks.PURPUR_PILLAR,
                    new String[] {
                            "A purpur block cut in the shape of a pillar."
                    });
            add(Blocks.SMOOTH_STONE,
                    new String[] {
                            "Compacted, smooth stone.",
                            "Useful for decorative purposes."
                    });
            add(Blocks.STONE_BRICKS,
                    new String[] {
                            "Stone cut into bricks.",
                            "Useful for decorative purposes."
                    });
            add(Blocks.CRACKED_STONE_BRICKS,
                    new String[] {
                            "Stone bricks cracked from age.",
                            "Useful for decorative purposes."
                    });
            add(Blocks.MOSSY_STONE_BRICKS,
                    new String[] {
                            "Stone bricks covered in moss.",
                            "Useful for decorative purposes."
                    });
            add(Blocks.CHISELED_STONE_BRICKS,
                    new String[] {
                            "Stone bricks cut with a specific pattern."
                    });
        }
        private void addLighting() {
            var candleFlavorText = new String[] {
                    "A light source made out of wax and a piece of string.",
                    "They come in colorful variants."
            };
            add(Blocks.CANDLE, candleFlavorText);
            add(Blocks.WHITE_CANDLE, candleFlavorText);
            add(Blocks.ORANGE_CANDLE, candleFlavorText);
            add(Blocks.MAGENTA_CANDLE, candleFlavorText);
            add(Blocks.LIGHT_BLUE_CANDLE, candleFlavorText);
            add(Blocks.YELLOW_CANDLE, candleFlavorText);
            add(Blocks.LIME_CANDLE, candleFlavorText);
            add(Blocks.PINK_CANDLE, candleFlavorText);
            add(Blocks.GRAY_CANDLE, candleFlavorText);
            add(Blocks.LIGHT_GRAY_CANDLE, candleFlavorText);
            add(Blocks.CYAN_CANDLE, candleFlavorText);
            add(Blocks.PURPLE_CANDLE, candleFlavorText);
            add(Blocks.BLUE_CANDLE, candleFlavorText);
            add(Blocks.BROWN_CANDLE, candleFlavorText);
            add(Blocks.GREEN_CANDLE, candleFlavorText);
            add(Blocks.RED_CANDLE, candleFlavorText);
            add(Blocks.BLACK_CANDLE, candleFlavorText);
            add(Blocks.END_ROD,
                    new String[] {
                            "A light source found in End Cities.",
                            "Crafted using a blaze rod."
                    });
            add(Blocks.JACK_O_LANTERN,
                    new String[] {
                            "A carved pumpkin with a torch inside.",
                            "Spooky!"
                    });
            add(Blocks.LANTERN,
                    new String[] {
                            "A small light source that can hang from other blocks."
                    });
            add(Blocks.SOUL_LANTERN,
                    new String[] {
                            "A lantern that creates light by burning souls."
                    });
            add(Blocks.SEA_LANTERN,
                    new String[] {
                            "A light source found in Ocean Monuments made using prismarine crystals."
                    });
            add(Blocks.TORCH,
                    new String[] {
                            "A simple light source made of a stick and a piece of coal or charcoal."
                    });
            add(Blocks.SOUL_TORCH,
                    new String[] {
                            "A torch that creates light by burning souls."
                    });
        }

        private void addUtilityBlocks() {
            addInteractable();
            addUtilizable();
            addMechanical();
        }

        private void addInteractable() {
        }
        private void addUtilizable() {
        }
        private void addMechanical() {
        }

        private void addOtherBlocks() {
        }

        private void addItems() {
        }

        private void add(Block block, String[] lines) {
            translationBuilder.add(block.getTranslationKey() + ".expanded_tooltips.desc", String.join("\n", lines));
        }

        private void add(Item item, String[] lines) {
            translationBuilder.add(item.getTranslationKey() + ".expanded_tooltips.desc", String.join("\n", lines));
        }
    }
}
