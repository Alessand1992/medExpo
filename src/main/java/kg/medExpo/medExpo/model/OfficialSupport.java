package kg.medExpo.medExpo.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "official_support")
public class OfficialSupport{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String info;
    @Column
    private String url;
    @JoinColumn
    @ManyToOne
    private Language languageId;
    @Column
    private LocalDateTime createdDate = LocalDateTime.now();
}
