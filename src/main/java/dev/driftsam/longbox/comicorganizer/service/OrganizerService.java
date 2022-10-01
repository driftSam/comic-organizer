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

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path, "*.{cbz, cbr}")){
            stream.forEach(entry->{
                files.add(entry);
            });

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return files;
    }
}
