package org.example;

//Nome: Vinicius A Nunes
//RA: 01221125
public class Service implements Salable {

    private String description;
    private Integer code;
    private Double amountHours;

    private Double hourValue;

    public Service(String description, Integer code, Double amountHours, Double hourValue) {
        this.description = description;
        this.code = code;
        this.amountHours = amountHours;
        this.hourValue = hourValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getAmountHours() {
        return amountHours;
    }

    public void setAmountHours(Double amountHours) {
        this.amountHours = amountHours;
    }

    public Double getHourValue() {
        return hourValue;
    }

    public void setHourValue(Double hourValue) {
        this.hourValue = hourValue;
    }

    @Override
    public Double getSaleValue() {
        return (this.amountHours * this.hourValue);
    }

    @Override
    public String toString() {
        return "Service = " +
                "description = " + description + '\'' +
                ", code= " + code +
                ", amountHours = " + amountHours +
                ", hourValue = " + hourValue;
    }
}
