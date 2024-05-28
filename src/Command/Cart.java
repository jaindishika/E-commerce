package Command;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<String, Product> items = new HashMap<>();

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    private double totalBill = 0.0;
    public void setItems(Map<String, Product> items) {
        this.items = items;
    }

    public Map<String, Product> getItems() {
        return items;
    }
}
