package fr.ensai.running.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import fr.ensai.running.model.Athlete;
import fr.ensai.running.service.AthleteService;

@RestController
@RequestMapping("/api")
public class ApiRestController {

    @Autowired
    private AthleteService athleteService;

    /**
     * Get all athletes
     */
    @GetMapping("/athlete")
    public List<Athlete> allAthletes() {
        return athleteService.findAll();
    }

    /**
     * Get athlete by ID
     */
    @GetMapping("/athlete/{id}")
    public ResponseEntity<Athlete> getAthleteById(@PathVariable Long id) {
        Athlete athlete = athleteService.findById(id);
        if (athlete == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(athlete);
    }

    /**
     * Create or update an athlete
     */
    @PostMapping("/athlete")
    public ResponseEntity<Athlete> createOrUpdateAthlete(@RequestBody Athlete athlete) {
        Athlete savedAthlete = athleteService.save(athlete);
        return ResponseEntity.ok(savedAthlete);
    }

    /**
     * Delete an athlete by ID
     */
    @DeleteMapping("/athlete/{id}")
    public ResponseEntity<Void> deleteAthlete(@PathVariable Long id) {
        Athlete athlete = athleteService.findById(id);
        if (athlete == null) {
            return ResponseEntity.notFound().build();
        }
        athleteService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
