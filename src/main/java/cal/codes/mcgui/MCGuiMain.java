/**
 * MCGui is licensed under the Mozilla Public License 2.0
 * Failure to follow this license will result in further action.
 */
package cal.codes.mcgui;

import cal.codes.mcgui.tests.BaseEditTest;
import net.fabricmc.api.ModInitializer;

public class MCGuiMain implements ModInitializer {
    public static final boolean tests = true;

    @Override
    public void onInitialize() {
        BaseEditTest.getInstance().Init();
    }
}
