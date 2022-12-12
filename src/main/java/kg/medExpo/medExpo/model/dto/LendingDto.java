package kg.medExpo.medExpo.model.dto;

import kg.medExpo.medExpo.model.*;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class LendingDto{
    private Long Logo;
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private List<Long> infoSupport;
    private List<Long> officialSupport;
    private List<Long> sponsor;
    private Long programs;
    private List<Long> photos;
    private List<Long> video;
    private Long managersPhones;
    private Long language;
    private Long visitorsId;
    private Long pressReleaseId;
}
