package kg.medExpo.medExpo.service.impl;

import kg.medExpo.medExpo.model.InfoSupport;
import kg.medExpo.medExpo.model.dto.InfoSupportDto;
import kg.medExpo.medExpo.repo.InfoSupportRepo;
import kg.medExpo.medExpo.service.InfoSupportService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.id.UUIDGenerator;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
@Slf4j
public class InfoSupportServiceImpl implements InfoSupportService {
    private InfoSupportRepo infoSupportRepo;

    @Override
    public InfoSupportDto findById(Long id) {
        InfoSupport infoSupport = infoSupportRepo.getReferenceById(id);
        InfoSupportDto infoSupportDto = new InfoSupportDto();
        infoSupportDto.setId(infoSupport.getId());
        infoSupportDto.setInfo(infoSupport.getInfo());
        infoSupportDto.setLanguageId(infoSupport.getLanguageId());
        infoSupportDto.setUrl(infoSupport.getUrl());
        return infoSupportDto;
    }

    @Override
    public InfoSupportDto create(InfoSupportDto infoSupportDto) {
        InfoSupport infoSupport = new InfoSupport();
        infoSupport.setInfo(infoSupportDto.getInfo());
        infoSupport.setUrl(infoSupportDto.getUrl());
        infoSupport.setLanguageId(infoSupportDto.getLanguageId());
        infoSupportRepo.save(infoSupport);
        return infoSupportDto;
    }

    @Override
    public InfoSupportDto update(InfoSupportDto infoSupportDto) {
        InfoSupport infoSupport = infoSupportRepo.getReferenceById(infoSupportDto.getId());
        infoSupport.setInfo(infoSupportDto.getInfo());
        infoSupport.setUrl(infoSupportDto.getUrl());
        infoSupport.setLanguageId(infoSupportDto.getLanguageId());
        infoSupportRepo.save(infoSupport);
        return infoSupportDto;
    }

    @Override
    public InfoSupportDto delete(InfoSupportDto infoSupportDto) {
        infoSupportRepo.deleteById(infoSupportDto.getId());
        return infoSupportDto;
    }
}
