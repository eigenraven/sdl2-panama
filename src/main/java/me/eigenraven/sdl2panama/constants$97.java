// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$97 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$97() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(SDL_VirtualJoystickDesc.Update.class, "apply", constants$4.const$0);
    static final VarHandle const$1 = constants$94.const$5.varHandle(MemoryLayout.PathElement.groupElement("Update"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(SDL_VirtualJoystickDesc.SetPlayerIndex.class, "apply", constants$74.const$3);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$74.const$3
    );
    static final VarHandle const$4 = constants$94.const$5.varHandle(MemoryLayout.PathElement.groupElement("SetPlayerIndex"));
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_SHORT,
        JAVA_SHORT
    );
}


