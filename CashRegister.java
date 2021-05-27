public class CashRegister {
    
    private int item;
    private double total;

    public CashRegister() {
        item = 0;
        total = 0;
    }

    public void clear() {
        item = 0;
        total = 0;
    }

    public void addItem(double price) {
        item++;
        total+= price;
    }

    public double getTotal() {
        return total;
    }

    public int getCount() {
        return item;
    }

}