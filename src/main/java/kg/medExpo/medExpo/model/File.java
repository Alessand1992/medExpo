package kg.medExpo.medExpo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;

@Data
@Entity
@Table(name = "files")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String fileName;
    @Column
    private String uri;
    @Column
    private String contentType;
}