package patterns.creational.factory;

import java.math.BigDecimal;

/***
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类。
 * Factory Method使一个类的实例化延迟到其子类。
 */
public interface NumberFactory {
    Number parse(String s);

    static NumberFactory getFactory() {
        return impl;
    }

    static NumberFactory impl = new NumberFactoryImpl();
}

class NumberFactoryImpl implements NumberFactory {

    @Override
    public Number parse(String s) {
        return new BigDecimal(s);
    }
}
