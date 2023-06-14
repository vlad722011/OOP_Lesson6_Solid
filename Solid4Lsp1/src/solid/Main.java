package solid;

import solid.lsp.Rectangle;
import solid.lsp.Square;

public class Main {
    public static void main(String[] args) {

        Rectangle square = new Square(16);
        Rectangle rectangle = new Rectangle(3,19);

        System.out.printf("В прямоугольнике сторона A = %d, сторона B = %d\n",
                rectangle.getSideA(), rectangle.getSideB());
        ViewShape viewRectangle = new ViewShape(rectangle);
        viewRectangle.showArea();

        System.out.printf("У квадрата сторона = %d\n",
                square.getSideA());
        ViewShape viewSquare = new ViewShape(square);
        viewSquare.showArea();

    }
}
