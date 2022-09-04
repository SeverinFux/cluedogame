package com.example.cluedogame.Models;

import java.util.ArrayList;
import java.util.List;

public class Room {
    String name;
    int anzTueren;
    String bodenbelag;
    List<Room> roomsList = new ArrayList<>();

    public Room(String name, int anzTueren, String bodenbelag) {
        this.name = name;
        this.anzTueren = anzTueren;
        this.bodenbelag = bodenbelag;
    }
    public List<Room> getRoomsList(){
        return roomsList;
    }
}
