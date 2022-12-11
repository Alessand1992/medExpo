package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.Photos;
import kg.medExpo.medExpo.model.dto.PhotosDto;

public interface PhotosService {

    PhotosDto findById(Long id);

    PhotosDto create(PhotosDto photosDto);

    PhotosDto update(PhotosDto photosDto);

    PhotosDto delete(PhotosDto photosDto);
}