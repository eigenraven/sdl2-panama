// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$188 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$188() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "SDL_hid_set_nonblocking",
        constants$5.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "SDL_hid_send_feature_report",
        constants$187.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "SDL_hid_get_feature_report",
        constants$187.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SDL_hid_close",
        constants$4.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "SDL_hid_get_manufacturer_string",
        constants$187.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "SDL_hid_get_product_string",
        constants$187.const$1
    );
}


