package com.jj.tienda.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.jj.tienda.Models.Repository.SaboresRepository;

@Controller
public class SaborController {

    @Autowired
    private SaboresRepository saborRepository;

    @GetMapping("/sabores")
    public String listarSabores(Model model) {
        model.addAttribute("sabores", saborRepository.findAll());
        return "sabores"; // Thymeleaf buscará "sabores.html"
    }
}
