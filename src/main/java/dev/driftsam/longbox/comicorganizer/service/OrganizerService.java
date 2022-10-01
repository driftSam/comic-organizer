package dev.driftsam.longbox.comicorganizer.service;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrganizerService {
   
    
    public List<Path> listFiles (Path path){
        List<Path> files = new ArrayList<>();

        try (DirectoryStream stream = Files.newDirectoryStream(path, "*.{cbz, cbr}")) {


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return files;
    }
}
