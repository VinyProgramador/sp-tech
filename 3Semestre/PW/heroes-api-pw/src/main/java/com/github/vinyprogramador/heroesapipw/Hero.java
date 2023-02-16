package com.github.vinyprogramador.heroesapipw;

//Nome: Vinicius A Nunes
//RA: 01221125
public class Hero {
    private String name;
    private String ability;
    private Integer age;
    private Double force;
    private Boolean isAlive;

    public Hero(String name, String ability, Integer age, Double force, Boolean isAlive) {
        this.name = name;
        this.ability = ability;
        this.age = age;
        this.force = force;
        this.isAlive = isAlive;
    }

    public Hero() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getForce() {
        return force;
    }

    public void setForce(Double force) {
        this.force = force;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }
}
