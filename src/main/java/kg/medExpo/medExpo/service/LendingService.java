package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.Lending;
import kg.medExpo.medExpo.model.MessageRequest;
import kg.medExpo.medExpo.model.dto.LendingDto;
import kg.medExpo.medExpo.model.dto.update.LendingUpdateDto;

import java.util.List;

public interface LendingService {

    Lending findById(Long id);

    Lending updateById(LendingUpdateDto lendingDto);

    String createLending(String lendingName);

    List<Lending> findAll();

    String createMessage(MessageRequest messageRequest);
}
