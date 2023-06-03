package patterns.creational.abstractFactory.fastFactory;

import patterns.creational.abstractFactory.service.AbstractFactory;
import patterns.creational.abstractFactory.service.HtmlDocument;
import patterns.creational.abstractFactory.service.WordDocument;

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
