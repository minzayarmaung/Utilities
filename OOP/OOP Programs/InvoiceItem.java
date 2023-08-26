package OOP_Practise;

public class InvoiceItem {
    private int id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(int id, String desc, int qty, double unitPrice){
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }
    
    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
    public double getTotal(){
        return getQty()*getUnitPrice();
    }
    public String toString(){
        return id+ " " + desc + " "+ qty + " "+unitPrice;
    }
    public static void main(String[] args) {
        InvoiceItem invoice1 = new InvoiceItem(3, "For Washing", 3, 2500);
        System.out.println(invoice1);
    }
}
