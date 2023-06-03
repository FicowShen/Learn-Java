package patterns.creational.AbstractFactory.GoodFactory;

import patterns.creational.AbstractFactory.service.AbstractFactory;
import patterns.creational.AbstractFactory.service.HtmlDocument;
import patterns.creational.AbstractFactory.service.WordDocument;

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
