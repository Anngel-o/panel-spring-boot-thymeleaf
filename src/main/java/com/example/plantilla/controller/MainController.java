package com.example.plantilla.controller;

import com.example.plantilla.model.PanelObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/")
    public String inicio(Model model){

        List<PanelObject> panelDefault = new ArrayList<>();
        panelDefault.add(new PanelObject("Nombre", "Angel Ortiz"));
        panelDefault.add(new PanelObject("Correo", "anngelo.omz@gmail.com"));
        panelDefault.add(new PanelObject("Github:", "https://github.com/anngel-o"));
        panelDefault.add(new PanelObject("Pokemon 1", "Charizard"));
        panelDefault.add(new PanelObject("Pokemon 2", "Pikachu"));
        panelDefault.add(new PanelObject("Pokemon 3", "Monkey"));
        panelDefault.add(new PanelObject("Pokemon 4", "Hitmonlee"));
        panelDefault.add(new PanelObject("Pokemon 5", ""));



        model.addAttribute("panelDefault", panelDefault);

        return "index";
    }

}
