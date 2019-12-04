package com.company;

public class Triangle extends Figures implements Printable{

    private int sideA;
    private int sideB;
    private int sideC;


    public Triangle(String name, int sideA, int sideB, int sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void print() {
        System.out.println(getName() + " " + "со сторонами " + sideA + " " + sideB + " " + sideC);

    }
}
