// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$185 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$185() {}
    static final VarHandle const$0 = constants$183.const$1.varHandle(MemoryLayout.PathElement.groupElement("interface_class"));
    static final VarHandle const$1 = constants$183.const$1.varHandle(MemoryLayout.PathElement.groupElement("interface_subclass"));
    static final VarHandle const$2 = constants$183.const$1.varHandle(MemoryLayout.PathElement.groupElement("interface_protocol"));
    static final VarHandle const$3 = constants$183.const$1.varHandle(MemoryLayout.PathElement.groupElement("next"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "SDL_hid_init",
        constants$13.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "SDL_hid_exit",
        constants$13.const$2
    );
}

