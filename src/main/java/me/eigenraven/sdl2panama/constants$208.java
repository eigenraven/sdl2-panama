// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$208 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$208() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "SDL_RenderIsClipEnabled",
        constants$3.const$5
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_FLOAT,
        JAVA_FLOAT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "SDL_RenderSetScale",
        constants$208.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SDL_RenderGetScale",
        constants$53.const$2
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "SDL_RenderWindowToLogical",
        constants$208.const$4
    );
}


