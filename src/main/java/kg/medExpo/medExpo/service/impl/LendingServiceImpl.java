package kg.medExpo.medExpo.service.impl;

import kg.medExpo.medExpo.model.*;
import kg.medExpo.medExpo.model.dto.LendingDto;
import kg.medExpo.medExpo.repo.*;
import kg.medExpo.medExpo.service.LendingService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class LendingServiceImpl implements LendingService {
    private LendingRepo lendingRepo;
    private LogoRepo logoRepo;
    private InfoSupportRepo infoSupportRepo;
    private OfficialSupportRepo officialSupportRepo;
    private SponsorRepo sponsorRepo;
    private PhotosRepo photosRepo;
    private VideoRepo videoRepo;
    private LanguageRepo languageRepo;
    private PressReleaseRepo pressReleaseRepo;
    private ProgramRepo programRepo;
    private ManagerPhoneRepo managerPhoneRepo;

    @Override
    public Lending findById(Long id) {
        return lendingRepo.getReferenceById(id);
    }

    @Override
    public Lending updateById(LendingDto lendingDto) {
        Lending lending = lendingRepo.getReferenceById(lendingDto.getId());
        List<InfoSupport> infoSupports = new ArrayList<>();
        List<OfficialSupport> officialSupports = new ArrayList<>();
        List<Sponsor> sponsors = new ArrayList<>();
        List<Photos> photos = new ArrayList<>();
        List<Video> videos = new ArrayList<>();
        lending.setLogo(logoRepo.getReferenceById(lendingDto.getId()));
        lending.setStartDate(lendingDto.getStartDate());
        lending.setEndDate(lendingDto.getEndDate());

        for(int i = 0;i<lendingDto.getInfoSupport().size();i++) {
            InfoSupport infoSupport = infoSupportRepo.getReferenceById(lendingDto.getInfoSupport().get(i));
            infoSupports.add(infoSupport);
        }
        lending.setInfoSupport(infoSupports);

        for(int i = 0;i<lendingDto.getOfficialSupport().size();i++) {
            OfficialSupport officialSupport = officialSupportRepo.getReferenceById(lendingDto.getOfficialSupport().get(i));
            officialSupports.add(officialSupport);
        }
        lending.setOfficialSupport(officialSupports);

        for(int i = 0;i<lendingDto.getSponsor().size();i++) {
            Sponsor sponsor = sponsorRepo.getReferenceById(lendingDto.getSponsor().get(i));
            sponsors.add(sponsor);
        }
        lending.setSponsor(sponsors);
        lending.setPrograms(programRepo.getReferenceById(lendingDto.getPrograms()));

        for(int i = 0;i<lendingDto.getPhotos().size();i++) {
            Photos photo = photosRepo.getReferenceById(lendingDto.getPhotos().get(i));
            photos.add(photo);
        }
        lending.setPhotos(photos);

        for(int i = 0;i<lendingDto.getVideo().size();i++) {
            Video video = videoRepo.getReferenceById(lendingDto.getVideo().get(i));
            videos.add(video);
        }
        lending.setVideo(videos);
        lending.setManagersPhones(managerPhoneRepo.getReferenceById(lendingDto.getManagersPhones()));
        lending.setLanguage(languageRepo.getReferenceById(lendingDto.getLanguage()));
        lending.setPressRelease(pressReleaseRepo.getReferenceById(lendingDto.getPressReleaseId()));
        lendingRepo.save(lending);
        return lending;
    }

    @Override
    public String createLending(String lendingName) {
        Lending lending = new Lending();
        lending.setName(lendingName);
        return "Success create lending " + lendingName;
    }

    @Override
    public List<Lending> findAll() {
        return lendingRepo.findAll();
    }

    @Override
    public String createMessage(MessageRequest messageRequest) {
        return null;
    }
}
