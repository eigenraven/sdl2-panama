// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$65 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$65() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "SDL_LowerBlitScaled",
        constants$57.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "SDL_SetYUVConversionMode",
        constants$31.const$4
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "SDL_GetYUVConversionMode",
        constants$13.const$2
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "SDL_GetYUVConversionModeForResolution",
        constants$65.const$3
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("format"),
        JAVA_INT.withName("w"),
        JAVA_INT.withName("h"),
        JAVA_INT.withName("refresh_rate"),
        RuntimeHelper.POINTER.withName("driverdata")
    );
}


