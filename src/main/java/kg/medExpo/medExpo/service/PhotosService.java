package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.Photos;
import kg.medExpo.medExpo.model.dto.PhotosDto;
import kg.medExpo.medExpo.model.dto.update.PhotoUpdateDto;

import java.util.List;

public interface PhotosService {

    PhotosDto findById(Long id);

    PhotosDto create(PhotosDto photosDto);

    PhotosDto update(PhotoUpdateDto photosDto);

    String delete(Long id);

    List<Photos> findAll();
}
