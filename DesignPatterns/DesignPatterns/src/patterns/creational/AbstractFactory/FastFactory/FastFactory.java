package patterns.creational.AbstractFactory.FastFactory;

import patterns.creational.AbstractFactory.service.AbstractFactory;
import patterns.creational.AbstractFactory.service.HtmlDocument;
import patterns.creational.AbstractFactory.service.WordDocument;

public class FastFactory implements AbstractFactory {

    @Override
    public HtmlDocument createHtml(String md) {
        return new FastHtmlDocument(md);
    }

    @Override
    public WordDocument createWord(String md) {
        return new FastWordDocument(md);
    }
}
