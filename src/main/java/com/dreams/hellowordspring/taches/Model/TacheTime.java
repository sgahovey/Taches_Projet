package com.dreams.hellowordspring.taches.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Time;
import java.time.LocalDate;

@Entity
@Table(name = "tache_time")
public class TacheTime extends Tache {
    public TacheTime() {}

    private Time dureeMinutes;

    public TacheTime(Long id, String nom, String description, boolean estComplete, LocalDate dateDebut, LocalDate dateFin, Time dureeMinutes) {
        super(id, nom, description, estComplete, dateDebut, dateFin);
        this.dureeMinutes = dureeMinutes;
    }

    public Time getDureeMinutes() {
        return dureeMinutes;
    }

    public void setDureeMinutes(Time dureeMinutes) {
        this.dureeMinutes = dureeMinutes;
    }
}