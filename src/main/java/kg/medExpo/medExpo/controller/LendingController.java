package kg.medExpo.medExpo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.medExpo.medExpo.model.MessageRequest;
import kg.medExpo.medExpo.model.RestResponse;
import kg.medExpo.medExpo.model.Visitor;
import kg.medExpo.medExpo.model.dto.update.IdDto;
import kg.medExpo.medExpo.service.LendingService;
import kg.medExpo.medExpo.service.OfficialSupportService;
import kg.medExpo.medExpo.service.PressReleaseService;
import kg.medExpo.medExpo.service.VisitorService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/lending")
@Api(tags = "LENDING")
@AllArgsConstructor
@Slf4j
public class LendingController {

    private LendingService lendingService;
    private PressReleaseService pressReleaseService;
    private VisitorService visitorService;
    private OfficialSupportService officialSupportService;

    @ApiOperation(value = "get lending by id", notes = "get lending by id")
    @RequestMapping(value = "/lending-id",method = RequestMethod.POST)
    public RestResponse<?> findLendingById(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,lendingService.findById(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "get visitors by id", notes = "get visitors by id")
    @RequestMapping(value = "/visitor-id",method = RequestMethod.POST)
    public RestResponse<?> findVisitorById(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,visitorService.findById(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "get press release by id", notes = "get press release by id")
    @RequestMapping(value = "/pressRelease-id",method = RequestMethod.POST)
    public RestResponse<?> findPressReleaseById(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,pressReleaseService.findById(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "get official support by id", notes = "get official support by id")
    @RequestMapping(value = "/officialSupport-id",method = RequestMethod.POST)
    public RestResponse<?> findOfficialSupportById(@RequestBody IdDto id){
        try{
            return RestResponse.of(HttpStatus.OK,officialSupportService.findById(id.getId()), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }



}
