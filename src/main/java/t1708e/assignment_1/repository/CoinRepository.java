package t1708e.assignment_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import t1708e.assignment_1.entity.Coin;

import java.util.List;

@Repository
public interface CoinRepository extends JpaRepository<Coin, Long> {
    Coin findByName(String name);

    List<Coin> findByMarket_MarketId(long id);
}
