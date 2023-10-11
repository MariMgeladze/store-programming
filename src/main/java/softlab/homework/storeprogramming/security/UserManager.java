package softlab.homework.storeprogramming.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import softlab.homework.storeprogramming.entities.UserDomain;
import softlab.homework.storeprogramming.repositories.UserRepository;

import java.util.Optional;


@RequiredArgsConstructor
public class UserManager implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
     Optional<UserDomain> users = userRepository.findAllByUsername(username);
        if (users.isEmpty()) {
            throw new RuntimeException("User not found");
        }
        return users.get();
    }
}
