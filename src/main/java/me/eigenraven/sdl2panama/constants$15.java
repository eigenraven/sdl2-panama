// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$15 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$15() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$12.const$3
    );
    static final VarHandle const$1 = constants$14.const$4.varHandle(MemoryLayout.PathElement.groupElement("size"));
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(SDL_RWops.seek.class, "apply", constants$15.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$15.const$2
    );
    static final VarHandle const$5 = constants$14.const$4.varHandle(MemoryLayout.PathElement.groupElement("seek"));
}


