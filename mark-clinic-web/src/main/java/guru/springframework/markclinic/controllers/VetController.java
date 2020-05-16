package guru.springframework.markclinic.controllers;

import guru.springframework.markclinic.model.Vet;
import guru.springframework.markclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html", "/vets.html"})
    public String listVets(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }

    @RequestMapping("/api/vets")
    @ResponseBody
    public Set<Vet> getVetsJson() {
        return vetService.findAll();
    }
}
