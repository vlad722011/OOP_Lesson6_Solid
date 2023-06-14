package solid.lsp;

public class Order extends OrderAbstract {

    public Order(int qnt, int price) {
       super(qnt, price);
    }

    public int getAmount() {
        return super.qnt * super.price;
    }

    @Override
    public String toString() {
        return String.format("Количество = %d, Цена = %d", qnt, price);
    }
}
