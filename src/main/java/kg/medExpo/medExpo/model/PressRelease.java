package kg.medExpo.medExpo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.util.IdentityHashMap;
import java.util.List;

@Data
@Entity
@Table(name = "press_release")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PressRelease {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private String text;
    @JoinColumn
    @OneToMany
    private List<File> files;

}
