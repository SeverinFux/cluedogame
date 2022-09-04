package com.example.cluedogame.Models;

import lombok.Data;

@Data
public class Wapons {
    String bezeichnung;
    float laengeInCm;
    float gewichtInG;
    String material;
    String nutzungsBereich;

    public Wapons(){

    }
    public Wapons(String bezeichnung, float laengeInCm, float gewichtInG, String material, String nutzungsBereich) {
        this.bezeichnung = bezeichnung;
        this.laengeInCm = laengeInCm;
        this.gewichtInG = gewichtInG;
        this.material = material;
        this.nutzungsBereich = nutzungsBereich;
    }
}
