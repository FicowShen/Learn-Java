package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ElementNode implements Node {
    private String name;
    private List<Node> list = new ArrayList<>();

    public ElementNode(String name) {
        this.name = name;
    }

    @Override
    public Node add(Node node) {
        list.add(node);
        return this;
    }

    @Override
    public List<Node> children() {
        return list;
    }

    @Override
    public String toXML() {
        String start = "<" + name + ">\n";
        String end = "</" + name + ">\n";
        StringJoiner joiner = new StringJoiner("", start, end);
        list.forEach(node -> {
            joiner.add(node.toXML() + "\n");
        });
        return joiner.toString();
    }
}
