package kg.medExpo.medExpo.model.dto;

import kg.medExpo.medExpo.model.Language;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class ProgramDto {
    private Long id;
    private String title;
    private Language languageId;
}
