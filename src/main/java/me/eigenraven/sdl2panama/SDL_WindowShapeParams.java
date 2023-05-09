// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union {
 *     Uint8 binarizationCutoff;
 *     SDL_Color colorKey;
 * };
 * }
 */
public class SDL_WindowShapeParams {

    public static MemoryLayout $LAYOUT() {
        return constants$216.const$3;
    }
    public static VarHandle binarizationCutoff$VH() {
        return constants$216.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint8 binarizationCutoff;
     * }
     */
    public static byte binarizationCutoff$get(MemorySegment seg) {
        return (byte)constants$216.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint8 binarizationCutoff;
     * }
     */
    public static void binarizationCutoff$set(MemorySegment seg, byte x) {
        constants$216.const$4.set(seg, x);
    }
    public static byte binarizationCutoff$get(MemorySegment seg, long index) {
        return (byte)constants$216.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void binarizationCutoff$set(MemorySegment seg, long index, byte x) {
        constants$216.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment colorKey$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

