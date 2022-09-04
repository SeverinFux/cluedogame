package com.example.cluedogame.Models;

import lombok.Data;

@Data
public class Person {
    String anrede;
    String name;
    int alter;
    String beruf;
    String haarfarbe;

    public Person() {
    }

    public Person(String anrede, String name, int alter, String beruf, String haarfarbe) {
        this.anrede = anrede;
        this.name = name;
        this.alter = alter;
        this.beruf = beruf;
        this.haarfarbe = haarfarbe;
    }
    


}
