package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.InfoSupport;
import kg.medExpo.medExpo.model.ManagerPhone;
import kg.medExpo.medExpo.model.dto.ManagerPhoneDto;

public interface ManagerPhoneService {

    ManagerPhoneDto findById(Long id);

    ManagerPhoneDto create(ManagerPhoneDto managerPhoneDto);

    ManagerPhoneDto update(ManagerPhoneDto managerPhoneDto);

    ManagerPhoneDto delete(ManagerPhoneDto managerPhoneDto);
}
