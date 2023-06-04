package patterns.structural.bridge;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private static final PrintStream originalOut = System.out;
    private static final PrintStream originalErr = System.err;

    @BeforeAll
    public static void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterAll
    public static void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
    @Test
    void testCar() {
        RefinedCar car1 = new BossCar(new HybridEngine());
        car1.drive();
        RefinedCar car2 = new TinyCar(new ElectricEngine());
        car2.drive();
        String expected = "Start Hybrid Engine...\n" +
                "Drive Boss car...\n" +
                "Start Electric Engine...\n" +
                "Drive Tiny car...\n";
        // https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
        assertEquals(expected, outContent.toString());
    }
}