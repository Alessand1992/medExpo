package kg.medExpo.medExpo.model.dto.update;

import kg.medExpo.medExpo.model.dto.LogoDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class LogoUpdateDto extends LogoDto {
    private Long id;

}
