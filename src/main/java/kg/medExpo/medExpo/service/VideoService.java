package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.Video;
import kg.medExpo.medExpo.model.dto.VideoDto;

public interface VideoService {

    VideoDto findById(Long id);

    VideoDto create(VideoDto videoDto);

    VideoDto update(VideoDto videoDto);

    VideoDto delete(VideoDto videoDto);
}
