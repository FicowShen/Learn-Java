package patterns.structural.facade;

import patterns.structural.facade.org.AdminOfIndustry;
import patterns.structural.facade.org.Bank;
import patterns.structural.facade.org.Company;
import patterns.structural.facade.org.Taxation;

/**
 * 为子系统中的一组接口提供一个一致的界面。
 * Facade模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 */
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
