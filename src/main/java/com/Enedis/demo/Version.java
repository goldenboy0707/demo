package com.Enedis.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Version {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String  getVersa() {
        return versa;
    }

    public void setVersa(String  versa) {
        this.versa = versa;
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "versa")
    private String  versa;
    public Version(){}



    public Version(Long id, String versa){
        this.id=id;
        this.versa=versa;

    }

}
