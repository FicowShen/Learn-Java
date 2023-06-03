package patterns.creational.AbstractFactory.service;

import patterns.creational.AbstractFactory.FastFactory.FastFactory;
import patterns.creational.AbstractFactory.GoodFactory.GoodFactory;

public interface AbstractFactory {
    HtmlDocument createHtml(String md);
    WordDocument createWord(String md);

    static AbstractFactory createFactory(String name) {
        if (name.equalsIgnoreCase("fast")) {
            return new FastFactory();
        } else if (name.equalsIgnoreCase("good")) {
            return new GoodFactory();
        } else {
            throw new IllegalArgumentException("Invalid factory name");
        }
    }
}



