package Practice;
public class DispensedProductModel {

//    private String arduinoID;
//    private String productId;
    private int qty;

    public DispensedProductModel(int qty) {
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}