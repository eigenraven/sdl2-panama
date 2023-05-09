// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     Uint8 r;
 *     Uint8 g;
 *     Uint8 b;
 * };
 * }
 */
public class SDL_MessageBoxColor {

    public static MemoryLayout $LAYOUT() {
        return constants$196.const$2;
    }
    public static VarHandle r$VH() {
        return constants$196.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint8 r;
     * }
     */
    public static byte r$get(MemorySegment seg) {
        return (byte)constants$196.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint8 r;
     * }
     */
    public static void r$set(MemorySegment seg, byte x) {
        constants$196.const$3.set(seg, x);
    }
    public static byte r$get(MemorySegment seg, long index) {
        return (byte)constants$196.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void r$set(MemorySegment seg, long index, byte x) {
        constants$196.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle g$VH() {
        return constants$196.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint8 g;
     * }
     */
    public static byte g$get(MemorySegment seg) {
        return (byte)constants$196.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint8 g;
     * }
     */
    public static void g$set(MemorySegment seg, byte x) {
        constants$196.const$4.set(seg, x);
    }
    public static byte g$get(MemorySegment seg, long index) {
        return (byte)constants$196.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void g$set(MemorySegment seg, long index, byte x) {
        constants$196.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle b$VH() {
        return constants$196.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint8 b;
     * }
     */
    public static byte b$get(MemorySegment seg) {
        return (byte)constants$196.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint8 b;
     * }
     */
    public static void b$set(MemorySegment seg, byte x) {
        constants$196.const$5.set(seg, x);
    }
    public static byte b$get(MemorySegment seg, long index) {
        return (byte)constants$196.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void b$set(MemorySegment seg, long index, byte x) {
        constants$196.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


