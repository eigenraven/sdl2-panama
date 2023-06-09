// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct SDL_HapticCondition {
 *     Uint16 type;
 *     SDL_HapticDirection direction;
 *     Uint32 length;
 *     Uint16 delay;
 *     Uint16 button;
 *     Uint16 interval;
 *     Uint16 right_sat[3];
 *     Uint16 left_sat[3];
 *     Sint16 right_coeff[3];
 *     Sint16 left_coeff[3];
 *     Uint16 deadband[3];
 *     Sint16 center[3];
 * };
 * }
 */
public class SDL_HapticCondition {

    public static MemoryLayout $LAYOUT() {
        return constants$171.const$3;
    }
    public static VarHandle type$VH() {
        return constants$171.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint16 type;
     * }
     */
    public static short type$get(MemorySegment seg) {
        return (short)constants$171.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint16 type;
     * }
     */
    public static void type$set(MemorySegment seg, short x) {
        constants$171.const$4.set(seg, x);
    }
    public static short type$get(MemorySegment seg, long index) {
        return (short)constants$171.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, short x) {
        constants$171.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment direction$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
    }
    public static VarHandle length$VH() {
        return constants$171.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint32 length;
     * }
     */
    public static int length$get(MemorySegment seg) {
        return (int)constants$171.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint32 length;
     * }
     */
    public static void length$set(MemorySegment seg, int x) {
        constants$171.const$5.set(seg, x);
    }
    public static int length$get(MemorySegment seg, long index) {
        return (int)constants$171.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void length$set(MemorySegment seg, long index, int x) {
        constants$171.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle delay$VH() {
        return constants$172.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint16 delay;
     * }
     */
    public static short delay$get(MemorySegment seg) {
        return (short)constants$172.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint16 delay;
     * }
     */
    public static void delay$set(MemorySegment seg, short x) {
        constants$172.const$0.set(seg, x);
    }
    public static short delay$get(MemorySegment seg, long index) {
        return (short)constants$172.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void delay$set(MemorySegment seg, long index, short x) {
        constants$172.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle button$VH() {
        return constants$172.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint16 button;
     * }
     */
    public static short button$get(MemorySegment seg) {
        return (short)constants$172.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint16 button;
     * }
     */
    public static void button$set(MemorySegment seg, short x) {
        constants$172.const$1.set(seg, x);
    }
    public static short button$get(MemorySegment seg, long index) {
        return (short)constants$172.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void button$set(MemorySegment seg, long index, short x) {
        constants$172.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle interval$VH() {
        return constants$172.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint16 interval;
     * }
     */
    public static short interval$get(MemorySegment seg) {
        return (short)constants$172.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint16 interval;
     * }
     */
    public static void interval$set(MemorySegment seg, short x) {
        constants$172.const$2.set(seg, x);
    }
    public static short interval$get(MemorySegment seg, long index) {
        return (short)constants$172.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void interval$set(MemorySegment seg, long index, short x) {
        constants$172.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment right_sat$slice(MemorySegment seg) {
        return seg.asSlice(30, 6);
    }
    public static MemorySegment left_sat$slice(MemorySegment seg) {
        return seg.asSlice(36, 6);
    }
    public static MemorySegment right_coeff$slice(MemorySegment seg) {
        return seg.asSlice(42, 6);
    }
    public static MemorySegment left_coeff$slice(MemorySegment seg) {
        return seg.asSlice(48, 6);
    }
    public static MemorySegment deadband$slice(MemorySegment seg) {
        return seg.asSlice(54, 6);
    }
    public static MemorySegment center$slice(MemorySegment seg) {
        return seg.asSlice(60, 6);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


