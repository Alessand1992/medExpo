package kg.medExpo.medExpo.model.dto.update;

import kg.medExpo.medExpo.model.dto.ProgramDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ProgramUpdateDto extends ProgramDto {
    private Long id;

}
