package com.example.cluedogame.service;

import com.example.cluedogame.Models.History;
import com.example.cluedogame.Models.Person;
import com.example.cluedogame.Models.Room;
import com.example.cluedogame.Models.Wapons;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Setter
@Getter
public class DataService {

    private List<Person> personList = new ArrayList<>(
            Arrays.asList(
                    new Person("Herr", "Fux", 13, "Metzger", "Baige"),
                    new Person("Herr", "Ruff", 17,"Einfach Reich", "Bruun"),
                    new Person("Herr", "Vjaee", 15, "Bauarbeiter", "Schwarz")
            )
    );
    private List<Wapons> waponList = new ArrayList<>(
            Arrays.asList(
                    new Wapons("Seil", 250, 13, "Saide", "Befestigung"),
                    new Wapons("Dolch", 48, 17,"Eisen", "Angriff / Verteidigung"),
                    new Wapons("Herzenständer", 45, 15, "Gusseisen", "Lichtunterstützung")
            )
    );
}
