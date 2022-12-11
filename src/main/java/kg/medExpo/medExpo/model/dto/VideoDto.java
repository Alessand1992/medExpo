package kg.medExpo.medExpo.model.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class VideoDto {
    private Long id;
    private String url;
}
