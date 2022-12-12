package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.Lending;
import kg.medExpo.medExpo.model.MessageRequest;
import kg.medExpo.medExpo.model.dto.LendingDto;

import java.util.List;

public interface LendingService {

    Lending findById(Long id);

    Lending updateById(Long id,LendingDto lendingDto);

    String createLending(String lendingName);

    List<Lending> findAll();

    String createMessage(MessageRequest messageRequest);
}
