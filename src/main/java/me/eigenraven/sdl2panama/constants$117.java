// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$117 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$117() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "SDL_GameControllerGetStringForAxis",
        constants$8.const$5
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(MemoryLayout.structLayout(
        JAVA_INT.withName("bindType"),
        MemoryLayout.unionLayout(
            JAVA_INT.withName("button"),
            JAVA_INT.withName("axis"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("hat"),
                JAVA_INT.withName("hat_mask")
            ).withName("hat")
        ).withName("value")
    ).withName("SDL_GameControllerButtonBind"),
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "SDL_GameControllerGetBindForAxis",
        constants$117.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SDL_GameControllerHasAxis",
        constants$5.const$3
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "SDL_GameControllerGetAxis",
        constants$105.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "SDL_GameControllerGetButtonFromString",
        constants$3.const$5
    );
}


