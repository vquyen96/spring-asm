package t1708e.assignment_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import t1708e.assignment_1.entity.Market;

@Repository
public interface MarketRepository extends JpaRepository<Market, Long> {
    Market findByName(String name);
}
