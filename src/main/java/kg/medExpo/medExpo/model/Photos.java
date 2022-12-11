package kg.medExpo.medExpo.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "photos")
public class Photos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String url;
    @Column
    private LocalDateTime createdDate = LocalDateTime.now();

}
