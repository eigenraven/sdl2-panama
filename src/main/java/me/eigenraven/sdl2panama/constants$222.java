// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$222 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$222() {}
    static final VarHandle const$0 = constants$221.const$5.varHandle(MemoryLayout.PathElement.groupElement("language"));
    static final VarHandle const$1 = constants$221.const$5.varHandle(MemoryLayout.PathElement.groupElement("country"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "SDL_GetPreferredLocales",
        constants$0.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SDL_OpenURL",
        constants$3.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "SDL_Init",
        constants$7.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "SDL_InitSubSystem",
        constants$7.const$5
    );
}


