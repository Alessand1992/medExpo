package kg.medExpo.medExpo.service.impl;

import kg.medExpo.medExpo.model.Sponsor;
import kg.medExpo.medExpo.model.dto.SponsorDto;
import kg.medExpo.medExpo.repo.SponsorRepo;
import kg.medExpo.medExpo.service.SponsorService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class SponsorServiceImpl implements SponsorService {
    private SponsorRepo sponsorRepo;
    @Override
    public SponsorDto findById(Long id) {
        Sponsor sponsor = sponsorRepo.getReferenceById(id);
        SponsorDto sponsorDto = new SponsorDto();
        sponsorDto.setId(sponsor.getId());
        sponsorDto.setSponsorsName(sponsor.getSponsorsName());
        sponsorDto.setSponsorsLogoUrl(sponsor.getSponsorsLogoUrl());
        sponsorDto.setLanguageId(sponsor.getLanguageId());
        return sponsorDto;
    }

    @Override
    public SponsorDto create(SponsorDto sponsorDto) {
        Sponsor sponsor = new Sponsor();
        sponsor.setSponsorsName(sponsorDto.getSponsorsName());
        sponsor.setLanguageId(sponsorDto.getLanguageId());
        sponsor.setSponsorsLogoUrl(sponsorDto.getSponsorsLogoUrl());
        sponsorRepo.save(sponsor);
        return sponsorDto;
    }

    @Override
    public SponsorDto update(SponsorDto sponsorDto) {
        Sponsor sponsor = sponsorRepo.getReferenceById(sponsorDto.getId());
        sponsor.setSponsorsLogoUrl(sponsorDto.getSponsorsLogoUrl());
        sponsor.setSponsorsName(sponsorDto.getSponsorsName());
        sponsor.setLanguageId(sponsorDto.getLanguageId());
        return sponsorDto;
    }

    @Override
    public SponsorDto delete(SponsorDto sponsorDto) {
        sponsorRepo.deleteById(sponsorDto.getId());
        return sponsorDto;
    }

    @Override
    public List<Sponsor> findAll() {
        return sponsorRepo.findAll();
    }
}
