package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.Video;
import kg.medExpo.medExpo.model.dto.VideoDto;

import java.util.List;

public interface VideoService {

    Video findById(Long id);

    VideoDto create(VideoDto videoDto);

    VideoDto update(Long id,VideoDto videoDto);

    String delete(Long id);

    List<Video> findAll();
}
