public class Deal {
    protected String comment;
    protected int creditChange;
    protected int debitChange;

    public Deal (String comment, int creditChange, int debitChange) {
        this.comment = comment;
        this.creditChange = creditChange;
        this.debitChange = debitChange;
    }

    public void setCreditChange(int creditChange) {
        this.creditChange = creditChange;
    }

    public int getCreditChange() {
        return creditChange;
    }

    public void setDebitChange(int debitChange) {
        this.debitChange = debitChange;
    }

    public int getDebitChange() {
        return debitChange;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
