package kawajava.github.io.generator;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProducerController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "general-topic";

    @GetMapping
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/publish")
    public String sendMessage(@RequestParam("message") String message) {
        kafkaTemplate.send(TOPIC, message);
        return "Message sent to Kafka topic";
    }
}
