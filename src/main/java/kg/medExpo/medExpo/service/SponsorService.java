package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.Sponsor;
import kg.medExpo.medExpo.model.dto.SponsorDto;

public interface SponsorService {

    SponsorDto findById(Long id);

    SponsorDto create(SponsorDto sponsorDto);

    SponsorDto update(SponsorDto sponsorDto);

    SponsorDto delete(SponsorDto sponsorDto);
}
