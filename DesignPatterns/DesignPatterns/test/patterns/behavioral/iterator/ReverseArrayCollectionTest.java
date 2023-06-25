package patterns.behavioral.iterator;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayCollectionTest {

    @Test
    void testIterator() {
        ReverseArrayCollection<String> array = new ReverseArrayCollection<>("apple", "pear", "banana");
        List<String> result = new ArrayList<>();
        for (String fruit: array) {
            result.add(fruit);
        }
        assertArrayEquals(result.toArray(), Arrays.asList("banana", "pear", "apple").toArray());
    }
}
