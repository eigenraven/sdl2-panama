// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$151 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$151() {}
    static final VarHandle const$0 = constants$149.const$4.varHandle(MemoryLayout.PathElement.groupElement("pressure"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        JAVA_INT.withName("timestamp"),
        JAVA_INT.withName("which"),
        JAVA_INT.withName("sensor"),
        MemoryLayout.sequenceLayout(3, JAVA_FLOAT).withName("data"),
        MemoryLayout.paddingLayout(32),
        JAVA_LONG.withName("timestamp_us")
    ).withName("SDL_ControllerSensorEvent");
    static final VarHandle const$2 = constants$151.const$1.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$3 = constants$151.const$1.varHandle(MemoryLayout.PathElement.groupElement("timestamp"));
    static final VarHandle const$4 = constants$151.const$1.varHandle(MemoryLayout.PathElement.groupElement("which"));
    static final VarHandle const$5 = constants$151.const$1.varHandle(MemoryLayout.PathElement.groupElement("sensor"));
}

