package jp.co.rakuten.mcpd.utils;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jp.co.rakuten.mcpd.utils.model.Order;
import jp.co.rakuten.mcpd.utils.service.OrderService;

import java.util.UUID;

@Path("/orders")
public class OrderResource {

    OrderService orderService;

    @Inject
    public OrderResource(OrderService orderService) {
        this.orderService = orderService;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Order createOrder(Order order) {
        return orderService.create(order);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Order getOrder(String id) {
        return orderService.get(UUID.fromString(id));
    }
}
