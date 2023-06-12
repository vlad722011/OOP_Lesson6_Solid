package solid;

import solid.srp.Point;
import solid.srp.Square;

public class Main {
    public static void main(String[] args) {
        int side = 5;
        Square square = new Square(side);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        square.draw();
        square.zoom(1.5f);
        System.out.printf("\nПлощадь фигуры: %d \n", square.getArea());
        square.draw();
    }
}
