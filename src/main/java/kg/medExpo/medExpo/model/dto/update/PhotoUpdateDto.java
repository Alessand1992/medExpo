package kg.medExpo.medExpo.model.dto.update;

import kg.medExpo.medExpo.model.dto.PhotosDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PhotoUpdateDto extends PhotosDto {

    private Long id;

}
