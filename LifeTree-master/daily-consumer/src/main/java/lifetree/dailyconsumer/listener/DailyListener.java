package lifetree.dailyconsumer.listener;

import lifetree.dailyconsumer.model.Daily;
import lifetree.dailyconsumer.service.DailyImporter;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DailyListener {

    private final DailyImporter dailyImporter;

    @KafkaListener(topics = "daily-topic")
    void listener(Daily daily) {
        System.out.println("Message :" + daily);
        dailyImporter.insert(daily);
    }
}
