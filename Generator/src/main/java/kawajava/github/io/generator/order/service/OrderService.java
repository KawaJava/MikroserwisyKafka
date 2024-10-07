package kawajava.github.io.generator.order.service;

import kawajava.github.io.generator.order.model.Order;
import kawajava.github.io.generator.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }
}
