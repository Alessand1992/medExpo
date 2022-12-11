package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.Visitor;
import kg.medExpo.medExpo.model.dto.VisitorDto;

import java.util.List;

public interface VisitorService {

    VisitorDto findById(Long id);

    VisitorDto create(VisitorDto visitorDto);

    VisitorDto update(VisitorDto visitorDto);

    VisitorDto delete(VisitorDto visitorDto);

    List<Visitor> findAll();
}
