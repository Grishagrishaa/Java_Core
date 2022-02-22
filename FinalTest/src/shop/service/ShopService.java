/*
package shop.service;

import shop.dto.goods.AuctionGoods;
import shop.dto.goods.DiscountedGoods;
import shop.dto.goods.Goods;

import java.util.*;

public class ShopService {
    List<Goods> storeAssortment = new ArrayList<>();//LIST - ASSORTMENT OF THE STORE
    Random rnd = new Random();

    //GOODS NAMES - LOW/HIGH PRICES
    String[] lowPriceGoods = new String[]{"Milk", "Potato", "Juice", "Apples", "Watermelon","Pizza",
            "Sauce", "Hamburger", "Pineapple","Twix","Snickers","Bounty","Cookies","Bread"};
    String[] highPriceGoods = new String[]{"TV", "Computer", "Playstation", "Xbox", "IPhone","IPad",
            "IPod","AirPods","Fridge","MicroWave","Cooker","Sink","Tap"};
    String[] reasons = new String[]{"The packaging was damaged", "Returned by warranty"};//SHOULD BE UPDATED



    public final void getStoreAssortment(){//DEFAULT GOODS
        System.out.println("_______________ASSORTMENT_OF_THE_STORE_______________");
        System.out.println("");
        System.out.println("_________________DEFAULT_GOODS_____________________");
        for (int i = 0; i < rnd.nextInt(60,120) ; i++) {//NAME[INDEX] - PRICE
            List<Goods> defaultGoods = new ArrayList<>();//COPY OF ASSORTMENT ARRAY, ONLY AUCTION GOODS STORED HERE
            defaultGoods.add(new Goods(lowPriceGoods[rnd.nextInt(14)], rnd.nextInt(50)));
            defaultGoods.add(new Goods(highPriceGoods[rnd.nextInt(13)], rnd.nextInt(500)));
            storeAssortment.addAll(defaultGoods);
            System.out.println(defaultGoods);
        }
        System.out.println("_________________AUCTION_GOODS____________________");
        for (int i = 0; i < rnd.nextInt(50,100) ; i++){//NAME[INDEX] - PRICE - SALE PERCENT
            List<Goods> auctionGoods = new ArrayList<>();//COPY OF ASSORTMENT ARRAY, ONLY AUCTION GOODS STORED HERE
            auctionGoods.add(new AuctionGoods(lowPriceGoods[rnd.nextInt(14)], rnd.nextInt(25),rnd.nextInt(50)));
            auctionGoods.add(new AuctionGoods(highPriceGoods[rnd.nextInt(13)], rnd.nextInt(500),rnd.nextInt(50)));
            storeAssortment.addAll(auctionGoods);
            System.out.println(auctionGoods);
        }
        System.out.println("_________________DISCOUNTED_GOODS_________________");
        for (int i = 0; i < rnd.nextInt(10,50) ; i++){//NAME[INDEX] - PRICE - SALE PERCENT - REASON OF DISCOUNT
            List<Goods> discountedGoods = new ArrayList<>();//COPY OF ASSORTMENT ARRAY, ONLY AUCTION GOODS STORED HERE
            discountedGoods.add(new DiscountedGoods(lowPriceGoods[rnd.nextInt(14)], rnd.nextInt(25),rnd.nextInt(50),reasons[rnd.nextInt(2)]));
            discountedGoods.add(new DiscountedGoods(highPriceGoods[rnd.nextInt(13)], rnd.nextInt(500),rnd.nextInt(50),reasons[rnd.nextInt(2)]));
            storeAssortment.addAll(discountedGoods);
            System.out.println(discountedGoods);
        }
    }

    public void getShoppingCart(){
        Scanner scn = new Scanner(System.in);
        List<Goods> shoppingCart = new ArrayList<>();
        System.out.println("SHOPPING CART IS EMPTY! CHOOSE SOMETHING! ");
        while(true){
            System.out.println("ENTER PRODUCT YOU NEED AND PRICE WITH SPACE");
            String name = scn.next();
            if(name.equalsIgnoreCase("Check")) {
                System.out.println("stop");
                System.out.println(shoppingCart);
                break;
            }
            int price = Integer.parseInt(scn.next());
            System.out.print("loading...");
            for (Goods product : storeAssortment) {
                if(product.getName().equalsIgnoreCase(name) && product.getPrice() == price){
                    shoppingCart.add(product);
                    System.out.println("WE GOT IT");
                    break;
                }
            }
        }
    }
}
*/
