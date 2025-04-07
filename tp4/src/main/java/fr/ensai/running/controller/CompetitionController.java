package fr.ensai.running.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.ensai.running.model.Competition;
import fr.ensai.running.service.CompetitionService;

@Controller
@RequestMapping("/com")
public class CompetitionController {

    @Autowired
    private CompetitionService competitionService;

    /**
     * Display all Competition
     */
    @GetMapping()
    public String findAllCompetition(Model model) {
        model.addAttribute("competitions", competitionService.findAll());
        return "allCompetitions"; // allCompetitions.html

    }

}