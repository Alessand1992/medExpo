package kg.medExpo.medExpo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.medExpo.medExpo.model.MessageRequest;
import kg.medExpo.medExpo.model.RestResponse;
import kg.medExpo.medExpo.service.LendingService;
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

    @ApiOperation(value = "get lending by id", notes = "get lending by id")
    @RequestMapping(value = "/by-id",method = RequestMethod.POST)
    public RestResponse<?> findLendingById(@RequestParam Long id){
        try{
            return RestResponse.of(HttpStatus.OK,lendingService.findById(id), Map.of("0","Success"));
        }catch (Exception e){
            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
        }
    }

//    @ApiOperation(value = "request for message", notes = "request for message")
//    @RequestMapping(value = "/by-id",method = RequestMethod.POST)
//    public RestResponse<?> requestForMessage(@RequestBody MessageRequest messageRequest){
//        try{
//            return RestResponse.of(HttpStatus.OK,lendingService.createMessage(messageRequest), Map.of("0","Success"));
//        }catch (Exception e){
//            return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
//        }
//    }

}
