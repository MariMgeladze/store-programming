package softlab.homework.storeprogramming.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

@Setter
@Getter
@Entity
@Table(schema = "public", name = "users")
public class UserDomain implements UserDetails {

    @Id
    private Integer id;

    @Column(name = "email")
    private String username;

    private Boolean active;

    private String password;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return new ArrayList<>();
    }

 //   @Override
   // public String getUsername() {
     //   return null;
    //}

    @Override
    public boolean isAccountNonExpired() {
        return Objects.equals(active,Boolean.TRUE);
    }

    @Override
    public boolean isAccountNonLocked() {
        return Objects.equals(active,Boolean.TRUE);
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return Objects.equals(active,Boolean.TRUE);
    }

    @Override
    public boolean isEnabled() {
        return Objects.equals(active,Boolean.TRUE);
    }
}
