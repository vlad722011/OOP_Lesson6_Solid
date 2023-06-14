package solid.lsp;

public class Square extends Rectangle implements GetArea {

    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setSideA(int sideA) {
        super.setSideA(sideA);
    }

    @Override
    public Double getArea() {
        return (Double) Math.pow(getSideA(), 2);
    }
}
