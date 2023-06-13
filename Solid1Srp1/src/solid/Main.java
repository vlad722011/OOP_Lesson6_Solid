package solid;

import solid.srp.SquareCalculation;
import solid.srp.SquareView;

public class Main {
    public static void main(String[] args) {
        int side = 5;
        SquareView square = new SquareView(side);
        System.out.printf("Площадь фигуры: %d \n", SquareCalculation.getArea(side));
        square.draw();
        square.zoom(1.5f);
        System.out.printf("\nПлощадь фигуры: %d \n", SquareCalculation.getArea(side));
        square.draw();
    }
}
