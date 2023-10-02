package softlab.homework.storeprogramming.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema = "public", name = "companies")
public class Company {
    @Id
    @Column(name = "id")
    private Integer id;

    private String name;
    @Column(name = "parent_id")
    private Integer parentId;
    @Column(name = "country_id")
    private String countryId;
}
