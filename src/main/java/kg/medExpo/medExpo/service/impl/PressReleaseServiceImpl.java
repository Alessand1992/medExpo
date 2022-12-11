package kg.medExpo.medExpo.service.impl;

import kg.medExpo.medExpo.model.PressRelease;
import kg.medExpo.medExpo.model.dto.PressReleaseDto;
import kg.medExpo.medExpo.repo.PressReleaseRepo;
import kg.medExpo.medExpo.service.PressReleaseService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Slf4j
@Service
public class PressReleaseServiceImpl implements PressReleaseService {

    private PressReleaseRepo pressReleaseRepo;

    @Override
    public PressReleaseDto findById(Long id) {
        PressRelease pressRelease = pressReleaseRepo.getReferenceById(id);
        PressReleaseDto pressReleaseDto = new PressReleaseDto();
        pressReleaseDto.setId(pressRelease.getId());
        return pressReleaseDto;
    }

    @Override
    public PressReleaseDto create(PressReleaseDto pressReleaseDto) {
        PressRelease pressRelease = new PressRelease();
        pressRelease.setId(pressReleaseDto.getId());
        pressReleaseRepo.save(pressRelease);
        return pressReleaseDto;
    }

    @Override
    public PressReleaseDto update(PressReleaseDto pressReleaseDto) {
        PressRelease pressRelease = pressReleaseRepo.getReferenceById(pressReleaseDto.getId());
        pressRelease.setId(pressReleaseDto.getId());
        pressReleaseRepo.save(pressRelease);
        return pressReleaseDto;
    }

    @Override
    public PressReleaseDto delete(PressReleaseDto pressReleaseDto) {
        pressReleaseRepo.deleteById(pressReleaseDto.getId());
        return pressReleaseDto;
    }

    @Override
    public List<PressRelease> findAll() {
        return pressReleaseRepo.findAll();
    }
}
