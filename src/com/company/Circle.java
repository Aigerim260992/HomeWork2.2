package com.company;

public class Circle extends Figures implements Printable{

    private int r;

    public Circle(String name, int r) {
        super(name);
        this.r = r;
    }

    @Override
    public void print() {
        System.out.println(getName() + " " + "радиусом " + r);
    }
}
