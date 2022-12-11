package kg.medExpo.medExpo.model;

import jdk.jfr.Enabled;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String role;
}
