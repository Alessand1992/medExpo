package kg.medExpo.medExpo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.medExpo.medExpo.model.File;
import kg.medExpo.medExpo.model.FileResponse;
import kg.medExpo.medExpo.model.RestResponse;
import kg.medExpo.medExpo.model.dto.FileDto;
import kg.medExpo.medExpo.repo.FileRepo;
import kg.medExpo.medExpo.service.FileService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/file")
@Api(tags = "FILE")
@AllArgsConstructor
@Slf4j
public class FileController {

    private FileService storageService;
    private FileRepo fileRepo;

    @ApiOperation(value = "files_list", notes = "files list")
    @GetMapping("/")
    public RestResponse<?> listAllFiles() throws Exception {
            try{
                return RestResponse.of(HttpStatus.OK,fileRepo.findAll(), Map.of("0","Success"));
            }catch (Exception e){
                return RestResponse.of(HttpStatus.NOT_FOUND,e.getMessage(), Map.of("-1","Error"));
            }
    }

    @ApiOperation(value = "download file", notes = "download file")
    @GetMapping("/download/{filename}")
    @ResponseBody
    public ResponseEntity<Resource> downloadFile(@PathVariable(name = "filename") String filename) throws Exception {

        Resource resource = storageService.loadAsResource(filename);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }

    @ApiOperation(value = "upload-file", notes = "upload-file")
    @PostMapping("/upload-file")
    @ResponseBody
    public FileResponse uploadFile(@RequestParam("file") MultipartFile file) throws Exception {
        String name = storageService.uploadFile(file);

        String uri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("file/download/")
                .path(name)
                .toUriString();
        File file1 = new File();
        file1.setFileName(file.getOriginalFilename());
        file1.setUri(uri);
        fileRepo.save(file1);
        return new FileResponse(name, uri, file.getContentType(), file.getSize());
    }

    @ApiOperation(value = "upload-files", notes = "upload-files")
    @PostMapping("/upload-multiple-files")
    @ResponseBody
    public List<FileResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
        return Arrays.stream(files)
                .map(file -> {
                    try {
                        return uploadFile(file);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return null;
                })
                .collect(Collectors.toList());
    }
}
