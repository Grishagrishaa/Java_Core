package shop.dto.goodsTypes;

public class Goods {
    protected String name;
    private int price;

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product {" + name + ", Price = " + price + '}';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public float getFloatSale() {
        return 1;
    }
}
