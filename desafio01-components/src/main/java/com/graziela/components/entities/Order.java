package com.graziela.components.entities;

public class Order {
    private Integer code;
    private Double basicPrice;
    private Double discount;

    public Order(Integer code, Double basicPrice, Double discount) {
        this.code = code;
        this.basicPrice = basicPrice;
        this.discount = discount;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(Double basicPrice) {
        this.basicPrice = basicPrice;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
