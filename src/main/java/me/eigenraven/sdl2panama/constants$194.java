// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$194 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$194() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandleVariadic(
        "SDL_LogCritical",
        constants$193.const$0
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.ofVoid(
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandleVariadic(
        "SDL_LogMessage",
        constants$194.const$1
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.ofVoid(
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "SDL_LogMessageV",
        constants$194.const$3
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
}


