package patterns.behavioral.chainOfResponsibility;

import java.math.BigDecimal;

public class CEOHandler implements Handler {
    @Override
    public Boolean process(Request request) {
        if (request.getAmount().compareTo(BigDecimal.valueOf(50000)) > 0) {
            return null;
        }
        return request.getName().equalsIgnoreCase("Ficow");
    }
}
