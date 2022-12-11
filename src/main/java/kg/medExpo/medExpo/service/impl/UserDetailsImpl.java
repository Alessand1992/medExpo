package kg.medExpo.medExpo.service.impl;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kg.medExpo.medExpo.model.Role;
import kg.medExpo.medExpo.model.User;
import kg.medExpo.medExpo.repo.RoleRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class UserDetailsImpl implements UserDetails {

    private static final long serialVersionUID = 1L;
    private String fullName;
    private String login;
    private String role;
    @JsonIgnore
    private String password;
    private static RoleRepo roleRepo;
    private Collection<? extends GrantedAuthority> authorities;

    public static UserDetailsImpl build(User user){

        List<GrantedAuthority> authorities1 = Collections.singletonList(new SimpleGrantedAuthority(user.getRole().toString()));

        return new UserDetailsImpl(
                user.getFullName(),
                user.getLogin(),
                user.getPassword(),
                user.getRole().toString(),
                authorities1);

    }
    public List<SimpleGrantedAuthority> getAuthorities(List<Role> roles){
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getRole())).collect(Collectors.toList());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
