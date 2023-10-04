package softlab.homework.storeprogramming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import softlab.homework.storeprogramming.entities.Country;

public interface CountryRepository extends JpaRepository<Country,Integer> {
}
