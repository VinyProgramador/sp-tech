package org.example;

//Nome: Vinicius A Nunes
//RA: 01221125
public abstract class Product implements Salable {
    private Integer code;
    private Double priceCost;

    public Product(Integer code, Double priceCost) {
        this.code = code;
        this.priceCost = priceCost;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getPriceCost() {
        return priceCost;
    }

    public void setPriceCost(Double priceCost) {
        this.priceCost = priceCost;
    }

    @Override
    public String toString() {
        return "Product = " +
                "code = " + code +
                ", priceCost = " + priceCost;
    }
}
