package shop.dto.goodsTypes;

public class DiscountedGoods extends AuctionGoods {
    private String DiscountReason;
    private int localSaleField;

    public DiscountedGoods(String name, int price, int salePercent, String discountReason) {
        super(name, price, salePercent);
        this.localSaleField = salePercent;
        this.DiscountReason = discountReason;
    }

    @Override
    public String toString() {
        return "Discounted Product {"+ getName() + ", Price = " + getPrice() + ", Sale = "+ getSale() + ", Discount Reason - " + DiscountReason + "}";
    }

    @Override
    public float getFloatSale() {
        return localSaleField/100f;
    }
}
