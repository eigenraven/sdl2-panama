// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$29 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$29() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "SDL_GetNumAudioDrivers",
        constants$13.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "SDL_GetAudioDriver",
        constants$8.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "SDL_AudioInit",
        constants$3.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SDL_AudioQuit",
        constants$3.const$3
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "SDL_GetCurrentAudioDriver",
        constants$0.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "SDL_OpenAudio",
        constants$2.const$0
    );
}

