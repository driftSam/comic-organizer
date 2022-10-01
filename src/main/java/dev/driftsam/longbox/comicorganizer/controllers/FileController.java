package dev.driftsam.longbox.comicorganizer.controllers;

import java.nio.file.Path;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.driftsam.longbox.comicorganizer.service.OrganizerService;

@RestController
public class FileController {

    private OrganizerService service;

    public FileController(OrganizerService service){
        this.service = service;
    }
    
    @GetMapping
    public List<Path> listFiles(Path path){
        return service.listFiles(path);

    }
}
