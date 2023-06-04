package patterns.creational.builder.html;

public class QuoteBuilder {
    public String buildQuote(String line) {
        return "<blockquote>" + line.substring(1).trim() + "</blockquote>";
    }
}
