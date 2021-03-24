package lifetree.dailyproducer.producer;

import lifetree.dailyproducer.model.Daily;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class DailyProducer {

    @Value("${kafka.topic.name}")
    private String topicName;

    private KafkaTemplate<String, Daily> kafkaTemplate;

    public DailyProducer(KafkaTemplate<String, Daily> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendDaily(Daily daily) {
        kafkaTemplate.send(topicName, daily);
    }
}
