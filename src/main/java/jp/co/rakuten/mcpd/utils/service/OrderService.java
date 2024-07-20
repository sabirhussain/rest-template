package jp.co.rakuten.mcpd.utils.service;

import jp.co.rakuten.mcpd.utils.model.Order;

import java.util.UUID;

public interface OrderService {
    Order create(Order order);

    Order get(UUID id);
}
