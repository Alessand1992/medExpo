package kg.medExpo.medExpo.service.impl;

import kg.medExpo.medExpo.model.Language;
import kg.medExpo.medExpo.model.OfficialSupport;
import kg.medExpo.medExpo.model.dto.OfficialSupportDto;
import kg.medExpo.medExpo.model.dto.update.OfficialSupportUpdateDto;
import kg.medExpo.medExpo.repo.LanguageRepo;
import kg.medExpo.medExpo.repo.OfficialSupportRepo;
import kg.medExpo.medExpo.service.OfficialSupportService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class OfficialSupportServiceImpl implements OfficialSupportService {

    private OfficialSupportRepo officialSupportRepo;
    private LanguageRepo languageRepo;
    @Override
    public OfficialSupportDto findById(Long id) {
        OfficialSupport officialSupport = officialSupportRepo.getReferenceById(id);
        OfficialSupportDto officialSupportDto = new OfficialSupportDto();
        officialSupportDto.setLanguageId(officialSupport.getLanguageId().getId());
        officialSupportDto.setInfo(officialSupport.getInfo());
        officialSupportDto.setUrl(officialSupport.getUrl());
        return officialSupportDto;
    }

    @Override
    public OfficialSupportDto create(OfficialSupportDto officialSupportDto) {
        OfficialSupport officialSupport = new OfficialSupport();
        officialSupport.setLanguageId(officialSupport.getLanguageId());
        officialSupport.setInfo(officialSupportDto.getInfo());
        officialSupport.setUrl(officialSupportDto.getUrl());
        officialSupportRepo.save(officialSupport);
        return officialSupportDto;
    }

    @Override
    public OfficialSupportDto update(OfficialSupportUpdateDto officialSupportDto) {
        OfficialSupport officialSupport = officialSupportRepo.getReferenceById(officialSupportDto.getId());
        officialSupport.setUrl(officialSupportDto.getUrl());
        officialSupport.setLanguageId(languageRepo.getReferenceById(officialSupportDto.getLanguageId()));
        officialSupport.setInfo(officialSupportDto.getInfo());
        officialSupportRepo.save(officialSupport);
        return officialSupportDto;
    }

    @Override
    public String delete(Long id) {
        officialSupportRepo.deleteById(id);
        return "success";
    }

    @Override
    public List<OfficialSupport> findAll() {
        return officialSupportRepo.findAll();
    }
}
