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
        panelDefault.add(new PanelObject("Pokemon 5", "Pichu"));
        panelDefault.add(new PanelObject("Pokemon 6", "Chansey"));
        panelDefault.add(new PanelObject("Pokemon 7", "Pidgotto"));
        panelDefault.add(new PanelObject("Pokemon 8", "Blastoise"));
        panelDefault.add(new PanelObject("Pokemon 9", "Alakasam"));
        panelDefault.add(new PanelObject("Pokemon 10", "Ditto"));

        List<PanelObject> panelPrimary = new ArrayList<>();
        panelPrimary.add(new PanelObject("Nombre", "Angel Ortiz"));
        panelPrimary.add(new PanelObject("Correo", "anngelo.omz@gmail.com"));
        panelPrimary.add(new PanelObject("Github:", "https://github.com/anngel-o"));
        panelPrimary.add(new PanelObject("Pokemon 1", "Charizard"));
        panelPrimary.add(new PanelObject("Pokemon 2", "Pikachu"));
        panelPrimary.add(new PanelObject("Pokemon 3", "Monkey"));
        panelPrimary.add(new PanelObject("Pokemon 4", "Hitmonlee"));
        panelPrimary.add(new PanelObject("Pokemon 5", "Pichu"));
        panelPrimary.add(new PanelObject("Pokemon 6", "Chansey"));
        panelPrimary.add(new PanelObject("Pokemon 7", "Pidgotto"));
        panelPrimary.add(new PanelObject("Pokemon 8", "Blastoise"));
        panelPrimary.add(new PanelObject("Pokemon 9", "Alakasam"));
        panelPrimary.add(new PanelObject("Pokemon 10", "Ditto"));

        model.addAttribute("panelDefault", panelDefault);
        model.addAttribute("panelPrimary", panelPrimary);

        return "index";
    }

}
