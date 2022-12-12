package kg.medExpo.medExpo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "visitors")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Visitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String textMain;
    @JoinColumn
    @OneToMany
    private List<File> files;
    @Column
    private LocalDateTime startDate;
    @Column
    private LocalDateTime endDate;
    @Column
    private String textFirst;
    @Column
    private String textSecond;
    @Column
    private String textThird;
    @Column
    private String textFour;
    @Column
    private String textFive;


}
