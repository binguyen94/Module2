package codegym.service;

import codegym.model.Order;

import java.util.List;

public interface IOrderService {
    List<Order> getAllOrders();
    Order findOrder(long idOrder);
    void saveOrder(Order order);
}
