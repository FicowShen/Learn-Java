package patterns.creational.abstractFactory.service;

import patterns.creational.abstractFactory.fastFactory.FastFactory;
import patterns.creational.abstractFactory.goodFactory.GoodFactory;

/***
 * 提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 */
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



