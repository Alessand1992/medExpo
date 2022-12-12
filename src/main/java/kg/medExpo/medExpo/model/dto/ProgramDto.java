package kg.medExpo.medExpo.model.dto;

import kg.medExpo.medExpo.model.Language;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class ProgramDto {
    private String title;
    private Long languageId;
}
