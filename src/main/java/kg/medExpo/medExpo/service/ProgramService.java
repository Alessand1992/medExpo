package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.Program;
import kg.medExpo.medExpo.model.dto.ProgramDto;

import java.util.List;

public interface ProgramService {

    ProgramDto findById(Long id);

    ProgramDto create(ProgramDto programDto);

    ProgramDto update(ProgramDto programDto);

    ProgramDto delete(ProgramDto programDto);

    List<Program> findAll();
}
