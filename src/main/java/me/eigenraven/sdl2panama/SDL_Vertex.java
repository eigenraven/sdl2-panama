// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct SDL_Vertex {
 *     SDL_FPoint position;
 *     SDL_Color color;
 *     SDL_FPoint tex_coord;
 * };
 * }
 */
public class SDL_Vertex {

    public static MemoryLayout $LAYOUT() {
        return constants$200.const$4;
    }
    public static MemorySegment position$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment color$slice(MemorySegment seg) {
        return seg.asSlice(8, 4);
    }
    public static MemorySegment tex_coord$slice(MemorySegment seg) {
        return seg.asSlice(12, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


