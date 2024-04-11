package br.cesul.shape;

public class Perimeter {

    private double side;

    public Perimeter(double side) {
        this.side = side;
    }

    public double getPerimeter() {
        return side * 4;
    }

}