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
                    new Person("Herr", "Vjaee", 15, "Bauarbeiter", "Schwarz"),
                    new Person("Frau", "Züst", 23, "Lehrerin", "Rot"),
                    new Person("Herr", "XD", 17,"Putzman", "Schwarz"),
                    new Person("Frau", "Rhyner", 54, "Köchin", "Weiss")

            )
    );
    private List<Wapons> waponList = new ArrayList<>(
            Arrays.asList(
                    new Wapons("Seil", 250, 13, "Seide", "Befestigung"),
                    new Wapons("Dolch", 48, 17,"Eisen", "Angriff / Verteidigung"),
                    new Wapons("kerzenständer", 45, 15, "Gusseisen", "Lichtunterstützung"),
                    new Wapons("Badewanne", 250, 3000, "Gusseisen", "säubern"),
                    new Wapons("TikTok", 6, 30, "Plastik", "Jonas"),
                    new Wapons("Rohr", 80, 150, "Eisen", "wasserleitung")
            )
    );
    private List<Room> roomList = new ArrayList<>(
            Arrays.asList(
                    new Room("Küche","Stein", 1,3, new ArrayList<>(List.of("Herd", "Kühlschrank", "Waschbecken"))),
                    new Room("Wohnzimmer","Holz", 3,4, new ArrayList<>(List.of("Sofa", "Tisch", "Stuhl"))),
                    new Room("Gästezimmer","Tepich", 2,1, new ArrayList<>(List.of("Bett", "Schrank", "Tisch"))),
                    new Room("Badezimmer","Keramik", 6,3, new ArrayList<>(List.of("Herd", "Kühlschrank", "Waschbecken"))),
                    new Room("Kinderzimmer","Holz", 1,1, new ArrayList<>(List.of("Kinderbett", "Tisch", "Schublade"))),
                    new Room("Toilette","Keramik", 1,1, new ArrayList<>(List.of("WC", "Lavabo", "Schrank")))
            )
    );
}
