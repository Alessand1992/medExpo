package kg.medExpo.medExpo.model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table
public class Lending {
    @Id
    @Column
    @GeneratedValue
    private Long id;
    @JoinColumn
    @ManyToOne
    private Logo Logo;
    @Column
    private String name;
    @Column
    private LocalDateTime startDate;
    @Column
    private LocalDateTime endDate;
    @JoinColumn
    @OneToMany
    private List<InfoSupport> infoSupport;
    @JoinColumn
    @OneToMany
    private List<OfficialSupport> officialSupport;
    @JoinColumn
    @OneToMany
    private List<Sponsor> sponsor;
    @JoinColumn
    @ManyToOne
    private Program programs;
    @JoinColumn
    @OneToMany
    private List<Photos> photos;
    @JoinColumn
    @OneToMany
    private List<Video> video;
    @JoinColumn
    @ManyToOne
    private ManagerPhone managersPhones;
    @JoinColumn
    @ManyToOne
    private Language language;
    @Column
    private LocalDateTime createdDate = LocalDateTime.now();
    @JoinColumn
    @ManyToOne
    private PressRelease pressRelease;

}