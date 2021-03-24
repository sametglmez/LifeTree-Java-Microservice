package lifetree.dailyconsumer.repository;

import lifetree.dailyconsumer.model.Daily;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DailyRepository extends MongoRepository<Daily, String> {
}
