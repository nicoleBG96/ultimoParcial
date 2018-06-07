package com.ucbcba.taller.services;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class UploadFileService {

    private String upload_folder=".//src//main//resources//static//files//";

    public void saveFile(MultipartFile file,String nombre) throws IOException {
        if(!file.isEmpty()){
            byte[] bytes=file.getBytes();
            Path path= Paths.get(upload_folder+nombre+".jpg");
            Files.write(path,bytes);

        }
    }
}
