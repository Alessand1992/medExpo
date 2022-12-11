package kg.medExpo.medExpo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.medExpo.medExpo.model.RestResponse;
import kg.medExpo.medExpo.model.User;
import kg.medExpo.medExpo.model.dto.AuthDto;
import kg.medExpo.medExpo.model.dto.UserDto;
import kg.medExpo.medExpo.repo.UserRepo;
import kg.medExpo.medExpo.security.JwtTokenProvider;
import kg.medExpo.medExpo.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
@Api(tags = "USER")
@AllArgsConstructor
@Slf4j
public class UserController {

    private final AuthenticationManager authenticationManager;
    private JwtTokenProvider jwtTokenProvider;
    private PasswordEncoder passwordEncoder;
    private UserRepo userRepo;
    private UserService userService;

    @ApiOperation(value = "authorization", notes = "authorization")
    @RequestMapping(value = "/authorization",method = RequestMethod.POST)
    public RestResponse<?> findLendingById(@RequestBody AuthDto authDto){
        try{
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authDto.getLogin(),authDto.getPassword()));
            User user = userRepo.findByLogin(authDto.getLogin()).orElseThrow(() -> new UsernameNotFoundException("Doesnt exist"));
            String token = jwtTokenProvider.createToken(authDto.getLogin(),user.getRole().toString());
            Map<Object,Object> response = new HashMap<>();
            response.put("login",authDto.getLogin());
            response.put("token",token);
            return RestResponse.of(HttpStatus.OK,response, Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "registration", notes = "registration")
    @RequestMapping(value = "/registration",method = RequestMethod.POST)
    public RestResponse<?> registration(@RequestBody UserDto userDto){
        try{
            return RestResponse.of(HttpStatus.OK,userService.createUser(userDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }
}
