package com.example.cluedogame;

import com.example.cluedogame.Models.History;
import com.example.cluedogame.Models.Persons;
import com.example.cluedogame.Models.Rooms;
import com.example.cluedogame.Models.Wapons;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {
    List<Persons> persons = new ArrayList<>();
    List<Wapons> wepons = new ArrayList<>();
    List<Rooms> rooms = new ArrayList<>();
    List<History> history = new ArrayList<>();

    public DataService(List<Persons> persons, List<Wapons> wepons, List<Rooms> rooms, List<History> history) {
        this.persons = persons;
        this.wepons = wepons;
        this.rooms = rooms;
        this.history = history;
    }
}
