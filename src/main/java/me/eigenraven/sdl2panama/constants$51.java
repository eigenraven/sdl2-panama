// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$51 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$51() {}
    static final VarHandle const$0 = constants$50.const$5.varHandle(MemoryLayout.PathElement.groupElement("x"));
    static final VarHandle const$1 = constants$50.const$5.varHandle(MemoryLayout.PathElement.groupElement("y"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("x"),
        JAVA_INT.withName("y"),
        JAVA_INT.withName("w"),
        JAVA_INT.withName("h")
    ).withName("SDL_Rect");
    static final VarHandle const$3 = constants$51.const$2.varHandle(MemoryLayout.PathElement.groupElement("x"));
    static final VarHandle const$4 = constants$51.const$2.varHandle(MemoryLayout.PathElement.groupElement("y"));
    static final VarHandle const$5 = constants$51.const$2.varHandle(MemoryLayout.PathElement.groupElement("w"));
}


