package com.example.cluedogame.Models;

import lombok.Data;

import java.util.List;
@Data
public class Room {
    public String roomName;
    String bodenbelag;
    int anzTueren;
    int anzFenster;
    List<String> moebel;

    public Room(){

    }
    public Room(String name, String bodenbelag, int anzTueren, int anzFenster, List<String> moebel) {
        this.roomName = name;
        this.bodenbelag = bodenbelag;
        this.anzTueren = anzTueren;
        this.anzFenster = anzFenster;
        this.moebel = moebel;
    }
}
