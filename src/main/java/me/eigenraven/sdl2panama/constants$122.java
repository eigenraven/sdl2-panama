// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$122 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$122() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "SDL_GameControllerGetAppleSFSymbolsNameForAxis",
        constants$7.const$2
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_LONG.withName("id"),
        JAVA_FLOAT.withName("x"),
        JAVA_FLOAT.withName("y"),
        JAVA_FLOAT.withName("pressure"),
        MemoryLayout.paddingLayout(32)
    ).withName("SDL_Finger");
    static final VarHandle const$2 = constants$122.const$1.varHandle(MemoryLayout.PathElement.groupElement("id"));
    static final VarHandle const$3 = constants$122.const$1.varHandle(MemoryLayout.PathElement.groupElement("x"));
    static final VarHandle const$4 = constants$122.const$1.varHandle(MemoryLayout.PathElement.groupElement("y"));
    static final VarHandle const$5 = constants$122.const$1.varHandle(MemoryLayout.PathElement.groupElement("pressure"));
}


