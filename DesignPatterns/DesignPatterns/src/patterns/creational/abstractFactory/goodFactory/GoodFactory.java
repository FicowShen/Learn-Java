package patterns.creational.abstractFactory.goodFactory;

import patterns.creational.abstractFactory.service.AbstractFactory;
import patterns.creational.abstractFactory.service.HtmlDocument;
import patterns.creational.abstractFactory.service.WordDocument;

public class GoodFactory implements AbstractFactory {
    @Override
    public HtmlDocument createHtml(String md) {
        return new GoodHtmlDocument(md);
    }

    @Override
    public WordDocument createWord(String md) {
        return new GoodWordDocument(md);
    }
}
