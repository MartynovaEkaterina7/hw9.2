import taxes.TaxSystem;

public class Company {
    private String title;
    private int debit;
    private int credit;
    private TaxSystem taxSystem;

    public Company (String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    };

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit = debit + amount;
        } else if (amount < 0) {
            credit = credit + Math.abs(amount);
        }
    }

    public void setTaxSystem (TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.println("Компания " + title + " уплатила налог в размере: " + tax + " руб.");
        debit = 0;
        credit = 0;
    }

    public int applyDeals(Deal[] deals) {
        for (int i = 0; i < deals.length; i++ ) {
            credit = credit + deals[i].creditChange;
            debit = debit + deals[i].debitChange;
        }
        int margin = debit - credit;
        payTaxes();
        return margin;
    }
}
