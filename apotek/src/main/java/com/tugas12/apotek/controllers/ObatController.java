package com.tugas12.apotek.controllers;

import com.tugas12.apotek.models.Obat;
import com.tugas12.apotek.services.ObatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ObatController {
    @Autowired
    private ObatService obatService;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("listObat", obatService.getAllObat());
        return "home";
    }

    @GetMapping("/add-obat")
    public String addObatPage() {
        return "add-obat";
    }

    @PostMapping("/add-obat")
    public String addObat(@ModelAttribute Obat obat) {
        obatService.addObat(obat);
        return "redirect:/home";
    }

    @GetMapping("/delete-obat/{id}")
    public String deleteObat(@PathVariable Integer id) {
        obatService.deleteObatById(id);
        return "redirect:/home";
    }
}
