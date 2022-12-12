package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.PressRelease;
import kg.medExpo.medExpo.model.dto.PressReleaseDto;

import java.util.List;

public interface PressReleaseService {

    PressRelease findById(Long id);

    PressReleaseDto create(PressReleaseDto pressReleaseDto);

    PressReleaseDto update(Long id,PressReleaseDto pressReleaseDto);

    String delete(Long id);

    List<PressRelease> findAll();

}
