package kg.medExpo.medExpo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jdk.jfr.Enabled;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String role;
}
