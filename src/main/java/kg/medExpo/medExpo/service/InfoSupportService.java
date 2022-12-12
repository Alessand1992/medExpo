package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.InfoSupport;
import kg.medExpo.medExpo.model.dto.InfoSupportDto;

import java.util.List;

public interface InfoSupportService {

    InfoSupport findById(Long id);

    InfoSupportDto create(InfoSupportDto infoSupportDto);

    InfoSupportDto update(Long id,InfoSupportDto infoSupportDto);

    String delete(Long id);

    List<InfoSupport> findAll();

}
