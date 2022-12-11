package kg.medExpo.medExpo.service.impl;

import kg.medExpo.medExpo.model.FileResponse;
import kg.medExpo.medExpo.repo.FileRepo;
import kg.medExpo.medExpo.service.FileService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import java.io.*;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;
import java.util.stream.Stream;

@AllArgsConstructor
@Service
@Slf4j
public class FileServiceImpl implements FileService {

    private final Path rootLocation = Path.of("Img");

    @Override
    @PostConstruct
    public void init() throws Exception {
        try {
            Files.createDirectories(Path.of(String.valueOf(rootLocation)));
        } catch (IOException e) {
            throw new Exception("Could not initialize storage location", e);
        }
    }


    @Override
    public String uploadFile(MultipartFile file) throws Exception {
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        try {
            if (file.isEmpty()) {
                throw new Exception("Failed to store empty file " + filename);
            }
            if (filename.contains("..")) {
                // This is a security check
                throw new Exception(
                        "Cannot store file with relative path outside current directory "
                                + filename);
            }
            try (InputStream inputStream = file.getInputStream()) {
                Files.copy(inputStream, rootLocation.resolve(filename),
                        StandardCopyOption.REPLACE_EXISTING);
            }
        }
        catch (IOException e) {
            throw new Exception("Failed to store file " + filename, e);
        }

        return filename;
    }


    @Override
    public Stream<Path> loadAll() throws Exception {
        try {
            return Files.walk(rootLocation, 1)
                    .filter(path -> !path.equals(this.rootLocation))
                    .map(this.rootLocation::relativize);
        } catch (IOException e) {
            throw new Exception("Failed to read stored files", e);
        }
    }

    @Override
    public Path load(String filename) {
        return rootLocation.resolve(filename);
    }

    @Override
    public Resource loadAsResource(String filename) throws Exception {
        try {
            Path file = load(filename);
            Resource resource = new UrlResource(file.toUri());
            if (resource.exists() || resource.isReadable()) {
                return resource;
            } else {
                throw new Exception(
                        "Could not read file: " + filename);
            }
        } catch (MalformedURLException e) {
            throw new Exception("Could not read file: " + filename, e);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
