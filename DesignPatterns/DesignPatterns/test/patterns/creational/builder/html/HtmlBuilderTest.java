package patterns.creational.builder.html;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HtmlBuilderTest {

    @Test
    void testToHtml() {
        String markdown = String.join("\n", // Markdown document
                "## Builder Pattern", // heading
                "> Seperate the construction of a complex object from its representation",
                "Use builder pattern when the construction process is complex.", "----", "Here is an example.");
        HtmlBuilder builder = new HtmlBuilder();
        String html = builder.toHtml(markdown);
        String expected = "<h2>Builder Pattern</h2>\n" +
                "<blockquote>Seperate the construction of a complex object from its representation</blockquote>\n" +
                "<p>Use builder pattern when the construction process is complex.</p>\n" +
                "<hr/>\n" +
                "<p>Here is an example.</p>\n";
//        System.out.println(html);
        assertEquals(expected, html);
    }

}