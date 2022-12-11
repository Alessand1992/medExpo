package kg.medExpo.medExpo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.medExpo.medExpo.model.RestResponse;
import kg.medExpo.medExpo.model.dto.*;
import kg.medExpo.medExpo.service.*;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/web")
@Api(tags = "WEB")
@AllArgsConstructor
@Slf4j
public class WebController {

    private LogoService logoService;
    private InfoSupportService infoSupportService;
    private LendingService lendingService;
    private ManagerPhoneService managerPhoneService;
    private OfficialSupportService officialSupportService;
    private PhotosService photosService;
    private PressReleaseService pressReleaseService;
    private ProgramService programService;
    private SponsorService sponsorService;
    private VideoService videoService;
    private VisitorService visitorService;

    @ApiOperation(value = "create logo", notes = "create logo")
    @RequestMapping(value = "/logo/create",method = RequestMethod.POST)
    public RestResponse<?> createLogo(@RequestBody LogoDto logoDto){
        try{
            return RestResponse.of(HttpStatus.OK,logoService.create(logoDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "update logo", notes = "update logo")
    @RequestMapping(value = "/logo/update",method = RequestMethod.PUT)
    public RestResponse<?> updateLogo(@RequestBody LogoDto logoDto){
        try{
            return RestResponse.of(HttpStatus.OK,logoService.update(logoDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "delete logo by id", notes = "delete logo by id")
    @RequestMapping(value = "/logo/delete",method = RequestMethod.POST)
    public RestResponse<?> deleteLogoById(@RequestBody LogoDto logoDto){
        try{
            return RestResponse.of(HttpStatus.OK,logoService.delete(logoDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "find logo by id", notes = "find logo by id")
    @RequestMapping(value = "/logo",method = RequestMethod.POST)
    public RestResponse<?> findLogoById(@RequestBody LogoDto logoDto){
        try{
            return RestResponse.of(HttpStatus.OK,logoService.findById(logoDto.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "infoSupport create", notes = "infoSupport create")
    @RequestMapping(value = "/infoSupport/create",method = RequestMethod.POST)
    public RestResponse<?> createInfoSupport(@RequestBody InfoSupportDto infoSupportDto){
        try{
            return RestResponse.of(HttpStatus.OK,infoSupportService.create(infoSupportDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "infoSupport-update", notes = "infoSupport-update")
    @RequestMapping(value = "/infoSupport/update",method = RequestMethod.PUT)
    public RestResponse<?> updateInfoSupport(@RequestBody InfoSupportDto infoSupportDto){
        try{
            return RestResponse.of(HttpStatus.OK,infoSupportService.update(infoSupportDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "infoSupport-update", notes = "infoSupport-update")
    @RequestMapping(value = "/infoSupport/delete",method = RequestMethod.POST)
    public RestResponse<?> deleteInfoSupportById(@RequestBody InfoSupportDto infoSupportDto){
        try{
            return RestResponse.of(HttpStatus.OK,infoSupportService.delete(infoSupportDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "infoSupport-get by id", notes = "infoSupport-get by id")
    @RequestMapping(value = "/infoSupport",method = RequestMethod.POST)
    public RestResponse<?> findInfoSupportById(@RequestBody InfoSupportDto infoSupportDto){
        try{
            return RestResponse.of(HttpStatus.OK,infoSupportService.findById(infoSupportDto.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "lending-create", notes = "lending-create")
    @RequestMapping(value = "/lending/create",method = RequestMethod.POST)
    public RestResponse<?> createLending(@RequestBody LendingDto lendingDto){
        try{
            return RestResponse.of(HttpStatus.OK,lendingService.createLending(lendingDto.getName()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "lending-update", notes = "lending-update")
    @RequestMapping(value = "/lending/update",method = RequestMethod.POST)
    public RestResponse<?> updateLending(@RequestBody LendingDto lendingDto){
        try{
            return RestResponse.of(HttpStatus.OK,lendingService.updateById(lendingDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "manager-phone-create", notes = "manager-phone-create")
    @RequestMapping(value = "/managerPhone/create",method = RequestMethod.POST)
    public RestResponse<?> createManagerPhone(@RequestBody ManagerPhoneDto managerPhoneDto){
        try{
            return RestResponse.of(HttpStatus.OK,managerPhoneService.create(managerPhoneDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "manager-phone-update", notes = "manager-phone-update")
    @RequestMapping(value = "/managerPhone/update",method = RequestMethod.PUT)
    public RestResponse<?> updateManagerPhone(@RequestBody ManagerPhoneDto managerPhoneDto){
        try{
            return RestResponse.of(HttpStatus.OK,managerPhoneService.update(managerPhoneDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "manager-phone-delete by id", notes = "manager-phone-delete by id")
    @RequestMapping(value = "/managerPhone/delete",method = RequestMethod.POST)
    public RestResponse<?> deleteManagerPhoneById(@RequestBody ManagerPhoneDto managerPhoneDto){
        try{
            return RestResponse.of(HttpStatus.OK,managerPhoneService.delete(managerPhoneDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "manager-phone-get by id", notes = "manager-phone-get by id")
    @RequestMapping(value = "/managerPhone",method = RequestMethod.POST)
    public RestResponse<?> findManagerPhoneById(@RequestBody ManagerPhoneDto managerPhoneDto){
        try{
            return RestResponse.of(HttpStatus.OK,managerPhoneService.findById(managerPhoneDto.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "official-support-create", notes = "official-support-create")
    @RequestMapping(value = "/official-support/create",method = RequestMethod.POST)
    public RestResponse<?> createOfficialSupport(@RequestBody OfficialSupportDto officialSupportDto){
        try{
            return RestResponse.of(HttpStatus.OK,officialSupportService.create(officialSupportDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "official-support-update", notes = "official-support-update")
    @RequestMapping(value = "/official-support/update",method = RequestMethod.PUT)
    public RestResponse<?> updateOfficialSupport(@RequestBody OfficialSupportDto officialSupportDto){
        try{
            return RestResponse.of(HttpStatus.OK,officialSupportService.update(officialSupportDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "official-support-delete by id", notes = "official-support-delete by id")
    @RequestMapping(value = "/official-support/delete",method = RequestMethod.POST)
    public RestResponse<?> deleteOfficialSupport(@RequestBody OfficialSupportDto officialSupportDto){
        try{
            return RestResponse.of(HttpStatus.OK,officialSupportService.delete(officialSupportDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "official-support-get by id", notes = "official-support-get by id")
    @RequestMapping(value = "/official-support",method = RequestMethod.POST)
    public RestResponse<?> findOfficialSupport(@RequestBody OfficialSupportDto officialSupportDto){
        try{
            return RestResponse.of(HttpStatus.OK,officialSupportService.findById(officialSupportDto.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "press-release-create", notes = "press-release-create")
    @RequestMapping(value = "/press-release/create",method = RequestMethod.POST)
    public RestResponse<?> createPressRelease(@RequestBody PressReleaseDto pressReleaseDto){
        try{
            return RestResponse.of(HttpStatus.OK,pressReleaseService.create(pressReleaseDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "press-release-update", notes = "press-release-update")
    @RequestMapping(value = "/press-release/update",method = RequestMethod.PUT)
    public RestResponse<?> updatePressRelease(@RequestBody PressReleaseDto pressReleaseDto){
        try{
            return RestResponse.of(HttpStatus.OK,pressReleaseService.update(pressReleaseDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "press-release-delete by id", notes = "press-release-delete by id")
    @RequestMapping(value = "/press-release/delete",method = RequestMethod.POST)
    public RestResponse<?> deletePressRelease(@RequestBody PressReleaseDto pressReleaseDto){
        try{
            return RestResponse.of(HttpStatus.OK,pressReleaseService.delete(pressReleaseDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "press-release-get by id", notes = "press-release-get by id")
    @RequestMapping(value = "/press-release",method = RequestMethod.POST)
    public RestResponse<?> findPressRelease(@RequestBody PressReleaseDto pressReleaseDto){
        try{
            return RestResponse.of(HttpStatus.OK,pressReleaseService.findById(pressReleaseDto.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "program-create", notes = "program-create")
    @RequestMapping(value = "/program/create",method = RequestMethod.POST)
    public RestResponse<?> createProgram(@RequestBody ProgramDto programDto){
        try{
            return RestResponse.of(HttpStatus.OK,programService.create(programDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "program-update", notes = "program-update")
    @RequestMapping(value = "/program/update",method = RequestMethod.PUT)
    public RestResponse<?> updateProgram(@RequestBody ProgramDto programDto){
        try{
            return RestResponse.of(HttpStatus.OK,programService.update(programDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "program-delete by id", notes = "program-delete by id")
    @RequestMapping(value = "/program/delete",method = RequestMethod.POST)
    public RestResponse<?> deleteProgram(@RequestBody ProgramDto programDto){
        try{
            return RestResponse.of(HttpStatus.OK,programService.delete(programDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "program-find by id", notes = "program-find by id")
    @RequestMapping(value = "/program",method = RequestMethod.POST)
    public RestResponse<?> findProgram(@RequestBody ProgramDto programDto){
        try{
            return RestResponse.of(HttpStatus.OK,pressReleaseService.findById(programDto.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "sponsor-create", notes = "sponsor-create")
    @RequestMapping(value = "/sponsor/create",method = RequestMethod.POST)
    public RestResponse<?> createSponsor(@RequestBody SponsorDto sponsorDto){
        try{
            return RestResponse.of(HttpStatus.OK,sponsorService.create(sponsorDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "sponsor-update", notes = "sponsor-update")
    @RequestMapping(value = "/sponsor/update",method = RequestMethod.PUT)
    public RestResponse<?> updateSponsor(@RequestBody SponsorDto sponsorDto){
        try{
            return RestResponse.of(HttpStatus.OK,sponsorService.update(sponsorDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "sponsor-delete by id", notes = "sponsor-delete by id")
    @RequestMapping(value = "/sponsor/delete",method = RequestMethod.POST)
    public RestResponse<?> deleteSponsor(@RequestBody SponsorDto sponsorDto){
        try{
            return RestResponse.of(HttpStatus.OK,sponsorService.delete(sponsorDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "sponsor-get by id", notes = "sponsor-get by id")
    @RequestMapping(value = "/sponsor",method = RequestMethod.POST)
    public RestResponse<?> findSponsor(@RequestBody SponsorDto sponsorDto){
        try{
            return RestResponse.of(HttpStatus.OK,sponsorService.findById(sponsorDto.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "visitor-create", notes = "visitor-create")
    @RequestMapping(value = "/visitor/create",method = RequestMethod.POST)
    public RestResponse<?> createVisitor(@RequestBody VisitorDto visitorDto){
        try{
            return RestResponse.of(HttpStatus.OK,visitorService.create(visitorDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "visitor-update", notes = "visitor-update")
    @RequestMapping(value = "/visitor/update",method = RequestMethod.PUT)
    public RestResponse<?> updateVisitor(@RequestBody VisitorDto visitorDto){
        try{
            return RestResponse.of(HttpStatus.OK,visitorService.update(visitorDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "visitor-delete by id", notes = "visitor-delete by id")
    @RequestMapping(value = "/visitor/delete",method = RequestMethod.POST)
    public RestResponse<?> deleteVisitor(@RequestBody VisitorDto visitorDto){
        try{
            return RestResponse.of(HttpStatus.OK,visitorService.delete(visitorDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "visitor-get by id", notes = "visitor-get by id")
    @RequestMapping(value = "/visitor",method = RequestMethod.POST)
    public RestResponse<?> findVisitor(@RequestBody VisitorDto visitorDto){
        try{
            return RestResponse.of(HttpStatus.OK,visitorService.findById(visitorDto.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "photo-create", notes = "photo-create")
    @RequestMapping(value = "/photo/create",method = RequestMethod.POST)
    public RestResponse<?> createPhoto(@RequestBody PhotosDto photosDto){
        try{
            return RestResponse.of(HttpStatus.OK,photosService.create(photosDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "photo-update", notes = "photo-update")
    @RequestMapping(value = "/photo/update",method = RequestMethod.PUT)
    public RestResponse<?> updatePhoto(@RequestBody PhotosDto photosDto){
        try{
            return RestResponse.of(HttpStatus.OK,photosService.update(photosDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "photo-delete by id", notes = "photo-delete by id")
    @RequestMapping(value = "/photo/delete",method = RequestMethod.POST)
    public RestResponse<?> deletePhoto(@RequestBody PhotosDto photosDto){
        try{
            return RestResponse.of(HttpStatus.OK,photosService.delete(photosDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "photo-get by id", notes = "photo-get by id")
    @RequestMapping(value = "/photo",method = RequestMethod.POST)
    public RestResponse<?> findPhoto(@RequestBody PhotosDto photosDto){
        try{
            return RestResponse.of(HttpStatus.OK,photosService.findById(photosDto.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "video-create", notes = "video-create")
    @RequestMapping(value = "/video/create",method = RequestMethod.POST)
    public RestResponse<?> createVideo(@RequestBody VideoDto videoDto){
        try{
            return RestResponse.of(HttpStatus.OK,videoService.create(videoDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "video-update", notes = "video-update")
    @RequestMapping(value = "/video/update",method = RequestMethod.PUT)
    public RestResponse<?> updateVideo(@RequestBody VideoDto videoDto){
        try{
            return RestResponse.of(HttpStatus.OK,videoService.update(videoDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "video-delete by id", notes = "video-delete by id")
    @RequestMapping(value = "/video/delete",method = RequestMethod.POST)
    public RestResponse<?> deleteVideo(@RequestBody VideoDto videoDto){
        try{
            return RestResponse.of(HttpStatus.OK,videoService.delete(videoDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "video-get by id", notes = "video-get by id")
    @RequestMapping(value = "/video",method = RequestMethod.POST)
    public RestResponse<?> findVideo(@RequestBody VideoDto videoDto){
        try{
            return RestResponse.of(HttpStatus.OK,videoService.findById(videoDto.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }
}
