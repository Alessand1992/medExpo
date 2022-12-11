package kg.medExpo.medExpo.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table
public class Program {
    @Id
    @GeneratedValue
    @Column
    private Long id;
    @Column
    private String title;
    @JoinColumn
    @ManyToOne
    private Language languageId;
    @Column
    private LocalDateTime createdDate = LocalDateTime.now();

}
