package kg.medExpo.medExpo.service.impl;

import kg.medExpo.medExpo.model.InfoSupport;
import kg.medExpo.medExpo.model.dto.InfoSupportDto;
import kg.medExpo.medExpo.model.dto.update.InfoSupportUpdateDto;
import kg.medExpo.medExpo.repo.InfoSupportRepo;
import kg.medExpo.medExpo.repo.LanguageRepo;
import kg.medExpo.medExpo.service.InfoSupportService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.id.UUIDGenerator;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
@Slf4j
public class InfoSupportServiceImpl implements InfoSupportService {
    private InfoSupportRepo infoSupportRepo;
    private LanguageRepo languageRepo;

    @Override
    public InfoSupport findById(Long id) {
        return infoSupportRepo.getReferenceById(id);
    }

    @Override
    public InfoSupportDto create(InfoSupportDto infoSupportDto) {
        InfoSupport infoSupport = new InfoSupport();
        infoSupport.setInfo(infoSupportDto.getInfo());
        infoSupport.setUrl(infoSupportDto.getUrl());
        infoSupport.setLanguageId(languageRepo.getReferenceById(infoSupportDto.getLanguageId()));
        infoSupportRepo.save(infoSupport);
        return infoSupportDto;
    }

    @Override
    public InfoSupportDto update(InfoSupportUpdateDto infoSupportDto) {
        InfoSupport infoSupport = infoSupportRepo.getReferenceById(infoSupportDto.getId());
        infoSupport.setInfo(infoSupportDto.getInfo());
        infoSupport.setUrl(infoSupportDto.getUrl());
        infoSupport.setLanguageId(languageRepo.getReferenceById(infoSupportDto.getLanguageId()));
        infoSupportRepo.save(infoSupport);
        return infoSupportDto;
    }

    @Override
    public String delete(Long id) {
        infoSupportRepo.deleteById(id);
        return "success";
    }

    @Override
    public List<InfoSupport> findAll() {
        return infoSupportRepo.findAll();
    }
}
