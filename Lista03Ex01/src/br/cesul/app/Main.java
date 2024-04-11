package br.cesul.app;

import br.cesul.shape.Area;
import br.cesul.shape.Perimeter;

public class Main {
    public static void main(String[] args) {
        Area area = new Area(5);
        System.out.println("A area do quadrado é: " + area.getArea());

        Perimeter perimeter = new Perimeter(5);
        System.out.println("O perimetro do quadrado é: " + perimeter.getPerimeter());
    }
}



