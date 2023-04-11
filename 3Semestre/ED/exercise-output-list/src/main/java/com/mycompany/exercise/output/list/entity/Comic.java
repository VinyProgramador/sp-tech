package com.mycompany.exercise.output.list.entity;
//Nome: Vinicius A Nunes
//RA:01221125

import java.time.LocalDate;

public class Comic {
    private Integer id;
    private Integer soldAmount;
    private String name;
    private Double price;
    private String writer;
    private boolean isGraphiNovel;
    private String distributor;

    public Comic(Integer id, Integer soldAmount, String name, Double price, String writer, Boolean isGraphiNovel, String distributor) {
        this.id = id;
        this.soldAmount = soldAmount;
        this.name = name;
        this.price = price;
        this.writer = writer;
        this.isGraphiNovel = isGraphiNovel;
        this.distributor = distributor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(Integer soldAmount) {
        this.soldAmount = soldAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public boolean isIsGraphiNovel() {
        return isGraphiNovel;
    }

    public void setIsGraphiNovel(boolean isGraphiNovel) {
        this.isGraphiNovel = isGraphiNovel;
    }
    

    public void setIsGraphiNovel(Boolean isGraphiNovel) {
        this.isGraphiNovel = isGraphiNovel;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    
}


