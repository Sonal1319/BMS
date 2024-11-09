package in.sonalp.bookmyshow.repository;

import in.sonalp.bookmyshow.model.Actor;
import in.sonalp.bookmyshow.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {
}
