// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$93 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$93() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_SHORT,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "SDL_JoystickGetDeviceVendor",
        constants$93.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "SDL_JoystickGetDeviceProduct",
        constants$93.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SDL_JoystickGetDeviceProductVersion",
        constants$93.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "SDL_JoystickGetDeviceType",
        constants$7.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "SDL_JoystickGetDeviceInstanceID",
        constants$7.const$5
    );
}


