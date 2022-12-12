package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.PressRelease;
import kg.medExpo.medExpo.model.dto.PressReleaseDto;
import kg.medExpo.medExpo.model.dto.update.PressReleaseUpdateDto;

import java.util.List;

public interface PressReleaseService {

    PressRelease findById(Long id);

    PressReleaseDto create(PressReleaseDto pressReleaseDto);

    PressReleaseDto update(PressReleaseUpdateDto pressReleaseDto);

    String delete(Long id);

    List<PressRelease> findAll();

}
