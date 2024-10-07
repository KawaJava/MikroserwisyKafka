package kawajava.github.io.generator.order.controller;

import kawajava.github.io.generator.order.model.Order;
import kawajava.github.io.generator.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;
    private final KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "order-topic";

    @PostMapping("/create")
    public Order createOrder(@RequestBody Order order) {
        kafkaTemplate.send(TOPIC, order.toString());
        return orderService.createOrder(order);
    }
}
