package kg.medExpo.medExpo.model.dto.update;

import kg.medExpo.medExpo.model.dto.SponsorDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class SponsorUpdateDto extends SponsorDto {
    private Long id;
}
