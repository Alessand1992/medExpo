package kg.medExpo.medExpo.service.impl;

import kg.medExpo.medExpo.model.Photos;
import kg.medExpo.medExpo.model.dto.PhotosDto;
import kg.medExpo.medExpo.repo.PhotosRepo;
import kg.medExpo.medExpo.service.PhotosService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class PhotosServiceImpl implements PhotosService {

    private PhotosRepo photosRepo;

    @Override
    public PhotosDto findById(Long id) {
        Photos photos = photosRepo.getReferenceById(id);
        PhotosDto photosDto = new PhotosDto();
        photosDto.setId(photos.getId());
        photosDto.setUrl(photos.getUrl());
        return photosDto;
    }

    @Override
    public PhotosDto create(PhotosDto photosDto) {
        Photos photos = new Photos();
        photos.setUrl(photosDto.getUrl());
        photosRepo.save(photos);
        return photosDto;
    }

    @Override
    public PhotosDto update(PhotosDto photosDto) {
        Photos photos = photosRepo.getReferenceById(photosDto.getId());
        photos.setUrl(photosDto.getUrl());
        return photosDto;
    }

    @Override
    public PhotosDto delete(PhotosDto photosDto) {
        photosRepo.deleteById(photosDto.getId());
        return photosDto;
    }

    @Override
    public List<Photos> findAll() {
        return photosRepo.findAll();
    }
}
