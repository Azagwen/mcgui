package cal.codes.mcgui.mcui.renderers;

import cal.codes.mcgui.exceptions.RegistryNotFoundException;
import cal.codes.mcgui.logging.Logger;
import cal.codes.mcgui.mcui.MethodsRegistry;
import cal.codes.mcgui.mcui.elements.UICheckbox;
import cal.codes.mcgui.mcui.elements.UIDocument;
import cal.codes.mcgui.mcui.events.CheckboxEventArgs;
import me.lambdaurora.spruceui.Position;
import me.lambdaurora.spruceui.widget.SpruceCheckboxWidget;

public class CheckboxRenderer implements Renderer<UICheckbox> {
    @Override
    public void render(UIDocument document, UICheckbox element) {
        SpruceCheckboxWidget tmp = new SpruceCheckboxWidget(
                Position.of(element.x, element.y),
                element.width,
                element.height,
                element.contents,
                (button, newValue) -> {
                    try {
                        MethodsRegistry.fetch(element.changeState).invoke(element, document, new CheckboxEventArgs(newValue));
                    } catch (RegistryNotFoundException e) {
                        e.printStackTrace();
                    }
                },
                element.defaultState
        );

        tmp.setVisible(true);

        document.add(tmp);
        Logger.info("Registered checkbox with action.");
    }
}
