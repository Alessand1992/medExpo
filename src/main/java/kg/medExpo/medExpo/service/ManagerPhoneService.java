package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.InfoSupport;
import kg.medExpo.medExpo.model.ManagerPhone;
import kg.medExpo.medExpo.model.dto.ManagerPhoneDto;

import java.util.List;

public interface ManagerPhoneService {

    ManagerPhoneDto findById(Long id);

    ManagerPhoneDto create(ManagerPhoneDto managerPhoneDto);

    ManagerPhoneDto update(Long id,ManagerPhoneDto managerPhoneDto);

    String delete(Long id);

    List<ManagerPhone> findAll();
}
