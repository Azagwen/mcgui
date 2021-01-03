package cal.codes.mcgui.tests;

import cal.codes.mcgui.MCGuiMain;
import cal.codes.mcgui.mcui.DocumentRegistry;
import cal.codes.mcgui.mcui.MCUIParser;
import cal.codes.mcgui.mcui.MethodsRegistry;
import cal.codes.mcgui.mcui.elements.UIDocument;
import cal.codes.mcgui.mcui.elements.UIElement;
import cal.codes.mcgui.mcui.events.CheckboxEventArgs;
import cal.codes.mcgui.mcui.events.EventHook;
import cal.codes.mcgui.mcui.events.SliderEventArgs;
import cal.codes.mcgui.utils.ResourceHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.toast.SystemToast;
import net.minecraft.text.LiteralText;
import org.jetbrains.annotations.Nullable;

public class BaseEditTest {

    public static BaseEditTest getInstance() {
        return new BaseEditTest();
    }

    private class buttonTest implements EventHook {

        @Override
        public void invoke(@Nullable UIElement element, UIDocument document) {
            testMethod();
        }

        @Override
        public void invoke(UIElement element, UIDocument document, CheckboxEventArgs checkboxEventArgs) {

        }

        @Override
        public void invoke(UIElement element, UIDocument document, SliderEventArgs sliderEventArgs) {

        }
    }

    public void Init() {
        if(!MCGuiMain.tests) return;
        try {
            MethodsRegistry.register("mcgui:button_test", new buttonTest());
            MethodsRegistry.register("mcgui:screen_render_test", new screenRenderTest());
            MethodsRegistry.register("mcgui:checkbox_test", new checkboxTest());
            DocumentRegistry.register("mcgui:test_file", MCUIParser.parse(ResourceHelper.getFileFromResource("assets/mcgui/test.mcui", MCGuiMain.class), true));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void testMethod() {
        SystemToast toast = SystemToast.create(MinecraftClient.getInstance(), SystemToast.Type.TUTORIAL_HINT,
                new LiteralText("OwO"), new LiteralText("Hello!"));
        MinecraftClient.getInstance().getToastManager().add(toast);
    }

    private class checkboxTest implements EventHook {

        @Override
        public void invoke(@Nullable UIElement element, UIDocument document) {

        }

        @Override
        public void invoke(UIElement element, UIDocument document, CheckboxEventArgs checkboxEventArgs) {
            SystemToast toast = SystemToast.create(MinecraftClient.getInstance(), SystemToast.Type.TUTORIAL_HINT,
                    new LiteralText("Checkbox State:"), new LiteralText(checkboxEventArgs.toString()));
            MinecraftClient.getInstance().getToastManager().add(toast);
        }

        @Override
        public void invoke(UIElement element, UIDocument document, SliderEventArgs sliderEventArgs) {

        }
    }

    private class screenRenderTest implements EventHook {
        @Override
        public void invoke(@Nullable UIElement element, UIDocument document) {

        }

        @Override
        public void invoke(UIElement element, UIDocument document, CheckboxEventArgs checkboxEventArgs) {

        }

        @Override
        public void invoke(UIElement element, UIDocument document, SliderEventArgs sliderEventArgs) {

        }
    }
}
