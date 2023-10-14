package softlab.homework.storeprogramming.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import softlab.homework.storeprogramming.entities.Company;
import softlab.homework.storeprogramming.entities.Product;
import softlab.homework.storeprogramming.models.CreateCompany;
import softlab.homework.storeprogramming.models.ProductCreateModel;
import softlab.homework.storeprogramming.repositories.CompanyRepository;
import softlab.homework.storeprogramming.repositories.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;
    private final ProductRepository productRepository;

    @Override
    public List<Company> search(String name, String countryId, Integer parentId) {
        return companyRepository.findAllByName(name);
    }

    @Override
    public Company getCompany(Integer parentId) {
        return companyRepository.findById(parentId).orElseThrow();
    }

    @Override
    public List<Product> getCompanyProduct(Integer companyId) {
        return productRepository.findAllByCompanyId(companyId);
    }

    @Override
    public Product companyCreateProduct(Integer id, ProductCreateModel productCreateModel) {
        Product product = new Product();
        product.setName(productCreateModel.name());
        product.setId(productCreateModel.companyId());
        product.setCountryId(productCreateModel.countryId());
        product.setEan(productCreateModel.ean());
        productRepository.save(product);
        return product;
    }

    @Override
    public Company createNewCompany(Integer id, CreateCompany createCompany) {
        Company company = new Company();
        company.setId(id);
        company.setName(createCompany.name());
        company.setCountryId(createCompany.countryId());
        company.setParentId(createCompany.parentId());
        companyRepository.save(company);
        return company;
    }
}
