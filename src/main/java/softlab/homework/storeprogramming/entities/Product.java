package softlab.homework.storeprogramming.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(schema = "public", name ="products")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="products_seq_gen")
    @SequenceGenerator(name="products_seq_gen", sequenceName="products_id_seq",allocationSize = 1)
    private Integer id;
    private String ean;
    private String name;
    @Column(name = "company_id")
    private Integer companyId;
    @Column(name = "country_id")
    private Integer countryId;


}
