package foxhub.expandedtooltips;

import net.fabricmc.api.ModInitializer;
import net.minecraft.SharedConstants;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;

import java.util.List;

public class ExpandedTooltips implements ModInitializer {
    private static final Style DESCRIPTION_STYLE = Style.EMPTY.withColor(TextColor.fromRgb(13750737)).withItalic(true);

    @Override
    public void onInitialize() {
    }

    public static void addText(ItemStack stack, List<Text> list) {
        var key = stack.getTranslationKey() + ".expanded_tooltips.desc";
        if (I18n.hasTranslation(key)) {
            var split = I18n.translate(key).split("\\n");
            for (var text : split) {
                list.add(Text.literal(text).fillStyle(DESCRIPTION_STYLE));
            }
        }
        else if (!SharedConstants.isDevelopment) {
            list.add(Text.literal(key));
        }
    }
}