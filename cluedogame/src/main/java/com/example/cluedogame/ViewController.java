package com.example.cluedogame;

import com.example.cluedogame.Models.Person;
import com.example.cluedogame.Models.Room;
import com.example.cluedogame.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cluedo")
public class ViewController {

    @Autowired
    DataService service;

    public ViewController(DataService service) {
        this.service = service;
    }

    @GetMapping
    public String getPerson(Model model){
        System.out.println("getData");
        Person person = new Person();
        System.out.println("Hhalllo welt");
        Room room = new Room();
        System.out.println(service.getRoomList().get(1));
        model.addAttribute("personlist", service.getPersonList());
        model.addAttribute("waponlist", service.getWaponList());
        model.addAttribute("roomlist", service.getRoomList());
        return "CluedoView";
    }

}
