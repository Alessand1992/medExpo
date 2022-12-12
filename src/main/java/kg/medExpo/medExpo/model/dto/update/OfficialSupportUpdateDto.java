package kg.medExpo.medExpo.model.dto.update;

import kg.medExpo.medExpo.model.Language;
import kg.medExpo.medExpo.model.dto.OfficialSupportDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class OfficialSupportUpdateDto extends OfficialSupportDto {

    private Long id;

}
