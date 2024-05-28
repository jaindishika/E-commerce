import Adapter.GPayAdapter;
import Adapter.GooglePay;
import Command.*;
import Decorator.CustomizePackaging;
import Decorator.GiftWrapping;
import Strategy.InternationalShipping;

public class Main {
    public static void main(String[] args) {
//        Add and Update
        var cartBucket = new Cart();
        var ProductItem = new Product("IPhone", 1, 14000);
        var addPhone = new UpdateQuantityCommand(cartBucket, ProductItem);
        addPhone.execute();
        ProductItem = new Product("IPhone", 2, 28000);
        addPhone = new UpdateQuantityCommand(cartBucket, ProductItem);
        addPhone.execute();

//      Remove Item
        var removePhone = new RemoveItemCommand("IPhone", cartBucket);
        removePhone.execute();
        cartBucket.getItems().forEach((key, value) -> {
            System.out.println("Product: " + value.getName() + ", Price: " + value.getPrice());
        });
//      Discount
        var totalDiscount = new DiscountCommand(1000, cartBucket);
        totalDiscount.execute();

//      Decorator Pattern
            var decorativeDevice = new Decorator.Product();
            var giftWrap = new GiftWrapping(decorativeDevice, 80);
            var customPackage = new CustomizePackaging(giftWrap, 100);
            System.out.println("Amount after Packaging : " + customPackage.cost(cartBucket.getTotalBill()));
            cartBucket.setTotalBill(customPackage.cost(cartBucket.getTotalBill()));
//      Strategy Pattern
            var internationalShipping = new InternationalShipping();
            var totalPayment = internationalShipping.calculate(cartBucket.getTotalBill(), 12000);
//      Adapter Pattern
        var GPay = new GooglePay();
        var GpayAdapter = new GPayAdapter(GPay);
        GpayAdapter.integratePaymentGateway(totalPayment);
    }
}