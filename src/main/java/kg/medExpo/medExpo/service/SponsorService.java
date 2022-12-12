package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.Sponsor;
import kg.medExpo.medExpo.model.dto.SponsorDto;
import kg.medExpo.medExpo.model.dto.update.SponsorUpdateDto;

import java.util.List;

public interface SponsorService {

    Sponsor findById(Long id);

    SponsorDto create(SponsorDto sponsorDto);

    SponsorDto update(SponsorUpdateDto sponsorDto);

    String delete(Long id);

    List<Sponsor> findAll();
}
