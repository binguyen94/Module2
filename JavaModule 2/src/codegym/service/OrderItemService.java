package codegym.service;

import codegym.config.Config;
import codegym.model.OrderItem;
import codegym.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class OrderItemService implements IOrderItemService{
    private final String pathOrderItem = "D:\\Module2\\JavaModule 2\\src\\codegym\\data\\order_item.txt";
    @Override
    public List<OrderItem> getAllOrderItems() {
        return FileUtils.readFile(pathOrderItem, Config.TYPE_ORDER_ITEM);
    }

    @Override
    public List<OrderItem> getOrderItems(long idOrder) {
        List<OrderItem> orderItems = getAllOrderItems();
        List<OrderItem> results = new ArrayList<>();

        for (OrderItem orderItem : orderItems) {
            if (orderItem.getIdOrder() == idOrder) {
                results.add(orderItem);
            }
        }
        return results;
    }

    @Override
    public void saveOrderItems(List<OrderItem> orderItemsAdd) {
        List<OrderItem> orderItems = getAllOrderItems();

        orderItems.addAll(orderItemsAdd);
        FileUtils.writeFile(pathOrderItem, orderItems);
    }
}
