package kg.medExpo.medExpo.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @Column
    private String login;
    @Column
    private String fullName;
    @Column
    private String password;
    @JoinColumn
    @ManyToOne
    private Role role;
    @Column
    private LocalDateTime createdDate = LocalDateTime.now();
}
