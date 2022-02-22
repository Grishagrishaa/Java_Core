package shop.runners;

import shop.dto.goodsTypes.AuctionGoods;
import shop.dto.goodsTypes.DiscountedGoods;
import shop.dto.goodsTypes.Goods;
import shop.service.ShopService1;
import shop.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        ShopService1 shop = new ShopService1();
        ShoppingCart cart = new ShoppingCart();


        shop.addProductToStore(
                new Goods("Milk",21),
                new AuctionGoods("Orange",23,5),
                new DiscountedGoods("Water",6,50,"Damaged")
        );
        System.out.println("_____________________STORE_ASSORTMENT_____________________");
        System.out.println(shop.getStoreAssortment());


        cart.take("Milk",3);
        cart.take("Orange",5);
        cart.take("Water",2);


        shop.checkPlease(cart.showCart());
    }
}
