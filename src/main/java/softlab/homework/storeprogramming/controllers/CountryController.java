package softlab.homework.storeprogramming.controllers;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import softlab.homework.storeprogramming.entities.Company;
import softlab.homework.storeprogramming.entities.Country;
import softlab.homework.storeprogramming.services.CountryService;
import softlab.homework.storeprogramming.services.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CountryController {
    private final CountryService countryService;
    private final ProductService productService;

    @GetMapping("countries")
    public List<Country>search(String name, String isocode2,Integer id){
        return countryService.search(name,isocode2,id);
    }


    @GetMapping("countries/{id}")
    public  Country country (@PathVariable Integer id){
        return countryService.getCountry(id);
    }

    @GetMapping("countries/{id}/companies")
    public List<Company>countryCompany(@PathVariable Integer id){
        return countryService.getCountryCompany(id);
    }


}
