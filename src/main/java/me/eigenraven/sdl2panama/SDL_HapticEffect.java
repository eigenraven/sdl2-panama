// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union SDL_HapticEffect {
 *     Uint16 type;
 *     SDL_HapticConstant constant;
 *     SDL_HapticPeriodic periodic;
 *     SDL_HapticCondition condition;
 *     SDL_HapticRamp ramp;
 *     SDL_HapticLeftRight leftright;
 *     SDL_HapticCustom custom;
 * };
 * }
 */
public class SDL_HapticEffect {

    public static MemoryLayout $LAYOUT() {
        return constants$177.const$4;
    }
    public static VarHandle type$VH() {
        return constants$177.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint16 type;
     * }
     */
    public static short type$get(MemorySegment seg) {
        return (short)constants$177.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint16 type;
     * }
     */
    public static void type$set(MemorySegment seg, short x) {
        constants$177.const$5.set(seg, x);
    }
    public static short type$get(MemorySegment seg, long index) {
        return (short)constants$177.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, short x) {
        constants$177.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment constant$slice(MemorySegment seg) {
        return seg.asSlice(0, 40);
    }
    public static MemorySegment periodic$slice(MemorySegment seg) {
        return seg.asSlice(0, 48);
    }
    public static MemorySegment condition$slice(MemorySegment seg) {
        return seg.asSlice(0, 68);
    }
    public static MemorySegment ramp$slice(MemorySegment seg) {
        return seg.asSlice(0, 44);
    }
    public static MemorySegment leftright$slice(MemorySegment seg) {
        return seg.asSlice(0, 12);
    }
    public static MemorySegment custom$slice(MemorySegment seg) {
        return seg.asSlice(0, 56);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

