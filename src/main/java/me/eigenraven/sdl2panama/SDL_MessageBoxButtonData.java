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
 *     Uint32 flags;
 *     int buttonid;
 *     char* text;
 * };
 * }
 */
public class SDL_MessageBoxButtonData {

    public static MemoryLayout $LAYOUT() {
        return constants$195.const$4;
    }
    public static VarHandle flags$VH() {
        return constants$195.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint32 flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$195.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint32 flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$195.const$5.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$195.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$195.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle buttonid$VH() {
        return constants$196.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int buttonid;
     * }
     */
    public static int buttonid$get(MemorySegment seg) {
        return (int)constants$196.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int buttonid;
     * }
     */
    public static void buttonid$set(MemorySegment seg, int x) {
        constants$196.const$0.set(seg, x);
    }
    public static int buttonid$get(MemorySegment seg, long index) {
        return (int)constants$196.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void buttonid$set(MemorySegment seg, long index, int x) {
        constants$196.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle text$VH() {
        return constants$196.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* text;
     * }
     */
    public static MemorySegment text$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$196.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* text;
     * }
     */
    public static void text$set(MemorySegment seg, MemorySegment x) {
        constants$196.const$1.set(seg, x);
    }
    public static MemorySegment text$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$196.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void text$set(MemorySegment seg, long index, MemorySegment x) {
        constants$196.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


