// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$123 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$123() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "SDL_GetNumTouchDevices",
        constants$13.const$2
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "SDL_GetTouchDevice",
        constants$123.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SDL_GetTouchName",
        constants$8.const$5
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "SDL_GetTouchDeviceType",
        constants$123.const$4
    );
}

