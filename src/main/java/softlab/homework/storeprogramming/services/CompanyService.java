package softlab.homework.storeprogramming.services;

import jakarta.persistence.criteria.CriteriaBuilder;
import softlab.homework.storeprogramming.entities.Company;
import softlab.homework.storeprogramming.entities.Product;
import softlab.homework.storeprogramming.models.CreateCompany;
import softlab.homework.storeprogramming.models.ProductCreateModel;

import java.util.List;

public interface CompanyService {
    List<Company> search(String name, String countryId, Integer id);
Company getCompany(Integer id);

    List<Product> getCompanyProduct(Integer id);


    Product companyCreateProduct(Integer id, ProductCreateModel productCreateModel);

    Company createNewCompany(Integer id, CreateCompany createCompany);
}
