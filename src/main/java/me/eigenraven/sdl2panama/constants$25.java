// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$25 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$25() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("freq"),
        JAVA_SHORT.withName("format"),
        JAVA_BYTE.withName("channels"),
        JAVA_BYTE.withName("silence"),
        JAVA_SHORT.withName("samples"),
        JAVA_SHORT.withName("padding"),
        JAVA_INT.withName("size"),
        RuntimeHelper.POINTER.withName("callback"),
        RuntimeHelper.POINTER.withName("userdata")
    ).withName("SDL_AudioSpec");
    static final VarHandle const$1 = constants$25.const$0.varHandle(MemoryLayout.PathElement.groupElement("freq"));
    static final VarHandle const$2 = constants$25.const$0.varHandle(MemoryLayout.PathElement.groupElement("format"));
    static final VarHandle const$3 = constants$25.const$0.varHandle(MemoryLayout.PathElement.groupElement("channels"));
    static final VarHandle const$4 = constants$25.const$0.varHandle(MemoryLayout.PathElement.groupElement("silence"));
    static final VarHandle const$5 = constants$25.const$0.varHandle(MemoryLayout.PathElement.groupElement("samples"));
}


