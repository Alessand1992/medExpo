package kg.medExpo.medExpo.model.dto;

import kg.medExpo.medExpo.model.File;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Data
public class PressReleaseDto {
    private Long id;
    private List<Long> filesId;
    private File uri;
}
