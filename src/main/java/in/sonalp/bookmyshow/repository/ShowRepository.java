package in.sonalp.bookmyshow.repository;

import in.sonalp.bookmyshow.model.City;
import in.sonalp.bookmyshow.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends JpaRepository<Show, Integer> {
}
