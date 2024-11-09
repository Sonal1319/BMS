package in.sonalp.bookmyshow.repository;

import in.sonalp.bookmyshow.model.City;
import in.sonalp.bookmyshow.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Integer> {
}
