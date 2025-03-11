import taxes.TaxSystem;

public class Company {
    protected String title;
    protected int debit;
    protected int credit;
    protected TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    };

    public Company() {

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit = debit + amount;
        } else if (amount < 0) {
            credit = credit + Math.abs(amount);
        }
    }

    public void payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.println("Компания " + title + " уплатила налог в размере: " + tax + " руб.");
        debit = 0;
        credit = 0;
    }

    public int applyDeals(Deal[] deals) {
        for (int i = 0; i < deals.length; i++ ) {
            credit = credit + deals[i].getCreditChange();
            debit = debit + deals[i].getDebitChange();
        }
        int margin = debit - credit;
        payTaxes();
        return margin;
    }
}
