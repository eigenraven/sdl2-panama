// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$16 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$16() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_LONG
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(SDL_RWops.read.class, "apply", constants$16.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$16.const$0
    );
    static final VarHandle const$3 = constants$14.const$4.varHandle(MemoryLayout.PathElement.groupElement("read"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(SDL_RWops.write.class, "apply", constants$16.const$0);
    static final VarHandle const$5 = constants$14.const$4.varHandle(MemoryLayout.PathElement.groupElement("write"));
}


