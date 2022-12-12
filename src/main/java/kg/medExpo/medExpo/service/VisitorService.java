package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.Visitor;
import kg.medExpo.medExpo.model.dto.VisitorDto;

import java.util.List;

public interface VisitorService {

    Visitor findById(Long id);

    VisitorDto create(VisitorDto visitorDto);

    VisitorDto update(Long id,VisitorDto visitorDto);

    String delete(Long id);

    List<Visitor> findAll();
}
