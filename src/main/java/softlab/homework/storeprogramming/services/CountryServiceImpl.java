package softlab.homework.storeprogramming.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import softlab.homework.storeprogramming.entities.Company;
import softlab.homework.storeprogramming.entities.Country;
import softlab.homework.storeprogramming.repositories.CompanyRepository;
import softlab.homework.storeprogramming.repositories.CountryRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;
    private final CompanyRepository companyRepository;
    @Override
    public List<Country> search(String name, String isocode2, Integer id) {
        return countryRepository.findAll() ;
    }

    @Override
    public Country getCountry(Integer id) {
        return countryRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Company> getCountryCompany(Integer id) {
        return companyRepository.findAllById(id);
    }
}
