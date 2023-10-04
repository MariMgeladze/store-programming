package softlab.homework.storeprogramming.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import softlab.homework.storeprogramming.entities.Product;
import softlab.homework.storeprogramming.repositories.ProductRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    @Override
    public List<Product> search(String name, String ean, Integer companyId, Integer id) {
        return productRepository.findAllByName(name);
    }

    @Override
    public List<Product> search(String name, Integer companyId, Integer id) {
        return null;
    }

    @Override
    public Product getProduct(Integer id) {
        return productRepository.findById(id).orElseThrow();
    }
}
