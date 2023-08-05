package com.uraneptus.expanded_tooltips;

import net.minecraft.client.resources.language.I18n;
import net.minecraft.data.DataGenerator;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;

import java.util.List;

@Mod(ExpandedTooltips.MODID)
public class ExpandedTooltips {
    public static final String MODID = "expanded_tooltips";
    private static final Style DESCRIPTION_STYLE = Style.EMPTY.withColor(TextColor.fromRgb(13750737)).withItalic(true);

    public ExpandedTooltips() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::gatherData);
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void gatherData(GatherDataEvent event) {
        boolean includeClient = event.includeClient();
        DataGenerator generator = event.getGenerator();
        generator.addProvider(includeClient, new ETLanguageProvider(generator));
    }

    public static void addText(ItemStack stack, List<Component> list) {
        var key = stack.getDescriptionId() + ".expanded_tooltips.desc";
        if (I18n.exists(key)) {
            var split = I18n.get(key).split("\\n");
            for (var text : split) {
                list.add(Component.literal(text).withStyle(DESCRIPTION_STYLE));
            }
         //Only if not in dev environment
        } else if (!FMLEnvironment.production) {
            list.add(Component.literal(key));
        }
    }
}