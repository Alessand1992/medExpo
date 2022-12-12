package kg.medExpo.medExpo.model.dto.update;

import kg.medExpo.medExpo.model.Language;
import kg.medExpo.medExpo.model.dto.InfoSupportDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class InfoSupportUpdateDto extends InfoSupportDto {

    private Long id;

}
