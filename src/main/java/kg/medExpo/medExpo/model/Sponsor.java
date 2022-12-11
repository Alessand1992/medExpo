package kg.medExpo.medExpo.model;

import lombok.Data;

import javax.persistence.*;
import java.io.File;
import java.time.LocalDateTime;

@Data
@Entity
@Table
public class Sponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String sponsorsLogoUrl;
    @Column
    private String sponsorsName;
    @ManyToOne
    private Language languageId;
    @Column
    private LocalDateTime createdDate = LocalDateTime.now();
}
