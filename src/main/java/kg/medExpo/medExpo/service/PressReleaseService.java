package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.dto.PressReleaseDto;

public interface PressReleaseService {

    PressReleaseDto findById(Long id);

    PressReleaseDto create(PressReleaseDto pressReleaseDto);

    PressReleaseDto update(PressReleaseDto pressReleaseDto);

    PressReleaseDto delete(PressReleaseDto pressReleaseDto);

}
