package shop.service;
import shop.dto.goodsTypes.Goods;
import shop.dto.ShoppingCartElement;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    ShopService1 shop = new ShopService1();

    List<ShoppingCartElement> shoppingCart = new ArrayList<>();
    List<Goods> a = shop.getStoreAssortment();

    public void take (String productName, int count){
        for (Goods ListElement : a) {
            if(ListElement.getName().equalsIgnoreCase(productName)){
                shoppingCart.add(new ShoppingCartElement(ListElement,count));
                System.out.println("GOT IT!");
                return;
            }
        }
        System.out.println("WE DON`T HAVE THIS ITEM, SORRY");
    }
    public List<ShoppingCartElement> showCart(){
        System.out.println("Your cart contains: " + shoppingCart);
        return shoppingCart;
    }
}
