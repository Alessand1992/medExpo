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
    public Program findById(Long id) {
        return programRepo.getReferenceById(id);
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
    public ProgramDto update(Long id,ProgramDto programDto) {
        Program program = programRepo.getReferenceById(id);
        program.setLanguageId(programDto.getLanguageId());
        program.setTitle(programDto.getTitle());
        programRepo.save(program);
        return programDto;
    }

    @Override
    public String delete(Long id) {
        programRepo.deleteById(id);
        return "success";
    }

    @Override
    public List<Program> findAll() {
        return programRepo.findAll();
    }


}
