package foxhub.expandedtooltips;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistry;
import net.fabricmc.fabric.impl.registry.sync.FabricRegistryInit;
import net.minecraft.block.*;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.TippedArrowItem;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

            this.addBlocks();
            this.addItems();
        }

        private void addBlocks() {
            //Natural
            this.soil();
            this.stone();
            this.mineral();
            this.liquid();
            this.nonPhysical();

            //Biota
            this.wood();
            this.plant();
            this.fungus();
            this.fauna();
            this.faunaProduct();
            this.algae();

            //Building
            this.decorative();
            this.mineralBlocks();
            this.manufactured();
            this.lighting();

            //Utility
            this.interactable();
            this.utilizable();
            this.mechanical();

            this.otherBlocks();
        }

        private void addItems() {
            this.materials();
            this.processed();
            this.food();
            this.seeds();
            this.dyes();
            this.tools();
            this.informational();
            this.weapons();
            this.armor();
            this.transportation();
            this.utility();
            this.otherItems();
        }

        private void soil() {
            addTooltip(Blocks.CLAY, "A wet block of fine-grained natural soil.", "When smelted, it can be used in many building applications.");
            addTooltip(Blocks.DIRT, "A block of soil uprooted from the Overworld.", "Versatile for many natural applications.");
            addTooltip(Blocks.COARSE_DIRT, "A block of soil uprooted from the Overworld.", "Incapable of growing plants due to its coarser complexion.");
            addTooltip(Blocks.ROOTED_DIRT, "A block of soil, pierced by Azalea roots.", "Following this block downward tends to lead to a lush cave.");
            addTooltip(Blocks.DIRT_PATH, "A well-worn path made in the dirt.", "Its top has the appearance of dead grass.");
            addTooltip(Blocks.GRASS_BLOCK, "A block of soil which has sprung life.", "Its color depends on the temperature of the biome.");
            addTooltip(Blocks.GRAVEL, "A block made up of many tiny stones.", "Abides by the laws of gravity that govern entities.");
            //1.20 addTooltip(Blocks.SUSPICIOUS_GRAVEL, "A block of sediment with ancient artifacts inside.");
            addTooltip(Blocks.MUD, "A block of wet dirt, rich with minerals.", "Supports the unique plant life of Mangrove Swamps.");
            addTooltip(Blocks.MYCELIUM, "A block of dirt part of a network of mushrooms.", "Supports the growth of mushrooms even in bright areas.");
            var nyliumTooltip = addTooltipText("A block of netherrack part of a network of Nether fungus.", "Unlike mycelium, bone meal can be used to spread it.");
            addTooltip(Blocks.CRIMSON_NYLIUM, nyliumTooltip);
            addTooltip(Blocks.WARPED_NYLIUM, nyliumTooltip);
            addTooltip(Blocks.PODZOL, "A block of dirt found in dense, wooded areas.", "Formed from quartz-rich sand and sedimentary debris.");
            addTooltip(Blocks.SAND, "A block made up of tiny minerals.", "Abides by the laws of gravity that govern entities.");
            addTooltip(Blocks.SUSPICIOUS_SAND, "A block of sediment with ancient artifacts inside.");
            addTooltip(Blocks.RED_SAND, "A block made up of tiny minerals, containing some iron.", "Abides by the laws of gravity that govern entities.");
            addTooltip(Blocks.SOUL_SAND, "A common sediment in the Nether.", "The faces seen come from the many souls captured inside.");
            addTooltip(Blocks.SOUL_SOIL, "A less compact soul sand common in Soul Sand Valleys.", "The faces signature of soul sand appear stretched.");
        }
        private void stone() {
            addTooltip(Blocks.ANDESITE, "An igneous rock found in the Overworld.", "Its palette blends with usual stone.");
            addTooltipForVariants(Blocks.ANDESITE, Blocks.ANDESITE_STAIRS, Blocks.ANDESITE_SLAB, Blocks.ANDESITE_WALL);
            addTooltip(Blocks.BEDROCK, "A strong rock found at the bottom of the world.", "Attempting to mine it would be a fool’s errand.");
            addTooltip(Blocks.BASALT, "A volcanic rock found in the Nether.", "It forms large pillars found throughout Basalt Deltas.");
            addTooltip(Blocks.SMOOTH_BASALT, "A volcanic rock that surrounds amethyst geodes.", "Similar to basalt formations found in the Nether.");
            addTooltip(Blocks.BLACKSTONE, "A charred-looking stone found mostly in Basalt Deltas.", "The denizens of the Nether have extracted much of it.");
            addTooltipForVariants(Blocks.BLACKSTONE, Blocks.BLACKSTONE_STAIRS, Blocks.BLACKSTONE_SLAB, Blocks.BLACKSTONE_WALL);
            addTooltip(Blocks.GILDED_BLACKSTONE, "Blackstone with veins of gold forged into it by the Piglins.", "Seemingly only for vanity, like much of their crude society.");
            addTooltip(Blocks.CALCITE, "A carbonate rock that surrounds amethyst geodes.", "Very brittle, making it not carvable.");
            addTooltip(Blocks.COBBLESTONE, "A building material made of large rocks.", "Necessary for virtually any adventurer or builder.");
            addTooltipForVariants(Blocks.COBBLESTONE, Blocks.COBBLESTONE_STAIRS, Blocks.COBBLESTONE_SLAB, Blocks.COBBLESTONE_WALL);
            addTooltip(Blocks.MOSSY_COBBLESTONE, "A block of cobblestone, covered in moss.", "Found in many mysterious ancient structures.");
            addTooltipForVariants(Blocks.MOSSY_COBBLESTONE, Blocks.MOSSY_COBBLESTONE_STAIRS, Blocks.MOSSY_COBBLESTONE_SLAB, Blocks.MOSSY_COBBLESTONE_WALL);
            addTooltip(Blocks.DEEPSLATE, "A hard stone found in the deepest caverns of the Overworld.", "Rare materials can be found within it, if one is lucky.");
            addTooltip(Blocks.DIORITE, "An igneous rock found in the Overworld.", "It is an abundant resource useful for decoration.");
            addTooltipForVariants(Blocks.DIORITE, Blocks.DIORITE_STAIRS, Blocks.DIORITE_SLAB, Blocks.DIORITE_WALL);
            addTooltip(Blocks.DRIPSTONE_BLOCK, "A strange rock, formed by time in the Dripstone Caves.", "However it is very brittle, making it not carvable.");
            addTooltip(Blocks.END_STONE, "A strange type of rock found in the End.", "Harbors twisted forms of life native to the dimension.");
            addTooltip(Blocks.GLOWSTONE, "A glowing crystal that grows on the ceiling of the Nether.", "Holds magical properties such as strengthening of potions.");
            addTooltip(Blocks.GRANITE, "An igneous rock found in the Overworld.", "Can indicate the presence of a large copper vein.");
            addTooltipForVariants(Blocks.GRANITE, Blocks.GRANITE_STAIRS, Blocks.GRANITE_SLAB, Blocks.GRANITE_WALL);
            var infestedBlocksTooltip = addTooltipText("A block of stone infested by a Silverfish.", "This sample was harvested in a way to preserve the rock.");
            addTooltip(Blocks.INFESTED_STONE, infestedBlocksTooltip);
            addTooltip(Blocks.INFESTED_COBBLESTONE, infestedBlocksTooltip);
            addTooltip(Blocks.INFESTED_STONE_BRICKS, infestedBlocksTooltip);
            addTooltip(Blocks.INFESTED_MOSSY_STONE_BRICKS, infestedBlocksTooltip);
            addTooltip(Blocks.INFESTED_CRACKED_STONE_BRICKS, infestedBlocksTooltip);
            addTooltip(Blocks.INFESTED_CHISELED_STONE_BRICKS, infestedBlocksTooltip);
            addTooltip(Blocks.INFESTED_DEEPSLATE, infestedBlocksTooltip);
            addTooltip(Blocks.MAGMA_BLOCK, "Molten rock found ubiquitously throughout the Nether.", "Also found in deep aquifers, though less common.");
            addTooltip(Blocks.NETHERRACK, "A flesh-like rock making up the majority of the Nether.", "It can be smelted to make a unique type of brick.");
            addTooltip(Blocks.OBSIDIAN, "A very tough glass with otherworldly potential.", "Formed when water flows into lava.");
            addTooltip(Blocks.CRYING_OBSIDIAN, "A cracked block of obsidian, overflowing with energy.", "Quite unstable compared to its normal counterpart.");
            addTooltip(Blocks.POINTED_DRIPSTONE, "A sharp form of dripstone.", "Deals damage to those who touch the point.");
            addTooltip(Blocks.SANDSTONE, "A sedimentary rock commonly found below sand.", "Makes for a good path block, in lieu of dirt.");
            addTooltipForVariants(Blocks.SANDSTONE, Blocks.SANDSTONE_STAIRS, Blocks.SANDSTONE_SLAB, Blocks.SANDSTONE_WALL);
            addTooltip(Blocks.RED_SANDSTONE, "A sedimentary rock commonly found below red sand.", "Trace amounts of iron give it a more reddish appearance.");
            addTooltipForVariants(Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_STAIRS, Blocks.RED_SANDSTONE_SLAB, Blocks.RED_SANDSTONE_WALL);
            addTooltip(Blocks.STONE, "A very versatile material, making up the majority of the Overworld’s upper layers.");
            addTooltipForVariants(Blocks.STONE, Blocks.STONE_STAIRS, Blocks.STONE_SLAB, Blocks.STONE_PRESSURE_PLATE, Blocks.STONE_BUTTON);
            var terracottaTooltip = addTooltipText("A hardened block of clay.", "Makes beautiful multi-colored stripes in Badlands.");
            addTooltip(Blocks.TERRACOTTA, terracottaTooltip);
            addTooltip(Blocks.WHITE_TERRACOTTA, terracottaTooltip);
            addTooltip(Blocks.ORANGE_TERRACOTTA, terracottaTooltip);
            addTooltip(Blocks.MAGENTA_TERRACOTTA, terracottaTooltip);
            addTooltip(Blocks.LIGHT_BLUE_TERRACOTTA, terracottaTooltip);
            addTooltip(Blocks.YELLOW_TERRACOTTA, terracottaTooltip);
            addTooltip(Blocks.LIME_TERRACOTTA, terracottaTooltip);
            addTooltip(Blocks.PINK_TERRACOTTA, terracottaTooltip);
            addTooltip(Blocks.GRAY_TERRACOTTA, terracottaTooltip);
            addTooltip(Blocks.LIGHT_GRAY_TERRACOTTA, terracottaTooltip);
            addTooltip(Blocks.CYAN_TERRACOTTA, terracottaTooltip);
            addTooltip(Blocks.PURPLE_TERRACOTTA, terracottaTooltip);
            addTooltip(Blocks.BLUE_TERRACOTTA, terracottaTooltip);
            addTooltip(Blocks.BROWN_TERRACOTTA, terracottaTooltip);
            addTooltip(Blocks.GREEN_TERRACOTTA, terracottaTooltip);
            addTooltip(Blocks.RED_TERRACOTTA, terracottaTooltip);
            addTooltip(Blocks.BLACK_TERRACOTTA, terracottaTooltip);
            addTooltip(Blocks.TUFF, "An ornamental rock formed from volcanic ash.", "Can signal the presence of a large iron vein.");
        }
        private void mineral() {
            var growingAmethyst = addTooltipText("A crystal found growing in amethyst geodes.", "Makes a satisfying ringing noise if mined.");
            addTooltip(Blocks.SMALL_AMETHYST_BUD, growingAmethyst);
            addTooltip(Blocks.MEDIUM_AMETHYST_BUD, growingAmethyst);
            addTooltip(Blocks.LARGE_AMETHYST_BUD, growingAmethyst);
            addTooltip(Blocks.AMETHYST_CLUSTER, growingAmethyst);
            addTooltip(Blocks.ANCIENT_DEBRIS, "Remains of an unknown metal found buried deep in the Nether.", "Piglins seem to have abandoned it for the more common gold.");
            addTooltip(Blocks.BUDDING_AMETHYST, "A crystal block, which amethyst clusters grow from.", "Shatters under even the most delicate touch.");
            addTooltip(Blocks.COAL_ORE, "A block of stone, with chunks of Coal inside.", "It is most common throughout the surface of the Overworld.");
            addTooltip(Blocks.COPPER_ORE, "A block of stone, with chunks of Copper inside.", "Common in higher-level caves, especially Dripstone Caves.");
            addTooltip(Blocks.DIAMOND_ORE, "A block of stone, with chunks of Diamond inside.", "Common in Deepslate, so finding this variant is a rarity.");
            addTooltip(Blocks.EMERALD_ORE, "A block of stone, with chunks of Emerald inside.", "Common in high mountains, so this variant is a rarity.");
            addTooltip(Blocks.IRON_ORE, "A block of stone, with chunks of Iron inside.", "Most common high up, but large veins can be in lower caves.");
            addTooltip(Blocks.LAPIS_ORE, "A block of stone, with chunks of Lapis Lazuli inside.", "It is rare, spread throughout every layer of the Overworld.");
            addTooltip(Blocks.REDSTONE_ORE, "A block of stone, with crystals of Redstone inside.", "It gets more common as depth increases.");
            addTooltip(Blocks.GOLD_ORE, "A block of stone, with chunks of Gold inside.", "Common in Badlands but otherwise tends to be found low down.");
            addTooltip(Blocks.DEEPSLATE_COAL_ORE, "A block of deepslate embedded with coal.", "It is common throughout the surface of the Overworld.");
            addTooltip(Blocks.DEEPSLATE_COPPER_ORE, "A block of deepslate embedded with copper.", "Common in Dripstone Caves and large veins.");
            addTooltip(Blocks.DEEPSLATE_IRON_ORE, "A block of deepslate embedded with iron.", "Great amounts can be found in large veins.");
            addTooltip(Blocks.DEEPSLATE_GOLD_ORE, "A block of deepslate embedded with gold.", "Tends to be found lower down.");
            addTooltip(Blocks.DEEPSLATE_DIAMOND_ORE, "A block of deepslate embedded with diamond.", "More common as you descend.");
            addTooltip(Blocks.DEEPSLATE_REDSTONE_ORE, "A block of deepslate embedded with redstone", "More common as you descend.");
            addTooltip(Blocks.DEEPSLATE_LAPIS_ORE, "A block of deepslate embedded with lapis lazuli", "Rare, but spread throughout many layers of the Overworld.");
            addTooltip(Blocks.DEEPSLATE_EMERALD_ORE, "A block of deepslate embedded with emerald", "Common in high mountains, so this variant is a rarity.");
            addTooltip(Blocks.NETHER_GOLD_ORE, "A block of netherrack, with small chunks of Gold inside.", "It can be found all throughout the Nether.");
            addTooltip(Blocks.NETHER_QUARTZ_ORE, "A block of netherrack, with chunks of Quartz inside.", "It can be found all throughout the Nether.");
        }
        private void liquid() {
            addTooltip(Blocks.ICE, "Water’s solid state.", "In some biomes water will freeze into it within minutes.");
            addTooltip(Blocks.BLUE_ICE, "Compressed, slippery ice found underwater in icebergs.", "Can solidify lava into basalt if near soul sand.");
            addTooltip(Blocks.PACKED_ICE, "Compressed ice found in glaciers and icebergs.", "Can be used to increase the flow speed of a water stream.");
            addTooltip(Blocks.LAVA, "Superheated rock in liquid form.", "Found in the Nether and Overworld, though quantities differ.");
            addTooltip(Blocks.POWDER_SNOW, "A light, fluffy snow, found in mountains.", "Don’t fall in!");
            addTooltip(Blocks.SNOW, "The thin top layers of fallen snow on the ground.");
            addTooltip(Blocks.SNOW_BLOCK, "A thick layer of snow found in cold biomes and mountains.", "Can create a Snow Golem along with a carved pumpkin.");
            addTooltip(Blocks.WATER, "An easily renewable, common liquid found in the Overworld.", "Evaporates when poured in the Nether.");
        }
        private void nonPhysical() {
            var airTooltip = addTooltipText("An invisible gas found everywhere in the Overworld, Nether and The End.");
            addTooltip(Blocks.AIR, airTooltip);
            addTooltip(Blocks.CAVE_AIR, airTooltip);
            addTooltip(Blocks.VOID_AIR, airTooltip);
            addTooltip(Blocks.FIRE, "A very hot plasma.", "It burns!");
            addTooltip(Blocks.SOUL_FIRE, "A very hot plasma created when burning souls.");
            addTooltip(Blocks.LIGHT, "A mysterious block of pure light.");
            addTooltip(Blocks.STRUCTURE_VOID, "A mysterious block that has not been found to have any use.");
        }
        private void wood() {
            var overworldLogsTooltip = addTooltipText("The log of a tree found in the Overworld.", "Used extensively in crafting.");
            addTooltip(Blocks.ACACIA_LOG, overworldLogsTooltip);
            addTooltip(Blocks.BIRCH_LOG, overworldLogsTooltip);
            addTooltip(Blocks.CHERRY_LOG, overworldLogsTooltip);
            addTooltip(Blocks.OAK_LOG, overworldLogsTooltip);
            addTooltip(Blocks.JUNGLE_LOG, overworldLogsTooltip);
            addTooltip(Blocks.DARK_OAK_LOG, overworldLogsTooltip);
            addTooltip(Blocks.SPRUCE_LOG, overworldLogsTooltip);
            addTooltip(Blocks.MANGROVE_LOG, overworldLogsTooltip);
            var strippedOverworldLogsTooltip = addTooltipText("An Overworld log removed of its bark using an axe.");
            addTooltip(Blocks.STRIPPED_ACACIA_LOG, strippedOverworldLogsTooltip);
            addTooltip(Blocks.STRIPPED_BIRCH_LOG, strippedOverworldLogsTooltip);
            addTooltip(Blocks.STRIPPED_CHERRY_LOG, strippedOverworldLogsTooltip);
            addTooltip(Blocks.STRIPPED_OAK_LOG, strippedOverworldLogsTooltip);
            addTooltip(Blocks.STRIPPED_JUNGLE_LOG, strippedOverworldLogsTooltip);
            addTooltip(Blocks.STRIPPED_DARK_OAK_LOG, strippedOverworldLogsTooltip);
            addTooltip(Blocks.STRIPPED_SPRUCE_LOG, strippedOverworldLogsTooltip);
            addTooltip(Blocks.STRIPPED_MANGROVE_LOG, strippedOverworldLogsTooltip);
            addTooltip(Blocks.STRIPPED_BAMBOO_BLOCK, "A Bamboo Block removed of its bark using an axe.");
            var overworldWoodTooltip = addTooltipText("An Overworld log with all sides covered in bark.");
            addTooltip(Blocks.ACACIA_WOOD, overworldWoodTooltip);
            addTooltip(Blocks.BIRCH_WOOD, overworldWoodTooltip);
            addTooltip(Blocks.CHERRY_WOOD, overworldWoodTooltip);
            addTooltip(Blocks.OAK_WOOD, overworldWoodTooltip);
            addTooltip(Blocks.JUNGLE_WOOD, overworldWoodTooltip);
            addTooltip(Blocks.DARK_OAK_WOOD, overworldWoodTooltip);
            addTooltip(Blocks.SPRUCE_WOOD, overworldWoodTooltip);
            addTooltip(Blocks.MANGROVE_WOOD, overworldWoodTooltip);
            var strippedOverworldWoodTooltip = addTooltipText("Overworld wood removed of its bark using an axe.");
            addTooltip(Blocks.STRIPPED_ACACIA_WOOD, strippedOverworldWoodTooltip);
            addTooltip(Blocks.STRIPPED_BIRCH_WOOD, strippedOverworldWoodTooltip);
            addTooltip(Blocks.STRIPPED_CHERRY_WOOD, strippedOverworldWoodTooltip);
            addTooltip(Blocks.STRIPPED_OAK_WOOD, strippedOverworldWoodTooltip);
            addTooltip(Blocks.STRIPPED_JUNGLE_WOOD, strippedOverworldWoodTooltip);
            addTooltip(Blocks.STRIPPED_DARK_OAK_WOOD, strippedOverworldWoodTooltip);
            addTooltip(Blocks.STRIPPED_SPRUCE_WOOD, strippedOverworldWoodTooltip);
            addTooltip(Blocks.STRIPPED_MANGROVE_WOOD, strippedOverworldWoodTooltip);
            addTooltip(Blocks.MANGROVE_ROOTS, "Large above-ground roots from mangrove trees.", "Keep them tied to the swampy ground.");
            addTooltip(Blocks.MUDDY_MANGROVE_ROOTS, "Large above-ground roots from mangrove trees.", "Found tangled through the thick mud of Mangrove Swamps.");
            var netherStemTooltip = addTooltipText("The stem of a huge fungus found in the Nether.", "Somehow immune to flame, unlike its Overworld counterpart.");
            addTooltip(Blocks.CRIMSON_STEM, netherStemTooltip);
            addTooltip(Blocks.WARPED_STEM, netherStemTooltip);
            var strippedNetherStemTooltip = addTooltipText("Nether stem removed of its outer layer using an axe.");
            addTooltip(Blocks.STRIPPED_CRIMSON_STEM, strippedNetherStemTooltip);
            addTooltip(Blocks.STRIPPED_WARPED_STEM, strippedNetherStemTooltip);
            var netherHyphaeTooltip = addTooltipText("A Nether stem with an outer layer on all sides.");
            addTooltip(Blocks.CRIMSON_HYPHAE, netherHyphaeTooltip);
            addTooltip(Blocks.WARPED_HYPHAE, netherHyphaeTooltip);
            var strippedNetherHyphaeTooltip = addTooltipText("Nether hyphae removed of its outer layer using an axe.");
            addTooltip(Blocks.STRIPPED_CRIMSON_HYPHAE, strippedNetherHyphaeTooltip);
            addTooltip(Blocks.STRIPPED_WARPED_HYPHAE, strippedNetherHyphaeTooltip);
        }
        private void plant() {
            addTooltip(Blocks.AZALEA, "A bush that grows in the Lush Caves biome.", "Can be grown into a full azalea tree with bone meal.");
            addTooltip(Blocks.FLOWERING_AZALEA, "A bush that grows in the Lush Caves biome, adorned with pink flowers.");
            addTooltip(Blocks.BAMBOO, "A tall & sturdy plant found in the Jungle biome.", "Grows extremely fast, making it a great fuel source.");
            addTooltip(Blocks.SMALL_DRIPLEAF, "A strange plant found in the Lush Caves.", "Unable to hold creatures, unlike its larger counterpart.");
            addTooltip(Blocks.BIG_DRIPLEAF, "A strange plant found in the Lush Caves.", "The strong stem holds creatures for a moment before sagging.");
            addTooltip(Blocks.CACTUS, "Prickly on the outside, wet on the inside.", "Found in desert biomes and used to create a green pigment.");
            addTooltip(Blocks.CAVE_VINES, "Glow Berry vines that grow on the ceilings of Lush Caves.", "Not very filling, but a useful food source when spelunking.");
            addTooltip(Blocks.COCOA, "A bean found on the side of Jungle trees.", "Used to make delicious chocolate chip cookies.");
            addTooltip(Blocks.CHORUS_PLANT, "The main stalk of a plant found in the End.", "Commonly found in the outer islands.");
            addTooltip(Blocks.CHORUS_FLOWER, "A flowering Chorus Plant that can be used to grow another.");
            addTooltip(Blocks.DEAD_BUSH, "A dried-out shrub found in some biomes.");
            var fernsTooltip = addTooltipText("A flowerless plant found all over Taiga biomes.", "Can be harvested for wheat seeds.");
            addTooltip(Blocks.FERN, fernsTooltip);
            addTooltip(Blocks.LARGE_FERN, fernsTooltip);
            var smallFlowersTooltip = addTooltipText("A small flower found in the Overworld.");
            addTooltip(Blocks.DANDELION, smallFlowersTooltip);
            addTooltip(Blocks.POPPY, smallFlowersTooltip);
            addTooltip(Blocks.BLUE_ORCHID, smallFlowersTooltip);
            addTooltip(Blocks.ALLIUM, smallFlowersTooltip);
            addTooltip(Blocks.AZURE_BLUET, smallFlowersTooltip);
            addTooltip(Blocks.RED_TULIP, smallFlowersTooltip);
            addTooltip(Blocks.ORANGE_TULIP, smallFlowersTooltip);
            addTooltip(Blocks.WHITE_TULIP, smallFlowersTooltip);
            addTooltip(Blocks.PINK_TULIP, smallFlowersTooltip);
            addTooltip(Blocks.OXEYE_DAISY, smallFlowersTooltip);
            addTooltip(Blocks.CORNFLOWER, smallFlowersTooltip);
            addTooltip(Blocks.LILY_OF_THE_VALLEY, smallFlowersTooltip);
            addTooltip(Blocks.PINK_PETALS, smallFlowersTooltip);
            var largeFlowersTooltip = addTooltipText("A small flower found in the Overworld.");
            addTooltip(Blocks.SUNFLOWER, largeFlowersTooltip);
            addTooltip(Blocks.LILAC, largeFlowersTooltip);
            addTooltip(Blocks.ROSE_BUSH, largeFlowersTooltip);
            addTooltip(Blocks.PEONY, largeFlowersTooltip);
            addTooltip(Blocks.TORCHFLOWER, "An ancient plant dug up by Sniffers.");
            //1.20 addTooltip(Blocks.PITCHER_PLANT, "An ancient plant dug up by Sniffers.");
            addTooltip(Blocks.WITHER_ROSE, "A small, dangerous flower created by the Wither.");
            var grassTooltip = addTooltipText("A small plant found wherever you look in the Overworld.", "Can be harvested for wheat seeds.");
            addTooltip(Blocks.GRASS, grassTooltip);
            addTooltip(Blocks.TALL_GRASS, grassTooltip);
            addTooltip(Blocks.HANGING_ROOTS, "The ends of the roots of Azalea trees hanging down from blocks.");
            var leavesTooltip = addTooltipText("Leaves from a tree found in the Overworld.");
            addTooltip(Blocks.ACACIA_LEAVES, leavesTooltip);
            addTooltip(Blocks.AZALEA_LEAVES, leavesTooltip);
            addTooltip(Blocks.BIRCH_LEAVES, leavesTooltip);
            addTooltip(Blocks.CHERRY_LEAVES, leavesTooltip);
            addTooltip(Blocks.DARK_OAK_LEAVES, leavesTooltip);
            addTooltip(Blocks.JUNGLE_LEAVES, leavesTooltip);
            addTooltip(Blocks.FLOWERING_AZALEA_LEAVES, leavesTooltip);
            addTooltip(Blocks.MANGROVE_LEAVES, leavesTooltip);
            addTooltip(Blocks.OAK_LEAVES, leavesTooltip);
            addTooltip(Blocks.SPRUCE_LEAVES, leavesTooltip);
            addTooltip(Blocks.LILY_PAD, "Floating plants found in Overworld swamps.", "Can support the weight of many creatures.");
            addTooltip(Blocks.MELON, "A large, juicy fruit, found in the Jungle biome.");
            var mossTooltip = addTooltipText("A plant that grows in some places in the Overworld, especially in moist environments such as the Lush Caves.");
            addTooltip(Blocks.MOSS_BLOCK, mossTooltip);
            addTooltip(Blocks.MOSS_CARPET, mossTooltip);
            addTooltip(Blocks.PUMPKIN, "Large orange gourds often used in Golem creation.", "Found in groups across the Overworld.");
            addTooltip(Blocks.CARVED_PUMPKIN, "A Pumpkin carved with a spooky face.", "Boo!");
            var saplingsTooltip = addTooltipText("The sapling of a tree found in the Overworld.");
            addTooltip(Blocks.SPRUCE_SAPLING, saplingsTooltip);
            addTooltip(Blocks.ACACIA_SAPLING, saplingsTooltip);
            addTooltip(Blocks.BIRCH_SAPLING, saplingsTooltip);
            addTooltip(Blocks.CHERRY_SAPLING, saplingsTooltip);
            addTooltip(Blocks.DARK_OAK_SAPLING, saplingsTooltip);
            addTooltip(Blocks.JUNGLE_SAPLING, saplingsTooltip);
            addTooltip(Blocks.OAK_SAPLING, saplingsTooltip);
            addTooltip(Blocks.MANGROVE_PROPAGULE, saplingsTooltip);
            var seagrassesTooltip = addTooltipText("A small plant found under the Overworld’s oceans and rivers.");
            addTooltip(Blocks.SEAGRASS, seagrassesTooltip);
            addTooltip(Blocks.TALL_SEAGRASS, seagrassesTooltip);
            addTooltip(Blocks.SPORE_BLOSSOM, "Large pink flowers found hanging from the ceilings of Lush caves.");
            addTooltip(Blocks.SUGAR_CANE, "A reed found near water that can be crushed into sugar, or crafted into parchment.");
            addTooltip(Blocks.VINE, "A plant that grows all over the sides of other blocks.", "Mostly found in lush, forested biomes.");
            addTooltip(Blocks.HAY_BLOCK, "A bundled block of nine bunches of wheat.", "Found in large piles in Villages.");
        }
        private void fungus() {
            var netherFungiTooltip = addTooltipText("A fungus that grows in Nether forests.", "The warped variant can be used to repel Hoglins.");
            addTooltip(Blocks.CRIMSON_FUNGUS, netherFungiTooltip);
            addTooltip(Blocks.WARPED_FUNGUS, netherFungiTooltip);
            addTooltip(Blocks.GLOW_LICHEN, "A glowing fungus that is found in the Overworld‘s caves.");
            var mushroomTooltip = addTooltipText("A small mushroom found across dimensions.");
            var mushroomBlockTooltip = addTooltipText("The cap of a huge mushroom, found in some Overworld biomes.");
            addTooltip(Blocks.BROWN_MUSHROOM, mushroomTooltip);
            addTooltip(Blocks.RED_MUSHROOM, mushroomTooltip);
            addTooltip(Blocks.BROWN_MUSHROOM_BLOCK, mushroomBlockTooltip);
            addTooltip(Blocks.RED_MUSHROOM_BLOCK, mushroomBlockTooltip);
            addTooltip(Blocks.MUSHROOM_STEM, "The stem of a huge mushroom from the Overworld.");
            addTooltip(Blocks.NETHER_SPROUTS, "Small fungus found in the Warped Forest biome.");
            addTooltip(Blocks.NETHER_WART, "A fungus sprout found in the Nether.", "Seemingly extinct outside of small gardens in Nether Fortresses.");
            addTooltip(Blocks.NETHER_WART_BLOCK, "A compact block of Nether Wart.", "Found in the caps of crimson huge fungi.");
            addTooltip(Blocks.WARPED_WART_BLOCK, "A block of warped Nether Wart.", "Found in the caps of warped huge fungi.");
            var netherRootsTooltip = addTooltipText("Small roots found in Nether forests.", "Hint at a larger mycelium network.");
            addTooltip(Blocks.CRIMSON_ROOTS, netherRootsTooltip);
            addTooltip(Blocks.WARPED_ROOTS, netherRootsTooltip);
            addTooltip(Blocks.SHROOMLIGHT, "A glowing mushroom found on the caps of huge fungi in the Nether.");
            addTooltip(Blocks.TWISTING_VINES, "Tall stalks found growing upwards, commonly in the Nether’s Warped Forests.");
            addTooltip(Blocks.WEEPING_VINES, "Ving growing down from the ceiling, Commonly found in the Nether’s Crimson Forest.");
        }
        private void fauna() {
            var coralTooltip = addTooltipText("A colorful underwater creature found in reefs.", "Found as part of a larger coral colony.");
            addTooltip(Blocks.TUBE_CORAL, coralTooltip);
            addTooltip(Blocks.BRAIN_CORAL, coralTooltip);
            addTooltip(Blocks.BUBBLE_CORAL, coralTooltip);
            addTooltip(Blocks.FIRE_CORAL, coralTooltip);
            addTooltip(Blocks.HORN_CORAL, coralTooltip);
            var deadCoralTooltip = addTooltipText("Dried-out coral, created when there isn’t enough water.");
            addTooltip(Blocks.DEAD_TUBE_CORAL, deadCoralTooltip);
            addTooltip(Blocks.DEAD_BRAIN_CORAL, deadCoralTooltip);
            addTooltip(Blocks.DEAD_BUBBLE_CORAL, deadCoralTooltip);
            addTooltip(Blocks.DEAD_FIRE_CORAL, deadCoralTooltip);
            addTooltip(Blocks.DEAD_HORN_CORAL, deadCoralTooltip);
            var coralBlocksTooltip = addTooltipText("A block-like underwater creature part of a coral colony, found in reefs.");
            addTooltip(Blocks.TUBE_CORAL_BLOCK, coralBlocksTooltip);
            addTooltip(Blocks.BRAIN_CORAL_BLOCK, coralBlocksTooltip);
            addTooltip(Blocks.BUBBLE_CORAL_BLOCK, coralBlocksTooltip);
            addTooltip(Blocks.FIRE_CORAL_BLOCK, coralBlocksTooltip);
            addTooltip(Blocks.HORN_CORAL_BLOCK, coralBlocksTooltip);
            var deadCoralBlocksTooltip = addTooltipText("A block of dried-out coral, created when there isn’t enough water.");
            addTooltip(Blocks.DEAD_TUBE_CORAL_BLOCK, deadCoralBlocksTooltip);
            addTooltip(Blocks.DEAD_BRAIN_CORAL_BLOCK, deadCoralBlocksTooltip);
            addTooltip(Blocks.DEAD_BUBBLE_CORAL_BLOCK, deadCoralBlocksTooltip);
            addTooltip(Blocks.DEAD_FIRE_CORAL_BLOCK, deadCoralBlocksTooltip);
            addTooltip(Blocks.DEAD_HORN_CORAL_BLOCK, deadCoralBlocksTooltip);
            var coralFansTooltip = addTooltipText("A small piece of coral, found growing on coral colonies in reefs.");
            addTooltip(Blocks.TUBE_CORAL_FAN, coralFansTooltip);
            addTooltip(Blocks.BRAIN_CORAL_FAN, coralFansTooltip);
            addTooltip(Blocks.BUBBLE_CORAL_FAN, coralFansTooltip);
            addTooltip(Blocks.FIRE_CORAL_FAN, coralFansTooltip);
            addTooltip(Blocks.HORN_CORAL_FAN, coralFansTooltip);
            var deadCoralFansTooltip = addTooltipText("A small piece of dried-out coral, created when there isn’t enough water.");
            addTooltip(Blocks.DEAD_TUBE_CORAL_FAN, deadCoralFansTooltip);
            addTooltip(Blocks.DEAD_BRAIN_CORAL_FAN, deadCoralFansTooltip);
            addTooltip(Blocks.DEAD_BUBBLE_CORAL_FAN, deadCoralFansTooltip);
            addTooltip(Blocks.DEAD_FIRE_CORAL_FAN, deadCoralFansTooltip);
            addTooltip(Blocks.DEAD_HORN_CORAL_FAN, deadCoralFansTooltip);
            addTooltip(Blocks.SEA_PICKLE, "A strange, glowing, marine creature found on the seafloor.", "Sometimes found in groups of up to four.");
            addTooltip(Blocks.SPONGE, "A porous block able to soak up water.", "Due to their rarity, this may be the true treasure that the Elder Guardians were hiding.");
            addTooltip(Blocks.WET_SPONGE, "A sponge made useless by absorbed water.", "Can be dried out, allowing the moisture to be collected in a bucket.");
        }
        private void faunaProduct() {
            addTooltip(Blocks.BEE_NEST, "A hive found on the side of trees that holds up to three bees.");
            addTooltip(Blocks.BONE_BLOCK, "A solid block of bone found in fossils in multiple dimensions.");
            addTooltip(Blocks.COBWEB, "A strong web created by the Overworld’s Spiders and Cave Spiders.");
            addTooltip(Blocks.DRAGON_EGG, "The one and only egg of the Ender Dragon.", "Mysteriously appeared on the pedestal after the Dragon was defeated.");
            addTooltip(Blocks.FROGSPAWN, "The egg cluster of a Frog, laid on top of water.", "After the passage of time, Tadpoles will hatch from them.");
            var froglightsTooltip = addTooltipText("A strange, colorful glowing block that is created when a Frog eats a small Magma Cube.");
            addTooltip(Blocks.OCHRE_FROGLIGHT, froglightsTooltip);
            addTooltip(Blocks.PEARLESCENT_FROGLIGHT, froglightsTooltip);
            addTooltip(Blocks.VERDANT_FROGLIGHT, froglightsTooltip);
            addTooltip(Blocks.HONEY_BLOCK, "A solid block of honey, crafted from four bottles of honey.", "It’s sticky!");
            addTooltip(Blocks.SLIME_BLOCK, "A block of slime that can be used to stick other blocks together.");
            addTooltip(Blocks.TURTLE_EGG, "The eggs of a Turtle, laid on beaches.", "Undead creatures have an unexplainable attraction to them.");
            var mobHeadsTooltip = addTooltipText("The head of a hostile creature found in the Overworld.");
            addTooltip(Blocks.CREEPER_HEAD, mobHeadsTooltip);
            addTooltip(Blocks.ZOMBIE_HEAD, mobHeadsTooltip);
            addTooltip(Blocks.SKELETON_SKULL, mobHeadsTooltip);
            addTooltip(Blocks.PIGLIN_HEAD, "The head of a strange creature found in the Nether.");
            addTooltip(Blocks.WITHER_SKELETON_SKULL, "The skull of a Wither Skeleton.", "It seems to show up in a structure depicted on a certain painting.");
            addTooltip(Blocks.DRAGON_HEAD, "A replica of an Ender Dragon’s head.", "Found as the figurehead on End Ships.");
            addTooltip(Blocks.PLAYER_HEAD, "The head of a creature similar to yourself.", "It is a mystery how it got here.");
        }
        private void algae() {
            addTooltip(Blocks.KELP, "An algae found growing in large, forest-like areas in many ocean biomes.");
            addTooltip(Blocks.DRIED_KELP_BLOCK, "A block of compacted dried kelp.", "Useful as a fuel in smelting.");
        }
        private void decorative() {
            var carpetsTooltip = addTooltipText("A thin layer of wool used for decoration.", "They come in many colorful variants.");
            addTooltip(Blocks.WHITE_CARPET, carpetsTooltip);
            addTooltip(Blocks.ORANGE_CARPET, carpetsTooltip);
            addTooltip(Blocks.MAGENTA_CARPET, carpetsTooltip);
            addTooltip(Blocks.LIGHT_BLUE_CARPET, carpetsTooltip);
            addTooltip(Blocks.YELLOW_CARPET, carpetsTooltip);
            addTooltip(Blocks.LIME_CARPET, carpetsTooltip);
            addTooltip(Blocks.PINK_CARPET, carpetsTooltip);
            addTooltip(Blocks.GRAY_CARPET, carpetsTooltip);
            addTooltip(Blocks.LIGHT_GRAY_CARPET, carpetsTooltip);
            addTooltip(Blocks.CYAN_CARPET, carpetsTooltip);
            addTooltip(Blocks.PURPLE_CARPET, carpetsTooltip);
            addTooltip(Blocks.BLUE_CARPET, carpetsTooltip);
            addTooltip(Blocks.BROWN_CARPET, carpetsTooltip);
            addTooltip(Blocks.GREEN_CARPET, carpetsTooltip);
            addTooltip(Blocks.RED_CARPET, carpetsTooltip);
            addTooltip(Blocks.BLACK_CARPET, carpetsTooltip);
            addTooltip(Blocks.CHAIN, "Links of iron, usually used to hang things.");
            addTooltip(Blocks.IRON_BARS, "Metal bars, usually used to create windows or fences.");
            addTooltip(Blocks.IRON_DOOR, "A door crafted from iron.", "Can only be opened with redstone power.");
            addTooltip(Blocks.IRON_TRAPDOOR, "A trapdoor crafted from iron.", "Can only be opened with redstone power.");
            addTooltip(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE, "A pressure plate crafted from iron.", "Measures large groups of objects.");
            addTooltip(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE, "A pressure plate crafted from gold.", "Measures the number of objects on it.");
            addTooltip(Blocks.GLASS, "A transparent block smelted from sand.", "It appears many creatures cannot see through it.");
            addTooltip(Blocks.GLASS_PANE, "A thin layer of glass, usually used for windows.");
            var stainedGlassTooltip = addTooltipText("A dyed block of glass, coming in many colorful variants.");
            addTooltip(Blocks.WHITE_STAINED_GLASS, stainedGlassTooltip);
            addTooltip(Blocks.ORANGE_STAINED_GLASS, stainedGlassTooltip);
            addTooltip(Blocks.MAGENTA_STAINED_GLASS, stainedGlassTooltip);
            addTooltip(Blocks.LIGHT_BLUE_STAINED_GLASS, stainedGlassTooltip);
            addTooltip(Blocks.YELLOW_STAINED_GLASS, stainedGlassTooltip);
            addTooltip(Blocks.LIME_STAINED_GLASS, stainedGlassTooltip);
            addTooltip(Blocks.PINK_STAINED_GLASS, stainedGlassTooltip);
            addTooltip(Blocks.GRAY_STAINED_GLASS, stainedGlassTooltip);
            addTooltip(Blocks.LIGHT_GRAY_STAINED_GLASS, stainedGlassTooltip);
            addTooltip(Blocks.CYAN_STAINED_GLASS, stainedGlassTooltip);
            addTooltip(Blocks.PURPLE_STAINED_GLASS, stainedGlassTooltip);
            addTooltip(Blocks.BLUE_STAINED_GLASS, stainedGlassTooltip);
            addTooltip(Blocks.BROWN_STAINED_GLASS, stainedGlassTooltip);
            addTooltip(Blocks.GREEN_STAINED_GLASS, stainedGlassTooltip);
            addTooltip(Blocks.RED_STAINED_GLASS, stainedGlassTooltip);
            addTooltip(Blocks.BLACK_STAINED_GLASS, stainedGlassTooltip);
            var stainedGlassPaneTooltip = addTooltipText("A dyed pane of glass, coming in many colorful variants.");
            addTooltip(Blocks.WHITE_STAINED_GLASS_PANE, stainedGlassPaneTooltip);
            addTooltip(Blocks.ORANGE_STAINED_GLASS_PANE, stainedGlassPaneTooltip);
            addTooltip(Blocks.MAGENTA_STAINED_GLASS_PANE, stainedGlassPaneTooltip);
            addTooltip(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE, stainedGlassPaneTooltip);
            addTooltip(Blocks.YELLOW_STAINED_GLASS_PANE, stainedGlassPaneTooltip);
            addTooltip(Blocks.LIME_STAINED_GLASS_PANE, stainedGlassPaneTooltip);
            addTooltip(Blocks.PINK_STAINED_GLASS_PANE, stainedGlassPaneTooltip);
            addTooltip(Blocks.GRAY_STAINED_GLASS_PANE, stainedGlassPaneTooltip);
            addTooltip(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, stainedGlassPaneTooltip);
            addTooltip(Blocks.CYAN_STAINED_GLASS_PANE, stainedGlassPaneTooltip);
            addTooltip(Blocks.PURPLE_STAINED_GLASS_PANE, stainedGlassPaneTooltip);
            addTooltip(Blocks.BLUE_STAINED_GLASS_PANE, stainedGlassPaneTooltip);
            addTooltip(Blocks.BROWN_STAINED_GLASS_PANE, stainedGlassPaneTooltip);
            addTooltip(Blocks.GREEN_STAINED_GLASS_PANE, stainedGlassPaneTooltip);
            addTooltip(Blocks.RED_STAINED_GLASS_PANE, stainedGlassPaneTooltip);
            addTooltip(Blocks.BLACK_STAINED_GLASS_PANE, stainedGlassPaneTooltip);
            addTooltip(Blocks.TINTED_GLASS, "A glass block made with amethyst that doesn’t let light pass through.");
            var glazedTerracottaTooltip = addTooltipText("A decorative, colorful terracotta block.", "Different variants have many unique patterns.");
            addTooltip(Blocks.WHITE_GLAZED_TERRACOTTA, glazedTerracottaTooltip);
            addTooltip(Blocks.ORANGE_GLAZED_TERRACOTTA, glazedTerracottaTooltip);
            addTooltip(Blocks.MAGENTA_GLAZED_TERRACOTTA, glazedTerracottaTooltip);
            addTooltip(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, glazedTerracottaTooltip);
            addTooltip(Blocks.YELLOW_GLAZED_TERRACOTTA, glazedTerracottaTooltip);
            addTooltip(Blocks.LIME_GLAZED_TERRACOTTA, glazedTerracottaTooltip);
            addTooltip(Blocks.PINK_GLAZED_TERRACOTTA, glazedTerracottaTooltip);
            addTooltip(Blocks.GRAY_GLAZED_TERRACOTTA, glazedTerracottaTooltip);
            addTooltip(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, glazedTerracottaTooltip);
            addTooltip(Blocks.CYAN_GLAZED_TERRACOTTA, glazedTerracottaTooltip);
            addTooltip(Blocks.PURPLE_GLAZED_TERRACOTTA, glazedTerracottaTooltip);
            addTooltip(Blocks.BLUE_GLAZED_TERRACOTTA, glazedTerracottaTooltip);
            addTooltip(Blocks.BROWN_GLAZED_TERRACOTTA, glazedTerracottaTooltip);
            addTooltip(Blocks.GREEN_GLAZED_TERRACOTTA, glazedTerracottaTooltip);
            addTooltip(Blocks.RED_GLAZED_TERRACOTTA, glazedTerracottaTooltip);
            addTooltip(Blocks.BLACK_GLAZED_TERRACOTTA, glazedTerracottaTooltip);
            addTooltip(Blocks.HONEYCOMB_BLOCK, "A solid block of four honeycombs.");
            var woolsTooltip = addTooltipText("The block that makes up the coat of a sheep.", "Shear sheep to peacefully gather it!");
            addTooltip(Blocks.WHITE_WOOL, woolsTooltip);
            addTooltip(Blocks.ORANGE_WOOL, woolsTooltip);
            addTooltip(Blocks.MAGENTA_WOOL, woolsTooltip);
            addTooltip(Blocks.LIGHT_BLUE_WOOL, woolsTooltip);
            addTooltip(Blocks.YELLOW_WOOL, woolsTooltip);
            addTooltip(Blocks.LIME_WOOL, woolsTooltip);
            addTooltip(Blocks.PINK_WOOL, woolsTooltip);
            addTooltip(Blocks.GRAY_WOOL, woolsTooltip);
            addTooltip(Blocks.LIGHT_GRAY_WOOL, woolsTooltip);
            addTooltip(Blocks.CYAN_WOOL, woolsTooltip);
            addTooltip(Blocks.PURPLE_WOOL, woolsTooltip);
            addTooltip(Blocks.BLUE_WOOL, woolsTooltip);
            addTooltip(Blocks.BROWN_WOOL, woolsTooltip);
            addTooltip(Blocks.GREEN_WOOL, woolsTooltip);
            addTooltip(Blocks.RED_WOOL, woolsTooltip);
            addTooltip(Blocks.BLACK_WOOL, woolsTooltip);
        }
        private void mineralBlocks() {
            addTooltip(Blocks.AMETHYST_BLOCK, "A block of crystal found in Amethyst Geodes.");
            addTooltip(Blocks.COAL_BLOCK, "A solid block made of pieces of coal.");
            var copperTooltip = "A solid block made of copper ingots.";
            var cutCopperTooltip = "A chiseled copper block.";
            var unoxidizedTooltip = "Oxidizes when left out for too long.";
            var exposedTooltip = "It is beginning to oxidize.";
            var weatheredTooltip = "Appears weathered by oxidization.";
            var oxidizedTooltip = "It is a blue-green color due to oxidization.";
            var waxedTooltip = "Waxed to prevent further oxidization.";
            addTooltip(Blocks.COPPER_BLOCK, copperTooltip, unoxidizedTooltip);
            addTooltip(Blocks.EXPOSED_COPPER, copperTooltip, exposedTooltip);
            addTooltip(Blocks.WEATHERED_COPPER, copperTooltip, weatheredTooltip);
            addTooltip(Blocks.OXIDIZED_COPPER, copperTooltip, oxidizedTooltip);
            addTooltip(Blocks.WAXED_COPPER_BLOCK, copperTooltip, waxedTooltip);
            addTooltip(Blocks.WAXED_EXPOSED_COPPER, copperTooltip, waxedTooltip);
            addTooltip(Blocks.WAXED_WEATHERED_COPPER, copperTooltip, waxedTooltip);
            addTooltip(Blocks.WAXED_OXIDIZED_COPPER, copperTooltip, waxedTooltip);

            addTooltip(Blocks.OXIDIZED_CUT_COPPER, cutCopperTooltip, oxidizedTooltip);
            addTooltipForVariants(Blocks.OXIDIZED_CUT_COPPER, Blocks.OXIDIZED_CUT_COPPER_STAIRS, Blocks.OXIDIZED_CUT_COPPER_SLAB);
            addTooltip(Blocks.WEATHERED_CUT_COPPER, cutCopperTooltip, weatheredTooltip);
            addTooltipForVariants(Blocks.WEATHERED_CUT_COPPER, Blocks.WEATHERED_CUT_COPPER_STAIRS, Blocks.WEATHERED_CUT_COPPER_SLAB);
            addTooltip(Blocks.EXPOSED_CUT_COPPER, cutCopperTooltip, exposedTooltip);
            addTooltipForVariants(Blocks.EXPOSED_CUT_COPPER, Blocks.EXPOSED_CUT_COPPER_STAIRS, Blocks.EXPOSED_CUT_COPPER_SLAB);
            addTooltip(Blocks.CUT_COPPER, cutCopperTooltip, unoxidizedTooltip);
            addTooltipForVariants(Blocks.CUT_COPPER, Blocks.CUT_COPPER_STAIRS, Blocks.CUT_COPPER_SLAB);

            addTooltip(Blocks.WAXED_OXIDIZED_CUT_COPPER, cutCopperTooltip, waxedTooltip);
            addTooltipForVariants(Blocks.WAXED_OXIDIZED_CUT_COPPER, Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS, Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB);
            addTooltip(Blocks.WAXED_WEATHERED_CUT_COPPER, cutCopperTooltip, waxedTooltip);
            addTooltipForVariants(Blocks.WAXED_WEATHERED_CUT_COPPER, Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS, Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB);
            addTooltip(Blocks.WAXED_EXPOSED_CUT_COPPER, cutCopperTooltip, waxedTooltip);
            addTooltipForVariants(Blocks.WAXED_EXPOSED_CUT_COPPER, Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS, Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB);
            addTooltip(Blocks.WAXED_CUT_COPPER, cutCopperTooltip, waxedTooltip);
            addTooltipForVariants(Blocks.WAXED_CUT_COPPER, Blocks.WAXED_CUT_COPPER_STAIRS, Blocks.WAXED_CUT_COPPER_SLAB);
            addTooltip(Blocks.RAW_COPPER_BLOCK, "A solid block made of raw copper, partially oxidized.");
            addTooltip(Blocks.DIAMOND_BLOCK, "A solid block made of diamonds.", "Shiny!");
            addTooltip(Blocks.EMERALD_BLOCK, "A solid block made of emeralds.", "Villagers will not accept it when trading.");
            addTooltip(Blocks.GOLD_BLOCK, "A solid block made of gold ingots.");
            addTooltip(Blocks.RAW_GOLD_BLOCK, "A solid block made of raw gold.");
            addTooltip(Blocks.IRON_BLOCK, "A solid block made of iron ingots.", "Can be used to create an Iron Golem with a carved pumpkin.");
            addTooltip(Blocks.RAW_IRON_BLOCK, "A solid block made of raw iron.");
            addTooltip(Blocks.LAPIS_BLOCK, "A solid block made of lapis lazuli.");
            addTooltip(Blocks.NETHERITE_BLOCK, "A solid block made of netherite ingots.");
            addTooltip(Blocks.QUARTZ_BLOCK, "A solid block made of pieces of quartz.");
            addTooltipForVariants(Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_SLAB);
            addTooltip(Blocks.CHISELED_QUARTZ_BLOCK, "A quartz block cut with a specific pattern.");
            addTooltip(Blocks.QUARTZ_PILLAR, "A quartz block cut in the shape of a pillar.");
            addTooltip(Blocks.QUARTZ_BRICKS, "A quartz block cut into bricks.");
            addTooltip(Blocks.SMOOTH_QUARTZ, "A polished block crafted from quartz.");
            addTooltipForVariants(Blocks.SMOOTH_QUARTZ, Blocks.SMOOTH_QUARTZ_STAIRS, Blocks.SMOOTH_QUARTZ_SLAB);
            addTooltip(Blocks.REDSTONE_BLOCK, "A solid block made of compacted redstone dust.", "Provides a redstone power source to adjacent blocks.");
        }
        private void manufactured() {
            addTooltip(Blocks.BOOKSHELF, "A wooden shelf filled with books.", "Some villagers keep large collections of them.");
            addTooltip(Blocks.BRICKS, "Smelted clay bricks used for building.");
            addTooltipForVariants(Blocks.BRICKS, Blocks.BRICK_STAIRS, Blocks.BRICK_SLAB, Blocks.BRICK_WALL);
            addTooltip(Blocks.CHISELED_DEEPSLATE, "Deepslate cut with a specific pattern.", "It appears to represent some kind of skull.");
            addTooltip(Blocks.COBBLED_DEEPSLATE, "A natural building material made of deepslate.");
            addTooltipForVariants(Blocks.COBBLED_DEEPSLATE, Blocks.COBBLED_DEEPSLATE_SLAB, Blocks.COBBLED_DEEPSLATE_STAIRS, Blocks.COBBLED_DEEPSLATE_WALL);
            addTooltip(Blocks.REINFORCED_DEEPSLATE, "A block of deepslate reinforced by a strange material.", "Found in mysterious frames at the heart of Ancient Cities.");
            var concreteTooltip = addTooltipText("A colorful block of concrete, hardened by water.", "This process seems to have prevented the effects of gravity.");
            addTooltip(Blocks.WHITE_CONCRETE, concreteTooltip);
            addTooltip(Blocks.ORANGE_CONCRETE, concreteTooltip);
            addTooltip(Blocks.MAGENTA_CONCRETE, concreteTooltip);
            addTooltip(Blocks.LIGHT_BLUE_CONCRETE, concreteTooltip);
            addTooltip(Blocks.YELLOW_CONCRETE, concreteTooltip);
            addTooltip(Blocks.LIME_CONCRETE, concreteTooltip);
            addTooltip(Blocks.PINK_CONCRETE, concreteTooltip);
            addTooltip(Blocks.GRAY_CONCRETE, concreteTooltip);
            addTooltip(Blocks.LIGHT_GRAY_CONCRETE, concreteTooltip);
            addTooltip(Blocks.CYAN_CONCRETE, concreteTooltip);
            addTooltip(Blocks.PURPLE_CONCRETE, concreteTooltip);
            addTooltip(Blocks.BLUE_CONCRETE, concreteTooltip);
            addTooltip(Blocks.BROWN_CONCRETE, concreteTooltip);
            addTooltip(Blocks.GREEN_CONCRETE, concreteTooltip);
            addTooltip(Blocks.RED_CONCRETE, concreteTooltip);
            addTooltip(Blocks.BLACK_CONCRETE, concreteTooltip);
            var concretePowderTooltip = addTooltipText("A powder of sand and gravel used to make concrete.", "Like its ingredients, it abides by the laws of gravity.");
            addTooltip(Blocks.WHITE_CONCRETE_POWDER, concretePowderTooltip);
            addTooltip(Blocks.ORANGE_CONCRETE_POWDER, concretePowderTooltip);
            addTooltip(Blocks.MAGENTA_CONCRETE_POWDER, concretePowderTooltip);
            addTooltip(Blocks.LIGHT_BLUE_CONCRETE_POWDER, concretePowderTooltip);
            addTooltip(Blocks.YELLOW_CONCRETE_POWDER, concretePowderTooltip);
            addTooltip(Blocks.LIME_CONCRETE_POWDER, concretePowderTooltip);
            addTooltip(Blocks.PINK_CONCRETE_POWDER, concretePowderTooltip);
            addTooltip(Blocks.GRAY_CONCRETE_POWDER, concretePowderTooltip);
            addTooltip(Blocks.LIGHT_GRAY_CONCRETE_POWDER, concretePowderTooltip);
            addTooltip(Blocks.CYAN_CONCRETE_POWDER, concretePowderTooltip);
            addTooltip(Blocks.PURPLE_CONCRETE_POWDER, concretePowderTooltip);
            addTooltip(Blocks.BLUE_CONCRETE_POWDER, concretePowderTooltip);
            addTooltip(Blocks.BROWN_CONCRETE_POWDER, concretePowderTooltip);
            addTooltip(Blocks.GREEN_CONCRETE_POWDER, concretePowderTooltip);
            addTooltip(Blocks.RED_CONCRETE_POWDER, concretePowderTooltip);
            addTooltip(Blocks.BLACK_CONCRETE_POWDER, concretePowderTooltip);
            addTooltip(Blocks.CUT_SANDSTONE, "Compacted, smooth sandstone.", "Used in the architecture of Desert Villages and Pyramids.");
            addTooltip(Blocks.CUT_RED_SANDSTONE, "Compacted, smooth red sandstone.", "Not used in any structures discovered so far.");
            addTooltipForVariants(Blocks.CUT_SANDSTONE, Blocks.CUT_SANDSTONE_SLAB);
            addTooltipForVariants(Blocks.CUT_RED_SANDSTONE, Blocks.CUT_RED_SANDSTONE_SLAB);
            addTooltip(Blocks.CHISELED_SANDSTONE, "Sandstone cut with the face of a Creeper.", "Exclusively found in the walls of Desert Pyramids.");
            addTooltip(Blocks.CHISELED_RED_SANDSTONE, "Red sandstone carved with the likeness of a strange beast.", "Not used in any structures discovered so far.");
            addTooltip(Blocks.SMOOTH_SANDSTONE, "Sandstone polished and smoothened.", "Commonly used in Desert Villages’ architecture.");
            addTooltipForVariants(Blocks.SMOOTH_SANDSTONE, Blocks.SMOOTH_SANDSTONE_SLAB, Blocks.SMOOTH_SANDSTONE_STAIRS);
            addTooltip(Blocks.SMOOTH_RED_SANDSTONE, "Red sandstone polished and smoothened.", "Not used in any structures discovered so far.");
            addTooltipForVariants(Blocks.SMOOTH_RED_SANDSTONE, Blocks.SMOOTH_RED_SANDSTONE_SLAB, Blocks.SMOOTH_RED_SANDSTONE_STAIRS);
            addTooltip(Blocks.DEEPSLATE_BRICKS, "Deepslate cut into bricks with a pattern similar to that of stone bricks.");
            addTooltipForVariants(Blocks.DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICK_SLAB, Blocks.DEEPSLATE_BRICK_STAIRS, Blocks.DEEPSLATE_BRICK_WALL);
            addTooltip(Blocks.CRACKED_DEEPSLATE_BRICKS, "Deepslate bricks cracked from age.", "Useful for decorative purposes.");
            addTooltip(Blocks.DEEPSLATE_TILES, "Tiled deepslate used for decorative purposes.");
            addTooltipForVariants(Blocks.DEEPSLATE_TILES, Blocks.DEEPSLATE_TILE_SLAB, Blocks.DEEPSLATE_TILE_STAIRS, Blocks.DEEPSLATE_TILE_WALL);
            addTooltip(Blocks.CRACKED_DEEPSLATE_TILES, "Deepslate tiles cracked from age.", "Useful for decorative purposes.");
            addTooltip(Blocks.END_STONE_BRICKS, "End stone cut into bricks with a pattern similar to that of stone bricks.");
            addTooltipForVariants(Blocks.END_STONE_BRICKS, Blocks.END_STONE_BRICK_SLAB, Blocks.END_STONE_BRICK_STAIRS, Blocks.END_STONE_BRICK_WALL);
            addTooltip(Blocks.MUD_BRICKS, "Packed mud shaped into bricks with a unique pattern.");
            addTooltipForVariants(Blocks.MUD_BRICKS, Blocks.MUD_BRICK_SLAB, Blocks.MUD_BRICK_STAIRS, Blocks.MUD_BRICK_WALL);
            addTooltip(Blocks.NETHER_BRICKS, "Block of smelted netherrack bricks with a unique pattern.");
            addTooltipForVariants(Blocks.NETHER_BRICKS, Blocks.NETHER_BRICK_SLAB, Blocks.NETHER_BRICK_STAIRS, Blocks.NETHER_BRICK_WALL, Blocks.NETHER_BRICK_FENCE);
            addTooltip(Blocks.CRACKED_NETHER_BRICKS, "Nether bricks cracked from age.", "Useful for decorative purposes.");
            addTooltip(Blocks.CHISELED_NETHER_BRICKS, "Nether bricks carved with a skull pattern.");
            addTooltip(Blocks.RED_NETHER_BRICKS, "Nether bricks dyed with nether wart.", "Useful for decorative purposes.");
            addTooltipForVariants(Blocks.RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICK_SLAB, Blocks.RED_NETHER_BRICK_STAIRS, Blocks.RED_NETHER_BRICK_WALL);
            addWoodsetTooltip(true, Blocks.OAK_PLANKS, new String[]{}, Blocks.OAK_SLAB, Blocks.OAK_STAIRS, Blocks.OAK_FENCE, Blocks.OAK_FENCE_GATE, Blocks.OAK_DOOR, Blocks.OAK_TRAPDOOR, Blocks.OAK_PRESSURE_PLATE, Blocks.OAK_BUTTON, Blocks.OAK_SIGN, Blocks.OAK_HANGING_SIGN);
            addWoodsetTooltip(true, Blocks.SPRUCE_PLANKS, new String[]{}, Blocks.SPRUCE_SLAB, Blocks.SPRUCE_STAIRS, Blocks.SPRUCE_FENCE, Blocks.SPRUCE_FENCE_GATE, Blocks.SPRUCE_DOOR, Blocks.SPRUCE_TRAPDOOR, Blocks.SPRUCE_PRESSURE_PLATE, Blocks.SPRUCE_BUTTON, Blocks.SPRUCE_SIGN, Blocks.SPRUCE_HANGING_SIGN);
            addWoodsetTooltip(true, Blocks.BIRCH_PLANKS, new String[]{}, Blocks.BIRCH_SLAB, Blocks.BIRCH_STAIRS, Blocks.BIRCH_FENCE, Blocks.BIRCH_FENCE_GATE, Blocks.BIRCH_DOOR, Blocks.BIRCH_TRAPDOOR, Blocks.BIRCH_PRESSURE_PLATE, Blocks.BIRCH_BUTTON, Blocks.BIRCH_SIGN, Blocks.BIRCH_HANGING_SIGN);
            addWoodsetTooltip(true, Blocks.JUNGLE_PLANKS, new String[]{}, Blocks.JUNGLE_SLAB, Blocks.JUNGLE_STAIRS, Blocks.JUNGLE_FENCE, Blocks.JUNGLE_FENCE_GATE, Blocks.JUNGLE_DOOR, Blocks.JUNGLE_TRAPDOOR, Blocks.JUNGLE_PRESSURE_PLATE, Blocks.JUNGLE_BUTTON, Blocks.JUNGLE_SIGN, Blocks.JUNGLE_HANGING_SIGN);
            addWoodsetTooltip(true, Blocks.ACACIA_PLANKS, new String[]{}, Blocks.ACACIA_SLAB, Blocks.ACACIA_STAIRS, Blocks.ACACIA_FENCE, Blocks.ACACIA_FENCE_GATE, Blocks.ACACIA_DOOR, Blocks.ACACIA_TRAPDOOR, Blocks.ACACIA_PRESSURE_PLATE, Blocks.ACACIA_BUTTON, Blocks.ACACIA_SIGN, Blocks.ACACIA_HANGING_SIGN);
            addWoodsetTooltip(true, Blocks.DARK_OAK_PLANKS, new String[]{}, Blocks.DARK_OAK_SLAB, Blocks.DARK_OAK_STAIRS, Blocks.DARK_OAK_FENCE, Blocks.DARK_OAK_FENCE_GATE, Blocks.DARK_OAK_DOOR, Blocks.DARK_OAK_TRAPDOOR, Blocks.DARK_OAK_PRESSURE_PLATE, Blocks.DARK_OAK_BUTTON, Blocks.DARK_OAK_SIGN, Blocks.DARK_OAK_HANGING_SIGN);
            addWoodsetTooltip(true, Blocks.MANGROVE_PLANKS, new String[]{}, Blocks.MANGROVE_SLAB, Blocks.MANGROVE_STAIRS, Blocks.MANGROVE_FENCE, Blocks.MANGROVE_FENCE_GATE, Blocks.MANGROVE_DOOR, Blocks.MANGROVE_TRAPDOOR, Blocks.MANGROVE_PRESSURE_PLATE, Blocks.MANGROVE_BUTTON, Blocks.MANGROVE_SIGN, Blocks.MANGROVE_HANGING_SIGN);
            addWoodsetTooltip(true, Blocks.CHERRY_PLANKS, new String[]{}, Blocks.CHERRY_SLAB, Blocks.CHERRY_STAIRS, Blocks.CHERRY_FENCE, Blocks.CHERRY_FENCE_GATE, Blocks.CHERRY_DOOR, Blocks.CHERRY_TRAPDOOR, Blocks.CHERRY_PRESSURE_PLATE, Blocks.CHERRY_BUTTON, Blocks.CHERRY_SIGN, Blocks.CHERRY_HANGING_SIGN);
            addWoodsetTooltip(true, Blocks.BAMBOO_PLANKS, new String[]{"Planks crafted from an bamboo stalks.", "Very versatile in crafting."}, Blocks.BAMBOO_SLAB, Blocks.BAMBOO_STAIRS, Blocks.BAMBOO_FENCE, Blocks.BAMBOO_FENCE_GATE, Blocks.BAMBOO_DOOR, Blocks.BAMBOO_TRAPDOOR, Blocks.BAMBOO_PRESSURE_PLATE, Blocks.BAMBOO_BUTTON, Blocks.BAMBOO_SIGN, Blocks.BAMBOO_HANGING_SIGN);
            addWoodsetTooltip(false, Blocks.CRIMSON_PLANKS, new String[]{}, Blocks.CRIMSON_SLAB, Blocks.CRIMSON_STAIRS, Blocks.CRIMSON_FENCE, Blocks.CRIMSON_FENCE_GATE, Blocks.CRIMSON_DOOR, Blocks.CRIMSON_TRAPDOOR, Blocks.CRIMSON_PRESSURE_PLATE, Blocks.CRIMSON_BUTTON, Blocks.CRIMSON_SIGN, Blocks.CRIMSON_HANGING_SIGN);
            addWoodsetTooltip(false, Blocks.WARPED_PLANKS, new String[]{}, Blocks.WARPED_SLAB, Blocks.WARPED_STAIRS, Blocks.WARPED_FENCE, Blocks.WARPED_FENCE_GATE, Blocks.WARPED_DOOR, Blocks.WARPED_TRAPDOOR, Blocks.WARPED_PRESSURE_PLATE, Blocks.WARPED_BUTTON, Blocks.WARPED_SIGN, Blocks.WARPED_HANGING_SIGN);
            addTooltip(Blocks.PACKED_MUD, "Dried mud packed together with wheat.");
            addTooltip(Blocks.POLISHED_ANDESITE, "Compacted, smooth andesite.", "Useful for decorative purposes.");
            addTooltipForVariants(Blocks.POLISHED_ANDESITE, Blocks.POLISHED_ANDESITE_SLAB, Blocks.POLISHED_ANDESITE_STAIRS);
            addTooltip(Blocks.POLISHED_BASALT, "Basalt found in large pillars and in Basalt Deltas.");
            addTooltip(Blocks.POLISHED_BLACKSTONE, "Compacted, smooth blackstone.", "Useful for decorative purposes.");
            addTooltipForVariants(Blocks.POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE_SLAB, Blocks.POLISHED_BLACKSTONE_STAIRS, Blocks.POLISHED_BLACKSTONE_WALL, Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE, Blocks.POLISHED_BLACKSTONE_BUTTON);
            addTooltip(Blocks.POLISHED_BLACKSTONE_BRICKS, "Polished blackstone cut into bricks.");
            addTooltipForVariants(Blocks.POLISHED_BLACKSTONE_BRICKS, Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS, Blocks.POLISHED_BLACKSTONE_BRICK_WALL);
            addTooltip(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, "Polished blackstone bricks cracked from age.");
            addTooltip(Blocks.CHISELED_POLISHED_BLACKSTONE, "Polished blackstone carved with a snout pattern.");
            addTooltip(Blocks.POLISHED_DIORITE, "Compacted, smooth diorite.", "Useful for decorative purposes.");
            addTooltipForVariants(Blocks.POLISHED_DIORITE, Blocks.POLISHED_DIORITE_SLAB, Blocks.POLISHED_DIORITE_STAIRS);
            addTooltip(Blocks.POLISHED_GRANITE, "Compacted, smooth granite.", "Useful for decorative purposes.");
            addTooltipForVariants(Blocks.POLISHED_GRANITE, Blocks.POLISHED_GRANITE_SLAB, Blocks.POLISHED_GRANITE_STAIRS);
            addTooltip(Blocks.POLISHED_DEEPSLATE, "Compacted, smooth deepslate.", "Useful for decorative purposes.");
            addTooltipForVariants(Blocks.POLISHED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE_SLAB, Blocks.POLISHED_DEEPSLATE_STAIRS, Blocks.POLISHED_DEEPSLATE_WALL);
            addTooltip(Blocks.PRISMARINE, "A strange, color-changing stone found exclusively in Ocean Monuments and Ocean Ruins.");
            addTooltipForVariants(Blocks.PRISMARINE, Blocks.PRISMARINE_SLAB, Blocks.PRISMARINE_STAIRS, Blocks.PRISMARINE_WALL);
            addTooltip(Blocks.PRISMARINE_BRICKS, "Prismarine cut into bricks, only found in Ocean Monuments.");
            addTooltipForVariants(Blocks.PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICK_SLAB, Blocks.PRISMARINE_BRICK_STAIRS);
            addTooltip(Blocks.DARK_PRISMARINE, "Prismarine dyed with Squid Ink, found only in wall patterns of Ocean Monuments.");
            addTooltipForVariants(Blocks.DARK_PRISMARINE, Blocks.DARK_PRISMARINE_SLAB, Blocks.DARK_PRISMARINE_STAIRS);
            addTooltip(Blocks.PURPUR_BLOCK, "A block found in End Cities made of popped chorus fruit.");
            addTooltipForVariants(Blocks.PURPUR_BLOCK, Blocks.PURPUR_SLAB, Blocks.PURPUR_STAIRS);
            addTooltip(Blocks.PURPUR_PILLAR, "A purpur block cut in the shape of a pillar.");
            addTooltip(Blocks.SMOOTH_STONE, "Compacted, polished stone.", "Useful for decorative purposes.");
            addTooltipForVariants(Blocks.SMOOTH_STONE, Blocks.SMOOTH_STONE_SLAB);
            addTooltip(Blocks.STONE_BRICKS, "Stone cut into bricks.", "Useful for decorative purposes.");
            addTooltipForVariants(Blocks.STONE_BRICKS, Blocks.STONE_BRICK_SLAB, Blocks.STONE_BRICK_STAIRS, Blocks.STONE_BRICK_WALL);
            addTooltip(Blocks.CRACKED_STONE_BRICKS, "Stone bricks cracked from age.", "Useful for decorative purposes.");
            addTooltip(Blocks.CHISELED_STONE_BRICKS, "Stone bricks cut with a specific pattern.");
            addTooltip(Blocks.MOSSY_STONE_BRICKS, "Stone bricks covered in moss.", "Useful for decorative purposes.");
            addTooltipForVariants(Blocks.MOSSY_STONE_BRICKS, Blocks.MOSSY_STONE_BRICK_STAIRS, Blocks.MOSSY_STONE_BRICK_SLAB, Blocks.MOSSY_STONE_BRICK_WALL);
            addTooltip(Blocks.BAMBOO_MOSAIC, "A decorative, patterned block of bamboo.");
            addTooltipForVariants(Blocks.BAMBOO_MOSAIC, Blocks.BAMBOO_MOSAIC_STAIRS, Blocks.BAMBOO_MOSAIC_SLAB);
            addTooltip(Blocks.BAMBOO_BLOCK, "A bundle of bamboo stalks.", "Used extensively in crafting.");


        }
        private void lighting() {
            var candlesTooltip = addTooltipText("A light source made out of wax and a piece of string.", "They come in colorful variants.");
            addTooltip(Blocks.CANDLE, candlesTooltip);
            addTooltip(Blocks.WHITE_CANDLE, candlesTooltip);
            addTooltip(Blocks.ORANGE_CANDLE, candlesTooltip);
            addTooltip(Blocks.MAGENTA_CANDLE, candlesTooltip);
            addTooltip(Blocks.LIGHT_BLUE_CANDLE, candlesTooltip);
            addTooltip(Blocks.YELLOW_CANDLE, candlesTooltip);
            addTooltip(Blocks.LIME_CANDLE, candlesTooltip);
            addTooltip(Blocks.PINK_CANDLE, candlesTooltip);
            addTooltip(Blocks.GRAY_CANDLE, candlesTooltip);
            addTooltip(Blocks.LIGHT_GRAY_CANDLE, candlesTooltip);
            addTooltip(Blocks.CYAN_CANDLE, candlesTooltip);
            addTooltip(Blocks.PURPLE_CANDLE, candlesTooltip);
            addTooltip(Blocks.BLUE_CANDLE, candlesTooltip);
            addTooltip(Blocks.BROWN_CANDLE, candlesTooltip);
            addTooltip(Blocks.GREEN_CANDLE, candlesTooltip);
            addTooltip(Blocks.RED_CANDLE, candlesTooltip);
            addTooltip(Blocks.BLACK_CANDLE, candlesTooltip);
            addTooltip(Blocks.END_ROD, "A light source found in End Cities.", "Crafted using a blaze rod.");
            addTooltip(Blocks.JACK_O_LANTERN, "A carved pumpkin with a torch inside.", "Spooky!");
            addTooltip(Blocks.LANTERN, "A small light source that can hang from other blocks.");
            addTooltip(Blocks.SOUL_LANTERN, "A lantern that creates light by burning souls.");
            addTooltip(Blocks.SEA_LANTERN, "A light source found in Ocean Monuments made using prismarine crystals.");
            addTooltip(Blocks.TORCH, "A simple light source made of a stick and a piece of coal or charcoal.");
            addTooltip(Blocks.SOUL_TORCH, "A torch that creates light by burning souls.");
        }
        private void interactable() {
            var anvilTooltip = addTooltipText("A metalworking tool used to repair, enchant, and rename items.");
            addTooltip(Blocks.ANVIL, anvilTooltip);
            addTooltip(Blocks.CHIPPED_ANVIL, anvilTooltip);
            addTooltip(Blocks.DAMAGED_ANVIL, anvilTooltip);
            addTooltip(Blocks.BARREL, "A simple container used as a workstation by fishermen Villagers.");
            addTooltip(Blocks.BEACON, "A powerful, effect-granting block created using a Nether Star dropped by the Wither.");
            addTooltip(Blocks.BREWING_STAND, "A piece of lab equipment used to brew potions and used as a workstation by cleric Villagers.");
            addTooltip(Blocks.BLAST_FURNACE, "A block used to smelt metals faster and as a workstation by armorer Villagers.");
            addTooltip(Blocks.CARTOGRAPHY_TABLE, "A block used to copy, lock and enlarge maps.", "Used as a workstation by cartographer Villagers.");
            addTooltip(Blocks.CHEST, "A wooden container commonly used to hold many items.", "Comes in two sizes.");
            addTooltip(Blocks.ENDER_CHEST, "An otherworldly container that can hold twenty-seven items that can be accessed from any Ender Chest.");
            addTooltip(Blocks.CRAFTING_TABLE, "A simple workbench made from wooden planks.", "A fundamental block with hundreds of possibilities.");
            addTooltip(Blocks.ENCHANTING_TABLE, "A magical workbench used for enchanting.", "Surrounding it with books increases its power and draws strange runes to its tome.");
            addTooltip(Blocks.FLETCHING_TABLE, "A workstation used by fletcher Villagers.");
            addTooltip(Blocks.FURNACE, "A block used to smelt items in ten seconds.");
            addTooltip(Blocks.GRINDSTONE, "A block used to remove enchantments from items.", "A workstation for weaponsmith Villagers.");
            addTooltip(Blocks.LECTERN, "A reading desk with a slanted top.", "Used as a workstation for librarian Villagers.");
            addTooltip(Blocks.LOOM, "A block used to design banners and as a workstation for shepherd Villagers.");
            var shulkerBoxTooltip = addTooltipText("A container made of a Shulker’s shell that keeps items inside when picked up.");
            addTooltip(Blocks.SHULKER_BOX, shulkerBoxTooltip);
            addTooltip(Blocks.WHITE_SHULKER_BOX, shulkerBoxTooltip);
            addTooltip(Blocks.ORANGE_SHULKER_BOX, shulkerBoxTooltip);
            addTooltip(Blocks.MAGENTA_SHULKER_BOX, shulkerBoxTooltip);
            addTooltip(Blocks.LIGHT_BLUE_SHULKER_BOX, shulkerBoxTooltip);
            addTooltip(Blocks.YELLOW_SHULKER_BOX, shulkerBoxTooltip);
            addTooltip(Blocks.LIME_SHULKER_BOX, shulkerBoxTooltip);
            addTooltip(Blocks.PINK_SHULKER_BOX, shulkerBoxTooltip);
            addTooltip(Blocks.GRAY_SHULKER_BOX, shulkerBoxTooltip);
            addTooltip(Blocks.LIGHT_GRAY_SHULKER_BOX, shulkerBoxTooltip);
            addTooltip(Blocks.CYAN_SHULKER_BOX, shulkerBoxTooltip);
            addTooltip(Blocks.PURPLE_SHULKER_BOX, shulkerBoxTooltip);
            addTooltip(Blocks.BLUE_SHULKER_BOX, shulkerBoxTooltip);
            addTooltip(Blocks.BROWN_SHULKER_BOX, shulkerBoxTooltip);
            addTooltip(Blocks.GREEN_SHULKER_BOX, shulkerBoxTooltip);
            addTooltip(Blocks.RED_SHULKER_BOX, shulkerBoxTooltip);
            addTooltip(Blocks.BLACK_SHULKER_BOX, shulkerBoxTooltip);
            addTooltip(Blocks.SMITHING_TABLE, "A workbench used to upgrade tools and armor.", "Used as a workstation by toolsmith Villagers.");
            addTooltip(Blocks.SMOKER, "A block used to cook food faster and as a workstation by butcher Villagers.");
            addTooltip(Blocks.STONECUTTER, "A block used to cut and chisel many types of stone.", "Mason Villagers use it as a workstation.");
            addTooltip(Blocks.CHISELED_BOOKSHELF, "A wooden shelf filled with books.", "Can be used as storage for many varieties of books.");
        }
        private void utilizable() {
            var bannerTooltip = addTooltipText("A colorful, decorative flag.", "They can be patterned with millions of unique combinations.");
            addTooltip(Blocks.WHITE_BANNER, bannerTooltip);
            addTooltip(Blocks.ORANGE_BANNER, bannerTooltip);
            addTooltip(Blocks.MAGENTA_BANNER, bannerTooltip);
            addTooltip(Blocks.LIGHT_BLUE_BANNER, bannerTooltip);
            addTooltip(Blocks.YELLOW_BANNER, bannerTooltip);
            addTooltip(Blocks.LIME_BANNER, bannerTooltip);
            addTooltip(Blocks.PINK_BANNER, bannerTooltip);
            addTooltip(Blocks.GRAY_BANNER, bannerTooltip);
            addTooltip(Blocks.LIGHT_GRAY_BANNER, bannerTooltip);
            addTooltip(Blocks.CYAN_BANNER, bannerTooltip);
            addTooltip(Blocks.PURPLE_BANNER, bannerTooltip);
            addTooltip(Blocks.BLUE_BANNER, bannerTooltip);
            addTooltip(Blocks.BROWN_BANNER, bannerTooltip);
            addTooltip(Blocks.GREEN_BANNER, bannerTooltip);
            addTooltip(Blocks.RED_BANNER, bannerTooltip);
            addTooltip(Blocks.BLACK_BANNER, bannerTooltip);
            addTooltip(Blocks.BEEHIVE, "An artificial version of a bee nest.", "Can hold up to three bees.");
            var bedTooltip = addTooltipText("A comfortable block that lets you set a respawn point.", "Explodes anywhere except the Overworld!");
            addTooltip(Blocks.WHITE_BED, bedTooltip);
            addTooltip(Blocks.ORANGE_BED, bedTooltip);
            addTooltip(Blocks.MAGENTA_BED, bedTooltip);
            addTooltip(Blocks.LIGHT_BLUE_BED, bedTooltip);
            addTooltip(Blocks.YELLOW_BED, bedTooltip);
            addTooltip(Blocks.LIME_BED, bedTooltip);
            addTooltip(Blocks.PINK_BED, bedTooltip);
            addTooltip(Blocks.GRAY_BED, bedTooltip);
            addTooltip(Blocks.LIGHT_GRAY_BED, bedTooltip);
            addTooltip(Blocks.CYAN_BED, bedTooltip);
            addTooltip(Blocks.PURPLE_BED, bedTooltip);
            addTooltip(Blocks.BLUE_BED, bedTooltip);
            addTooltip(Blocks.BROWN_BED, bedTooltip);
            addTooltip(Blocks.GREEN_BED, bedTooltip);
            addTooltip(Blocks.RED_BED, bedTooltip);
            addTooltip(Blocks.BLACK_BED, bedTooltip);
            addTooltip(Blocks.BELL, "A block that can be rung to alert villagers.", "Additionally, it can be rung using redstone power or a projectile.");
            addTooltip(Blocks.CAKE, "A sweet food with cherries on top.", "Too big to eat all at once, but it comes in seven slices.");
            addTooltip(Blocks.CAMPFIRE, "An easy way to cook multiple pieces of food at once.", "Emits a plume of smoke that can be seen from far away.");
            addTooltip(Blocks.SOUL_CAMPFIRE, "A campfire that creates light by burning souls.");
            addTooltip(Blocks.CAULDRON, "An iron basin that can hold water, lava and snow.");
            addTooltip(Blocks.COMPOSTER, "A bin that holds compost and can produce bone meal.", "Also a workstation for farmer Villagers.");
            addTooltip(Blocks.CONDUIT, "A powerful, effect-granting block.", "When powered, it emits a pulsing sound, as if it is alive...");
            addTooltip(Blocks.FARMLAND, "Rich soil that crops can grow on.", "Stepping on it too hard will turn it back into regular dirt.");
            addTooltip(Blocks.END_GATEWAY, "A portal that teleports you throughout The End.");
            addTooltip(Blocks.END_PORTAL, "A portal that teleports you to the main island in The End.");
            addTooltip(Blocks.END_PORTAL_FRAME, "The indestructible frame of an End Portal.", "Only found in Strongholds.");
            addTooltip(Blocks.FLOWER_POT, "A small clay pot that can hold many types of plants.");
            addTooltip(Blocks.LADDER, "A useful wooden block that can be climbed up and down.");
            addTooltip(Blocks.LODESTONE, "A chiseled stone block with a chunk of netherite in the center that can be used to guide a compass’ needle.");
            addTooltip(Blocks.JUKEBOX, "A wooden block used to listen to music discs.");
            addTooltip(Blocks.NETHER_PORTAL, "A portal that brings you to and from the Nether.");
            addTooltip(Blocks.RESPAWN_ANCHOR, "A block charged with glowstone to set a respawn point in the Nether.", "Explosive when used in the Overworld.");
            addTooltip(Blocks.SCAFFOLDING, "A very useful block made of bamboo used to get around while building.");
            addTooltip(Blocks.SPAWNER, "A mysterious block that summons copies of any creature whose soul has become trapped inside.");
            addTooltip(Blocks.TNT, "An explosive block made of sand and gunpowder.", "Be careful around anything you don’t want turned into a crater!");
            addTooltip(Blocks.DECORATED_POT, "A ceramic pot that can display ancient sherds.");
        }
        private void mechanical() {
            var commandBlocks = addTooltipText("A mysterious block that has not been found to have any use.");
            addTooltip(Blocks.COMMAND_BLOCK, commandBlocks);
            addTooltip(Blocks.CHAIN_COMMAND_BLOCK, commandBlocks);
            addTooltip(Blocks.REPEATING_COMMAND_BLOCK, commandBlocks);
            addTooltip(Blocks.DISPENSER, "A redstone component used to shoot out items.");
            addTooltip(Blocks.DAYLIGHT_DETECTOR, "A redstone component used to sense the time of day.");
            addTooltip(Blocks.DROPPER, "A redstone component that drops items when it receives a redstone signal.");
            addTooltip(Blocks.HOPPER, "A redstone component used to move items around and transfer them between containers.");
            addTooltip(Blocks.LEVER, "A simple switch to turn on or off a redstone signal.");
            addTooltip(Blocks.LIGHTNING_ROD, "A copper pole that attracts lightning.", "Be careful not to get too close during a thunderstorm!");
            addTooltip(Blocks.NOTE_BLOCK, "A redstone component that plays music notes.", "Can be made to sound like various instruments by placing different blocks underneath.");
            addTooltip(Blocks.OBSERVER, "A redstone component that can detect changes in blocks next to it.");
            addTooltip(Blocks.PISTON, "A redstone component that pushes and pulls blocks.");
            addTooltip(Blocks.STICKY_PISTON, "A piston with slime on the end to hold onto blocks without the help of slime or honey.");
            addTooltip(Blocks.RAIL, "A track used for minecart travel, crafted with iron and sticks.");
            addTooltip(Blocks.ACTIVATOR_RAIL, "A rail that can interact with the minecarts traveling over it.");
            addTooltip(Blocks.DETECTOR_RAIL, "A rail with a pressure plate used to activate redstone with a minecart.");
            addTooltip(Blocks.POWERED_RAIL, "A rail that can boost a minecart when powered.");
            addTooltip(Blocks.COMPARATOR, "A redstone component that can detect states of adjacent blocks.");
            addTooltip(Blocks.REDSTONE_LAMP, "A light source turned on and off by redstone power.");
            addTooltip(Blocks.REPEATER, "A redstone component that can delay and extend redstone signals.");
            addTooltip(Blocks.REDSTONE_TORCH, "A torch that gives off a redstone power signal.");
            addTooltip(Blocks.TARGET, "A block that gives off a redstone signal based on where it is hit with a projectile.");
            addTooltip(Blocks.TRAPPED_CHEST, "A chest that activates a redstone signal when opened.");
            addTooltip(Blocks.TRIPWIRE_HOOK, "A hook that holds a tripwire and can activate a redstone signal.");
        }
        private void otherBlocks() {
            addTooltip(Blocks.BARRIER, "An invisible, unbreakable, solid block.");
            addTooltip(Blocks.JIGSAW, "A mysterious and unobtainable block.", "It is rumored to have been involved in creating the world");
            addTooltip(Blocks.STRUCTURE_BLOCK, "A mysterious block that has not been found to have any use.");
            addTooltip(Blocks.SCULK, "A block made from a material of unknown origin.", "Mining it seems to release the strange energy held within.");
            addTooltip(Blocks.SCULK_CATALYST, "A block made from a material of unknown origin.", "It can create more of this material when given sufficient soul power.");
            addTooltip(Blocks.SCULK_SENSOR, "A block made from a material of unknown origin.", "Has small tendrils that can sense vibrations and put out a signal redstone can detect.");
            addTooltip(Blocks.SCULK_SHRIEKER, "A block made from a material of unknown origin.", "Its loud shrieks generate pulsating darkness.");
            addTooltip(Blocks.SCULK_VEIN, "A block made from a material of unknown origin.", "It seems to be an early stage of growth for other sculk blocks.");
            //1.20 addTooltip(Blocks.CALIBRATED_SCULK_SENSOR, "A block made from a material of unknown origin.", "Infused with amethyst, allowing it to filter vibrations.");
            //1.20 addTooltip(Blocks.SNIFFER_EGG, "The egg of an ancient creature, found in an ocean ruin.");
        }
        private void materials() {
            addTooltip(Items.AMETHYST_SHARD, "A shard of a purple crystal found in Amethyst Geodes.");
            addTooltip(Items.BLAZE_ROD, "A hot bar of magic energy dropped by Blazes.");
            addTooltip(Items.BONE, "A piece of a creature’s skeleton.", "Can be made into bone meal, a useful fertilizer.");
            addTooltip(Items.CLAY_BALL, "A small clump of clay, used to make bricks.");
            addTooltip(Items.COAL, "A fuel source found underground in the Overworld.");
            addTooltip(Items.CHARCOAL, "Burnt logs from trees, commonly used as fuel.");
            addTooltip(Items.DIAMOND, "A gem found commonly in the depths of the Deepslate layer.", "The toughest material found in the Overworld.");
            addTooltip(Items.DRAGON_BREATH, "Acid created from an Ender Dragon’s fireball.", "Used in the creation of Lingering Potions.");
            addTooltip(Items.ECHO_SHARD, "A mysterious shard containing an unknown power.", "When cracked, one can hear the screaming of trapped souls.");
            addTooltip(Items.EMERALD, "A crystal of pure life energy.", "Villagers like them!");
            addTooltip(Items.ENDER_PEARL, "A crystalline orb with great amounts of dimensional energy.", "It will shatter when tossed, warping you to its location.");
            addTooltip(Items.FEATHER, "The feather of the Overworld’s birds.", "Used to craft arrows.");
            addTooltip(Items.FLINT, "A sedimentary rock used to make arrows and light fire.");
            addTooltip(Items.GHAST_TEAR, "A drop of liquid soul energy shed by a Ghast.");
            addTooltip(Items.GLOWSTONE_DUST, "The dust of the Glowstone crystal.", "Used to strengthen the effects of potions.");
            addTooltip(Items.GUNPOWDER, "An explosive material dropped by Creepers.", "Used in the creation of TNT.");
            addTooltip(Items.HEART_OF_THE_SEA, "A strange orb found in a buried treasure chest.", "Hums with a strange power reminiscent of the ocean depths.");
            addTooltip(Items.HONEYCOMB, "A piece of wax obtained from beehives.");
            addTooltip(Items.INK_SAC, "An item dropped by squids and used for black dye.");
            addTooltip(Items.GLOW_INK_SAC, "An ink sac dropped by Glow Squids.", "Used to make writing on signs glow.");
            addTooltip(Items.LAPIS_LAZULI, "A blue metamorphic rock used to help enchant items.");
            addTooltip(Items.LEATHER, "A material with many uses, dropped by some Overworld animals.");
            addTooltip(Items.MAGMA_CREAM, "A ball of a hot, slime-like substance dropped from Magma Cubes.");
            addTooltip(Items.NAUTILUS_SHELL, "The shell of a sea creature.", "Used to create a Conduit.");
            addTooltip(Items.QUARTZ, "A mineral found everywhere in the Nether.", "A piece of some redstone components.");
            addTooltip(Items.NETHER_STAR, "Countless souls crystallized in a star shape.", "Dropped by a Wither and seems to have great magical potential.");
            addTooltip(Items.NETHER_WART, "A fungus found in Nether Fortresses, commonly used to brew potions.");
            addTooltip(Items.PHANTOM_MEMBRANE, "A shred of the wing lining of a Phantom.", "Can be used to repair a broken elytra.");
            var potterySherds = addTooltipText("An ancient shard found in the soil around ruins.");
            //addTooltip(Items.POTTERY_SHERD_ANGLER, potterySherds);
            addTooltip(Items.POTTERY_SHARD_ARCHER, potterySherds);
            addTooltip(Items.POTTERY_SHARD_ARMS_UP, potterySherds);
            //addTooltip(Items.POTTERY_SHERD_BLADE, potterySherds);
            //addTooltip(Items.POTTERY_SHERD_BREWER, potterySherds);
            //addTooltip(Items.POTTERY_SHERD_BURN, potterySherds);
            //addTooltip(Items.POTTERY_SHERD_DANGER, potterySherds);
            //addTooltip(Items.POTTERY_SHERD_EXPLORER, potterySherds);
            //addTooltip(Items.POTTERY_SHERD_FRIEND, potterySherds);
            //addTooltip(Items.POTTERY_SHERD_HEART, potterySherds);
            //addTooltip(Items.POTTERY_SHERD_HEARTBREAK, potterySherds);
            //addTooltip(Items.POTTERY_SHERD_HOWL, potterySherds);
            //addTooltip(Items.POTTERY_SHERD_MINER, potterySherds);
            //addTooltip(Items.POTTERY_SHERD_MOURNER, potterySherds);
            //addTooltip(Items.POTTERY_SHERD_PLENTY, potterySherds);
            addTooltip(Items.POTTERY_SHARD_PRIZE, potterySherds);
            //addTooltip(Items.POTTERY_SHERD_SHEAF, potterySherds);
            //addTooltip(Items.POTTERY_SHERD_SHELTER, potterySherds);
            addTooltip(Items.POTTERY_SHARD_SKULL, potterySherds);
            //addTooltip(Items.POTTERY_SHARD_SNORT, potterySherds);
            addTooltip(Items.PRISMARINE_SHARD, "A piece of prismarine dropped by Guardians and Elder Guardians.");
            addTooltip(Items.PRISMARINE_CRYSTALS, "Glowing pieces of prismarine used to make sea lanterns.");
            addTooltip(Items.RABBIT_HIDE, "The coat of a rabbit.", "Can be crafted into leather.");
            addTooltip(Items.RABBIT_FOOT, "The paw of a rabbit, used as an ingredient in potions of leaping.");
            addTooltip(Items.RAW_COPPER, "A chunk of unsmelted copper.");
            addTooltip(Items.RAW_GOLD, "A chunk of unsmelted gold.");
            addTooltip(Items.RAW_IRON, "A chunk of unsmelted iron.");
            addTooltip(Items.REDSTONE, "Dust harvested from Redstone crystals, found underground.", "Has countless technical uses.");
            addTooltip(Items.SCUTE, "An item created when baby turtles grow up.", "Can be crafted into a helmet.");
            addTooltip(Items.SHULKER_SHELL, "The shell of a Shulker found in End Cities.", "Can be crafted into Shulker Boxes.");
            addTooltip(Items.SLIME_BALL, "A gooey orb, dropped from all sizes of Slime.");
            addTooltip(Items.STICK, "A small length of wood used to craft many items.");
            addTooltip(Items.STRING, "A piece of thread used to craft many items.");
            addTooltip(Items.WHEAT, "A plant commonly used for food, found in the Overworld.");
        }
        private void processed() {
            addTooltip(Items.BLAZE_POWDER, "Crushed blaze rods mostly used in potions.");
            addTooltip(Items.BOWL, "A wooden dish that usually holds soup.");
            addTooltip(Items.BRICK, "Smelted clay used for building.");
            addTooltip(Items.NETHER_BRICK, "Smelted netherrack used for building.");
            addTooltip(Items.COPPER_INGOT, "A bar of smelted copper.");
            addTooltip(Items.FERMENTED_SPIDER_EYE, "A common ingredient used to reverse the effects of potions.");
            addTooltip(Items.FIREWORK_STAR, "An item used to create different shapes and colors of fireworks.");
            addTooltip(Items.GLISTERING_MELON_SLICE, "A melon slice coated in gold, used for healing potions.");
            addTooltip(Items.GOLD_INGOT, "An ingot of smelted gold.", "May be worth something…");
            addTooltip(Items.GOLD_NUGGET, "A small chunk of gold.");
            addTooltip(Items.IRON_INGOT, "A bar of smelted iron.", "Very versatile in crafting.");
            addTooltip(Items.IRON_NUGGET, "A small piece of iron.");
            addTooltip(Items.NETHERITE_INGOT, "An alloy made of ancient scraps and gold.", "It has a strange property rendering it impervious to fire.");
            addTooltip(Items.NETHERITE_SCRAP, "A small, smelted sheet of ancient debris.", "Perhaps once used as metal, but is surprisingly brittle in its current state.");
            addTooltip(Items.PAPER, "A thin material made with sugar cane.", "Used to craft books.");
            addTooltip(Items.POPPED_CHORUS_FRUIT, "Smelted chorus fruit used to make some decorative blocks.");
            addTooltip(Items.SUGAR, "An ingredient for foods and potions, made from sugar cane.");
        }
        private void food() {
            addTooltip(Items.APPLE, "A delicious, fresh fruit found on oak trees.");
            addTooltip(Items.GOLDEN_APPLE, "An apple coated in gold.", "Grants effects when eaten.");
            addTooltip(Items.ENCHANTED_GOLDEN_APPLE, "A magical golden apple.", "Eating it will protect you from almost anything with multiple powerful effects.");
            addTooltip(Items.BEETROOT, "A red root vegetable found in villages.");
            addTooltip(Items.BEETROOT_SOUP, "A filling soup made with six beetroots.");
            addTooltip(Items.BREAD, "A very common food made with three pieces of wheat.");
            addTooltip(Items.CARROT, "An orange root vegetable found in villages.");
            addTooltip(Items.GOLDEN_CARROT, "A carrot coated in gold.", "Very filling.");
            addTooltip(Items.CHORUS_FRUIT, "A fruit found on chorus plants in The End.", "Teleports you nearby when eaten.");
            addTooltip(Items.COOKIE, "A small baked food made with wheat and cocoa beans.");
            addTooltip(Items.DRIED_KELP, "Smelted kelp.", "A good quick-to-eat food source.");
            addTooltip(Items.GLOW_BERRIES, "Berries found on cave vines in lush caves.");
            addTooltip(Items.HONEY_BOTTLE, "A bottle of honey from a beehive.");
            addTooltip(Items.MELON_SLICE, "A juicy slice of a melon, found in the Jungle biome.");
            addTooltip(Items.MUSHROOM_STEW, "A soup made with the Overworld’s mushrooms.");
            addTooltip(Items.POTATO, "A common starchy root vegetable.", "Great as a food source.");
            addTooltip(Items.BAKED_POTATO, "A filling, delicious cooked potato.");
            addTooltip(Items.POISONOUS_POTATO, "A rare potato that is poisonous when eaten.");
            addTooltip(Items.PUFFERFISH, "A poisonous fish used to brew potions of water breathing.");
            addTooltip(Items.PUMPKIN_PIE, "A delicious pie baked with pumpkin.");
            addTooltip(Items.RABBIT_STEW, "A soup cooked with rabbit meat and vegetables.");
            addTooltip(Items.BEEF, "Uncooked beef dropped from a cow.");
            addTooltip(Items.COOKED_BEEF, "A filling piece of cooked beef.");
            addTooltip(Items.CHICKEN, "A piece of uncooked chicken.", "May give you food poisoning.");
            addTooltip(Items.COOKED_CHICKEN, "A filling piece of cooked chicken.");
            addTooltip(Items.COD, "Uncooked fish found in oceans.");
            addTooltip(Items.COOKED_COD, "A filling piece of cooked cod.");
            addTooltip(Items.MUTTON, "A piece of uncooked mutton.");
            addTooltip(Items.COOKED_MUTTON, "A filling piece of cooked mutton.");
            addTooltip(Items.PORKCHOP, "A piece of uncooked pork.");
            addTooltip(Items.COOKED_PORKCHOP, "A filling piece of cooked pork.");
            addTooltip(Items.RABBIT, "A piece of uncooked rabbit.");
            addTooltip(Items.COOKED_RABBIT, "A filling piece of cooked rabbit.");
            addTooltip(Items.SALMON, "Uncooked fish found in oceans and rivers.");
            addTooltip(Items.COOKED_SALMON, "A filling piece of cooked salmon.");
            addTooltip(Items.ROTTEN_FLESH, "Decomposing flesh dropped by zombies.", "Eating it is not recommended.");
            addTooltip(Items.SPIDER_EYE, "A common ingredient for potions, sometimes dropped by spiders.");
            addTooltip(Items.SUSPICIOUS_STEW, "A soup that inflicts different effects depending on the ingredients.");
            addTooltip(Items.SWEET_BERRIES, "A sweet food found in Taiga biomes.");
            addTooltip(Items.TROPICAL_FISH, "A fish found in certain tropical biomes.");
        }
        private void seeds() {
            addTooltip(Items.BEETROOT_SEEDS, "Seeds used to grow beetroot plants.");
            addTooltip(Items.COCOA_BEANS, "A large bean found on jungle trees.");
            addTooltip(Items.MELON_SEEDS, "Seeds used to grow melons.");
            //1.20 addTooltip(Items.PITCHER_POD, "A pod used to grow ancient pitcher plants.");
            addTooltip(Items.PUMPKIN_SEEDS, "Seeds used to grow pumpkins.");
            addTooltip(Items.TORCHFLOWER_SEEDS, "Seeds used to grow ancient torchflowers.");
            addTooltip(Items.WHEAT_SEEDS, "Seeds used to grow wheat plants.");
        }
        private void dyes() {
            addTooltip(Items.BLACK_DYE, "A dye made with ink sacs or wither roses.");
            addTooltip(Items.BLUE_DYE, "A dye made with lapis lazuli or cornflowers.");
            addTooltip(Items.BROWN_DYE, "A dye made with cocoa beans.");
            addTooltip(Items.CYAN_DYE, "A combination of blue and green dye.");
            addTooltip(Items.GRAY_DYE, "A combination of black and white dye.");
            addTooltip(Items.GREEN_DYE, "A dye made by smelting cactus.");
            addTooltip(Items.LIGHT_BLUE_DYE, "A dye made with blue and white dye or blue orchids.");
            addTooltip(Items.LIGHT_GRAY_DYE, "A dye made with a few different white flowers.");
            addTooltip(Items.LIME_DYE, "A dye made with green and white dye or by smelting sea pickles.");
            addTooltip(Items.MAGENTA_DYE, "A dye made with a few different magenta flowers.");
            addTooltip(Items.ORANGE_DYE, "A dye made with red and yellow dye or orange tulips.");
            addTooltip(Items.PINK_DYE, "A dye made with red and white dye, pink tulips or peonies.");
            addTooltip(Items.PURPLE_DYE, "A combination of blue and red dye.");
            addTooltip(Items.RED_DYE, "A dye made with a few different red flowers.");
            addTooltip(Items.WHITE_DYE, "A dye made with bone meal or lilies of the valley.");
            addTooltip(Items.YELLOW_DYE, "A dye made with dandelions or sunflowers.");
        }
        private void tools() {
            addTooltip(Items.WOODEN_AXE, "An axe made of wood or hypha.", "Used to chop wood and hypha.");
            addTooltip(Items.STONE_AXE, "An axe made of certain stones.", "Used to chop wood and hypha.");
            addTooltip(Items.IRON_AXE, "An axe made of smelted iron.", "Used to chop wood and hypha.");
            addTooltip(Items.GOLDEN_AXE, "An axe made of smelted gold.", "Used to chop wood and hypha.");
            addTooltip(Items.DIAMOND_AXE, "An axe made of the Overworld’s strongest mineral.", "Used to chop wood and hypha.");
            addTooltip(Items.NETHERITE_AXE, "A diamond axe enhanced with Netherite.", "This makes it impervious to fire.");
            addTooltip(Items.FISHING_ROD, "A string on a stick used to catch fish.");
            addTooltip(Items.FLINT_AND_STEEL, "Pieces of flint and iron used to start a fire.");
            addTooltip(Items.WOODEN_HOE, "A hoe made of wood or hypha.", "Used to till soil.");
            addTooltip(Items.STONE_HOE, "A hoe made of certain stones.", "Used to till soil.");
            addTooltip(Items.IRON_HOE, "A hoe made of smelted iron.", "Used to till soil.");
            addTooltip(Items.GOLDEN_HOE, "A hoe made of smelted gold.", "Used to till soil.");
            addTooltip(Items.DIAMOND_HOE, "A hoe made of the Overworld’s strongest mineral.", "Used to till soil.");
            addTooltip(Items.NETHERITE_HOE, "A diamond hoe enhanced with Netherite.", "This makes it impervious to fire.");
            addTooltip(Items.MILK_BUCKET, "A bucket filled with cow's or goat’s milk.");
            addTooltip(Items.WOODEN_PICKAXE, "A pickaxe made of wood or hypha.", "Used to mine stone materials.");
            addTooltip(Items.STONE_PICKAXE, "A pickaxe made of certain stones.", "Used to mine stone materials.");
            addTooltip(Items.IRON_PICKAXE, "A pickaxe made of smelted iron.", "Used to mine stone materials.");
            addTooltip(Items.GOLDEN_PICKAXE, "A pickaxe made of smelted gold.", "Used to mine stone materials.");
            addTooltip(Items.DIAMOND_PICKAXE, "A pickaxe made of the Overworld’s strongest mineral.", "Used to mine stone materials.");
            addTooltip(Items.NETHERITE_PICKAXE, "A diamond pickaxe enhanced with Netherite.", "This makes it impervious to fire.");
            addPotionTooltips(Items.POTION,  "A brewed drink that grants effects to creatures who choose to ingest it.");
            addPotionTooltips(Items.LINGERING_POTION,  "A brewed drink that creates an effect-granting cloud of gas.");
            addPotionTooltips(Items.SPLASH_POTION,  "A brewed drink that grants effects to creatures splashed by the liquid contained inside.");
            addTooltip(Items.SHEARS, "A tool used to cut grasses and leaves, and to shear sheep.");
            addTooltip(Items.WOODEN_SHOVEL, "A shovel made of wood or hypha.", "Used to dig through some natural materials.");
            addTooltip(Items.STONE_SHOVEL, "A shovel made of certain stones.", "Used to dig through some natural materials.");
            addTooltip(Items.IRON_SHOVEL, "A shovel made of smelted iron.", "Used to dig through some natural materials.");
            addTooltip(Items.GOLDEN_SHOVEL, "A shovel made of smelted gold.", "Used to dig through some natural materials.");
            addTooltip(Items.DIAMOND_SHOVEL, "A shovel made of the Overworld’s strongest mineral.", "Used to dig through some natural materials.");
            addTooltip(Items.NETHERITE_SHOVEL, "A diamond shovel enhanced with Netherite.", "This makes it impervious to fire.");
            addTooltip(Items.SHIELD, "A piece of personal armor used to block attacks.");
        }
        private void informational() {
            addTooltip(Items.WRITABLE_BOOK, "Bound sheets of paper used to record information.");
            addTooltip(Items.BOOK, "Bound sheets of paper used to record information.");
            addTooltip(Items.WRITTEN_BOOK, "A book with information written in it.");
            addTooltip(Items.CLOCK, "An item used to tell the time.");
            addTooltip(Items.COMPASS, "A device used to locate one’s spawn point using a strange form of magnetism.");
            addTooltip(Items.RECOVERY_COMPASS, "A strange compass enhanced by the power of Echo Shards.", "It points to the exact point at which the bearer last died.");
            addTooltip(Items.MAP, "A piece of paper used to see an overview of an area.");
            addTooltip(Items.FILLED_MAP, "A map filled with a visual description of an area.");
            addTooltip(Items.NAME_TAG, "A label used to name creatures.");
            addTooltip(Items.SPYGLASS, "A viewing device made of copper and amethyst.", "Allows the user to see far objects as if they were close by.");
        }
        private void weapons() {
            addTooltip(Items.ARROW, "A pointed stick fired from a bow or crossbow.");
            addTooltip(Items.BRUSH, "A tool used to excavate ancient artifacts.");
            addTooltip(Items.SPECTRAL_ARROW, "A magical arrow that inflicts the glowing effect on anything it hits.");
            addPotionTooltips(Items.TIPPED_ARROW, "An arrow dipped in a potion, granting an effect to anyone it hits.");
            addTooltip(Items.BOW, "A weapon used to fire many types of arrows.");
            addTooltip(Items.CROSSBOW, "A stronger bow that must be charged before using.");
            addTooltip(Items.EGG, "A chicken’s egg.", "Will sometimes hatch when thrown.");
            addTooltip(Items.FIRE_CHARGE, "A ball of fire-starting materials used to light fires.");
            addTooltip(Items.SNOWBALL, "A ball of snow that knocks back things it is thrown at.");
            addTooltip(Items.WOODEN_SWORD, "A sword made of wood or hypha.", "Used as a simple weapon.");
            addTooltip(Items.STONE_SWORD, "A sword made of certain stones.", "A weak, yet common weapon.");
            addTooltip(Items.IRON_SWORD, "A sword made of smelted iron.", "A reliable weapon for many adventurers.");
            addTooltip(Items.GOLDEN_SWORD, "A sword made of smelted gold.", "A flashy weapon with little durability.");
            addTooltip(Items.DIAMOND_SWORD, "A sword made of the Overworld’s strongest mineral.", "A powerful weapon.");
            addTooltip(Items.NETHERITE_SWORD, "A diamond sword enhanced with Netherite.", "An impressive weapon.");
            addTooltip(Items.TRIDENT, "A three-pronged spear that easily travels through water.");
        }
        private void armor() {
            addTooltip(Items.LEATHER_BOOTS, "A pair of boots made of leather.");
            addTooltip(Items.CHAINMAIL_BOOTS, "A pair of boots made of chainmail.");
            addTooltip(Items.IRON_BOOTS, "A pair of boots crafted of smelted iron.");
            addTooltip(Items.GOLDEN_BOOTS, "A pair of boots crafted of smelted gold.");
            addTooltip(Items.DIAMOND_BOOTS, "A pair of boots made of the Overworld’s strongest mineral.");
            addTooltip(Items.NETHERITE_BOOTS, "A pair of diamond boots enhanced with Netherite.", "This makes them impervious to fire.");
            addTooltip(Items.LEATHER_CHESTPLATE, "A sturdy piece of armor made of leather.");
            addTooltip(Items.CHAINMAIL_CHESTPLATE, "A sturdy piece of armor made of chainmail.");
            addTooltip(Items.IRON_CHESTPLATE, "A sturdy piece of armor made of smelted iron.");
            addTooltip(Items.GOLDEN_CHESTPLATE, "A sturdy piece of armor made of smelted gold.");
            addTooltip(Items.DIAMOND_CHESTPLATE, "A sturdy piece of armor made of the Overworld’s strongest mineral.");
            addTooltip(Items.NETHERITE_CHESTPLATE, "A diamond chestplate enhanced with Netherite.", "This makes it impervious to fire.");
            addTooltip(Items.LEATHER_HELMET, "A piece of head protection made of leather.");
            addTooltip(Items.CHAINMAIL_HELMET, "A piece of head protection made of chainmail.");
            addTooltip(Items.IRON_HELMET, "A piece of head protection made of smelted iron.");
            addTooltip(Items.GOLDEN_HELMET, "A piece of head protection made of smelted gold.");
            addTooltip(Items.DIAMOND_HELMET, "A piece of head protection made of the Overworld’s strongest mineral.");
            addTooltip(Items.NETHERITE_HELMET, "A diamond helmet plated with Netherite.", "This makes it impervious to fire.");
            addTooltip(Items.TURTLE_HELMET, "A turtle’s shell, granting water breathing for ten seconds.");
            addTooltip(Items.LEATHER_HORSE_ARMOR, "Horse protection made of leather.");
            addTooltip(Items.IRON_HORSE_ARMOR, "Horse protection made of smelted iron.");
            addTooltip(Items.GOLDEN_HORSE_ARMOR, "Horse protection made of smelted gold.");
            addTooltip(Items.DIAMOND_HORSE_ARMOR, "Horse protection made of the Overworld’s strongest mineral.");
            addTooltip(Items.LEATHER_LEGGINGS, "Leg protection made of leather.");
            addTooltip(Items.CHAINMAIL_LEGGINGS, "Leg protection made of chainmail.");
            addTooltip(Items.IRON_LEGGINGS, "Leg protection made of smelted iron.");
            addTooltip(Items.GOLDEN_LEGGINGS, "Leg protection made of smelted gold.");
            addTooltip(Items.DIAMOND_LEGGINGS, "Leg protection made of the Overworld’s strongest mineral.");
            addTooltip(Items.NETHERITE_LEGGINGS, "A pair of diamond leggings enhanced with Netherite.", "This makes them impervious to fire.");
        }
        private void transportation() {
            var boatTooltip = addTooltipText("A wooden means of aquatic transportation.");
            addTooltip(Items.OAK_BOAT, boatTooltip);
            addTooltip(Items.DARK_OAK_BOAT, boatTooltip);
            addTooltip(Items.BIRCH_BOAT, boatTooltip);
            addTooltip(Items.SPRUCE_BOAT, boatTooltip);
            addTooltip(Items.ACACIA_BOAT, boatTooltip);
            addTooltip(Items.JUNGLE_BOAT, boatTooltip);
            addTooltip(Items.CHERRY_BOAT, boatTooltip);
            addTooltip(Items.MANGROVE_BOAT, boatTooltip);
            var chestBoatTooltip = addTooltipText("A boat containing a chest to store materials.");
            addTooltip(Items.OAK_CHEST_BOAT, chestBoatTooltip);
            addTooltip(Items.DARK_OAK_CHEST_BOAT, chestBoatTooltip);
            addTooltip(Items.BIRCH_CHEST_BOAT, chestBoatTooltip);
            addTooltip(Items.SPRUCE_CHEST_BOAT, chestBoatTooltip);
            addTooltip(Items.ACACIA_CHEST_BOAT, chestBoatTooltip);
            addTooltip(Items.JUNGLE_CHEST_BOAT, chestBoatTooltip);
            addTooltip(Items.CHERRY_CHEST_BOAT, chestBoatTooltip);
            addTooltip(Items.MANGROVE_CHEST_BOAT, chestBoatTooltip);
            addTooltip(Items.BAMBOO_RAFT, "A bamboo means of aquatic transportation.");
            addTooltip(Items.BAMBOO_CHEST_RAFT, "A raft containing a chest to store materials.");
            addTooltip(Items.ELYTRA, "A pair of wings found on End Ships.", "The sky’s the limit!");
            addTooltip(Items.MINECART, "An iron cart, used as a means of transportation.");
            addTooltip(Items.CHEST_MINECART, "A minecart with a chest to store cargo.");
            addTooltip(Items.HOPPER_MINECART, "A minecart with a hopper.", "Can transfer items while moving.");
            addTooltip(Items.TNT_MINECART, "A minecart with explosives inside.");
            addTooltip(Items.FURNACE_MINECART, "A minecart with motion is powered by fuel.");
            addTooltip(Items.COMMAND_BLOCK_MINECART, "A minecart with a mysterious device inside.");
        }
        private void utility() {
            addTooltip(Items.ARMOR_STAND, "An object used to display all sorts of armor and items.");
            addTooltip(Items.ITEM_FRAME, "A small frame used to display your most prized items.");
            addTooltip(Items.GLOW_ITEM_FRAME, "An item frame that glows in the dark using a glow ink sac.");
            var bannerPattern = addTooltipText("A stencil for painting on a banner.");
            addTooltip(Items.CREEPER_BANNER_PATTERN, bannerPattern);
            addTooltip(Items.FLOWER_BANNER_PATTERN, bannerPattern);
            addTooltip(Items.GLOBE_BANNER_PATTERN, bannerPattern);
            addTooltip(Items.MOJANG_BANNER_PATTERN, bannerPattern);
            addTooltip(Items.PIGLIN_BANNER_PATTERN, bannerPattern);
            addTooltip(Items.SKULL_BANNER_PATTERN, bannerPattern);
            addTooltip(Items.BONE_MEAL, "A useful fertilizer created from bones.", "Can accelerate most plants’ growth.");
            addTooltip(Items.EXPERIENCE_BOTTLE, "A bottle packed with experience orbs.", "Throwing it at the ground will shatter it and release them.");
            addTooltip(Items.BUCKET, "An iron container used to carry water, lava, or snow.");
            addTooltip(Items.AXOLOTL_BUCKET, "A bucket with a friendly Axolotl contained in water.");
            addTooltip(Items.COD_BUCKET, "A bucket with a Cod contained in water.");
            addTooltip(Items.LAVA_BUCKET, "A bucket filled with molten rock.");
            addTooltip(Items.POWDER_SNOW_BUCKET, "A bucket filled with a block of powder snow.");
            addTooltip(Items.PUFFERFISH_BUCKET, "A bucket with a Pufferfish contained in water.");
            addTooltip(Items.SALMON_BUCKET, "A bucket with a Salmon contained in water.");
            addTooltip(Items.TADPOLE_BUCKET, "A bucket with a Tadpole contained in water.");
            addTooltip(Items.TROPICAL_FISH_BUCKET, "A bucket with a Tropical Fish contained in water.");
            addTooltip(Items.WATER_BUCKET, "A bucket filled with liquid water.");
            addTooltip(Items.BUNDLE, "A bag used to carry a variety of items at once.");
            addTooltip(Items.CARROT_ON_A_STICK, "A carrot tied to a fishing rod.", "Pigs are attracted to it.");
            addTooltip(Items.WARPED_FUNGUS_ON_A_STICK, "A warped fungus tied to a fishing rod.", "Striders are attracted by it.");
            addTooltip(Items.ENCHANTED_BOOK, "A magical tome containing knowledge of an enchantment.");
            addTooltip(Items.END_CRYSTAL, "An extremely explosive crystal.", "Appears to have the power to heal the Ender Dragon.");
            addTooltip(Items.ENDER_EYE, "An unnerving eye seems to tug towards something.", "Perhaps it will lead somewhere?");
            addTooltip(Items.FIREWORK_ROCKET, "A rocket used to launch fireworks.", "Can be shot out of a crossbow for a vibrant attack.");
            addTooltip(Items.GLASS_BOTTLE, "A small glass bottle, able to hold many liquids.");
            addTooltip(Items.GOAT_HORN, "A goat’s horn that has fallen off.", "When blown, the sound can be heard for hundreds of meters.");
            addTooltip(Items.LEAD, "A leash used to keep creatures close.", "Can be tied to a fence post.");
            var smithingTemplate = addTooltipText("A tablet used to design or upgrade items.", "Applied with a Smithing Table.");
            addTooltip(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, smithingTemplate);
        /*addTooltip(Items.COAST_ARMOR_TRIM_SMITHING_TEMPLATE, trimTemplate);
        //addTooltip(Items.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE, trimTemplate);
        //addTooltip(Items.EYE_ARMOR_TRIM_SMITHING_TEMPLATE, trimTemplate);
        //addTooltip(Items.HOST_ARMOR_TRIM_SMITHING_TEMPLATE, trimTemplate);
        //addTooltip(Items.RAISER_ARMOR_TRIM_SMITHING_TEMPLATE, trimTemplate);
        //addTooltip(Items.RIB_ARMOR_TRIM_SMITHING_TEMPLATE, trimTemplate);
        //addTooltip(Items.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE, trimTemplate);
        //addTooltip(Items.SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE, trimTemplate);
        //addTooltip(Items.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE, trimTemplate);
        //addTooltip(Items.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE, trimTemplate);
        //addTooltip(Items.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE, trimTemplate);
        //addTooltip(Items.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE, trimTemplate);
        //addTooltip(Items.VEX_ARMOR_TRIM_SMITHING_TEMPLATE, trimTemplate);
        //addTooltip(Items.WARD_ARMOR_TRIM_SMITHING_TEMPLATE, trimTemplate);
        //addTooltip(Items.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE, trimTemplate);
        addTooltip(Items.WILD_ARMOR_TRIM_SMITHING_TEMPLATE, trimTemplate);*/
            addTooltip(Items.SADDLE, "A useful seat for controlled riding of certain animals.");
            addTooltip(Items.TOTEM_OF_UNDYING, "A strange figure created by illagers", "Mysteriously revives you when moments from death.");
        }
        private void otherItems() {
            var discTooltip = addTooltipText("A disc made from an unknown material.", "It has etchings that allow music to be played.");
            var strangeDiscTooltip = addTooltipText("A strange disc from ages past.", "Recreated from echoes of its age.");
            addTooltip(Items.MUSIC_DISC_CAT, discTooltip);
            addTooltip(Items.MUSIC_DISC_BLOCKS, discTooltip);
            addTooltip(Items.MUSIC_DISC_CHIRP, discTooltip);
            addTooltip(Items.MUSIC_DISC_FAR, discTooltip);
            addTooltip(Items.MUSIC_DISC_MALL, discTooltip);
            addTooltip(Items.MUSIC_DISC_MELLOHI, discTooltip);
            addTooltip(Items.MUSIC_DISC_OTHERSIDE, discTooltip);
            addTooltip(Items.MUSIC_DISC_PIGSTEP, discTooltip);
            //addTooltip(Items.MUSIC_DISC_RELIC, discTooltip);
            addTooltip(Items.MUSIC_DISC_STAL, discTooltip);
            addTooltip(Items.MUSIC_DISC_STRAD, discTooltip);
            addTooltip(Items.MUSIC_DISC_WAIT, discTooltip);
            addTooltip(Items.MUSIC_DISC_WARD, discTooltip);
            addTooltip(Items.MUSIC_DISC_5, strangeDiscTooltip);
            addTooltip(Items.MUSIC_DISC_11, strangeDiscTooltip);
            addTooltip(Items.MUSIC_DISC_13, strangeDiscTooltip);
            addTooltip(Items.DISC_FRAGMENT_5, "A fragment of a music disc, found in an Ancient City.");
            var spawnEggs = addTooltipText("A strange, multi-colored egg.", "When used, it hatches into a mob through an unknown process.");
            addTooltip(Items.ALLAY_SPAWN_EGG, spawnEggs);
            addTooltip(Items.AXOLOTL_SPAWN_EGG, spawnEggs);
            addTooltip(Items.BAT_SPAWN_EGG, spawnEggs);
            addTooltip(Items.BEE_SPAWN_EGG, spawnEggs);
            addTooltip(Items.BLAZE_SPAWN_EGG, spawnEggs);
            addTooltip(Items.CAMEL_SPAWN_EGG, spawnEggs);
            addTooltip(Items.CAT_SPAWN_EGG, spawnEggs);
            addTooltip(Items.CAVE_SPIDER_SPAWN_EGG, spawnEggs);
            addTooltip(Items.CHICKEN_SPAWN_EGG, spawnEggs);
            addTooltip(Items.COD_SPAWN_EGG, spawnEggs);
            addTooltip(Items.COW_SPAWN_EGG, spawnEggs);
            addTooltip(Items.CREEPER_SPAWN_EGG, spawnEggs);
            addTooltip(Items.DOLPHIN_SPAWN_EGG, spawnEggs);
            addTooltip(Items.DONKEY_SPAWN_EGG, spawnEggs);
            addTooltip(Items.DROWNED_SPAWN_EGG, spawnEggs);
            addTooltip(Items.ELDER_GUARDIAN_SPAWN_EGG, spawnEggs);
            addTooltip(Items.ENDERMAN_SPAWN_EGG, spawnEggs);
            addTooltip(Items.ENDERMITE_SPAWN_EGG, spawnEggs);
            addTooltip(Items.EVOKER_SPAWN_EGG, spawnEggs);
            addTooltip(Items.FOX_SPAWN_EGG, spawnEggs);
            addTooltip(Items.FROG_SPAWN_EGG, spawnEggs);
            addTooltip(Items.GHAST_SPAWN_EGG, spawnEggs);
            addTooltip(Items.GLOW_SQUID_SPAWN_EGG, spawnEggs);
            addTooltip(Items.GOAT_SPAWN_EGG, spawnEggs);
            addTooltip(Items.GUARDIAN_SPAWN_EGG, spawnEggs);
            addTooltip(Items.HOGLIN_SPAWN_EGG, spawnEggs);
            addTooltip(Items.HORSE_SPAWN_EGG, spawnEggs);
            addTooltip(Items.HUSK_SPAWN_EGG, spawnEggs);
            addTooltip(Items.IRON_GOLEM_SPAWN_EGG, spawnEggs);
            addTooltip(Items.LLAMA_SPAWN_EGG, spawnEggs);
            addTooltip(Items.MAGMA_CUBE_SPAWN_EGG, spawnEggs);
            addTooltip(Items.MOOSHROOM_SPAWN_EGG, spawnEggs);
            addTooltip(Items.MULE_SPAWN_EGG, spawnEggs);
            addTooltip(Items.OCELOT_SPAWN_EGG, spawnEggs);
            addTooltip(Items.PANDA_SPAWN_EGG, spawnEggs);
            addTooltip(Items.PARROT_SPAWN_EGG, spawnEggs);
            addTooltip(Items.PHANTOM_SPAWN_EGG, spawnEggs);
            addTooltip(Items.PIG_SPAWN_EGG, spawnEggs);
            addTooltip(Items.PIGLIN_SPAWN_EGG, spawnEggs);
            addTooltip(Items.PIGLIN_BRUTE_SPAWN_EGG, spawnEggs);
            addTooltip(Items.PILLAGER_SPAWN_EGG, spawnEggs);
            addTooltip(Items.POLAR_BEAR_SPAWN_EGG, spawnEggs);
            addTooltip(Items.PUFFERFISH_SPAWN_EGG, spawnEggs);
            addTooltip(Items.RABBIT_SPAWN_EGG, spawnEggs);
            addTooltip(Items.RAVAGER_SPAWN_EGG, spawnEggs);
            addTooltip(Items.SALMON_SPAWN_EGG, spawnEggs);
            addTooltip(Items.SHEEP_SPAWN_EGG, spawnEggs);
            addTooltip(Items.SHULKER_SPAWN_EGG, spawnEggs);
            addTooltip(Items.SILVERFISH_SPAWN_EGG, spawnEggs);
            addTooltip(Items.SKELETON_SPAWN_EGG, spawnEggs);
            addTooltip(Items.SKELETON_HORSE_SPAWN_EGG, spawnEggs);
            addTooltip(Items.SLIME_SPAWN_EGG, spawnEggs);
            addTooltip(Items.SNIFFER_SPAWN_EGG, spawnEggs);
            addTooltip(Items.SNOW_GOLEM_SPAWN_EGG, spawnEggs);
            addTooltip(Items.SPIDER_SPAWN_EGG, spawnEggs);
            addTooltip(Items.SQUID_SPAWN_EGG, spawnEggs);
            addTooltip(Items.STRAY_SPAWN_EGG, spawnEggs);
            addTooltip(Items.STRIDER_SPAWN_EGG, spawnEggs);
            addTooltip(Items.TADPOLE_SPAWN_EGG, spawnEggs);
            addTooltip(Items.TRADER_LLAMA_SPAWN_EGG, spawnEggs);
            addTooltip(Items.TROPICAL_FISH_SPAWN_EGG, spawnEggs);
            addTooltip(Items.TURTLE_SPAWN_EGG, spawnEggs);
            addTooltip(Items.VEX_SPAWN_EGG, spawnEggs);
            addTooltip(Items.VILLAGER_SPAWN_EGG, spawnEggs);
            addTooltip(Items.VINDICATOR_SPAWN_EGG, spawnEggs);
            addTooltip(Items.WANDERING_TRADER_SPAWN_EGG, spawnEggs);
            addTooltip(Items.WARDEN_SPAWN_EGG, spawnEggs);
            addTooltip(Items.WITCH_SPAWN_EGG, spawnEggs);
            addTooltip(Items.WITHER_SKELETON_SPAWN_EGG, spawnEggs);
            addTooltip(Items.WOLF_SPAWN_EGG, spawnEggs);
            addTooltip(Items.ZOGLIN_SPAWN_EGG, spawnEggs);
            addTooltip(Items.ZOMBIE_SPAWN_EGG, spawnEggs);
            addTooltip(Items.ZOMBIE_HORSE_SPAWN_EGG, spawnEggs);
            addTooltip(Items.ZOMBIE_VILLAGER_SPAWN_EGG, spawnEggs);
            addTooltip(Items.ZOMBIFIED_PIGLIN_SPAWN_EGG, spawnEggs);
            addTooltip(Items.ENDER_DRAGON_SPAWN_EGG, spawnEggs);
            addTooltip(Items.WITHER_SPAWN_EGG, spawnEggs);
            addTooltip(Items.DEBUG_STICK, "A mysterious stick containing great power.", "Can alter the state of blocks beyond physical limits.");
            addTooltip(Items.KNOWLEDGE_BOOK, "A strange book containing much knowledge.", "It can inspire the idea of a recipe or accomplishment.");
            addTooltip(Items.PAINTING, "A canvas with a mysterious pattern painted on it.", "Does it mean something?");
        }

        public void addTooltip(Block block, String... tooltip) {
            translationBuilder.add(block.getTranslationKey() + ".expanded_tooltips.desc", String.join("\n", tooltip));
        }

        public void addTooltipForVariants(Block baseBlock, Block... variants) {
            for (Block variant : variants) {
                if (variant instanceof StairsBlock) {
                    addTooltip(variant, "Stairs crafted from " + I18n.translate(baseBlock.getTranslationKey()) + ".");
                }
                if (variant instanceof SlabBlock) {
                    addTooltip(variant, "A slab crafted from " + I18n.translate(baseBlock.getTranslationKey()) + ".");
                }
                if (variant instanceof WallBlock) {
                    addTooltip(variant, "A wall crafted from " + I18n.translate(baseBlock.getTranslationKey()) + ".");
                }
                if (variant instanceof ButtonBlock) {
                    addTooltip(variant, "A button crafted from " + I18n.translate(baseBlock.getTranslationKey()) + ".");
                }
                if (variant instanceof PressurePlateBlock) {
                    addTooltip(variant, "A pressure plate crafted from " + I18n.translate(baseBlock.getTranslationKey()) + ".");
                }
                if (variant instanceof FenceBlock) {
                    addTooltip(variant, "A fence crafted from " + I18n.translate(baseBlock.getTranslationKey()) + ".");
                }
            }
        }

        public void addWoodsetTooltip(boolean isOvWood, Block baseBlock, String[] optionalBaseBlockTooltip, Block... variants) {
            if (Arrays.stream(optionalBaseBlockTooltip).toList().isEmpty()) {
                var planksTooltip = isOvWood ? "Planks crafted from an Overworld log." : "Planks crafted from a Nether stem.";
                addTooltip(baseBlock, planksTooltip, "Very versatile in crafting.");
            } else {
                addTooltip(baseBlock, optionalBaseBlockTooltip);
            }
            for (Block variant : variants) {
                if (variant instanceof StairsBlock) {
                    addTooltip(variant, "Stairs crafted from " + I18n.translate(baseBlock.getTranslationKey()) + ".");
                }
                if (variant instanceof SlabBlock) {
                    addTooltip(variant, "A slab crafted from " + I18n.translate(baseBlock.getTranslationKey()) + ".");
                }
                if (variant instanceof FenceBlock) {
                    addTooltip(variant, "A fence crafted from " + I18n.translate(baseBlock.getTranslationKey()) + ".");
                }
                if (variant instanceof FenceGateBlock) {
                    addTooltip(variant, "A fence gate crafted from " + I18n.translate(baseBlock.getTranslationKey()) + ".");
                }
                if (variant instanceof ButtonBlock) {
                    addTooltip(variant, "A button crafted from " + I18n.translate(baseBlock.getTranslationKey()) + ".");
                }
                if (variant instanceof PressurePlateBlock) {
                    addTooltip(variant, "A pressure plate crafted from " + I18n.translate(baseBlock.getTranslationKey()) + ".");
                }
                if (variant instanceof DoorBlock) {
                    addTooltip(variant, "A door crafted from " + I18n.translate(baseBlock.getTranslationKey()) + ".");
                }
                if (variant instanceof TrapdoorBlock) {
                    addTooltip(variant, "A trapdoor crafted from " + I18n.translate(baseBlock.getTranslationKey()) + ".");
                }
                if (variant instanceof SignBlock) {
                    addTooltip(variant, "A sign crafted from " + I18n.translate(baseBlock.getTranslationKey()) + ".");
                }
                if (variant instanceof HangingSignBlock) {
                    addTooltip(variant, "A hanging sign crafted from " + I18n.translate(baseBlock.getTranslationKey()) + ".");
                }
            }
        }

        public void addPotionTooltips(Item potionItem, String... tooltip) {
            List<String> potionTranslationKeys = new ArrayList<>();
            for (Potion potion : Registries.POTION) {
                if (potion != Potions.EMPTY) {
                    String translationKey = getPotionTooltipKey(potion, potionItem);
                    if (potion != Potions.WATER) {
                        if (potion != Potions.THICK && potion != Potions.AWKWARD && potion != Potions.MUNDANE) {
                            if (!potionTranslationKeys.contains(translationKey)) {
                                potionTranslationKeys.add(translationKey);
                            }
                        } else {
                            if (!(potionItem instanceof TippedArrowItem)) {
                                addTooltip(translationKey, "An unfinished potion with no effect.");
                            } else {
                                addTooltip(translationKey, "An arrow dipped in an unfinished potion, granting no effect.");
                            }
                        }
                    } else {
                        if (!(potionItem instanceof TippedArrowItem)) {
                            addTooltip(translationKey, "A glass bottle filled with water.", "An important ingredient for potion brewing.");
                        } else {
                            addTooltip(translationKey, "An arrow dipped in water, granting no effect.");
                        }
                    }
                }
            }
            for (String key : potionTranslationKeys) {
                addTooltip(key, tooltip);
            }
        }

        private String getPotionTooltipKey(Potion potion, Item potionItem) {
            return potion.finishTranslationKey(potionItem.getTranslationKey() + ".effect.") + ".expanded_tooltips.desc";
        }

        public void addTooltip(Item item, String... tooltip) {
            translationBuilder.add(item.getTranslationKey() + ".expanded_tooltips.desc", String.join("\n", tooltip));
        }

        public void addTooltip(String key, String... tooltip) {
            translationBuilder.add(key, String.join("\n", tooltip));
        }

        public String[] addTooltipText(String... tooltip) {
            return tooltip;
        }
    }
}