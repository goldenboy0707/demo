package com.Enedis.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VersionRepo extends JpaRepository<Version, Long> {

    List<Version> findAll();


}
