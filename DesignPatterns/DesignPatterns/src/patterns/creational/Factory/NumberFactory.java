package patterns.creational.Factory;

import java.math.BigDecimal;

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
