package com.example.cluedogame;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cluedo")
public class ViewController {

    DataService dataService;

    public ViewController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping
    public String getAll(){
        System.out.println("HeyMan");
        return "CluedoView";
    }

}
