package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 运用共享技术有效地支持大量细粒度的对象。
 */
public class Student {

    private static final Map<String, Student> cache = new HashMap<>();

    // use factory method to manage cache for flyweight pattern
    public static Student create(int id, String name) {
        String key = id + "_" + name;
        Student student = cache.get(key);
        if (student == null) {
            student = new Student(id, name);
            cache.put(key, student);
        }
        return student;
    }
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
