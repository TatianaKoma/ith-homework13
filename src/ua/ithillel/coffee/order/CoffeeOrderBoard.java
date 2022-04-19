package ua.ithillel.coffee.order;

import java.util.LinkedList;
import java.util.ListIterator;

public class CoffeeOrderBoard {
    public LinkedList<Order> add(String[] names, LinkedList<Order> listOfOrders) {

        for (int i = 0; i < names.length; i++) {
            Order order = new Order(i + 1, names[i]);
            listOfOrders.add(order);
        }
        return listOfOrders;
    }

    public void deliver(LinkedList<Order> listOfOrders) {
        listOfOrders.poll();
    }

    public void deliverByNumber(int orderNumber, LinkedList<Order> listOfOrders) {
        for (int i = 0; i < listOfOrders.size(); i++) {
            if (listOfOrders.get(i).getId() == orderNumber) {
                listOfOrders.remove(listOfOrders.get(i));
            }
        }
    }

    public void draw(LinkedList<Order> listOfOrders) {
        System.out.println("__________");
        System.out.println("Num" + " | " + "Name");

        ListIterator<Order>
                iterator = listOfOrders.listIterator(0);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
