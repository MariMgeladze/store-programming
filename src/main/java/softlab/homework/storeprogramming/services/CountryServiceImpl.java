package softlab.homework.storeprogramming.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import softlab.homework.storeprogramming.entities.Country;
import softlab.homework.storeprogramming.repositories.CountryRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;
    @Override
    public List<Country> search(String name, String isocode2, Integer id) {
        return countryRepository.findAll() ;
    }
}
