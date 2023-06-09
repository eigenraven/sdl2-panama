// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct SDL_ControllerButtonEvent {
 *     Uint32 type;
 *     Uint32 timestamp;
 *     SDL_JoystickID which;
 *     Uint8 button;
 *     Uint8 state;
 *     Uint8 padding1;
 *     Uint8 padding2;
 * };
 * }
 */
public class SDL_ControllerButtonEvent {

    public static MemoryLayout $LAYOUT() {
        return constants$147.const$4;
    }
    public static VarHandle type$VH() {
        return constants$147.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint32 type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)constants$147.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint32 type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        constants$147.const$5.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)constants$147.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        constants$147.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle timestamp$VH() {
        return constants$148.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint32 timestamp;
     * }
     */
    public static int timestamp$get(MemorySegment seg) {
        return (int)constants$148.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint32 timestamp;
     * }
     */
    public static void timestamp$set(MemorySegment seg, int x) {
        constants$148.const$0.set(seg, x);
    }
    public static int timestamp$get(MemorySegment seg, long index) {
        return (int)constants$148.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void timestamp$set(MemorySegment seg, long index, int x) {
        constants$148.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle which$VH() {
        return constants$148.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SDL_JoystickID which;
     * }
     */
    public static int which$get(MemorySegment seg) {
        return (int)constants$148.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SDL_JoystickID which;
     * }
     */
    public static void which$set(MemorySegment seg, int x) {
        constants$148.const$1.set(seg, x);
    }
    public static int which$get(MemorySegment seg, long index) {
        return (int)constants$148.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void which$set(MemorySegment seg, long index, int x) {
        constants$148.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle button$VH() {
        return constants$148.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint8 button;
     * }
     */
    public static byte button$get(MemorySegment seg) {
        return (byte)constants$148.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint8 button;
     * }
     */
    public static void button$set(MemorySegment seg, byte x) {
        constants$148.const$2.set(seg, x);
    }
    public static byte button$get(MemorySegment seg, long index) {
        return (byte)constants$148.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void button$set(MemorySegment seg, long index, byte x) {
        constants$148.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle state$VH() {
        return constants$148.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint8 state;
     * }
     */
    public static byte state$get(MemorySegment seg) {
        return (byte)constants$148.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint8 state;
     * }
     */
    public static void state$set(MemorySegment seg, byte x) {
        constants$148.const$3.set(seg, x);
    }
    public static byte state$get(MemorySegment seg, long index) {
        return (byte)constants$148.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void state$set(MemorySegment seg, long index, byte x) {
        constants$148.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle padding1$VH() {
        return constants$148.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint8 padding1;
     * }
     */
    public static byte padding1$get(MemorySegment seg) {
        return (byte)constants$148.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint8 padding1;
     * }
     */
    public static void padding1$set(MemorySegment seg, byte x) {
        constants$148.const$4.set(seg, x);
    }
    public static byte padding1$get(MemorySegment seg, long index) {
        return (byte)constants$148.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void padding1$set(MemorySegment seg, long index, byte x) {
        constants$148.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle padding2$VH() {
        return constants$148.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint8 padding2;
     * }
     */
    public static byte padding2$get(MemorySegment seg) {
        return (byte)constants$148.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint8 padding2;
     * }
     */
    public static void padding2$set(MemorySegment seg, byte x) {
        constants$148.const$5.set(seg, x);
    }
    public static byte padding2$get(MemorySegment seg, long index) {
        return (byte)constants$148.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void padding2$set(MemorySegment seg, long index, byte x) {
        constants$148.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


