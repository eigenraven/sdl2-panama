// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$155 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$155() {}
    static final VarHandle const$0 = constants$153.const$3.varHandle(MemoryLayout.PathElement.groupElement("pressure"));
    static final VarHandle const$1 = constants$153.const$3.varHandle(MemoryLayout.PathElement.groupElement("windowID"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        JAVA_INT.withName("timestamp"),
        JAVA_LONG.withName("touchId"),
        JAVA_FLOAT.withName("dTheta"),
        JAVA_FLOAT.withName("dDist"),
        JAVA_FLOAT.withName("x"),
        JAVA_FLOAT.withName("y"),
        JAVA_SHORT.withName("numFingers"),
        JAVA_SHORT.withName("padding"),
        MemoryLayout.paddingLayout(32)
    ).withName("SDL_MultiGestureEvent");
    static final VarHandle const$3 = constants$155.const$2.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$4 = constants$155.const$2.varHandle(MemoryLayout.PathElement.groupElement("timestamp"));
    static final VarHandle const$5 = constants$155.const$2.varHandle(MemoryLayout.PathElement.groupElement("touchId"));
}


