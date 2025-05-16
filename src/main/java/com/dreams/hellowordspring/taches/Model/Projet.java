package com.dreams.hellowordspring.taches.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "projet")
public class Projet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nom;
    private String description;

    @ManyToMany
    @JsonIgnore
    private Set<TacheSimple> tachesSimples = new HashSet<>();

    @ManyToMany
    @JsonIgnore
    private Set<TacheComplexe> tachesComplexes = new HashSet<>();

    public Projet() {
    }
    public Projet(Long id, String nom, String description, Set<TacheSimple> tachesSimples, Set<TacheComplexe> tachesComplexes) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.tachesSimples = tachesSimples;
        this.tachesComplexes = tachesComplexes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<TacheSimple> getTachesSimples() {
        return tachesSimples;
    }

    public void setTachesSimples(Set<TacheSimple> tachesSimples) {
        this.tachesSimples = tachesSimples;
    }

    public Set<TacheComplexe> getTachesComplexes() {
        return tachesComplexes;
    }

    public void setTachesComplexes(Set<TacheComplexe> tachesComplexes) {
        this.tachesComplexes = tachesComplexes;
    }

    public void addTacheSimple(TacheSimple tacheSimple) {
        this.tachesSimples.add(tacheSimple);
    }

    public void deleteTacheSimple(TacheSimple tacheSimple) {
        this.tachesSimples.remove(tacheSimple);
    }

    public void addTacheComplexe(TacheComplexe tacheComplexe) {
        this.tachesComplexes.add(tacheComplexe);
    }

    public void deleteTacheComplexe(TacheComplexe tacheComplexe) {
        this.tachesComplexes.remove(tacheComplexe);
    }
}