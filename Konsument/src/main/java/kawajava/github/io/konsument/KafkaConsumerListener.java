package kawajava.github.io.konsument;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerListener {

    @KafkaListener(topics = "general-topic", groupId = "consumer-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
    @KafkaListener(topics = "order-topic", groupId = "order_group")
    public void consumeOrder(String order) {
        System.out.println("Received Order: " + order);
    }
}
