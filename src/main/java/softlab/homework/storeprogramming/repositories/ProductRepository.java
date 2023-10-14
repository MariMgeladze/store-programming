package softlab.homework.storeprogramming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import softlab.homework.storeprogramming.entities.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findAllByName(String name);

    List<Product> findAllByCompanyId(Integer id);
}
