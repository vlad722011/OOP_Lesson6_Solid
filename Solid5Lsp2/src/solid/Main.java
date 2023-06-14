package solid;

import solid.lsp.FactoryOrder;
import solid.lsp.OrderAbstract;

public class Main {
    public static void main(String[] args) {
        FactoryOrder creator = new FactoryOrder();
        OrderCalculator calculator = new OrderCalculator();
        calculator.add(creator.create(3, 2));
        calculator.add(creator.create(1, 3));
        calculator.add(creator.create(4, 1));
        calculator.add(creator.create(7, 5));
        calculator.add(creator.create(2, 13));
        calculator.add(creator.create(9, 6));
        calculator.add(creator.create(4, 4));

        System.out.println("Каждый третий заказ - в подарок! Каждый третий заказ - БЕСПЛАТНО!!!");

        for (OrderAbstract order : calculator) {
            System.out.println(order);
        }

        System.out.printf("Сумма заказа %d", calculator.calcAmount());
    }
}