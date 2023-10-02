package softlab.homework.storeprogramming.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(schema = "public", name ="products")
public class Product {
    @Id
    private Integer id;
    private String ean;
    private String name;
    @Column(name = "company_id")
    private Integer companyId;
    @Column(name = "country_id")
    private Integer countryId;


}
