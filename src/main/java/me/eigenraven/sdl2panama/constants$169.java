// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$169 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$169() {}
    static final VarHandle const$0 = constants$167.const$2.varHandle(MemoryLayout.PathElement.groupElement("fade_level"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_SHORT.withName("type"),
        MemoryLayout.paddingLayout(16),
        MemoryLayout.structLayout(
            JAVA_BYTE.withName("type"),
            MemoryLayout.paddingLayout(24),
            MemoryLayout.sequenceLayout(3, JAVA_INT).withName("dir")
        ).withName("direction"),
        JAVA_INT.withName("length"),
        JAVA_SHORT.withName("delay"),
        JAVA_SHORT.withName("button"),
        JAVA_SHORT.withName("interval"),
        JAVA_SHORT.withName("period"),
        JAVA_SHORT.withName("magnitude"),
        JAVA_SHORT.withName("offset"),
        JAVA_SHORT.withName("phase"),
        JAVA_SHORT.withName("attack_length"),
        JAVA_SHORT.withName("attack_level"),
        JAVA_SHORT.withName("fade_length"),
        JAVA_SHORT.withName("fade_level"),
        MemoryLayout.paddingLayout(16)
    ).withName("SDL_HapticPeriodic");
    static final VarHandle const$2 = constants$169.const$1.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$3 = constants$169.const$1.varHandle(MemoryLayout.PathElement.groupElement("length"));
    static final VarHandle const$4 = constants$169.const$1.varHandle(MemoryLayout.PathElement.groupElement("delay"));
    static final VarHandle const$5 = constants$169.const$1.varHandle(MemoryLayout.PathElement.groupElement("button"));
}


