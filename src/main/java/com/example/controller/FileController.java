package com.example.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/files")
public class FileController {
    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        return "Uploaded: " + file.getOriginalFilename();
    }
}
