package kg.medExpo.medExpo.service.impl;

import kg.medExpo.medExpo.model.Sponsor;
import kg.medExpo.medExpo.model.dto.SponsorDto;
import kg.medExpo.medExpo.model.dto.update.SponsorUpdateDto;
import kg.medExpo.medExpo.repo.LanguageRepo;
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
    private LanguageRepo languageRepo;
    @Override
    public Sponsor findById(Long id) {
        return sponsorRepo.getReferenceById(id);
    }

    @Override
    public SponsorDto create(SponsorDto sponsorDto) {
        Sponsor sponsor = new Sponsor();
        sponsor.setSponsorsName(sponsorDto.getSponsorsName());
        sponsor.setLanguageId(languageRepo.getReferenceById(sponsorDto.getLanguageId()));
        sponsor.setSponsorsLogoUrl(sponsorDto.getSponsorsLogoUrl());
        sponsorRepo.save(sponsor);
        return sponsorDto;
    }

    @Override
    public SponsorDto update(SponsorUpdateDto sponsorDto) {
        Sponsor sponsor = sponsorRepo.getReferenceById(sponsorDto.getId());
        sponsor.setSponsorsLogoUrl(sponsorDto.getSponsorsLogoUrl());
        sponsor.setSponsorsName(sponsorDto.getSponsorsName());
        sponsor.setLanguageId(languageRepo.getReferenceById(sponsorDto.getLanguageId()));
        return sponsorDto;
    }

    @Override
    public String delete(Long id) {
        sponsorRepo.deleteById(id);
        return "success";
    }

    @Override
    public List<Sponsor> findAll() {
        return sponsorRepo.findAll();
    }
}
