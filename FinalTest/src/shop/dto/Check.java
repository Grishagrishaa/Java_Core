package shop.dto;

import shop.dto.goodsTypes.Goods;

public class Check {
    private Goods ProductDescription;

    private int TotalPrice;

    @Override
    public String toString() {
        return "ProductDescription = " + ProductDescription + ", TotalPrice = " + TotalPrice;
    }
}
