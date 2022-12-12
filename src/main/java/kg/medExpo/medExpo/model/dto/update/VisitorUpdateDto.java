package kg.medExpo.medExpo.model.dto.update;

import kg.medExpo.medExpo.model.dto.VideoDto;
import kg.medExpo.medExpo.model.dto.VisitorDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class VisitorUpdateDto extends VisitorDto {
    private Long id;
}
