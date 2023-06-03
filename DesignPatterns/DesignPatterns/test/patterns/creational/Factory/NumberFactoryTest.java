package patterns.creational.Factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberFactoryTest {

    @Test
    void testParse() {
        NumberFactory factory = NumberFactory.getFactory();
        Number number = factory.parse("123.456");
        assertEquals(123.456, number.doubleValue());
    }
}