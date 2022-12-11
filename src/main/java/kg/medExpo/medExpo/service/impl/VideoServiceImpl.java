package kg.medExpo.medExpo.service.impl;

import kg.medExpo.medExpo.model.Video;
import kg.medExpo.medExpo.model.dto.VideoDto;
import kg.medExpo.medExpo.repo.VideoRepo;
import kg.medExpo.medExpo.service.VideoService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class VideoServiceImpl implements VideoService {

    private VideoRepo videoRepo;

    @Override
    public VideoDto findById(Long id) {
        Video video = videoRepo.getReferenceById(id);
        VideoDto videoDto = new VideoDto();
        videoDto.setId(video.getId());
        videoDto.setUrl(video.getUrl());
        return videoDto;
    }

    @Override
    public VideoDto create(VideoDto videoDto) {
        Video video = new Video();
        video.setUrl(videoDto.getUrl());
        videoRepo.save(video);
        return videoDto;
    }

    @Override
    public VideoDto update(VideoDto videoDto) {
        Video video = videoRepo.getReferenceById(videoDto.getId());
        video.setUrl(videoDto.getUrl());
        return videoDto;
    }

    @Override
    public VideoDto delete(VideoDto videoDto) {
        videoRepo.deleteById(videoDto.getId());
        return videoDto;
    }

    @Override
    public List<Video> findAll() {
        return videoRepo.findAll();
    }
}
