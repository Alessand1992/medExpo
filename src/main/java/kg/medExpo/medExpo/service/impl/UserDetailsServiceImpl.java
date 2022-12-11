package kg.medExpo.medExpo.service.impl;

import kg.medExpo.medExpo.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@AllArgsConstructor
@Service("userDetailServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


            kg.medExpo.medExpo.model.User user = userRepo.findByLogin(username).orElseThrow(() -> new UsernameNotFoundException("Login not found : " + username));
            GrantedAuthority authority = new SimpleGrantedAuthority(user.getRole().getRole());
            return new User(user.getLogin(), user.getPassword(), Arrays.asList(authority));

    }
}

