package solid;

import solid.lsp.Rectangle;

public class ViewShape {
    private Rectangle figure;

    public ViewShape(Rectangle rectangle) {
        this.figure = rectangle;
    }

    public void showArea() {
        System.out.print("Площадь фигуры равна: ");
        System.out.println(figure.getArea());
    }
}
