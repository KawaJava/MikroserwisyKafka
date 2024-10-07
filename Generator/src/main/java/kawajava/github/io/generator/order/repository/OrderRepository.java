package kawajava.github.io.generator.order.repository;

import kawajava.github.io.generator.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
