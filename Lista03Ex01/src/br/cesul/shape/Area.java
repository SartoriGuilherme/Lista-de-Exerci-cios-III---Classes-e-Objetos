package br.cesul.shape;

public class Area {

    private double side;

    public Area(double side) {
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }
}
