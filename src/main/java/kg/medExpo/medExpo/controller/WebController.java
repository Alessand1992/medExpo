package kg.medExpo.medExpo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.medExpo.medExpo.model.RestResponse;
import kg.medExpo.medExpo.model.dto.*;
import kg.medExpo.medExpo.model.dto.update.*;
import kg.medExpo.medExpo.service.*;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
    @RequestMapping(value = "/logo/create",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> createLogo(@RequestBody LogoDto logoDto){
        try{
            return RestResponse.of(HttpStatus.OK,logoService.create(logoDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "logo-find-all", notes = "logo-find-all")
    @RequestMapping(value = "/logo/find-all",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> findAllLogo(){
        try{
            return RestResponse.of(HttpStatus.OK, logoService.findAll(), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "update logo", notes = "update logo")
    @RequestMapping(value = "/logo/update",method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> updateLogo(@RequestBody LogoUpdateDto logoDto){
        try{
            return RestResponse.of(HttpStatus.OK,logoService.update(logoDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "delete logo by id", notes = "delete logo by id")
    @RequestMapping(value = "/logo/delete",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> deleteLogoById(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,logoService.delete(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "find logo by id", notes = "find logo by id")
    @RequestMapping(value = "/logo",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> findLogoById(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,logoService.findById(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "infoSupport create", notes = "infoSupport create")
    @RequestMapping(value = "/infoSupport/create",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> createInfoSupport(@RequestBody InfoSupportDto infoSupportDto){
        try{
            return RestResponse.of(HttpStatus.OK,infoSupportService.create(infoSupportDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "infoSupport-find-all", notes = "infoSupport-find-all")
    @RequestMapping(value = "/infoSupport/find-all",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> findAllInfoSupport(){
        try{
            return RestResponse.of(HttpStatus.OK, infoSupportService.findAll(), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "infoSupport-update", notes = "infoSupport-update")
    @RequestMapping(value = "/infoSupport/update",method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> updateInfoSupport(@RequestBody InfoSupportUpdateDto infoSupportDto){
        try{
            return RestResponse.of(HttpStatus.OK,infoSupportService.update(infoSupportDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "infoSupport-delete-by-id", notes = "infoSupport-delete-by-id")
    @RequestMapping(value = "/infoSupport/delete",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> deleteInfoSupportById(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,infoSupportService.delete(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "infoSupport-get by id", notes = "infoSupport-get by id")
    @RequestMapping(value = "/infoSupport",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> findInfoSupportById(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,infoSupportService.findById(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "lending-create", notes = "lending-create")
    @RequestMapping(value = "/lending/create",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> createLending(@RequestBody NameDto nameDto){
        try{
            return RestResponse.of(HttpStatus.OK,lendingService.createLending(nameDto.getName()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "lending-find-all", notes = "lending-find-all")
    @RequestMapping(value = "/lending/find-all",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> findAllLending(){
        try{
            return RestResponse.of(HttpStatus.OK, lendingService.findAll(), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "lending-update", notes = "lending-update")
    @RequestMapping(value = "/lending/update",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> updateLending(@RequestBody LendingUpdateDto lendingDto){
        try{
            return RestResponse.of(HttpStatus.OK,lendingService.updateById(lendingDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "manager-phone-create", notes = "manager-phone-create")
    @RequestMapping(value = "/managerPhone/create",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> createManagerPhone(@RequestBody ManagerPhoneDto managerPhoneDto){
        try{
            return RestResponse.of(HttpStatus.OK,managerPhoneService.create(managerPhoneDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "manager-phone-find-all", notes = "manager-phone-find-all")
    @RequestMapping(value = "/manager-phone/find-all",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> findAllManagerPhone(){
        try{
            return RestResponse.of(HttpStatus.OK, managerPhoneService.findAll(), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "manager-phone-update", notes = "manager-phone-update")
    @RequestMapping(value = "/managerPhone/update",method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> updateManagerPhone(@RequestBody ManagerPhoneUpdateDto managerPhoneDto){
        try{
            return RestResponse.of(HttpStatus.OK,managerPhoneService.update(managerPhoneDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "manager-phone-delete by id", notes = "manager-phone-delete by id")
    @RequestMapping(value = "/managerPhone/delete",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> deleteManagerPhoneById(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,managerPhoneService.delete(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "manager-phone-get by id", notes = "manager-phone-get by id")
    @RequestMapping(value = "/managerPhone",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> findManagerPhoneById(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,managerPhoneService.findById(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "official-support-create", notes = "official-support-create")
    @RequestMapping(value = "/official-support/create",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> createOfficialSupport(@RequestBody OfficialSupportDto officialSupportDto){
        try{
            return RestResponse.of(HttpStatus.OK,officialSupportService.create(officialSupportDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "official-support-find-all", notes = "official-support-find-all")
    @RequestMapping(value = "/official-support/find-all",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> findAllOfficialSupport(){
        try{
            return RestResponse.of(HttpStatus.OK, officialSupportService.findAll(), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "official-support-update", notes = "official-support-update")
    @RequestMapping(value = "/official-support/update",method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> updateOfficialSupport(@RequestBody OfficialSupportUpdateDto officialSupportDto){
        try{
            return RestResponse.of(HttpStatus.OK,officialSupportService.update(officialSupportDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "official-support-delete by id", notes = "official-support-delete by id")
    @RequestMapping(value = "/official-support/delete",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> deleteOfficialSupport(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,officialSupportService.delete(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "official-support-get by id", notes = "official-support-get by id")
    @RequestMapping(value = "/official-support",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> findOfficialSupport(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,officialSupportService.findById(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "press-release-create", notes = "press-release-create")
    @RequestMapping(value = "/press-release/create",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> createPressRelease(@RequestBody PressReleaseDto pressReleaseDto){
        try{
            return RestResponse.of(HttpStatus.OK,pressReleaseService.create(pressReleaseDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "press-release-find-all", notes = "press-release-find-all")
    @RequestMapping(value = "/press-release/find-all",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> findAllPressRelease(){
        try{
            return RestResponse.of(HttpStatus.OK, pressReleaseService.findAll(), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }


    @ApiOperation(value = "press-release-update", notes = "press-release-update")
    @RequestMapping(value = "/press-release/update",method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> updatePressRelease(@RequestBody PressReleaseUpdateDto pressReleaseDto){
        try{
            return RestResponse.of(HttpStatus.OK,pressReleaseService.update(pressReleaseDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "press-release-delete by id", notes = "press-release-delete by id")
    @RequestMapping(value = "/press-release/delete",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> deletePressRelease(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,pressReleaseService.delete(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "press-release-get by id", notes = "press-release-get by id")
    @RequestMapping(value = "/press-release",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> findPressRelease(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,pressReleaseService.findById(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "program-create", notes = "program-create")
    @RequestMapping(value = "/program/create",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> createProgram(@RequestBody ProgramDto programDto){
        try{
            return RestResponse.of(HttpStatus.OK,programService.create(programDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "program-find-all", notes = "program-find-all")
    @RequestMapping(value = "/program/find-all",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> findAllProgram(){
        try{
            return RestResponse.of(HttpStatus.OK, programService.findAll(), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "program-update", notes = "program-update")
    @RequestMapping(value = "/program/update",method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> updateProgram(@RequestBody ProgramUpdateDto programDto){
        try{
            return RestResponse.of(HttpStatus.OK,programService.update(programDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "program-delete by id", notes = "program-delete by id")
    @RequestMapping(value = "/program/delete",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> deleteProgram(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,programService.delete(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "program-find by id", notes = "program-find by id")
    @RequestMapping(value = "/program",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> findProgram(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,pressReleaseService.findById(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "sponsor-create", notes = "sponsor-create")
    @RequestMapping(value = "/sponsor/create",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> createSponsor(@RequestBody SponsorDto sponsorDto){
        try{
            return RestResponse.of(HttpStatus.OK,sponsorService.create(sponsorDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "sponsor-find-all", notes = "sponsor-find-all")
    @RequestMapping(value = "/sponsor/find-all",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> findAllSponsor(){
        try{
            return RestResponse.of(HttpStatus.OK, sponsorService.findAll(), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "sponsor-update", notes = "sponsor-update")
    @RequestMapping(value = "/sponsor/update",method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> updateSponsor(@RequestBody SponsorUpdateDto sponsorDto){
        try{
            return RestResponse.of(HttpStatus.OK,sponsorService.update(sponsorDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "sponsor-delete by id", notes = "sponsor-delete by id")
    @RequestMapping(value = "/sponsor/delete",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> deleteSponsor(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,sponsorService.delete(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "sponsor-get by id", notes = "sponsor-get by id")
    @RequestMapping(value = "/sponsor",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> findSponsor(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,sponsorService.findById(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "visitor-create", notes = "visitor-create")
    @RequestMapping(value = "/visitor/create",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> createVisitor(@RequestBody VisitorDto visitorDto){
        try{
            return RestResponse.of(HttpStatus.OK,visitorService.create(visitorDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "visitor-find-all", notes = "visitor-find-all")
    @RequestMapping(value = "/visitor/find-all",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> findAllVisitor(){
        try{
            return RestResponse.of(HttpStatus.OK, visitorService.findAll(), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "visitor-update", notes = "visitor-update")
    @RequestMapping(value = "/visitor/update",method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> updateVisitor(@RequestBody VisitorUpdateDto visitorDto){
        try{
            return RestResponse.of(HttpStatus.OK,visitorService.update(visitorDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "visitor-delete by id", notes = "visitor-delete by id")
    @RequestMapping(value = "/visitor/delete",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> deleteVisitor(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,visitorService.delete(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "visitor-get by id", notes = "visitor-get by id")
    @RequestMapping(value = "/visitor",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> findVisitor(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,visitorService.findById(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "photo-create", notes = "photo-create")
    @RequestMapping(value = "/photo/create",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> createPhoto(@RequestBody PhotosDto photosDto){
        try{
            return RestResponse.of(HttpStatus.OK,photosService.create(photosDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "photo-find-all", notes = "photo-find-all")
    @RequestMapping(value = "/photo/find-all",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> findAllPhoto(){
        try{
            return RestResponse.of(HttpStatus.OK, photosService.findAll(), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "photo-update", notes = "photo-update")
    @RequestMapping(value = "/photo/update",method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> updatePhoto(@RequestBody PhotoUpdateDto photosDto){
        try{
            return RestResponse.of(HttpStatus.OK,photosService.update(photosDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "photo-delete by id", notes = "photo-delete by id")
    @RequestMapping(value = "/photo/delete",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> deletePhoto(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,photosService.delete(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "photo-get by id", notes = "photo-get by id")
    @RequestMapping(value = "/photo",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> findPhoto(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,photosService.findById(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "video-create", notes = "video-create")
    @RequestMapping(value = "/video/create",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> createVideo(@RequestBody VideoDto videoDto){
        try{
            return RestResponse.of(HttpStatus.OK,videoService.create(videoDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "video-find-all", notes = "video-find-all")
    @RequestMapping(value = "/video/find-all",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> findAllVideo(){
        try{
            return RestResponse.of(HttpStatus.OK, videoService.findAll(), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "video-update", notes = "video-update")
    @RequestMapping(value = "/video/update",method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> updateVideo(@RequestBody VideoUpdateDto videoDto){
        try{
            return RestResponse.of(HttpStatus.OK,videoService.update(videoDto), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "video-delete by id", notes = "video-delete by id")
    @RequestMapping(value = "/video/delete",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> deleteVideo(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,videoService.delete(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "video-get by id", notes = "video-get by id")
    @RequestMapping(value = "/video",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<?> findVideo(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,videoService.findById(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }
}
