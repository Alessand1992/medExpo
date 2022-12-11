package kg.medExpo.medExpo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String languageName;

}
