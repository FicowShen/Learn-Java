package patterns.creational.AbstractFactory.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import patterns.creational.AbstractFactory.FastFactory.FastFactory;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {
    @ParameterizedTest
    @MethodSource
    void testFactory(String factoryName, String result) throws IOException  {
        AbstractFactory factory = AbstractFactory.createFactory(factoryName);
        HtmlDocument htmlDoc = factory.createHtml("#Hello\nHello, world!");
        assertEquals(result, htmlDoc.toHtml());
        htmlDoc.save(pathForFile(factoryName + ".html"));
        WordDocument word = factory.createWord("#Hello\nHello, world!");
        word.save(pathForFile(factoryName + ".doc"));
    }

    private Path pathForFile(String filename) {
        return Paths.get(".", "out", "test", filename);
    }

    static List<Arguments> testFactory() {
        String fastHTML = "<h1>Hello</h1>\n<p>Hello, world!</p>\n";
        String goodHTML = "<html>\n<body>\n" +
                "<h1>Hello</h1>\n" +
                "<p>Hello, world!</p>\n\n" +
                "</body>\n</html>";
        return Arrays.asList(
                Arguments.of("fast", fastHTML),
                Arguments.of("good", goodHTML)
        );
        // https://www.baeldung.com/java-init-list-one-line
//        return List.of( // arguments:
//                Arguments.of("fast", "<h1>Hello</h1>\n<p>Hello, world!</p>\n"),
//                Arguments.of("good", "Apple")
//        );
    }
}