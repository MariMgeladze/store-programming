package softlab.homework.storeprogramming.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import softlab.homework.storeprogramming.entities.Company;
import softlab.homework.storeprogramming.entities.Product;
import softlab.homework.storeprogramming.repositories.CompanyRepository;
import softlab.homework.storeprogramming.repositories.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;
    private final ProductRepository productRepository;

    @Override
    public List<Company> search(String name, String countryId, Integer parentId) {
        return companyRepository.findAll();
    }

    @Override
    public Company getCompany(Integer parentId) {
        return companyRepository.findById(parentId).orElseThrow();
    }

    @Override
    public List<Product> getCompanyProduct(Integer id) {
        return productRepository.findAllById(id);
    }
}
