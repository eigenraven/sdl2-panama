// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$112 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$112() {}
    static final VarHandle const$0 = constants$111.const$4.varHandle(MemoryLayout.PathElement.groupElement("hat_mask"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "SDL_GameControllerAddMappingsFromRW",
        constants$5.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "SDL_GameControllerAddMapping",
        constants$3.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SDL_GameControllerNumMappings",
        constants$13.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "SDL_GameControllerMappingForIndex",
        constants$8.const$5
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("data")
        )
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "SDL_GameControllerMappingForGUID",
        constants$112.const$5
    );
}


