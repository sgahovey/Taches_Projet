package com.dreams.hellowordspring.taches.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tache_simple")
public class TacheSimple extends Tache {

    @ManyToMany(mappedBy = "sousTaches")
    @JsonIgnore
    private Set<TacheComplexe> tacheComplexes = new HashSet<>();

    @ManyToMany(mappedBy = "tachesSimples")
    @JsonIgnore
    private Set<Projet> projets = new HashSet<>();

    public Set<Projet> getProjets() {
        return projets;
    }

    public void setProjets(Set<Projet> projets) {
        this.projets = projets;
    }

    public TacheSimple() {
    }

    public TacheSimple(Long id, String nom, String description, boolean estComplete, LocalDate dateDebut, LocalDate dateFin) {
        super(id, nom, description, estComplete, dateDebut, dateFin);
    }

    public Set<TacheComplexe> getTacheComplexes() {
        return tacheComplexes;
    }

    public void setTacheComplexes(Set<TacheComplexe> tacheComplexes) {
        this.tacheComplexes = tacheComplexes;
    }

    public void addTacheComplexe(TacheComplexe tacheComplexe) {
        this.tacheComplexes.add(tacheComplexe);
    }

    public void deleteTacheComplexe(TacheComplexe tacheComplexe) {
        this.tacheComplexes.remove(tacheComplexe);
    }
}