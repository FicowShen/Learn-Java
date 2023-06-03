import patterns.creational.Factory.NumberFactory;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        creational();
    }

    static void creational() {
        NumberFactory factory = NumberFactory.getFactory();
        Number number = factory.parse("123.456");
        System.out.println(number);
    }
}