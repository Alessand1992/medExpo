package kg.medExpo.medExpo.model.dto.update;

import kg.medExpo.medExpo.model.dto.LendingDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class LendingUpdateDto extends LendingDto {

    private Long id;

}
