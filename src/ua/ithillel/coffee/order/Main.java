package ua.ithillel.coffee.order;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Order> listOfOrders = new LinkedList<>();
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        String[]names = {"Tom","Rick","Alice","Robert","Maria"};
        coffeeOrderBoard.add(names,listOfOrders);
        coffeeOrderBoard.draw(listOfOrders);
        coffeeOrderBoard.deliver(listOfOrders);
        coffeeOrderBoard.draw(listOfOrders);
        coffeeOrderBoard.deliverByNumber(5,listOfOrders);
        coffeeOrderBoard.draw(listOfOrders);
    }
}
