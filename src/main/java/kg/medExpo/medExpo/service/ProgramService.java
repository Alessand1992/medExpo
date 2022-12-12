package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.Program;
import kg.medExpo.medExpo.model.dto.ProgramDto;
import kg.medExpo.medExpo.model.dto.update.ProgramUpdateDto;

import java.util.List;

public interface ProgramService {

    Program findById(Long id);

    ProgramDto create(ProgramDto programDto);

    ProgramDto update(ProgramUpdateDto programDto);

    String delete(Long id);

    List<Program> findAll();
}
