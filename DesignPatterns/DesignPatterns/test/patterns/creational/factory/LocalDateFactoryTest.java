package patterns.creational.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalDateFactoryTest {

    @Test
    void testFromInt() {
        assertEquals("2023-12-08", LocalDateFactory.fromInt(20231208).toString());
        assertNull(LocalDateFactory.fromInt(1208));
        assertNull(LocalDateFactory.fromInt(120231208));
    }
}