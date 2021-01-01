package cal.codes.mcgui.mcui.parsers;

import cal.codes.mcgui.mcui.elements.UICheckbox;
import cal.codes.mcgui.mcui.elements.UIDocument;
import net.minecraft.text.LiteralText;
import net.minecraft.text.TranslatableText;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class CheckboxParser implements Parser<UICheckbox> {

    public static CheckboxParser getInstance() {
        return new CheckboxParser();
    }

    @Override
    public UICheckbox parse(Element element, UIDocument doc) {
        UICheckbox cbx = new UICheckbox();

        Attributes attr = element.attributes();

        // Checkbox transform
        cbx.x = Integer.parseInt(attr.get("x"));
        cbx.y = Integer.parseInt(attr.get("y"));
        cbx.width = Integer.parseInt(attr.get("width"));
        cbx.height = Integer.parseInt(attr.get("height"));

        // contents
        if(attr.get("loc").equals("true")) {
            cbx.contents = new TranslatableText(element.text());
        } else {
            cbx.contents = new LiteralText(element.text());
        }

        // Checkbox Properties
        if(attr.hasKey("defaultstate")) {
            cbx.defaultState = Boolean.parseBoolean(attr.get("defaultstate"));
        } else {
            cbx.defaultState = false;
        }

        // Checkbox events
        if(attr.hasKey("@render")) cbx.renderEvent = attr.get("@render");
        if(attr.hasKey("@changestate")) cbx.changeState = attr.get("@changestate");

        if(attr.hasKey("id")) cbx.id = attr.get("id");

        return cbx;
    }
}
