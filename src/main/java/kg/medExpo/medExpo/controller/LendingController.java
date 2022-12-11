package kg.medExpo.medExpo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.medExpo.medExpo.model.MessageRequest;
import kg.medExpo.medExpo.model.RestResponse;
import kg.medExpo.medExpo.model.Visitor;
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
    @RequestMapping(value = "/by-id",method = RequestMethod.POST)
    public RestResponse<?> findLendingById(@RequestParam Long id){
        try{
            return RestResponse.of(HttpStatus.OK,lendingService.findById(id), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "get visitors by id", notes = "get lending by id")
    @RequestMapping(value = "/visitor-id",method = RequestMethod.POST)
    public RestResponse<?> findVisitorById(@RequestParam Long id){
        try{
            return RestResponse.of(HttpStatus.OK,visitorService.findById(id), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "get press release by id", notes = "get lending by id")
    @RequestMapping(value = "/by-id",method = RequestMethod.POST)
    public RestResponse<?> findPressReleaseById(@RequestParam Long id){
        try{
            return RestResponse.of(HttpStatus.OK,pressReleaseService.findById(id), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

    @ApiOperation(value = "get official support by id", notes = "get lending by id")
    @RequestMapping(value = "/by-id",method = RequestMethod.POST)
    public RestResponse<?> findOfficialSupportById(@RequestParam Long id){
        try{
            return RestResponse.of(HttpStatus.OK,officialSupportService.findById(id), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }



}
