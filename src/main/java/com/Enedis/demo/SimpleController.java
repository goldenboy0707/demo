package com.Enedis.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SimpleController {
    @Autowired
    private VersionRepo versionRepo;

    // Home Page
    @GetMapping("/")
    public String welcome()
    {
        return "<html><body>"
                + "<h1>WELCOME</h1>"
                + "</body></html>";
    }

    @RequestMapping("/helloo")
    public List<Version> hello(){
        return versionRepo.findAll();
    }
}
