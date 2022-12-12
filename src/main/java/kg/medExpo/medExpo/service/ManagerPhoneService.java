package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.InfoSupport;
import kg.medExpo.medExpo.model.ManagerPhone;
import kg.medExpo.medExpo.model.dto.ManagerPhoneDto;
import kg.medExpo.medExpo.model.dto.update.ManagerPhoneUpdateDto;

import java.util.List;

public interface ManagerPhoneService {

    ManagerPhoneDto findById(Long id);

    ManagerPhoneDto create(ManagerPhoneDto managerPhoneDto);

    ManagerPhoneDto update(ManagerPhoneUpdateDto managerPhoneDto);

    String delete(Long id);

    List<ManagerPhone> findAll();
}
