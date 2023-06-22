package patterns.structural.flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void create() {
        Student s1 = Student.create(1, "ficow");
        Student s2 = Student.create(2, "hebe");
        Student s3 = Student.create(1, "ficow");
        assertEquals(s1, s3);
        assertNotEquals(s2, s3);
    }
}