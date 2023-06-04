package patterns.structural.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void testNode() {
        Node root = new ElementNode("school");
        root.add(new ElementNode("classA")
                .add(new TextNode("Tom"))
                .add(new TextNode("Alice")));
        root.add(new ElementNode("classB")
                .add(new TextNode("Bob"))
                .add(new TextNode("Grace"))
                .add(new CommentNode("comment...")));
        String expected = "<school>\n" +
                "<classA>\n" +
                "Tom\n" +
                "Alice\n" +
                "</classA>\n" +
                "\n" +
                "<classB>\n" +
                "Bob\n" +
                "Grace\n" +
                "<!-- comment... -->\n" +
                "</classB>\n" +
                "\n" +
                "</school>\n";
        assertEquals(expected, root.toXML());
    }
}