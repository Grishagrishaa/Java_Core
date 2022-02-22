package shop.dto.goodsTypes;

public class AuctionGoods extends Goods {
    private int salePercent;

    public AuctionGoods(String name, int price,int salePercent) {
        super(name, price);
        this.salePercent = salePercent;
    }

    @Override
    public String toString() {
        return "Auction Product{" + getName() + ", Price " + getPrice() + ", Sale = " + salePercent +
                '}';
    }

    public int getSale() {
        return salePercent;
    }

    public float getFloatSale() {
        return salePercent/100f;
    }
}
