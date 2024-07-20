package jp.co.rakuten.mcpd.utils.service;

import jakarta.enterprise.context.ApplicationScoped;
import jp.co.rakuten.mcpd.utils.model.Order;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@ApplicationScoped
class OrderServiceImpl implements OrderService {
    private Map<UUID, Order> orderStore = new HashMap<>();

    @Override
    public Order create(Order order) {
        order.setId(UUID.randomUUID());
        orderStore.put(order.getId(), order);
        return order;
    }

    @Override
    public Order get(UUID id) {
        return orderStore.get(id);
    }
}
