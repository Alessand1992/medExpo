package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.Sponsor;
import kg.medExpo.medExpo.model.dto.SponsorDto;

import java.util.List;

public interface SponsorService {

    Sponsor findById(Long id);

    SponsorDto create(SponsorDto sponsorDto);

    SponsorDto update(Long id,SponsorDto sponsorDto);

    String delete(Long id);

    List<Sponsor> findAll();
}
