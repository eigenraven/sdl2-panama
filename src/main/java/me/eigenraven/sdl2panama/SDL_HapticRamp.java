// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct SDL_HapticRamp {
 *     Uint16 type;
 *     SDL_HapticDirection direction;
 *     Uint32 length;
 *     Uint16 delay;
 *     Uint16 button;
 *     Uint16 interval;
 *     Sint16 start;
 *     Sint16 end;
 *     Uint16 attack_length;
 *     Uint16 attack_level;
 *     Uint16 fade_length;
 *     Uint16 fade_level;
 * };
 * }
 */
public class SDL_HapticRamp {

    public static MemoryLayout $LAYOUT() {
        return constants$172.const$3;
    }
    public static VarHandle type$VH() {
        return constants$172.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint16 type;
     * }
     */
    public static short type$get(MemorySegment seg) {
        return (short)constants$172.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint16 type;
     * }
     */
    public static void type$set(MemorySegment seg, short x) {
        constants$172.const$4.set(seg, x);
    }
    public static short type$get(MemorySegment seg, long index) {
        return (short)constants$172.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, short x) {
        constants$172.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment direction$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
    }
    public static VarHandle length$VH() {
        return constants$172.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint32 length;
     * }
     */
    public static int length$get(MemorySegment seg) {
        return (int)constants$172.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint32 length;
     * }
     */
    public static void length$set(MemorySegment seg, int x) {
        constants$172.const$5.set(seg, x);
    }
    public static int length$get(MemorySegment seg, long index) {
        return (int)constants$172.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void length$set(MemorySegment seg, long index, int x) {
        constants$172.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle delay$VH() {
        return constants$173.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint16 delay;
     * }
     */
    public static short delay$get(MemorySegment seg) {
        return (short)constants$173.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint16 delay;
     * }
     */
    public static void delay$set(MemorySegment seg, short x) {
        constants$173.const$0.set(seg, x);
    }
    public static short delay$get(MemorySegment seg, long index) {
        return (short)constants$173.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void delay$set(MemorySegment seg, long index, short x) {
        constants$173.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle button$VH() {
        return constants$173.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint16 button;
     * }
     */
    public static short button$get(MemorySegment seg) {
        return (short)constants$173.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint16 button;
     * }
     */
    public static void button$set(MemorySegment seg, short x) {
        constants$173.const$1.set(seg, x);
    }
    public static short button$get(MemorySegment seg, long index) {
        return (short)constants$173.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void button$set(MemorySegment seg, long index, short x) {
        constants$173.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle interval$VH() {
        return constants$173.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint16 interval;
     * }
     */
    public static short interval$get(MemorySegment seg) {
        return (short)constants$173.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint16 interval;
     * }
     */
    public static void interval$set(MemorySegment seg, short x) {
        constants$173.const$2.set(seg, x);
    }
    public static short interval$get(MemorySegment seg, long index) {
        return (short)constants$173.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void interval$set(MemorySegment seg, long index, short x) {
        constants$173.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle start$VH() {
        return constants$173.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Sint16 start;
     * }
     */
    public static short start$get(MemorySegment seg) {
        return (short)constants$173.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Sint16 start;
     * }
     */
    public static void start$set(MemorySegment seg, short x) {
        constants$173.const$3.set(seg, x);
    }
    public static short start$get(MemorySegment seg, long index) {
        return (short)constants$173.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void start$set(MemorySegment seg, long index, short x) {
        constants$173.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle end$VH() {
        return constants$173.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Sint16 end;
     * }
     */
    public static short end$get(MemorySegment seg) {
        return (short)constants$173.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Sint16 end;
     * }
     */
    public static void end$set(MemorySegment seg, short x) {
        constants$173.const$4.set(seg, x);
    }
    public static short end$get(MemorySegment seg, long index) {
        return (short)constants$173.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void end$set(MemorySegment seg, long index, short x) {
        constants$173.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle attack_length$VH() {
        return constants$173.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint16 attack_length;
     * }
     */
    public static short attack_length$get(MemorySegment seg) {
        return (short)constants$173.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint16 attack_length;
     * }
     */
    public static void attack_length$set(MemorySegment seg, short x) {
        constants$173.const$5.set(seg, x);
    }
    public static short attack_length$get(MemorySegment seg, long index) {
        return (short)constants$173.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void attack_length$set(MemorySegment seg, long index, short x) {
        constants$173.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle attack_level$VH() {
        return constants$174.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint16 attack_level;
     * }
     */
    public static short attack_level$get(MemorySegment seg) {
        return (short)constants$174.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint16 attack_level;
     * }
     */
    public static void attack_level$set(MemorySegment seg, short x) {
        constants$174.const$0.set(seg, x);
    }
    public static short attack_level$get(MemorySegment seg, long index) {
        return (short)constants$174.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void attack_level$set(MemorySegment seg, long index, short x) {
        constants$174.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle fade_length$VH() {
        return constants$174.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint16 fade_length;
     * }
     */
    public static short fade_length$get(MemorySegment seg) {
        return (short)constants$174.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint16 fade_length;
     * }
     */
    public static void fade_length$set(MemorySegment seg, short x) {
        constants$174.const$1.set(seg, x);
    }
    public static short fade_length$get(MemorySegment seg, long index) {
        return (short)constants$174.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void fade_length$set(MemorySegment seg, long index, short x) {
        constants$174.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle fade_level$VH() {
        return constants$174.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint16 fade_level;
     * }
     */
    public static short fade_level$get(MemorySegment seg) {
        return (short)constants$174.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint16 fade_level;
     * }
     */
    public static void fade_level$set(MemorySegment seg, short x) {
        constants$174.const$2.set(seg, x);
    }
    public static short fade_level$get(MemorySegment seg, long index) {
        return (short)constants$174.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void fade_level$set(MemorySegment seg, long index, short x) {
        constants$174.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

