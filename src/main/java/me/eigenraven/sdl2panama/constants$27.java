// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$27 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$27() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$26.const$4
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("needed"),
        JAVA_SHORT.withName("src_format"),
        JAVA_SHORT.withName("dst_format"),
        JAVA_DOUBLE.withName("rate_incr"),
        RuntimeHelper.POINTER.withName("buf"),
        JAVA_INT.withName("len"),
        JAVA_INT.withName("len_cvt"),
        JAVA_INT.withName("len_mult"),
        JAVA_DOUBLE.withBitAlignment(32).withName("len_ratio"),
        MemoryLayout.sequenceLayout(10, RuntimeHelper.POINTER.withBitAlignment(32)).withName("filters"),
        JAVA_INT.withName("filter_index")
    ).withName("SDL_AudioCVT");
    static final VarHandle const$2 = constants$27.const$1.varHandle(MemoryLayout.PathElement.groupElement("needed"));
    static final VarHandle const$3 = constants$27.const$1.varHandle(MemoryLayout.PathElement.groupElement("src_format"));
    static final VarHandle const$4 = constants$27.const$1.varHandle(MemoryLayout.PathElement.groupElement("dst_format"));
    static final VarHandle const$5 = constants$27.const$1.varHandle(MemoryLayout.PathElement.groupElement("rate_incr"));
}


