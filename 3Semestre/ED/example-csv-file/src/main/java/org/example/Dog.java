package org.example;

public class Dog {
    private int id;
    private String name;
    private  String port;
    private Double Weight;

    public Dog(int id, String name, String port, Double weight) {
        this.id = id;
        this.name = name;
        this.port = port;
        Weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Double getWeight() {
        return Weight;
    }

    public void setWeight(Double weight) {
        Weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", port='" + port + '\'' +
                ", Weight=" + Weight +
                '}';
    }
}
