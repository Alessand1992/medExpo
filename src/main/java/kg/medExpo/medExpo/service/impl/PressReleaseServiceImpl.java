package kg.medExpo.medExpo.service.impl;

import kg.medExpo.medExpo.model.File;
import kg.medExpo.medExpo.model.PressRelease;
import kg.medExpo.medExpo.model.dto.PressReleaseDto;
import kg.medExpo.medExpo.model.dto.update.PressReleaseUpdateDto;
import kg.medExpo.medExpo.repo.FileRepo;
import kg.medExpo.medExpo.repo.PressReleaseRepo;
import kg.medExpo.medExpo.service.PressReleaseService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Slf4j
@Service
public class PressReleaseServiceImpl implements PressReleaseService {

    private PressReleaseRepo pressReleaseRepo;
    private FileRepo fileRepo;

    @Override
    public PressRelease findById(Long id) {
        return pressReleaseRepo.getReferenceById(id);
    }

    @Override
    public PressReleaseDto create(PressReleaseDto pressReleaseDto) {
        PressRelease pressRelease = new PressRelease();
        List<File> files = new ArrayList<>();
        for(int i = 0 ;i < pressReleaseDto.getFilesId().size(); i++){
            File file = fileRepo.getReferenceById(pressReleaseDto.getFilesId().get(i));
            files.add(file);
        }
        pressRelease.setFiles(files);
        pressRelease.setText(pressReleaseDto.getText());
        pressReleaseRepo.save(pressRelease);
        return pressReleaseDto;
    }

    @Override
    public PressReleaseDto update(PressReleaseUpdateDto pressReleaseDto) {
        PressRelease pressRelease = pressReleaseRepo.getReferenceById(pressReleaseDto.getId());
        List<File> files = new ArrayList<>();
        for(int i = 0 ;i < pressReleaseDto.getFilesId().size(); i++){
            File file = fileRepo.getReferenceById(pressReleaseDto.getFilesId().get(i));
            files.add(file);
        }
        pressRelease.setFiles(files);
        pressRelease.setText(pressReleaseDto.getText());
        pressReleaseRepo.save(pressRelease);
        return pressReleaseDto;
    }

    @Override
    public String delete(Long id) {
        pressReleaseRepo.deleteById(id);
        return "success";
    }

    @Override
    public List<PressRelease> findAll() {
        return pressReleaseRepo.findAll();
    }
}
