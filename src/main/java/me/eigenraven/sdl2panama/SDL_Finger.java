// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct SDL_Finger {
 *     SDL_FingerID id;
 *     float x;
 *     float y;
 *     float pressure;
 * };
 * }
 */
public class SDL_Finger {

    public static MemoryLayout $LAYOUT() {
        return constants$122.const$1;
    }
    public static VarHandle id$VH() {
        return constants$122.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SDL_FingerID id;
     * }
     */
    public static long id$get(MemorySegment seg) {
        return (long)constants$122.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SDL_FingerID id;
     * }
     */
    public static void id$set(MemorySegment seg, long x) {
        constants$122.const$2.set(seg, x);
    }
    public static long id$get(MemorySegment seg, long index) {
        return (long)constants$122.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void id$set(MemorySegment seg, long index, long x) {
        constants$122.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle x$VH() {
        return constants$122.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * float x;
     * }
     */
    public static float x$get(MemorySegment seg) {
        return (float)constants$122.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * float x;
     * }
     */
    public static void x$set(MemorySegment seg, float x) {
        constants$122.const$3.set(seg, x);
    }
    public static float x$get(MemorySegment seg, long index) {
        return (float)constants$122.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, float x) {
        constants$122.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y$VH() {
        return constants$122.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * float y;
     * }
     */
    public static float y$get(MemorySegment seg) {
        return (float)constants$122.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * float y;
     * }
     */
    public static void y$set(MemorySegment seg, float x) {
        constants$122.const$4.set(seg, x);
    }
    public static float y$get(MemorySegment seg, long index) {
        return (float)constants$122.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, float x) {
        constants$122.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pressure$VH() {
        return constants$122.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * float pressure;
     * }
     */
    public static float pressure$get(MemorySegment seg) {
        return (float)constants$122.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * float pressure;
     * }
     */
    public static void pressure$set(MemorySegment seg, float x) {
        constants$122.const$5.set(seg, x);
    }
    public static float pressure$get(MemorySegment seg, long index) {
        return (float)constants$122.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pressure$set(MemorySegment seg, long index, float x) {
        constants$122.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


