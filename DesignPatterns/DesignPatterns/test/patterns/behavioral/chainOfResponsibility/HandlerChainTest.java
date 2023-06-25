package patterns.behavioral.chainOfResponsibility;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class HandlerChainTest {

    @Test
    void testProcess() {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new ManagerHandler());
        chain.addHandler(new DirectorHandler());
        chain.addHandler(new CEOHandler());
        assertFalse(chain.process(new Request("Baby", new BigDecimal("100"))));
        assertTrue(chain.process(new Request("Shen", new BigDecimal("100"))));
        assertFalse(chain.process(new Request("Bob", new BigDecimal("10000"))));
        assertTrue(chain.process(new Request("Hebe", new BigDecimal("10000"))));
        assertFalse(chain.process(new Request("Sam", new BigDecimal("50000"))));
        assertTrue(chain.process(new Request("Ficow", new BigDecimal("50000"))));
        assertThrowsExactly(RuntimeException.class, () -> chain.process(new Request("Ficow", new BigDecimal("50001"))));
    }
}