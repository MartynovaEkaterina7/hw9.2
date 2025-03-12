import taxes.TaxEarnings;
import taxes.TaxEarningsMinusSpendings;
import taxes.TaxSystem;

public class Main {
    public static void main(String[] args) {
        TaxSystem taxEarnings = new TaxEarnings();
        TaxSystem taxEarningsMinusSpendings = new TaxEarningsMinusSpendings();
        Company company = new Company();
        company.setTitle("Весёлый слоник");
        company.setTaxSystem(taxEarnings);
        company.shiftMoney(5000);
        company.shiftMoney(-2000);
        company.payTaxes();
        // смена системы налогооблажения.
        company.setTaxSystem(taxEarningsMinusSpendings);
        company.shiftMoney(5000);
        company.shiftMoney(-2000);
        company.payTaxes();
        //Сделки
        Deal[] deals = {
                new Sale("Велосипед", 15000),
                new Expenditure("Запчасти", 5000),
                new Sale("Самокат", 8000),
                new Expenditure("Стелаж", 3000)
        };
        company.applyDeals(deals);
    }
}
