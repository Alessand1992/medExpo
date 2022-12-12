package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.OfficialSupport;
import kg.medExpo.medExpo.model.dto.OfficialSupportDto;

import java.util.List;

public interface OfficialSupportService {

    OfficialSupportDto findById(Long id);

    OfficialSupportDto create(OfficialSupportDto officialSupportDto);

    OfficialSupportDto update(Long id,OfficialSupportDto officialSupportDto);

    String delete(Long id);

    List<OfficialSupport> findAll();
}
