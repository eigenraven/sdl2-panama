// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$157 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$157() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        JAVA_INT.withName("timestamp"),
        JAVA_LONG.withName("touchId"),
        JAVA_LONG.withName("gestureId"),
        JAVA_INT.withName("numFingers"),
        JAVA_FLOAT.withName("error"),
        JAVA_FLOAT.withName("x"),
        JAVA_FLOAT.withName("y")
    ).withName("SDL_DollarGestureEvent");
    static final VarHandle const$1 = constants$157.const$0.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$2 = constants$157.const$0.varHandle(MemoryLayout.PathElement.groupElement("timestamp"));
    static final VarHandle const$3 = constants$157.const$0.varHandle(MemoryLayout.PathElement.groupElement("touchId"));
    static final VarHandle const$4 = constants$157.const$0.varHandle(MemoryLayout.PathElement.groupElement("gestureId"));
    static final VarHandle const$5 = constants$157.const$0.varHandle(MemoryLayout.PathElement.groupElement("numFingers"));
}


