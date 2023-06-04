package patterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void testSingleton() {
        assertEquals(Earth.getInstance(), Earth.getInstance());
        assertEquals(World.INSTANCE, World.INSTANCE);
    }

}