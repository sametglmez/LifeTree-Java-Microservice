package lifetree.dailyconsumer.service;

import lifetree.dailyconsumer.model.Daily;
import lifetree.dailyconsumer.repository.DailyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DailyImporter {

    private final DailyRepository dailyRepository;

    public void insert(Daily daily) {
        dailyRepository.insert(daily);
    }
}
