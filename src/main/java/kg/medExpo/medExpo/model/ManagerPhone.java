package kg.medExpo.medExpo.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table
public class ManagerPhone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String phone;
    @Column
    private String email;
    @Column
    private String photoUrl;
    @Column
    private String info;
    @ManyToOne
    private Language languageId;
    @Column
    private LocalDateTime createdDate = LocalDateTime.now();
}
