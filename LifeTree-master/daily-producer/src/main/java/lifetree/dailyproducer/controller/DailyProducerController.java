package lifetree.dailyproducer.controller;

import lifetree.dailyproducer.model.Daily;
import lifetree.dailyproducer.producer.DailyProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DailyProducerController {

    private final DailyProducer dailyProducer;

    public DailyProducerController(DailyProducer dailyProducer) {
        this.dailyProducer = dailyProducer;
    }

    @PostMapping("daily-produce")
    public ResponseEntity createDaily(@RequestBody Daily daily) {
        dailyProducer.sendDaily(daily);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
