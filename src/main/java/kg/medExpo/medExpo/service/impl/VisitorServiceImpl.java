package kg.medExpo.medExpo.service.impl;

import kg.medExpo.medExpo.model.File;
import kg.medExpo.medExpo.model.Visitor;
import kg.medExpo.medExpo.model.dto.VisitorDto;
import kg.medExpo.medExpo.model.dto.update.VisitorUpdateDto;
import kg.medExpo.medExpo.repo.FileRepo;
import kg.medExpo.medExpo.repo.VisitorsRepo;
import kg.medExpo.medExpo.service.VisitorService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class VisitorServiceImpl implements VisitorService {

    private VisitorsRepo visitorsRepo;

    private FileRepo fileRepo;
    @Override
    public Visitor findById(Long id) {
        return visitorsRepo.getReferenceById(id);
    }

    @Override
    public VisitorDto create(VisitorDto visitorDto) {
        Visitor visitor = new Visitor();
        List<File> files = new ArrayList<>();
        for(int i = 0;i < visitorDto.getFiles().size(); i++){
            File file = fileRepo.getReferenceById(visitorDto.getFiles().get(i));
            files.add(file);
        }
        visitor.setFiles(files);
        visitor.setStartDate(visitorDto.getStartDate());
        visitor.setEndDate(visitorDto.getEndDate());
        visitor.setTextMain(visitorDto.getTextMain());
        visitor.setTextFirst(visitorDto.getTextFirst());
        visitor.setTextSecond(visitorDto.getTextSecond());
        visitor.setTextThird(visitorDto.getTextThird());
        visitor.setTextFour(visitorDto.getTextFour());
        visitor.setTextFive(visitorDto.getTextFive());
        visitorsRepo.save(visitor);
        return visitorDto;
    }

    @Override
    public VisitorDto update(VisitorUpdateDto visitorDto) {
        Visitor visitor = visitorsRepo.getReferenceById(visitorDto.getId());
        List<File> files = new ArrayList<>();
        for(int i = 0;i < visitorDto.getFiles().size(); i++){
            File file = fileRepo.getReferenceById(visitorDto.getFiles().get(i));
            files.add(file);
        }
        visitor.setFiles(files);
        visitor.setStartDate(visitorDto.getStartDate());
        visitor.setEndDate(visitorDto.getEndDate());
        visitor.setTextMain(visitorDto.getTextMain());
        visitor.setTextFirst(visitorDto.getTextFirst());
        visitor.setTextSecond(visitorDto.getTextSecond());
        visitor.setTextThird(visitorDto.getTextThird());
        visitor.setTextFour(visitorDto.getTextFour());
        visitor.setTextFive(visitorDto.getTextFive());
        visitorsRepo.save(visitor);
        return visitorDto;
    }

    @Override
    public String delete(Long id) {
        visitorsRepo.deleteById(id);
        return "success";
    }

    @Override
    public List<Visitor> findAll() {
        return visitorsRepo.findAll();
    }
}
