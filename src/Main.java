import taxes.TaxEarnings;
import taxes.TaxEarningsMinusSpendings;
import taxes.TaxSystem;

public class Main {
    public static void main(String[] args) {
        TaxSystem taxEarnings = new TaxEarnings();
        TaxSystem taxEarningsMinusSpendings = new TaxEarningsMinusSpendings();
        Company company = new Company("Весёлый слоник", taxEarnings);
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
                new Sale("Продажа Велосипеда на 15 000 руб.", 0, 15000, "Велосипед", 15000),
                new Expenditure("Покупка Запчастей на 5 000 руб.", 5000, 0, "Запчасти", 5000),
                new Sale("Продажа Самоката на 8 000 руб.", 0, 8000, "Самокат", 8000),
                new Expenditure("Покупка Стелажа на 3 000 руб.", 3000, 0, "Стелаж", 3000),
        };
        company.applyDeals(deals);
    }
}
