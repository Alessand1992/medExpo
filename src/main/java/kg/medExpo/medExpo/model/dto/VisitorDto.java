package kg.medExpo.medExpo.model.dto;

import kg.medExpo.medExpo.model.File;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class VisitorDto {
    private Long id;
    private String textMain;
    private List<File> files;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String textFirst;
    private String textSecond;
    private String textThird;
    private String textFour;
    private String textFive;
}
