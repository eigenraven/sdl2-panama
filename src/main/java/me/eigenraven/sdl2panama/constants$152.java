// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$152 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$152() {}
    static final VarHandle const$0 = constants$151.const$1.varHandle(MemoryLayout.PathElement.groupElement("timestamp_us"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        JAVA_INT.withName("timestamp"),
        JAVA_INT.withName("which"),
        JAVA_BYTE.withName("iscapture"),
        JAVA_BYTE.withName("padding1"),
        JAVA_BYTE.withName("padding2"),
        JAVA_BYTE.withName("padding3")
    ).withName("SDL_AudioDeviceEvent");
    static final VarHandle const$2 = constants$152.const$1.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$3 = constants$152.const$1.varHandle(MemoryLayout.PathElement.groupElement("timestamp"));
    static final VarHandle const$4 = constants$152.const$1.varHandle(MemoryLayout.PathElement.groupElement("which"));
    static final VarHandle const$5 = constants$152.const$1.varHandle(MemoryLayout.PathElement.groupElement("iscapture"));
}


