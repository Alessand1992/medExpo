package kg.medExpo.medExpo.model.dto;

import kg.medExpo.medExpo.model.Language;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

@Data
public class SponsorDto {
    private String sponsorsLogoUrl;
    private String sponsorsName;
    private Long languageId;

}
