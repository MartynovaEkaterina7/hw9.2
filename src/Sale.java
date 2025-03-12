public class Sale extends Deal {
    public Sale(String title, int price) {
        super(("Продажа" + title + "на " + price +"руб."),0, price);
    }
}
