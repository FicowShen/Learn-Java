package patterns.behavioral.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 * 将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 */
public class HandlerChain {

    private List<Handler> handlers = new ArrayList<>();

    public void addHandler(Handler handler) { this.handlers.add(handler); }

    public boolean process(Request request) {
        for (Handler handler : handlers) {
            Boolean result = handler.process(request);
            if (result != null) {
                return result;
            }
        }
        throw new RuntimeException("Cannot handle request:" + request);
    }
}
