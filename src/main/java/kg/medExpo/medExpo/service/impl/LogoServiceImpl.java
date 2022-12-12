package kg.medExpo.medExpo.service.impl;

import kg.medExpo.medExpo.model.Logo;
import kg.medExpo.medExpo.model.dto.LogoDto;
import kg.medExpo.medExpo.model.dto.ManagerPhoneDto;
import kg.medExpo.medExpo.model.dto.update.LogoUpdateDto;
import kg.medExpo.medExpo.repo.LogoRepo;
import kg.medExpo.medExpo.service.LogoService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class LogoServiceImpl implements LogoService {
    private LogoRepo logoRepo;

    @Override
    public LogoDto findById(Long id) {
        Logo logo = logoRepo.getReferenceById(id);
        LogoDto logoDto = new LogoDto();
        logoDto.setImageUrl(logo.getImageUrl());
        logoDto.setLendingName(logo.getLendingName());
        return logoDto;
    }

    @Override
    public LogoDto create(LogoDto logoDto) throws IOException {
        Logo logo = new Logo();
        logo.setLendingName(logoDto.getLendingName());
        logo.setCreatedDate(LocalDateTime.now());
        logo.setImageUrl(logoDto.getImageUrl());
        logoRepo.save(logo);
        return logoDto;
    }

    @Override
    public LogoDto update(LogoUpdateDto logoDto) {
        Logo logo = logoRepo.getReferenceById(logoDto.getId());
        logo.setLendingName(logoDto.getLendingName());
        logo.setCreatedDate(LocalDateTime.now());
        logo.setImageUrl(logoDto.getImageUrl());
        logoRepo.save(logo);
        return logoDto;
    }

    @Override
    public String delete(Long id) {
        logoRepo.deleteById(id);
        return "success";
    }

    @Override
    public List<Logo> findAll() {
        return logoRepo.findAll();
    }
}
