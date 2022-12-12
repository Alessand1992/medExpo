package kg.medExpo.medExpo.model.dto.update;

import kg.medExpo.medExpo.model.File;
import kg.medExpo.medExpo.model.dto.PressReleaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PressReleaseUpdateDto extends PressReleaseDto {

    private Long id;


}
