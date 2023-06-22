package patterns.structural.facade;

import patterns.structural.facade.org.AdminOfIndustry;
import patterns.structural.facade.org.Bank;
import patterns.structural.facade.org.Company;
import patterns.structural.facade.org.Taxation;

public class Facade {
    private AdminOfIndustry admin = new AdminOfIndustry();
    private Bank bank = new Bank();
    private Taxation taxation = new Taxation();

    public Company openCompany(String name) {
        Company c = this.admin.register(name);
        String bankAccount = this.bank.openAccount(c.getId());
        c.setBankAccount(bankAccount);
        String taxCode = this.taxation.applyTaxCode(c.getId());
        c.setTaxCode(taxCode);
        return c;
    }
}
