package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.Program;
import kg.medExpo.medExpo.model.dto.ProgramDto;

import java.util.List;

public interface ProgramService {

    Program findById(Long id);

    ProgramDto create(ProgramDto programDto);

    ProgramDto update(Long id,ProgramDto programDto);

    String delete(Long id);

    List<Program> findAll();
}
