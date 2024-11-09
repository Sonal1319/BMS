package in.sonalp.bookmyshow.repository;

import in.sonalp.bookmyshow.model.Auditorium;
import in.sonalp.bookmyshow.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditoriumRepository extends JpaRepository<Auditorium, Integer> {
}
