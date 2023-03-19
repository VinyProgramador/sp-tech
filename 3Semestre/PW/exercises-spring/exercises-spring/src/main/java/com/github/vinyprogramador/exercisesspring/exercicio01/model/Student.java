package com.github.vinyprogramador.exercisesspring.exercicio01.model;

public class Student {
    private String student;
    private int id;
    private double n1;
    private double n2;

    public Student(String student, int id, double n1, double n2) {
        this.student = student;
        this.id = id;
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public Double getAverage(){
        return  (getN1() + getN2())/2;
    }
}
