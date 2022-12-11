package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.InfoSupport;
import kg.medExpo.medExpo.model.dto.InfoSupportDto;

import java.util.List;

public interface InfoSupportService {

    InfoSupportDto findById(Long id);

    InfoSupportDto create(InfoSupportDto infoSupportDto);

    InfoSupportDto update(InfoSupportDto infoSupportDto);

    InfoSupportDto delete(InfoSupportDto infoSupportDto);

    List<InfoSupport> findAll();

}
