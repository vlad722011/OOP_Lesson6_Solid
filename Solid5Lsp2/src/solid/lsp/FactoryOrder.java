package solid.lsp;

public class FactoryOrder {

    private int count = 0;

    // Каждый 3-й заказ - бонусный
    public OrderAbstract create(int qnt, int price) {
        count++;
        if (count == 3){
            count = 0;
            price = 0;
            return new OrderBonus(qnt, price);
        }
        return new Order(qnt, price);
    }
}
