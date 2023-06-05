package patterns.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {

    @Test
    void testDecorator() {
        TextNode n1 = new SpanNode();
        TextNode n2 = new BoldDecorator(new UnderlineDecorator(new SpanNode()));
        TextNode n3 = new ItalicDecorator(new BoldDecorator(new SpanNode()));
        n1.setText("Hello");
        n2.setText("Decorated");
        n3.setText("World");
        assertEquals("<span>Hello</span>", n1.getText());
        assertEquals("<b><u><span>Decorated</span></u></b>", n2.getText());
        assertEquals("<i><b><span>World</span></b></i>", n3.getText());
    }
}