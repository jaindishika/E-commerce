package Command;
import java.util.Map;

public class OperationCommand {
    public Cart removeItem(Cart cart, String name){
        Map<String, Product> items = cart.getItems();
        if (items.containsKey(name)){
            if (items.get(name).getQuantity() > 1){
                var quantity = items.get(name).getQuantity();
                double price = items.get(name).getPrice();
                price -= items.get(name).getPrice()/quantity;
                items.get(name).setPrice(price);
                quantity -= 1;
                items.get(name).setQuantity(quantity);
            }
            else{
                items.remove(name);
            }
            var totalBill =  cart.getTotalBill();
            totalBill -= items.get(name).getPrice();
            cart.setTotalBill(totalBill);
        }
        return cart;
    }
    public Cart updateItem(Cart cart, Product product){
        Map<String, Product> items = cart.getItems();
        if(items.containsKey(product.getName())){
            double price = items.get(product.getName()).getPrice();
            var quantity = items.get(product.getName()).getQuantity();
            price += product.getPrice()*quantity;
            product.setPrice(price);
            quantity += product.getQuantity();
            product.setQuantity(quantity);
        }
        var totalBill =  cart.getTotalBill();
        totalBill += product.getPrice();
        cart.setTotalBill(totalBill);
        items.put(product.getName(), product);
        return cart;
    }
    public void discount(Cart cart, double discount){
        var price = cart.getTotalBill()-discount;
        cart.setTotalBill(price);
    }

}
