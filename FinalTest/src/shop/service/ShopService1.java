package shop.service;

import shop.dto.goodsTypes.Goods;
import shop.dto.ShoppingCartElement;

import java.util.*;

public class ShopService1 {
    private static List<Goods> storeAssortment = new ArrayList<>();//LIST - ASSORTMENT OF THE STORE

    public void addProductToStore(Goods... product){
        storeAssortment.addAll(Arrays.asList(product));
    }


    public List<Goods> getStoreAssortment(){
        //System.out.println("_______________ASSORTMENT_OF_THE_STORE_______________");//TO PRINT IN TWO COLUMNS IN CASE A LOT OF ELEMENTS IN STORE
        /*for (int i = 0; i <storeAssortment.size() ; i++) {
            System.out.print(" " + storeAssortment.get(i));
            if(i%2==0){
                System.out.println(" ");
            }
        }*/
        return storeAssortment;
    }

    public void checkPlease(List<ShoppingCartElement> cart){
        float total = 0;
        for (ShoppingCartElement element : cart) {
            System.out.println(element);//SALE PRODUCTS
            if (element.getProductType().getFloatSale() != 1){//(PRICE - (PRICE * SALE PERCENT/100)) * COUNT
                total += (element.getProductType().getPrice() - (element.getProductType().getPrice() *(element.getProductType()).getFloatSale())) *element.getCount();
                System.out.println("costs = " + (element.getProductType().getPrice() - (element.getProductType().getPrice() *(element.getProductType()).getFloatSale())) *element.getCount());
            }else{//DEFAULT PRODUCTS
                total += element.getProductType().getPrice() * element.getCount();//PRICE * COUNT
                System.out.println("costs = " + (element.getProductType().getPrice() * element.getCount()));
            }
        }
        System.out.println("Total costs " + total);
    }
}
