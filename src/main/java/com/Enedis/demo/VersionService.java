package com.Enedis.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VersionService {
    @Autowired
    VersionRepo versionRepo;

    public List<Version> getVideosFromDB() {
        return versionRepo.findAll();
    }

}



