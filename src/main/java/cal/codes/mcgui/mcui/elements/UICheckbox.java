package cal.codes.mcgui.mcui.elements;

import net.minecraft.text.Text;

public class UICheckbox extends UIElement {
    public UICheckbox() {
        type = UIType.CHECKBOX;
    }

    public int x;
    public int y;
    public int width;
    public int height;

    public Text contents;

    public boolean defaultState;

    public String changeState;

}
