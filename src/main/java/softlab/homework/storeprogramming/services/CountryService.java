package softlab.homework.storeprogramming.services;

import softlab.homework.storeprogramming.entities.Country;

import java.util.List;

public interface CountryService {
    List<Country> search(String name, String isocode2, Integer id);
}
