package org.example;

//Nome: Vinicius A Nunes
//RA: 01221125
public class Dvd extends Product {
    private String name;
    private String recordCompany;

    public Dvd(Integer code, Double priceCost, String name, String recordCompany) {
        super(code, priceCost);
        this.name = name;
        this.recordCompany = recordCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecordCompany() {
        return recordCompany;
    }

    public void setRecordCompany(String recordCompany) {
        this.recordCompany = recordCompany;
    }

    @Override
    public Double getSaleValue() {
        return (getPriceCost() * 0.20) + getPriceCost();
    }

    @Override
    public String toString() {
        return "Dvd = " +
                "name = " + name + '\'' +
                ", recordCompany = " + recordCompany + '\'' +
                ", SaleValue = " + getSaleValue() + "\n" +
                super.toString();
    }
}
