package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.Lending;
import kg.medExpo.medExpo.model.MessageRequest;
import kg.medExpo.medExpo.model.dto.LendingDto;

public interface LendingService {

    Lending findById(Long id);

    Lending updateById(LendingDto lendingDto);

    String createLending(String lendingName);

    String createMessage(MessageRequest messageRequest);
}
