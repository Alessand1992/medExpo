package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.FileResponse;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.stream.Stream;

public interface FileService {
    void init() throws Exception;

    String uploadFile(MultipartFile file) throws Exception;

    Stream<Path> loadAll() throws Exception;

    Path load(String filename);

    Resource loadAsResource(String filename) throws Exception;
}
