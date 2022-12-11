package kg.medExpo.medExpo.service.impl;

import kg.medExpo.medExpo.model.Visitor;
import kg.medExpo.medExpo.model.dto.VisitorDto;
import kg.medExpo.medExpo.repo.VisitorsRepo;
import kg.medExpo.medExpo.service.VisitorService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class VisitorServiceImpl implements VisitorService {

    private VisitorsRepo visitorsRepo;
    @Override
    public VisitorDto findById(Long id) {
        Visitor visitor = visitorsRepo.getReferenceById(id);
        VisitorDto visitorDto = new VisitorDto();
        visitorDto.setId(visitor.getId());
        visitorDto.setFiles(visitor.getFiles());
        visitorDto.setStartDate(visitor.getStartDate());
        visitorDto.setEndDate(visitor.getEndDate());
        visitorDto.setTextMain(visitor.getTextMain());
        visitorDto.setTextFirst(visitor.getTextFirst());
        visitorDto.setTextSecond(visitor.getTextSecond());
        visitorDto.setTextThird(visitor.getTextThird());
        visitorDto.setTextFour(visitor.getTextFour());
        visitorDto.setTextFive(visitor.getTextFive());
        return visitorDto;
    }

    @Override
    public VisitorDto create(VisitorDto visitorDto) {
        Visitor visitor = new Visitor();
        visitor.setId(visitorDto.getId());
        visitor.setFiles(visitorDto.getFiles());
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
    public VisitorDto update(VisitorDto visitorDto) {
        Visitor visitor = visitorsRepo.getReferenceById(visitorDto.getId());
        visitor.setId(visitorDto.getId());
        visitor.setFiles(visitorDto.getFiles());
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
    public VisitorDto delete(VisitorDto visitorDto) {
        visitorsRepo.deleteById(visitorDto.getId());
        return visitorDto;
    }
}
