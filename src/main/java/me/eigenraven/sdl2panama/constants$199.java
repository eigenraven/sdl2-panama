// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$199 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$199() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "SDL_Metal_DestroyView",
        constants$4.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "SDL_Metal_GetLayer",
        constants$3.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "SDL_Metal_GetDrawableSize",
        constants$53.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SDL_GetPowerInfo",
        constants$2.const$0
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("name"),
        JAVA_INT.withName("flags"),
        JAVA_INT.withName("num_texture_formats"),
        MemoryLayout.sequenceLayout(16, JAVA_INT).withName("texture_formats"),
        JAVA_INT.withName("max_texture_width"),
        JAVA_INT.withName("max_texture_height")
    ).withName("SDL_RendererInfo");
    static final VarHandle const$5 = constants$199.const$4.varHandle(MemoryLayout.PathElement.groupElement("name"));
}


