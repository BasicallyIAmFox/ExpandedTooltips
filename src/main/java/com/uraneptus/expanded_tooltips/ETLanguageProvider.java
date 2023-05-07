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
        add(Blocks.DIRT, "A block of soil uprooted from the Overworld.", "Despite its weakness as a block, it is very versatile for many natural applications.");
        add(Blocks.COARSE_DIRT, "A block of soil uprooted from the Overworld.", "It is rendered incapable of growing plants due to its coarser complexion.");
        add(Blocks.ROOTED_DIRT, "A block of soil, pierced by Azalea roots.", "Following a trail of this block downward tends to lead to a lush cave.");
        add(Blocks.DIRT_PATH, "A well-worn path made in the dirt.", "Its top has the appearance of dead grass, no matter what material the path was created from.");
        add(Blocks.GRASS_BLOCK, "A block of soil which has sprung life.", "Its color depends on the temperature of the biome.");
        add(Blocks.GRAVEL, "A block made up of many tiny stones.", "It seems to abide by the laws of gravity that govern entities, with a little poking and prodding.");
        add(Blocks.MUD, "A block of wet dirt, rich with minerals.", "It can be found covering the ground in Mangrove Swamps, supporting their unique plant life.");
        add(Blocks.MYCELIUM, "A block of dirt made part of a network of mushrooms.", "It can support the growth of mushrooms even in the brightest of areas.");
        var nyliumTooltip = addTooltipText("A block of netherrack made part of a network of Nether fungus.", "Unlike its Overworld counterpart, one can use bone meal on it to spread the fungus.");
        add(Blocks.CRIMSON_NYLIUM, nyliumTooltip);
        add(Blocks.WARPED_NYLIUM, nyliumTooltip);
        add(Blocks.PODZOL, "A block of dirt found in dense, wooded areas.", "It holds many organic compounds due to the presence of dead plant matter.");
        add(Blocks.SAND, "A block made up of miniscule minerals, containing trace amounts of quartz.", "It seems to abide by the laws of gravity that govern entities, with a little poking and prodding.");
        add(Blocks.RED_SAND, "A block made up of miniscule minerals, containing trace amounts of iron.", "It seems to abide by the laws of gravity that govern entities, with a little poking and prodding.");
        add(Blocks.SOUL_SAND, "A less compact form of soul sand, common in the Soul Sand Valley.", "It seems to have been swept up by some sort of wind, as the faces signature of soul sand are stretched out.");
    }
    private void stone() {
        add(Blocks.ANDESITE, "An igneous rock found in the Overworld.", "Its palette seems to blend in with regular stone, so don’t get fooled if looking for crafting materials.");
        add(Blocks.BEDROCK, "A strong rock found at the bottom of the world.", "It is rendered impossible to break due to the immense pressure compacting it nigh-infinitely, so mining it would be a fool’s errand.");
        add(Blocks.BASALT, "A volcanic rock found in the Nether.", "It tends to form large pillars, which can come together to create Basalt Deltas.");
        add(Blocks.SMOOTH_BASALT, "A volcanic rock that surrounds amethyst geodes.", "It holds relation to the basalt formations found in the Nether.");
        add(Blocks.BLACKSTONE, "A charred type of black stone found in the Nether.", "It is most commonly found in Basalt Deltas, but the denizens of the Nether seem to have found a way to extract it en masse.");
        add(Blocks.GILDED_BLACKSTONE, "A block of Blackstone with veins of gold forged into it.", "The Piglins seem to have created it simply for the purpose of vanity, like much of their crude society.");
        add(Blocks.CALCITE, "A carbonate rock that surrounds amethyst geodes.", "It is very brittle, making it near-impossible to craft into new building blocks.");
        add(Blocks.COBBLESTONE, "A building material made of large rocks.", "It has a very wide array of uses, making it a requirement for virtually anybody making their way in the world.");
        add(Blocks.MOSSY_COBBLESTONE, "A block of cobblestone, covered in moss.", "The moss does not seem to get as many nutrients from the stone, so it has a more subdued appearance.");
        add(Blocks.DEEPSLATE, "A hard form of stone found in the deepest caverns of the Overworld.", "Many rare materials can be found embedded in it, if one is so lucky.");
        add(Blocks.DIORITE, "An igneous rock found in the Overworld.", "It can be crafted with stone and quartz in a pinch, but it is so abundant that this is simply a waste of materials under normal circumstances.");
        add(Blocks.DRIPSTONE_BLOCK, "A strange rock, formed over unknowable amounts of time in the Dripstone Caves.", "Despite this, it is incredibly brittle, and so it cannot be used to craft more advanced building blocks.");
        add(Blocks.END_STONE, "A strange type of rock found in the End.", "It has the capability of harboring many twisted forms of life native to the dimension.");
        add(Blocks.GLOWSTONE, "A glowing crystal found growing on the ceiling of the Nether.", "It holds many magical properties, including the potential to strengthen a potion.");
        add(Blocks.GRANITE, "An igneous rock found in the Overworld.", "It can be used by miners as a signal for a large copper vein.");
        var infestedBlocksTooltip = addTooltipText("A block of stone infested by a Silverfish.", "Mining typically makes the Silverfish break out, however it seems this sample was harvested in a different way.");
        add(Blocks.INFESTED_STONE, infestedBlocksTooltip);
        add(Blocks.INFESTED_COBBLESTONE, infestedBlocksTooltip);
        add(Blocks.INFESTED_STONE_BRICKS, infestedBlocksTooltip);
        add(Blocks.INFESTED_MOSSY_STONE_BRICKS, infestedBlocksTooltip);
        add(Blocks.INFESTED_CRACKED_STONE_BRICKS, infestedBlocksTooltip);
        add(Blocks.INFESTED_CHISELED_STONE_BRICKS, infestedBlocksTooltip);
        add(Blocks.INFESTED_DEEPSLATE, infestedBlocksTooltip);
        add(Blocks.MAGMA_BLOCK, "Molten rock found ubiquitously throughout the Nether.", "It is also found in deep aquifers and underwater areas, though less common.");
        add(Blocks.NETHERRACK, "A flesh-like rock making up the majority of the Nether.", "It can be smelted to make a unique type of brick.");
        add(Blocks.OBSIDIAN, "A very tough glass with otherworldly potential.", "Formed when water flows into lava.");
        add(Blocks.CRYING_OBSIDIAN, "A cracked block of obsidian, overflowing with dimensional energy.", "It appears to be quite unstable compared to its normal counterpart.");
        add(Blocks.POINTED_DRIPSTONE, "A sharp form of dripstone, dealing damage to those unlucky enough to fall on it, or worse, get struck on the head.", "A good hit from a trident can dislodge a stalactite from the ceiling.");
        add(Blocks.SANDSTONE, "A sedimentary rock commonly found below sand.", "Makes for a good path block, in lieu of dirt.");
        add(Blocks.RED_SANDSTONE, "A sedimentary rock commonly found below red sand.", "Trace amounts of iron give it a more reddish appearance.");
        add(Blocks.STONE, "A very versatile material, making up the majority of the Overworld’s upper layers.");
        var terracottaTooltip = addTooltipText("A hardened block of clay.", "It can be found in Badlands biomes, making beautiful multi-colored stripes.");
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
        add(Blocks.TUFF, "An ornamental rock formed from volcanic ash.", "It is found most commonly in the Deepslate layer, and can signal the presence of a large iron vein.");
    }
    private void mineral() {
        add(Blocks.AMETHYST_CLUSTER, "A crystal found growing in amethyst geodes.", "It makes a satisfying ringing noise when mined.");
        add(Blocks.ANCIENT_DEBRIS, "Remains of an unknown metal found buried deep in the Nether.", "The dimension’s inhabitants seem to have abandoned it for the more common gold.");
        add(Blocks.BUDDING_AMETHYST, "A crystal block, which amethyst clusters grow from.", "Shatters under even the most delicate touch, rendering it unobtainable through normal means.");
        add(Blocks.COAL_ORE, "A block of stone, with chunks of Coal inside.", "It is most common throughout the surface of the Overworld.");
        add(Blocks.COPPER_ORE, "A block of stone, with chunks of Copper inside.", "It is most common in higher-level caves, especially in Dripstone Caves.");
        add(Blocks.DIAMOND_ORE, "A block of stone, with chunks of Diamond inside.", "It is most common in the Deepslate layer, so finding it in normal stone is a rarity.", "It tends to appear less in blocks exposed to air.");
        add(Blocks.EMERALD_ORE, "A block of stone, with chunks of Emerald inside.", "It is most common in high mountains, so finding it in a block of deepslate is a rarity.");
        add(Blocks.GOLD_ORE, "A block of stone, with chunks of Gold inside.", "It is most common in Badlands, outside of which it tends to be found lower down.");
        add(Blocks.NETHER_GOLD_ORE, "A block of netherrack, with small chunks of Gold inside.", "It can be found all throughout the Nether.");
        add(Blocks.IRON_ORE, "A block of stone, with chunks of Iron inside.", "It is most common in mountains and higher caves, but large veins can be found in the deepslate layer.");
        add(Blocks.LAPIS_ORE, "A block of stone, with chunks of Lapis Lazuli inside.", "It is rare, spread throughout every layer of the Overworld.");
        add(Blocks.NETHER_QUARTZ_ORE, "A block of netherrack, with chunks of Quartz inside.", "It can be found all throughout the Nether.");
        add(Blocks.REDSTONE_ORE, "A block of stone, with crystals of Redstone inside.", "It is most common in the deepslate layer, getting even more common as depth increases.");
    }
    private void liquid() {
        add(Blocks.ICE, "Water’s solid state.", "In some biomes water will freeze into it within minutes.");
        add(Blocks.BLUE_ICE, "Compressed, extremely slippery ice found underwater in icebergs.", "Mysteriously, it has the ability to solidify lava into basalt when near soul sand.");
        add(Blocks.PACKED_ICE, "Compressed ice found in glaciers and icebergs.", "Can be used to increase the flow speed of a water stream.");
        add(Blocks.LAVA, "Superheated rock in liquid form.", "Found in massive seas in the depths of the Nether, and in pockets in the Overworld.");
        add(Blocks.POWDER_SNOW, "A light, fluffy snow, found in mountains.", "Don’t fall in!");
        add(Blocks.SNOW, "The thin top layers of fallen snow on the ground.");
        add(Blocks.SNOW_BLOCK, "A thick layer of snow found in many cold biomes and mountains.", "Can be used to create a Snow Golem along with a carved pumpkin.");
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
        add(block.getDescriptionId() + ".expanded_tooltips.desc", String.join("\n", tooltip));
    }

    private void add(Item item, String... tooltip) {
        add(item.getDescriptionId() + ".expanded_tooltips.desc", String.join("\n", tooltip));
    }

    private String[] addTooltipText(String... tooltip) {
        return tooltip;
    }
}