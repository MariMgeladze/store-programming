package softlab.homework.storeprogramming.controllers;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import softlab.homework.storeprogramming.entities.Country;
import softlab.homework.storeprogramming.services.CountryService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CountryController {
    private final CountryService countryService;

    @GetMapping("countries")
    public List<Country>search(String name, String isocode2,Integer id){
        return countryService.search(name,isocode2,id);

    }
}
