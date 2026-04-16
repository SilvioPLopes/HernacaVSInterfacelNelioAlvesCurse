package application;

import model.entitites.AbstractShape;
import model.entitites.Cicle;
import model.entitites.Rectangle;
import model.enums.Color;

public class Program {

    public static void main(String[] args) {

        AbstractShape circle = Cicle.builder().color(Color.BLACK).radius(2.0).build();
        AbstractShape rectangle = Rectangle.builder().color(Color.WHITE).width(3.0).height(4.0).build();

        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle area: " + String.format("%.3f", circle.area()));
        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", rectangle.area()));
    }
}