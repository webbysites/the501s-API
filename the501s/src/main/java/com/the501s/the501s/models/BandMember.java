package com.the501s.the501s.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("bandMember")
public class BandMember {
    @Id
    private String id;
    private String name;
    private List<String> instruments;
    private String singing;
    private String guitar;
    private String bass;
    private String drums;
    private String accordion;
    private String practice;
    private String pic;


    public BandMember() {
    }

    public BandMember(String id, String name, List<String> instruments, String singing, String guitar, String bass, String drums, String accordion, String practice, String pic) {
        this.id = id;
        this.name = name;
        this.instruments = instruments;
        this.singing = singing;
        this.guitar = guitar;
        this.bass = bass;
        this.drums = drums;
        this.accordion = accordion;
        this.practice = practice;
        this.pic = pic;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getInstruments() {
        return this.instruments;
    }

    public void setInstruments(List<String> instruments) {
        this.instruments = instruments;
    }

    public String getSinging() {
        return this.singing;
    }

    public void setSinging(String singing) {
        this.singing = singing;
    }

    public String getGuitar() {
        return this.guitar;
    }

    public void setGuitar(String guitar) {
        this.guitar = guitar;
    }

    public String getBass() {
        return this.bass;
    }

    public void setBass(String bass) {
        this.bass = bass;
    }

    public String getDrums() {
        return this.drums;
    }

    public void setDrums(String drums) {
        this.drums = drums;
    }

    public String getAccordion() {
        return this.accordion;
    }

    public void setAccordion(String accordion) {
        this.accordion = accordion;
    }

    public String getPractice() {
        return this.practice;
    }

    public void setPractice(String practice) {
        this.practice = practice;
    }

    public String getPic() {
        return this.pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public BandMember id(String id) {
        this.id = id;
        return this;
    }

    public BandMember name(String name) {
        this.name = name;
        return this;
    }

    public BandMember instruments(List<String> instruments) {
        this.instruments = instruments;
        return this;
    }

    public BandMember singing(String singing) {
        this.singing = singing;
        return this;
    }

    public BandMember guitar(String guitar) {
        this.guitar = guitar;
        return this;
    }

    public BandMember bass(String bass) {
        this.bass = bass;
        return this;
    }

    public BandMember drums(String drums) {
        this.drums = drums;
        return this;
    }

    public BandMember accordion(String accordion) {
        this.accordion = accordion;
        return this;
    }

    public BandMember practice(String practice) {
        this.practice = practice;
        return this;
    }

    public BandMember pic(String pic) {
        this.pic = pic;
        return this;
    }

}