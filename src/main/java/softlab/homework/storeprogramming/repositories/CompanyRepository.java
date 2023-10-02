package softlab.homework.storeprogramming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import softlab.homework.storeprogramming.entities.Company;

public interface CompanyRepository extends JpaRepository<Company,Integer> {
}
