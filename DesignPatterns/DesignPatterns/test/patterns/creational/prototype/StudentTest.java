package patterns.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testClone() {
        Student s = new Student();
        s.setId(1);
        s.setName("ficow");
        s.setScore(88);
        Student s2 = (Student) s.clone();
        assertEquals(s.getId(), s2.getId());
        assertEquals(s.getName(), s2.getName());
        assertEquals(s.getScore(), s2.getScore());
        assertNotEquals(s.toString(), s2.toString());
//        System.out.println(s.toString() + "\n" + s2.toString());
    }
}