package kg.medExpo.medExpo.service.impl;

import kg.medExpo.medExpo.model.Role;
import kg.medExpo.medExpo.model.User;
import kg.medExpo.medExpo.model.dto.AuthDto;
import kg.medExpo.medExpo.model.dto.UserDto;
import kg.medExpo.medExpo.repo.RoleRepo;
import kg.medExpo.medExpo.repo.UserRepo;
import kg.medExpo.medExpo.security.JwtTokenProvider;
import kg.medExpo.medExpo.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final AuthenticationManager authenticationManager;
    private JwtTokenProvider jwtTokenProvider;
    private PasswordEncoder passwordEncoder;
    private UserRepo userRepo;
    private RoleRepo roleRepo;

    @Override
    public User createUser(UserDto userDto) throws Exception {
        if(userRepo.findByLogin(userDto.getLogin()).isPresent()){
            throw new Exception("User is exist");
        }

        User user = new User();
        user.setFullName(userDto.getFullName());
        user.setCreatedDate(LocalDateTime.now());
        user.setLogin(userDto.getLogin());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        user.setRole(roleRepo.getReferenceById(1L));
        return user;
    }

}
