package patterns.structural.decorator;

/***
 * 动态地给一个对象添加一些额外的职责。
 * 就增加功能来说，相比生成子类更为灵活。
 */
public abstract class NodeDecorator implements TextNode {
    protected final TextNode target;

    public NodeDecorator(TextNode target) {
        this.target = target;
    }

    @Override
    public void setText(String text) {
        this.target.setText(text);
    }
}
