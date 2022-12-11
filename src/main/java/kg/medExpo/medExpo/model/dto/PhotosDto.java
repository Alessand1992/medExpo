package kg.medExpo.medExpo.model.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Column;

@Data
public class PhotosDto {
    private Long id;
    private String url;
}
