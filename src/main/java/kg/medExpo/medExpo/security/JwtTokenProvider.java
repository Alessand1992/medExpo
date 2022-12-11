package kg.medExpo.medExpo.security;

import io.jsonwebtoken.*;
import kg.medExpo.medExpo.model.Role;
import kg.medExpo.medExpo.model.User;
import kg.medExpo.medExpo.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class JwtTokenProvider {
    private UserDetailsService userDetailsService;
    @Autowired
    private UserRepo userRepo;
    @Value("${jwt.secret}")
    private String secretKey ;
    @Value("${jwt.expiration}")
    private Long validityInMilliseconds;
    @Value("${jwt.header}")
    private String authorizationHeader;


    public JwtTokenProvider(@Qualifier("userDetailServiceImpl") UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @PostConstruct
    protected void init(){
        secretKey = Base64.getEncoder().encodeToString(secretKey.getBytes());
    }


    public String createToken(String userName,String role) throws Exception {

        Optional<User> user = userRepo.findByLogin(userName);

        Claims claims = Jwts.claims().setSubject(userName);
        claims.put("role",role);
        user.ifPresent(value -> claims.put("phone", value.getRole()));
        Date now = new Date();
        Date validity = new Date(now.getTime() + validityInMilliseconds * 1000);

        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(now)
                .setExpiration(validity)
                .signWith(SignatureAlgorithm.HS256,secretKey)

                .compact();
    }

    public boolean validateToken(String token){
        try {
            Jws<Claims> claimsJws = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token);
            return !claimsJws.getBody().getExpiration().before(new Date());
        }catch (JwtException | IllegalArgumentException e){
            throw new JwtAuthenticationException("Jwt token is expired or invalid", HttpStatus.UNAUTHORIZED);
        }
    }
    public Authentication getAuthentication(String token){
        UserDetails details = this.userDetailsService.loadUserByUsername(getUserName(token));
        return new UsernamePasswordAuthenticationToken(details,"",details.getAuthorities());
    }

    public String getUserName(String token){
        return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody().getSubject();
    }

    public String resolveToken(HttpServletRequest request){
        return  request.getHeader(authorizationHeader);
    }

    private static List<GrantedAuthority> grantedAuthorities(List<Role> roles){
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getRole())).collect(Collectors.toList());
    }

    private List<String> getRolesNames(List<Role> roles){
        List<String> result =new ArrayList<>();
        roles.forEach(role -> result.add(role.getRole()));
        return result;
    }
}