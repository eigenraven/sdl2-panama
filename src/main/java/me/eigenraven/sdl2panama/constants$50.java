// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$50 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$50() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.ofVoid(
        JAVA_FLOAT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "SDL_CalculateGammaRamp",
        constants$50.const$0
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("x"),
        JAVA_INT.withName("y")
    ).withName("SDL_Point");
    static final VarHandle const$3 = constants$50.const$2.varHandle(MemoryLayout.PathElement.groupElement("x"));
    static final VarHandle const$4 = constants$50.const$2.varHandle(MemoryLayout.PathElement.groupElement("y"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_FLOAT.withName("x"),
        JAVA_FLOAT.withName("y")
    ).withName("SDL_FPoint");
}

