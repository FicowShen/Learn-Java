package patterns.structural.facade;

import org.junit.jupiter.api.Test;
import patterns.structural.facade.org.Company;

import static org.junit.jupiter.api.Assertions.*;

class FacadeTest {

    @Test
    void testFacade() {
        Facade facade = new Facade();
        Company c = facade.openCompany("Facade Software Ltd.");
        assertEquals("Facade Software Ltd.", c.getName());
        assertNotNull(c.getBankAccount());
        assertNotNull(c.getTaxCode());
    }
}