// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$160 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$160() {}
    static final VarHandle const$0 = constants$159.const$2.varHandle(MemoryLayout.PathElement.groupElement("timestamp_us"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        JAVA_INT.withName("timestamp")
    ).withName("SDL_QuitEvent");
    static final VarHandle const$2 = constants$160.const$1.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$3 = constants$160.const$1.varHandle(MemoryLayout.PathElement.groupElement("timestamp"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        JAVA_INT.withName("timestamp")
    ).withName("SDL_OSEvent");
    static final VarHandle const$5 = constants$160.const$4.varHandle(MemoryLayout.PathElement.groupElement("type"));
}

