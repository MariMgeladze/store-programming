package softlab.homework.storeprogramming.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import softlab.homework.storeprogramming.entities.Company;
import softlab.homework.storeprogramming.entities.Product;
import softlab.homework.storeprogramming.repositories.ProductRepository;
import softlab.homework.storeprogramming.services.CompanyService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;
    private final ProductRepository productRepository;

    @GetMapping("companies")
    public List<Company> search(String name, String countryId,Integer id){
    return companyService.search(name,countryId,id);
    }

    @GetMapping("companies/{id}")
    public Company company(@PathVariable Integer id){
        return companyService.getCompany(id);
    }

    @GetMapping("companies/{id}/products")
    public List<Product>companyProduct(@PathVariable Integer id){
        return companyService.getCompanyProduct(id);
    }
}
