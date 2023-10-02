package softlab.homework.storeprogramming.services;

import jakarta.persistence.criteria.CriteriaBuilder;
import softlab.homework.storeprogramming.entities.Company;
import softlab.homework.storeprogramming.entities.Product;

import java.util.List;

public interface CompanyService {
    List<Company> search(String name, String countryId, Integer id);
Company getCompany(Integer id);

    List<Product> getCompanyProduct(Integer id);
}
