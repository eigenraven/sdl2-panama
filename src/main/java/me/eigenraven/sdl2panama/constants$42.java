// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$42 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$42() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_BYTE.withName("r"),
        JAVA_BYTE.withName("g"),
        JAVA_BYTE.withName("b"),
        JAVA_BYTE.withName("a")
    ).withName("SDL_Color");
    static final VarHandle const$1 = constants$42.const$0.varHandle(MemoryLayout.PathElement.groupElement("r"));
    static final VarHandle const$2 = constants$42.const$0.varHandle(MemoryLayout.PathElement.groupElement("g"));
    static final VarHandle const$3 = constants$42.const$0.varHandle(MemoryLayout.PathElement.groupElement("b"));
    static final VarHandle const$4 = constants$42.const$0.varHandle(MemoryLayout.PathElement.groupElement("a"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("ncolors"),
        MemoryLayout.paddingLayout(32),
        RuntimeHelper.POINTER.withName("colors"),
        JAVA_INT.withName("version"),
        JAVA_INT.withName("refcount")
    ).withName("SDL_Palette");
}


