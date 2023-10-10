package softlab.homework.storeprogramming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import softlab.homework.storeprogramming.entities.UserDomain;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserDomain,Integer> {

   Optional<UserDomain> findAllByUsername(String username);
}
