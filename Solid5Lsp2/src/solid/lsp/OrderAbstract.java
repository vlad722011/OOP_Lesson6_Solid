package solid.lsp;

public abstract class OrderAbstract {
    protected int qnt;
    protected int price;

    public OrderAbstract(int qnt, int price) {
        this.qnt = qnt;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Количество = %d, Цена = %d", qnt, price);
    }

    public abstract int getAmount() ;
}
