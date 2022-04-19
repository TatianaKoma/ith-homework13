package ua.ithillel.coffee.order;

import java.util.Objects;

public class Order {
    private int id;
    private String customerName;

    public Order(int id, String customerName) {
        this.id = id;
        this.customerName = customerName;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Objects.equals(customerName, order.customerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerName);
    }

    @Override
    public String toString() {
        return id + "   | " + customerName;
    }


}
