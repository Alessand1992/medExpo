package kg.medExpo.medExpo.model.dto.update;

import kg.medExpo.medExpo.model.Language;
import kg.medExpo.medExpo.model.ManagerPhone;
import kg.medExpo.medExpo.model.dto.ManagerPhoneDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ManagerPhoneUpdateDto extends ManagerPhoneDto {

    private Long id;

}
