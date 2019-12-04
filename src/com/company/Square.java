package com.company;

public class Square extends Figures implements Printable{

    private int sideA;

    public Square(String name, int sideA) {
        super(name);
        this.sideA = sideA;
    }

    @Override
    public void print() {
        System.out.println(getName() + " " + "площадью " + " "  + sideA);

    }
}
