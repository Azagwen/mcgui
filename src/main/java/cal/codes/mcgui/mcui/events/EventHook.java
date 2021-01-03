package cal.codes.mcgui.mcui.events;

import cal.codes.mcgui.mcui.elements.UIDocument;
import cal.codes.mcgui.mcui.elements.UIElement;
import org.jetbrains.annotations.Nullable;

public interface EventHook {
    /**
     * Used by:
     * - @render
     * - @click
     * @param element The UIElement invoking, null if screen.
     * @param document The document the element is from.
     */
    public void invoke(@Nullable UIElement element, UIDocument document);

    /**
     * Used by:
     * - @changestate
     * @param element The UIElement invoking, null if screen.
     * @param document The document the element is from.
     * @param checkboxEventArgs The arguments.
     */
    public void invoke(UIElement element, UIDocument document, CheckboxEventArgs checkboxEventArgs);

    /**
     * Used by:
     * - @valuechanged
     * @param element The UIElement invoking, null if screen.
     * @param document The document the element is from.
     * @param sliderEventArgs The arguments.
     */
    public void invoke(UIElement element, UIDocument document, SliderEventArgs sliderEventArgs);
}
