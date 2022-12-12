package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.Logo;
import kg.medExpo.medExpo.model.dto.LogoDto;
import kg.medExpo.medExpo.model.dto.ManagerPhoneDto;
import kg.medExpo.medExpo.model.dto.update.LogoUpdateDto;

import java.io.IOException;
import java.util.List;

public interface LogoService {

    LogoDto findById(Long id);

    LogoDto create(LogoDto logoDto) throws IOException;

    LogoDto update(LogoUpdateDto logoDto);

    String delete(Long id);

    List<Logo> findAll();
}
