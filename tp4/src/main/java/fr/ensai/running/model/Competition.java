package fr.ensai.running.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_competition")
    private long id;

    private String designation;
    private  String city;
    @Column(name = "event_date")
    private LocalDate eventDate;
    private float distance;
    private int maxAthletes;


    @Override
    public String toString() {
        return "Competition (" + designation + " " + city + ", " + eventDate + ")";
    }
    
}
