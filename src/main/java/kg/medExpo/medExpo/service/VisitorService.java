package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.Visitor;
import kg.medExpo.medExpo.model.dto.VisitorDto;
import kg.medExpo.medExpo.model.dto.update.VisitorUpdateDto;

import java.util.List;

public interface VisitorService {

    Visitor findById(Long id);

    VisitorDto create(VisitorDto visitorDto);

    VisitorDto update(VisitorUpdateDto visitorDto);

    String delete(Long id);

    List<Visitor> findAll();
}
