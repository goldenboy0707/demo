package com.Enedis.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VersionService {
    @Autowired
    VersionRepo versionRepo;
    public List<Version> getAllVersion(){
        return versionRepo.findAll();
    }

    public String AddVersion(Version version){
        versionRepo.save(version);
        return "seuccess";
    }
}
