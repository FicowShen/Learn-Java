package patterns.behavioral.interpreter;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class PlaceholderInterpreterTest {

    @Test
    void testFormattedString() {
        String result = PlaceholderInterpreter.formattedString("[{}] start {} at {}...", LocalTime.now().withNano(0), "engine", LocalDate.now());
        assertEquals(String.format("[%s] start %s at %s...", LocalTime.now().withNano(0), "engine", LocalDate.now()), result);
    }
}