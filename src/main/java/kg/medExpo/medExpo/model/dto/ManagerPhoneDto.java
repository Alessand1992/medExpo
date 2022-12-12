package kg.medExpo.medExpo.model.dto;

import kg.medExpo.medExpo.model.Language;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

@Data
public class ManagerPhoneDto {
    private String phone;
    private String email;
    private String photoUrl;
    private String info;
    private Language languageId;

}
