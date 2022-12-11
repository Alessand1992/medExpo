package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.dto.LogoDto;
import kg.medExpo.medExpo.model.dto.ManagerPhoneDto;

import java.io.IOException;

public interface LogoService {

    LogoDto findById(Long id);

    LogoDto create(LogoDto logoDto) throws IOException;

    LogoDto update(LogoDto logoDto);

    LogoDto delete(LogoDto logoDto);
}
