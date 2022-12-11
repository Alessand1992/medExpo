package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.PressRelease;
import kg.medExpo.medExpo.model.dto.PressReleaseDto;

import java.util.List;

public interface PressReleaseService {

    PressReleaseDto findById(Long id);

    PressReleaseDto create(PressReleaseDto pressReleaseDto);

    PressReleaseDto update(PressReleaseDto pressReleaseDto);

    PressReleaseDto delete(PressReleaseDto pressReleaseDto);

    List<PressRelease> findAll();

}
