package me.eigenraven.sdl2panama.test;

import me.eigenraven.sdl2panama.SDL2;
import me.eigenraven.sdl2panama.SDL_version;
import org.junit.jupiter.api.Test;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static org.junit.jupiter.api.Assertions.*;

public class SdlTest {
    @Test
    public void testVersion() {
        try (Arena arena = Arena.openConfined()) {
            final MemorySegment libVersion = SDL_version.allocate(arena);
            SDL2.SDL_GetVersion(libVersion);
            final int major = SDL_version.major$get(libVersion);
            final int minor = SDL_version.minor$get(libVersion);
            final int patch = SDL_version.patch$get(libVersion);
            System.err.printf("SDL version loaded: %d.%d.%d%n", major, minor, patch);
            assertEquals(major, SDL2.SDL_MAJOR_VERSION());
            assertTrue(minor >= SDL2.SDL_MINOR_VERSION());
        }
    }
}
