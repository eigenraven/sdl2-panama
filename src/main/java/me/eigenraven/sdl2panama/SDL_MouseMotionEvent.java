// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct SDL_MouseMotionEvent {
 *     Uint32 type;
 *     Uint32 timestamp;
 *     Uint32 windowID;
 *     Uint32 which;
 *     Uint32 state;
 *     Sint32 x;
 *     Sint32 y;
 *     Sint32 xrel;
 *     Sint32 yrel;
 * };
 * }
 */
public class SDL_MouseMotionEvent {

    public static MemoryLayout $LAYOUT() {
        return constants$133.const$0;
    }
    public static VarHandle type$VH() {
        return constants$133.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint32 type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)constants$133.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint32 type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        constants$133.const$1.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)constants$133.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        constants$133.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle timestamp$VH() {
        return constants$133.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint32 timestamp;
     * }
     */
    public static int timestamp$get(MemorySegment seg) {
        return (int)constants$133.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint32 timestamp;
     * }
     */
    public static void timestamp$set(MemorySegment seg, int x) {
        constants$133.const$2.set(seg, x);
    }
    public static int timestamp$get(MemorySegment seg, long index) {
        return (int)constants$133.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void timestamp$set(MemorySegment seg, long index, int x) {
        constants$133.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle windowID$VH() {
        return constants$133.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint32 windowID;
     * }
     */
    public static int windowID$get(MemorySegment seg) {
        return (int)constants$133.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint32 windowID;
     * }
     */
    public static void windowID$set(MemorySegment seg, int x) {
        constants$133.const$3.set(seg, x);
    }
    public static int windowID$get(MemorySegment seg, long index) {
        return (int)constants$133.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void windowID$set(MemorySegment seg, long index, int x) {
        constants$133.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle which$VH() {
        return constants$133.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint32 which;
     * }
     */
    public static int which$get(MemorySegment seg) {
        return (int)constants$133.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint32 which;
     * }
     */
    public static void which$set(MemorySegment seg, int x) {
        constants$133.const$4.set(seg, x);
    }
    public static int which$get(MemorySegment seg, long index) {
        return (int)constants$133.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void which$set(MemorySegment seg, long index, int x) {
        constants$133.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle state$VH() {
        return constants$133.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Uint32 state;
     * }
     */
    public static int state$get(MemorySegment seg) {
        return (int)constants$133.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Uint32 state;
     * }
     */
    public static void state$set(MemorySegment seg, int x) {
        constants$133.const$5.set(seg, x);
    }
    public static int state$get(MemorySegment seg, long index) {
        return (int)constants$133.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void state$set(MemorySegment seg, long index, int x) {
        constants$133.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle x$VH() {
        return constants$134.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Sint32 x;
     * }
     */
    public static int x$get(MemorySegment seg) {
        return (int)constants$134.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Sint32 x;
     * }
     */
    public static void x$set(MemorySegment seg, int x) {
        constants$134.const$0.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)constants$134.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        constants$134.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y$VH() {
        return constants$134.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Sint32 y;
     * }
     */
    public static int y$get(MemorySegment seg) {
        return (int)constants$134.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Sint32 y;
     * }
     */
    public static void y$set(MemorySegment seg, int x) {
        constants$134.const$1.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)constants$134.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        constants$134.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle xrel$VH() {
        return constants$134.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Sint32 xrel;
     * }
     */
    public static int xrel$get(MemorySegment seg) {
        return (int)constants$134.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Sint32 xrel;
     * }
     */
    public static void xrel$set(MemorySegment seg, int x) {
        constants$134.const$2.set(seg, x);
    }
    public static int xrel$get(MemorySegment seg, long index) {
        return (int)constants$134.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void xrel$set(MemorySegment seg, long index, int x) {
        constants$134.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle yrel$VH() {
        return constants$134.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Sint32 yrel;
     * }
     */
    public static int yrel$get(MemorySegment seg) {
        return (int)constants$134.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Sint32 yrel;
     * }
     */
    public static void yrel$set(MemorySegment seg, int x) {
        constants$134.const$3.set(seg, x);
    }
    public static int yrel$get(MemorySegment seg, long index) {
        return (int)constants$134.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void yrel$set(MemorySegment seg, long index, int x) {
        constants$134.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

