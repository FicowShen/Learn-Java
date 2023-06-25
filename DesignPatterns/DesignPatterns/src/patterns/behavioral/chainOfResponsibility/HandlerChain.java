package patterns.behavioral.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

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
