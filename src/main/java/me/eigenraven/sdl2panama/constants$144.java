// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$144 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$144() {}
    static final VarHandle const$0 = constants$143.const$1.varHandle(MemoryLayout.PathElement.groupElement("state"));
    static final VarHandle const$1 = constants$143.const$1.varHandle(MemoryLayout.PathElement.groupElement("padding1"));
    static final VarHandle const$2 = constants$143.const$1.varHandle(MemoryLayout.PathElement.groupElement("padding2"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        JAVA_INT.withName("timestamp"),
        JAVA_INT.withName("which")
    ).withName("SDL_JoyDeviceEvent");
    static final VarHandle const$4 = constants$144.const$3.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$5 = constants$144.const$3.varHandle(MemoryLayout.PathElement.groupElement("timestamp"));
}


