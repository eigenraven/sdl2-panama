// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$124 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$124() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "SDL_GetNumTouchFingers",
        constants$123.const$4
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "SDL_GetTouchFinger",
        constants$124.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SDL_RecordGesture",
        constants$123.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "SDL_SaveAllDollarTemplates",
        constants$3.const$5
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "SDL_SaveDollarTemplate",
        constants$124.const$5
    );
}

