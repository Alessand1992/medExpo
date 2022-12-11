package kg.medExpo.medExpo.model;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.util.IdentityHashMap;
import java.util.List;

@Data
@Entity
@Table(name = "press_release")
public class PressRelease {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @JoinColumn
    @OneToMany
    private List<File> files;

}
