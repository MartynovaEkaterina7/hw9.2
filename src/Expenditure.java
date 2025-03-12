public class Expenditure extends Deal {
    public Expenditure(String title, int price) {
        super(("Покупка" + title + "на " + price +"руб."),price, 0);
    }
}
