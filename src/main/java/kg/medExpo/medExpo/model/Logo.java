package kg.medExpo.medExpo.model;

import lombok.Data;

import javax.persistence.*;
import java.awt.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table
public class Logo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String lendingName;
    @Column
    private String imageUrl;
    @Column
    private LocalDateTime createdDate = LocalDateTime.now();
}
