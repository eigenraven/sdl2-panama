// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$53 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$53() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "SDL_HasIntersection",
        constants$2.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "SDL_IntersectRect",
        constants$6.const$1
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SDL_UnionRect",
        constants$53.const$2
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "SDL_EnclosePoints",
        constants$53.const$4
    );
}


