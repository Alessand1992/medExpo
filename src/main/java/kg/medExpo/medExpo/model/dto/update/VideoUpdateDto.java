package kg.medExpo.medExpo.model.dto.update;

import kg.medExpo.medExpo.model.dto.VideoDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class VideoUpdateDto extends VideoDto {
    private Long id;
}
