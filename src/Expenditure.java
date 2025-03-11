public class Expenditure extends Deal {
    public String productName;
    public int price;

    public Expenditure (String comment, int creditChange, int debitChange, String productName, int price) {
        super(comment, creditChange, debitChange);
        this.productName = productName;
        this.price = price;
    }
}
