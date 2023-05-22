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
            add(Blocks.CLAY, "A wet block of fine-grained natural soil.", "When smelted, it can be used in many building applications.");
            add(Blocks.DIRT, "A block of soil uprooted from the Overworld.", "Versatile for many natural applications.");
            add(Blocks.COARSE_DIRT, "A block of soil uprooted from the Overworld.", "Incapable of growing plants due to its coarser complexion.");
            add(Blocks.ROOTED_DIRT, "A block of soil, pierced by Azalea roots.", "Following this block downward tends to lead to a lush cave.");
            add(Blocks.DIRT_PATH, "A well-worn path made in the dirt.", "Its top has the appearance of dead grass.");
            add(Blocks.GRASS_BLOCK, "A block of soil which has sprung life.", "Its color depends on the temperature of the biome.");
            add(Blocks.GRAVEL, "A block made up of many tiny stones.", "Abides by the laws of gravity that govern entities.");
            add(Blocks.MUD, "A block of wet dirt, rich with minerals.", "Supports the unique plant life of Mangrove Swamps.");
            add(Blocks.MYCELIUM, "A block of dirt part of a network of mushrooms.", "Supports the growth of mushrooms even in bright areas.");
            var nyliumTooltip = addTooltipText("A block of netherrack part of a network of Nether fungus.", "Unlike mycelium, bone meal can be used to spread it.");
            add(Blocks.CRIMSON_NYLIUM, nyliumTooltip);
            add(Blocks.WARPED_NYLIUM, nyliumTooltip);
            add(Blocks.PODZOL, "A block of dirt found in dense, wooded areas.", "Formed from quartz-rich sand and sedimentary debris.");
            add(Blocks.SAND, "A block made up of tiny minerals.", "Abides by the laws of gravity that govern entities.");
            add(Blocks.RED_SAND, "A block made up of tiny minerals, containing some iron.", "Abides by the laws of gravity that govern entities.");
            add(Blocks.SOUL_SAND, "A common sediment in the Nether.", "The faces seen come from the many souls captured inside.");
            add(Blocks.SOUL_SOIL, "A less compact soul sand common in Soul Sand Valleys.", "The faces signature of soul sand appear stretched.");
        }
        private void stone() {
            add(Blocks.ANDESITE, "An igneous rock found in the Overworld.", "Its palette blends with usual stone.");
            add(Blocks.BEDROCK, "A strong rock found at the bottom of the world.", "Attempting to mine it would be a fool’s errand.");
            add(Blocks.BASALT, "A volcanic rock found in the Nether.", "It forms large pillars found throughout Basalt Deltas.");
            add(Blocks.SMOOTH_BASALT, "A volcanic rock that surrounds amethyst geodes.", "Similar to basalt formations found in the Nether.");
            add(Blocks.BLACKSTONE, "A charred-looking stone found mostly in Basalt Deltas.", "The denizens of the Nether have extracted much of it.");
            add(Blocks.GILDED_BLACKSTONE, "Blackstone with veins of gold forged into it by the Piglins.", "Seemingly only for vanity, like much of their crude society.");
            add(Blocks.CALCITE, "A carbonate rock that surrounds amethyst geodes.", "Very brittle, making it not carvable.");
            add(Blocks.COBBLESTONE, "A building material made of large rocks.", "Necessary for virtually any adventurer or builder.");
            add(Blocks.MOSSY_COBBLESTONE, "A block of cobblestone, covered in moss.", "Found in many mysterious ancient structures.");
            add(Blocks.DEEPSLATE, "A hard stone found in the deepest caverns of the Overworld.", "Rare materials can be found within it, if one is lucky.");
            add(Blocks.DIORITE, "An igneous rock found in the Overworld.", "It is an abundant resource useful for decoration.");
            add(Blocks.DRIPSTONE_BLOCK, "A strange rock, formed by time in the Dripstone Caves.", "However it is very brittle, making it not carvable.");
            add(Blocks.END_STONE, "A strange type of rock found in the End.", "Harbors twisted forms of life native to the dimension.");
            add(Blocks.GLOWSTONE, "A glowing crystal that grows on the ceiling of the Nether.", "Holds magical properties such as strengthening of potions.");
            add(Blocks.GRANITE, "An igneous rock found in the Overworld.", "Can indicate the presence of a large copper vein.");
            var infestedBlocksTooltip = addTooltipText("A block of stone infested by a Silverfish.", "This sample was harvested in a way to preserve the rock.");
            add(Blocks.INFESTED_STONE, infestedBlocksTooltip);
            add(Blocks.INFESTED_COBBLESTONE, infestedBlocksTooltip);
            add(Blocks.INFESTED_STONE_BRICKS, infestedBlocksTooltip);
            add(Blocks.INFESTED_MOSSY_STONE_BRICKS, infestedBlocksTooltip);
            add(Blocks.INFESTED_CRACKED_STONE_BRICKS, infestedBlocksTooltip);
            add(Blocks.INFESTED_CHISELED_STONE_BRICKS, infestedBlocksTooltip);
            add(Blocks.INFESTED_DEEPSLATE, infestedBlocksTooltip);
            add(Blocks.MAGMA_BLOCK, "Molten rock found ubiquitously throughout the Nether.", "Also found in deep aquifers, though less common.");
            add(Blocks.NETHERRACK, "A flesh-like rock making up the majority of the Nether.", "It can be smelted to make a unique type of brick.");
            add(Blocks.OBSIDIAN, "A very tough glass with otherworldly potential.", "Formed when water flows into lava.");
            add(Blocks.CRYING_OBSIDIAN, "A cracked block of obsidian, overflowing with energy.", "Quite unstable compared to its normal counterpart.");
            add(Blocks.POINTED_DRIPSTONE, "A sharp form of dripstone.", "Deals damage to those who touch the point.");
            add(Blocks.SANDSTONE, "A sedimentary rock commonly found below sand.", "Makes for a good path block, in lieu of dirt.");
            add(Blocks.RED_SANDSTONE, "A sedimentary rock commonly found below red sand.", "Trace amounts of iron give it a more reddish appearance.");
            add(Blocks.STONE, "A very versatile material, making up the majority of the Overworld’s upper layers.");
            var terracottaTooltip = addTooltipText("A hardened block of clay.", "Makes beautiful multi-colored stripes in Badlands.");
            add(Blocks.TERRACOTTA, terracottaTooltip);
            add(Blocks.WHITE_TERRACOTTA, terracottaTooltip);
            add(Blocks.ORANGE_TERRACOTTA, terracottaTooltip);
            add(Blocks.MAGENTA_TERRACOTTA, terracottaTooltip);
            add(Blocks.LIGHT_BLUE_TERRACOTTA, terracottaTooltip);
            add(Blocks.YELLOW_TERRACOTTA, terracottaTooltip);
            add(Blocks.LIME_TERRACOTTA, terracottaTooltip);
            add(Blocks.PINK_TERRACOTTA, terracottaTooltip);
            add(Blocks.GRAY_TERRACOTTA, terracottaTooltip);
            add(Blocks.LIGHT_GRAY_TERRACOTTA, terracottaTooltip);
            add(Blocks.CYAN_TERRACOTTA, terracottaTooltip);
            add(Blocks.PURPLE_TERRACOTTA, terracottaTooltip);
            add(Blocks.BLUE_TERRACOTTA, terracottaTooltip);
            add(Blocks.BROWN_TERRACOTTA, terracottaTooltip);
            add(Blocks.GREEN_TERRACOTTA, terracottaTooltip);
            add(Blocks.RED_TERRACOTTA, terracottaTooltip);
            add(Blocks.BLACK_TERRACOTTA, terracottaTooltip);
            add(Blocks.TUFF, "An ornamental rock formed from volcanic ash.", "Can signal the presence of a large iron vein.");
        }
        private void mineral() {
            add(Blocks.AMETHYST_CLUSTER, "A crystal found growing in amethyst geodes.", "Makes a satisfying ringing noise if mined.");
            add(Blocks.ANCIENT_DEBRIS, "Remains of an unknown metal found buried deep in the Nether.", "Piglins seem to have abandoned it for the more common gold.");
            add(Blocks.BUDDING_AMETHYST, "A crystal block, which amethyst clusters grow from.", "Shatters under even the most delicate touch.");
            add(Blocks.COAL_ORE, "A block of stone, with chunks of Coal inside.", "It is most common throughout the surface of the Overworld.");
            add(Blocks.COPPER_ORE, "A block of stone, with chunks of Copper inside.", "Common in higher-level caves, especially Dripstone Caves.");
            add(Blocks.DIAMOND_ORE, "A block of stone, with chunks of Diamond inside.", "Common in Deepslate, so finding this variant is a rarity.");
            add(Blocks.EMERALD_ORE, "A block of stone, with chunks of Emerald inside.", "Common in high mountains, so this variant is a rarity.");
            add(Blocks.GOLD_ORE, "A block of stone, with chunks of Gold inside.", "Common in Badlands but otherwise tends to be found low down.");
            add(Blocks.NETHER_GOLD_ORE, "A block of netherrack, with small chunks of Gold inside.", "It can be found all throughout the Nether.");
            add(Blocks.IRON_ORE, "A block of stone, with chunks of Iron inside.", "Most common high up, but large veins can be in lower caves.");
            add(Blocks.LAPIS_ORE, "A block of stone, with chunks of Lapis Lazuli inside.", "It is rare, spread throughout every layer of the Overworld.");
            add(Blocks.NETHER_QUARTZ_ORE, "A block of netherrack, with chunks of Quartz inside.", "It can be found all throughout the Nether.");
            add(Blocks.REDSTONE_ORE, "A block of stone, with crystals of Redstone inside.", "It gets more common as depth increases.");
        }
        private void liquid() {
            add(Blocks.ICE, "Water’s solid state.", "In some biomes water will freeze into it within minutes.");
            add(Blocks.BLUE_ICE, "Compressed, slippery ice found underwater in icebergs.", "Can solidify lava into basalt if near soul sand.");
            add(Blocks.PACKED_ICE, "Compressed ice found in glaciers and icebergs.", "Can be used to increase the flow speed of a water stream.");
            add(Blocks.LAVA, "Superheated rock in liquid form.", "Found in the Nether and Overworld, though quantities differ.");
            add(Blocks.POWDER_SNOW, "A light, fluffy snow, found in mountains.", "Don’t fall in!");
            add(Blocks.SNOW, "The thin top layers of fallen snow on the ground.");
            add(Blocks.SNOW_BLOCK, "A thick layer of snow found in cold biomes and mountains.", "Can create a Snow Golem along with a carved pumpkin.");
            add(Blocks.WATER, "An easily renewable, common liquid found in the Overworld.", "Evaporates when poured in the Nether.");
        }
        private void nonPhysical() {
            var airTooltip = addTooltipText("An invisible gas found everywhere in the Overworld, Nether and The End.");
            add(Blocks.AIR, airTooltip);
            add(Blocks.CAVE_AIR, airTooltip);
            add(Blocks.VOID_AIR, airTooltip);
            add(Blocks.FIRE, "A very hot plasma.", "It burns!");
            add(Blocks.SOUL_FIRE, "A very hot plasma created when burning souls.");
            add(Blocks.LIGHT, "A mysterious block of pure light.");
            add(Blocks.STRUCTURE_VOID, "A mysterious block that has not been found to have any use.");
        }
        private void wood() {

        }
        private void plant() {

        }
        private void fungus() {

        }
        private void faunaProduct() {

        }
        private void algae() {

        }
        private void decorative() {

        }
        private void mineralBlocks() {

        }
        private void manufactured() {

        }
        private void lighting() {

        }
        private void interactable() {

        }
        private void utilizable() {

        }
        private void mechanical() {

        }
        private void otherBlocks() {

        }
        private void materials() {

        }
        private void processed() {

        }
        private void food() {

        }
        private void seeds() {

        }
        private void dyes() {

        }
        private void tools() {

        }
        private void informational() {

        }
        private void weapons() {

        }
        private void armor() {

        }
        private void transportation() {

        }
        private void utility() {

        }
        private void otherItems() {

        }

        private void add(Block block, String... tooltip) {
            translationBuilder.add(block.getTranslationKey() + ".expanded_tooltips.desc", String.join("\n", tooltip));
        }

        private void add(Item item, String... tooltip) {
            translationBuilder.add(item.getTranslationKey() + ".expanded_tooltips.desc", String.join("\n", tooltip));
        }

        private String[] addTooltipText(String... tooltip) {
            return tooltip;
        }
    }
}
