package com.Enedis.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "versio")
public class Version {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVer() {
        return ver;
    }

    public void setVer(int ver) {
        this.ver = ver;
    }

    @Id
    @GeneratedValue
    private Long id;
    private int ver;
    public Version(){}

    public Version(Long id, int ver){
        this.id=id;
        this.ver=ver;

    }

}
