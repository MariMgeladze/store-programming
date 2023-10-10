package softlab.homework.storeprogramming.models;

import jakarta.persistence.Column;



public record ProductCreateModel(String ean,String name,Integer companyId,Integer countryId) { }
