package softlab.homework.storeprogramming.services;

import softlab.homework.storeprogramming.entities.Company;
import softlab.homework.storeprogramming.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> search(String name, String ean,Integer companyId, Integer id);

    List<Product> search(String name, Integer companyId, Integer id);

    Product getProduct(Integer id);
}
