package kg.medExpo.medExpo.model.dto;

import kg.medExpo.medExpo.model.Language;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Data
public class InfoSupportDto {
    private String info;
    private String url;
    private Long languageId;

}
