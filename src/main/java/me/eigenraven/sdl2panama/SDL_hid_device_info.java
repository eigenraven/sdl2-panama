// Generated by jextract

package me.eigenraven.sdl2panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct SDL_hid_device_info {
 *     char* path;
 *     unsigned short vendor_id;
 *     unsigned short product_id;
 *     wchar_t* serial_number;
 *     unsigned short release_number;
 *     wchar_t* manufacturer_string;
 *     wchar_t* product_string;
 *     unsigned short usage_page;
 *     unsigned short usage;
 *     int interface_number;
 *     int interface_class;
 *     int interface_subclass;
 *     int interface_protocol;
 *     struct SDL_hid_device_info* next;
 * };
 * }
 */
public class SDL_hid_device_info {

    public static MemoryLayout $LAYOUT() {
        return constants$183.const$1;
    }
    public static VarHandle path$VH() {
        return constants$183.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* path;
     * }
     */
    public static MemorySegment path$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$183.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* path;
     * }
     */
    public static void path$set(MemorySegment seg, MemorySegment x) {
        constants$183.const$2.set(seg, x);
    }
    public static MemorySegment path$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$183.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void path$set(MemorySegment seg, long index, MemorySegment x) {
        constants$183.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle vendor_id$VH() {
        return constants$183.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short vendor_id;
     * }
     */
    public static short vendor_id$get(MemorySegment seg) {
        return (short)constants$183.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short vendor_id;
     * }
     */
    public static void vendor_id$set(MemorySegment seg, short x) {
        constants$183.const$3.set(seg, x);
    }
    public static short vendor_id$get(MemorySegment seg, long index) {
        return (short)constants$183.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void vendor_id$set(MemorySegment seg, long index, short x) {
        constants$183.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle product_id$VH() {
        return constants$183.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short product_id;
     * }
     */
    public static short product_id$get(MemorySegment seg) {
        return (short)constants$183.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short product_id;
     * }
     */
    public static void product_id$set(MemorySegment seg, short x) {
        constants$183.const$4.set(seg, x);
    }
    public static short product_id$get(MemorySegment seg, long index) {
        return (short)constants$183.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void product_id$set(MemorySegment seg, long index, short x) {
        constants$183.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle serial_number$VH() {
        return constants$183.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * wchar_t* serial_number;
     * }
     */
    public static MemorySegment serial_number$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$183.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * wchar_t* serial_number;
     * }
     */
    public static void serial_number$set(MemorySegment seg, MemorySegment x) {
        constants$183.const$5.set(seg, x);
    }
    public static MemorySegment serial_number$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$183.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void serial_number$set(MemorySegment seg, long index, MemorySegment x) {
        constants$183.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle release_number$VH() {
        return constants$184.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short release_number;
     * }
     */
    public static short release_number$get(MemorySegment seg) {
        return (short)constants$184.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short release_number;
     * }
     */
    public static void release_number$set(MemorySegment seg, short x) {
        constants$184.const$0.set(seg, x);
    }
    public static short release_number$get(MemorySegment seg, long index) {
        return (short)constants$184.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void release_number$set(MemorySegment seg, long index, short x) {
        constants$184.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle manufacturer_string$VH() {
        return constants$184.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * wchar_t* manufacturer_string;
     * }
     */
    public static MemorySegment manufacturer_string$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$184.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * wchar_t* manufacturer_string;
     * }
     */
    public static void manufacturer_string$set(MemorySegment seg, MemorySegment x) {
        constants$184.const$1.set(seg, x);
    }
    public static MemorySegment manufacturer_string$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$184.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void manufacturer_string$set(MemorySegment seg, long index, MemorySegment x) {
        constants$184.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle product_string$VH() {
        return constants$184.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * wchar_t* product_string;
     * }
     */
    public static MemorySegment product_string$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$184.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * wchar_t* product_string;
     * }
     */
    public static void product_string$set(MemorySegment seg, MemorySegment x) {
        constants$184.const$2.set(seg, x);
    }
    public static MemorySegment product_string$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$184.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void product_string$set(MemorySegment seg, long index, MemorySegment x) {
        constants$184.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle usage_page$VH() {
        return constants$184.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short usage_page;
     * }
     */
    public static short usage_page$get(MemorySegment seg) {
        return (short)constants$184.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short usage_page;
     * }
     */
    public static void usage_page$set(MemorySegment seg, short x) {
        constants$184.const$3.set(seg, x);
    }
    public static short usage_page$get(MemorySegment seg, long index) {
        return (short)constants$184.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void usage_page$set(MemorySegment seg, long index, short x) {
        constants$184.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle usage$VH() {
        return constants$184.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short usage;
     * }
     */
    public static short usage$get(MemorySegment seg) {
        return (short)constants$184.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short usage;
     * }
     */
    public static void usage$set(MemorySegment seg, short x) {
        constants$184.const$4.set(seg, x);
    }
    public static short usage$get(MemorySegment seg, long index) {
        return (short)constants$184.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void usage$set(MemorySegment seg, long index, short x) {
        constants$184.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle interface_number$VH() {
        return constants$184.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int interface_number;
     * }
     */
    public static int interface_number$get(MemorySegment seg) {
        return (int)constants$184.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int interface_number;
     * }
     */
    public static void interface_number$set(MemorySegment seg, int x) {
        constants$184.const$5.set(seg, x);
    }
    public static int interface_number$get(MemorySegment seg, long index) {
        return (int)constants$184.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void interface_number$set(MemorySegment seg, long index, int x) {
        constants$184.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle interface_class$VH() {
        return constants$185.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int interface_class;
     * }
     */
    public static int interface_class$get(MemorySegment seg) {
        return (int)constants$185.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int interface_class;
     * }
     */
    public static void interface_class$set(MemorySegment seg, int x) {
        constants$185.const$0.set(seg, x);
    }
    public static int interface_class$get(MemorySegment seg, long index) {
        return (int)constants$185.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void interface_class$set(MemorySegment seg, long index, int x) {
        constants$185.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle interface_subclass$VH() {
        return constants$185.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int interface_subclass;
     * }
     */
    public static int interface_subclass$get(MemorySegment seg) {
        return (int)constants$185.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int interface_subclass;
     * }
     */
    public static void interface_subclass$set(MemorySegment seg, int x) {
        constants$185.const$1.set(seg, x);
    }
    public static int interface_subclass$get(MemorySegment seg, long index) {
        return (int)constants$185.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void interface_subclass$set(MemorySegment seg, long index, int x) {
        constants$185.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle interface_protocol$VH() {
        return constants$185.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int interface_protocol;
     * }
     */
    public static int interface_protocol$get(MemorySegment seg) {
        return (int)constants$185.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int interface_protocol;
     * }
     */
    public static void interface_protocol$set(MemorySegment seg, int x) {
        constants$185.const$2.set(seg, x);
    }
    public static int interface_protocol$get(MemorySegment seg, long index) {
        return (int)constants$185.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void interface_protocol$set(MemorySegment seg, long index, int x) {
        constants$185.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle next$VH() {
        return constants$185.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct SDL_hid_device_info* next;
     * }
     */
    public static MemorySegment next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$185.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct SDL_hid_device_info* next;
     * }
     */
    public static void next$set(MemorySegment seg, MemorySegment x) {
        constants$185.const$3.set(seg, x);
    }
    public static MemorySegment next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$185.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void next$set(MemorySegment seg, long index, MemorySegment x) {
        constants$185.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


