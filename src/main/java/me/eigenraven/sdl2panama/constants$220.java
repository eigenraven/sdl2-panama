// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$220 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$220() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(SDL_TimerCallback.class, "apply", constants$68.const$0);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$68.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "SDL_AddTimer",
        constants$14.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SDL_RemoveTimer",
        constants$7.const$5
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_BYTE.withName("major"),
        JAVA_BYTE.withName("minor"),
        JAVA_BYTE.withName("patch")
    ).withName("SDL_version");
    static final VarHandle const$5 = constants$220.const$4.varHandle(MemoryLayout.PathElement.groupElement("major"));
}


