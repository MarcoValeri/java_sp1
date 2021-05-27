public class CashRegisterP816 {
    
    private double[] item;
    private double total;
    private int count;

    public CashRegisterP816(int numberOfItems) {
        item = new double[numberOfItems];
        total = 0;
        count = 0;
    }

    public void clear() {
        
        for (int i = 0; i < count; i++) {
            item[i] = 0;
        }

        total = 0;
        count = 0;

    }


    public void addItem(double price) {
        
        if (price > 0 && count < item.length) {
            item[count] = price;
            count++;
            total+= price;
        }

    }

    public double getTotal() {
        return total;
    }

    public int getCount() {
        return count;
    }

    public void cancelLast() {

        if (count > 0) {
            count--;
            total-= item[count];
            item[count] = 0;
        } 
        
    }

    public void displayAll() {
        for (int i = 0; i < count; i++) {
            System.out.println("Item " + (i + 1) + ": " + item[i]);
        }
    }

}
