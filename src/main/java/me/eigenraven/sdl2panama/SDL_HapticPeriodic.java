// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct SDL_HapticPeriodic {
 *     Uint16 type;
 *     SDL_HapticDirection direction;
 *     Uint32 length;
 *     Uint16 delay;
 *     Uint16 button;
 *     Uint16 interval;
 *     Uint16 period;
 *     Sint16 magnitude;
 *     Sint16 offset;
 *     Uint16 phase;
 *     Uint16 attack_length;
 *     Uint16 attack_level;
 *     Uint16 fade_length;
 *     Uint16 fade_level;
 * };
 * }
 */
public class SDL_HapticPeriodic {

    public static MemoryLayout $LAYOUT() {
        return constants$169.const$1;
    }
    public static VarHandle type$VH() {
        return constants$169.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint16 type;
     * }
     */
    public static short type$get(MemorySegment seg) {
        return (short)constants$169.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint16 type;
     * }
     */
    public static void type$set(MemorySegment seg, short x) {
        constants$169.const$2.set(seg, x);
    }
    public static short type$get(MemorySegment seg, long index) {
        return (short)constants$169.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, short x) {
        constants$169.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment direction$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
    }
    public static VarHandle length$VH() {
        return constants$169.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint32 length;
     * }
     */
    public static int length$get(MemorySegment seg) {
        return (int)constants$169.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint32 length;
     * }
     */
    public static void length$set(MemorySegment seg, int x) {
        constants$169.const$3.set(seg, x);
    }
    public static int length$get(MemorySegment seg, long index) {
        return (int)constants$169.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void length$set(MemorySegment seg, long index, int x) {
        constants$169.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle delay$VH() {
        return constants$169.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint16 delay;
     * }
     */
    public static short delay$get(MemorySegment seg) {
        return (short)constants$169.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint16 delay;
     * }
     */
    public static void delay$set(MemorySegment seg, short x) {
        constants$169.const$4.set(seg, x);
    }
    public static short delay$get(MemorySegment seg, long index) {
        return (short)constants$169.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void delay$set(MemorySegment seg, long index, short x) {
        constants$169.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle button$VH() {
        return constants$169.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint16 button;
     * }
     */
    public static short button$get(MemorySegment seg) {
        return (short)constants$169.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint16 button;
     * }
     */
    public static void button$set(MemorySegment seg, short x) {
        constants$169.const$5.set(seg, x);
    }
    public static short button$get(MemorySegment seg, long index) {
        return (short)constants$169.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void button$set(MemorySegment seg, long index, short x) {
        constants$169.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle interval$VH() {
        return constants$170.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint16 interval;
     * }
     */
    public static short interval$get(MemorySegment seg) {
        return (short)constants$170.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint16 interval;
     * }
     */
    public static void interval$set(MemorySegment seg, short x) {
        constants$170.const$0.set(seg, x);
    }
    public static short interval$get(MemorySegment seg, long index) {
        return (short)constants$170.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void interval$set(MemorySegment seg, long index, short x) {
        constants$170.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle period$VH() {
        return constants$170.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint16 period;
     * }
     */
    public static short period$get(MemorySegment seg) {
        return (short)constants$170.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint16 period;
     * }
     */
    public static void period$set(MemorySegment seg, short x) {
        constants$170.const$1.set(seg, x);
    }
    public static short period$get(MemorySegment seg, long index) {
        return (short)constants$170.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void period$set(MemorySegment seg, long index, short x) {
        constants$170.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle magnitude$VH() {
        return constants$170.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Sint16 magnitude;
     * }
     */
    public static short magnitude$get(MemorySegment seg) {
        return (short)constants$170.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Sint16 magnitude;
     * }
     */
    public static void magnitude$set(MemorySegment seg, short x) {
        constants$170.const$2.set(seg, x);
    }
    public static short magnitude$get(MemorySegment seg, long index) {
        return (short)constants$170.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void magnitude$set(MemorySegment seg, long index, short x) {
        constants$170.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle offset$VH() {
        return constants$170.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Sint16 offset;
     * }
     */
    public static short offset$get(MemorySegment seg) {
        return (short)constants$170.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Sint16 offset;
     * }
     */
    public static void offset$set(MemorySegment seg, short x) {
        constants$170.const$3.set(seg, x);
    }
    public static short offset$get(MemorySegment seg, long index) {
        return (short)constants$170.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void offset$set(MemorySegment seg, long index, short x) {
        constants$170.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle phase$VH() {
        return constants$170.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint16 phase;
     * }
     */
    public static short phase$get(MemorySegment seg) {
        return (short)constants$170.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint16 phase;
     * }
     */
    public static void phase$set(MemorySegment seg, short x) {
        constants$170.const$4.set(seg, x);
    }
    public static short phase$get(MemorySegment seg, long index) {
        return (short)constants$170.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void phase$set(MemorySegment seg, long index, short x) {
        constants$170.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle attack_length$VH() {
        return constants$170.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint16 attack_length;
     * }
     */
    public static short attack_length$get(MemorySegment seg) {
        return (short)constants$170.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint16 attack_length;
     * }
     */
    public static void attack_length$set(MemorySegment seg, short x) {
        constants$170.const$5.set(seg, x);
    }
    public static short attack_length$get(MemorySegment seg, long index) {
        return (short)constants$170.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void attack_length$set(MemorySegment seg, long index, short x) {
        constants$170.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle attack_level$VH() {
        return constants$171.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint16 attack_level;
     * }
     */
    public static short attack_level$get(MemorySegment seg) {
        return (short)constants$171.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint16 attack_level;
     * }
     */
    public static void attack_level$set(MemorySegment seg, short x) {
        constants$171.const$0.set(seg, x);
    }
    public static short attack_level$get(MemorySegment seg, long index) {
        return (short)constants$171.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void attack_level$set(MemorySegment seg, long index, short x) {
        constants$171.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle fade_length$VH() {
        return constants$171.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint16 fade_length;
     * }
     */
    public static short fade_length$get(MemorySegment seg) {
        return (short)constants$171.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint16 fade_length;
     * }
     */
    public static void fade_length$set(MemorySegment seg, short x) {
        constants$171.const$1.set(seg, x);
    }
    public static short fade_length$get(MemorySegment seg, long index) {
        return (short)constants$171.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void fade_length$set(MemorySegment seg, long index, short x) {
        constants$171.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle fade_level$VH() {
        return constants$171.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint16 fade_level;
     * }
     */
    public static short fade_level$get(MemorySegment seg) {
        return (short)constants$171.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint16 fade_level;
     * }
     */
    public static void fade_level$set(MemorySegment seg, short x) {
        constants$171.const$2.set(seg, x);
    }
    public static short fade_level$get(MemorySegment seg, long index) {
        return (short)constants$171.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void fade_level$set(MemorySegment seg, long index, short x) {
        constants$171.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


