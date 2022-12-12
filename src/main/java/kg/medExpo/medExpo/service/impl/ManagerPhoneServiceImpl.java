package kg.medExpo.medExpo.service.impl;

import kg.medExpo.medExpo.model.ManagerPhone;
import kg.medExpo.medExpo.model.dto.ManagerPhoneDto;
import kg.medExpo.medExpo.repo.ManagerPhoneRepo;
import kg.medExpo.medExpo.service.ManagerPhoneService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ManagerPhoneServiceImpl implements ManagerPhoneService {

    private ManagerPhoneRepo managerPhoneRepo;

    @Override
    public ManagerPhoneDto findById(Long id) {
        ManagerPhone managerPhone = managerPhoneRepo.getReferenceById(id);
        ManagerPhoneDto managerPhoneDto = new ManagerPhoneDto();
        managerPhoneDto.setPhone(managerPhone.getPhone());
        managerPhoneDto.setLanguageId(managerPhone.getLanguageId());
        managerPhoneDto.setEmail(managerPhone.getEmail());
        managerPhoneDto.setPhotoUrl(managerPhone.getPhotoUrl());
        managerPhoneDto.setInfo(managerPhone.getInfo());
        return managerPhoneDto;
    }

    @Override
    public ManagerPhoneDto create(ManagerPhoneDto managerPhoneDto) {
        ManagerPhone managerPhone = new ManagerPhone();
        managerPhone.setPhone(managerPhoneDto.getPhone());
        managerPhone.setEmail(managerPhoneDto.getEmail());
        managerPhone.setPhotoUrl(managerPhoneDto.getPhotoUrl());
        managerPhone.setLanguageId(managerPhoneDto.getLanguageId());
        managerPhone.setInfo(managerPhoneDto.getInfo());
        managerPhoneRepo.save(managerPhone);
        return managerPhoneDto;
    }

    @Override
    public ManagerPhoneDto update(Long id,ManagerPhoneDto managerPhoneDto) {
        ManagerPhone managerPhone = managerPhoneRepo.getReferenceById(id);
        managerPhone.setPhone(managerPhoneDto.getPhone());
        managerPhone.setEmail(managerPhoneDto.getEmail());
        managerPhone.setPhotoUrl(managerPhoneDto.getPhotoUrl());
        managerPhone.setLanguageId(managerPhoneDto.getLanguageId());
        managerPhone.setInfo(managerPhoneDto.getInfo());
        managerPhoneRepo.save(managerPhone);
        return managerPhoneDto;
    }

    @Override
    public String delete(Long id) {
        managerPhoneRepo.deleteById(id);
        return "success";
    }

    @Override
    public List<ManagerPhone> findAll() {
        return managerPhoneRepo.findAll();
    }
}
