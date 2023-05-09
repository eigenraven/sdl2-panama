// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct SDL_ControllerSensorEvent {
 *     Uint32 type;
 *     Uint32 timestamp;
 *     SDL_JoystickID which;
 *     Sint32 sensor;
 *     float data[3];
 *     Uint64 timestamp_us;
 * };
 * }
 */
public class SDL_ControllerSensorEvent {

    public static MemoryLayout $LAYOUT() {
        return constants$151.const$1;
    }
    public static VarHandle type$VH() {
        return constants$151.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint32 type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)constants$151.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint32 type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        constants$151.const$2.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)constants$151.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        constants$151.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle timestamp$VH() {
        return constants$151.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint32 timestamp;
     * }
     */
    public static int timestamp$get(MemorySegment seg) {
        return (int)constants$151.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint32 timestamp;
     * }
     */
    public static void timestamp$set(MemorySegment seg, int x) {
        constants$151.const$3.set(seg, x);
    }
    public static int timestamp$get(MemorySegment seg, long index) {
        return (int)constants$151.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void timestamp$set(MemorySegment seg, long index, int x) {
        constants$151.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle which$VH() {
        return constants$151.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SDL_JoystickID which;
     * }
     */
    public static int which$get(MemorySegment seg) {
        return (int)constants$151.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SDL_JoystickID which;
     * }
     */
    public static void which$set(MemorySegment seg, int x) {
        constants$151.const$4.set(seg, x);
    }
    public static int which$get(MemorySegment seg, long index) {
        return (int)constants$151.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void which$set(MemorySegment seg, long index, int x) {
        constants$151.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle sensor$VH() {
        return constants$151.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Sint32 sensor;
     * }
     */
    public static int sensor$get(MemorySegment seg) {
        return (int)constants$151.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Sint32 sensor;
     * }
     */
    public static void sensor$set(MemorySegment seg, int x) {
        constants$151.const$5.set(seg, x);
    }
    public static int sensor$get(MemorySegment seg, long index) {
        return (int)constants$151.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void sensor$set(MemorySegment seg, long index, int x) {
        constants$151.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment data$slice(MemorySegment seg) {
        return seg.asSlice(16, 12);
    }
    public static VarHandle timestamp_us$VH() {
        return constants$152.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint64 timestamp_us;
     * }
     */
    public static long timestamp_us$get(MemorySegment seg) {
        return (long)constants$152.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint64 timestamp_us;
     * }
     */
    public static void timestamp_us$set(MemorySegment seg, long x) {
        constants$152.const$0.set(seg, x);
    }
    public static long timestamp_us$get(MemorySegment seg, long index) {
        return (long)constants$152.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void timestamp_us$set(MemorySegment seg, long index, long x) {
        constants$152.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


