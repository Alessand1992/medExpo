package kg.medExpo.medExpo.model.dto.update;

import kg.medExpo.medExpo.model.dto.FileDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class FileUpdateDto extends FileDto {

    private Long id;

}
