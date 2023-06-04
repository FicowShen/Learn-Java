package patterns.structural.composite;

import java.util.List;

/***
 * 将对象组合成树形结构以表示“部分-整体”的层次结构，
 * 使得用户对单个对象和组合对象的使用具有一致性。
 */
public interface Node {
    Node add(Node node);
    List<Node> children();
    String toXML();
}
