package shop.dto;

import shop.dto.goodsTypes.Goods;

public class ShoppingCartElement {

    private Goods productType;

    private int count;

    public ShoppingCartElement(Goods productType, int count) {
        this.productType = productType;
        this.count = count;
    }

    public Goods getProductType() {
        return productType;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "{" + productType +
                ", count = " + count +
                '}';
    }
}
