package com.github.vinyprogramador.project03;

public class Music {
    private String name;
    private Integer year;
    private Boolean isNational;

    public Music(String name, Integer year, Boolean isNational) {
        this.name = name;
        this.year = year;
        this.isNational = isNational;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Boolean getNational() {
        return isNational;
    }

    public void setNational(Boolean national) {
        isNational = national;
    }
}
