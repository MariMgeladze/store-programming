package softlab.homework.storeprogramming.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema = "public", name = "companies")
public class Company {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="company_seq_gen")
    @SequenceGenerator(name="company_seq_gen", sequenceName="companies_id_seq",allocationSize = 1)
    private Integer id;

    private String name;
    @Column(name = "parent_id")
    private Integer parentId;
    @Column(name = "country_id")
    private String countryId;
}
