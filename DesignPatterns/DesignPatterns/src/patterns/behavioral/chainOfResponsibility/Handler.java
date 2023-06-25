package patterns.behavioral.chainOfResponsibility;

public interface Handler {
    Boolean process(Request request);
}
