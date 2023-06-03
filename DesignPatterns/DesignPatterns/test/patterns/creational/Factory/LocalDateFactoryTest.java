package patterns.creational.Factory;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LocalDateFactoryTest {

    @Test
    void testFromInt() {
        assertEquals("2023-12-08", LocalDateFactory.fromInt(20231208).toString());
        assertNull(LocalDateFactory.fromInt(1208));
        assertNull(LocalDateFactory.fromInt(120231208));
    }
}