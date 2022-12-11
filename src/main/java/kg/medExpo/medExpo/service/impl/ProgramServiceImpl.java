package kg.medExpo.medExpo.service.impl;

import kg.medExpo.medExpo.model.Program;
import kg.medExpo.medExpo.model.dto.ProgramDto;
import kg.medExpo.medExpo.repo.ProgramRepo;
import kg.medExpo.medExpo.service.ProgramService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ProgramServiceImpl implements ProgramService {

    private ProgramRepo programRepo;
    @Override
    public ProgramDto findById(Long id) {
        Program program = programRepo.getReferenceById(id);
        ProgramDto programDto = new ProgramDto();
        programDto.setId(program.getId());
        programDto.setLanguageId(program.getLanguageId());
        programDto.setTitle(program.getTitle());
        return programDto;
    }

    @Override
    public ProgramDto create(ProgramDto programDto) {
        Program program = new Program();
        program.setLanguageId(programDto.getLanguageId());
        program.setTitle(programDto.getTitle());
        programRepo.save(program);
        return programDto;
    }

    @Override
    public ProgramDto update(ProgramDto programDto) {
        Program program = programRepo.getReferenceById(programDto.getId());
        program.setLanguageId(programDto.getLanguageId());
        program.setTitle(programDto.getTitle());
        programRepo.save(program);
        return programDto;
    }

    @Override
    public ProgramDto delete(ProgramDto programDto) {
        programRepo.deleteById(programDto.getId());
        return programDto;
    }

    @Override
    public List<Program> findAll() {
        return programRepo.findAll();
    }


}
