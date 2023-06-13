package solid.srp;

public class SquareCalculation {
    private int side;

    public static int getArea(int side) {
        return side * side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
}
