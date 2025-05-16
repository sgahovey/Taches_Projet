package com.dreams.hellowordspring.taches.Controller;

import com.dreams.hellowordspring.taches.Model.Projet;
import com.dreams.hellowordspring.taches.Model.TacheComplexe;
import com.dreams.hellowordspring.taches.Model.TacheSimple;
import com.dreams.hellowordspring.taches.Repository.ProjetRepository;
import com.dreams.hellowordspring.taches.Repository.TacheComplexeRepository;
import com.dreams.hellowordspring.taches.Repository.TacheSimpleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@RestController
public class ProjetController {

    @Autowired
    private ProjetRepository projetRepository;

    @Autowired
    private TacheSimpleRepository tacheSimpleRepository;

    @Autowired
    private TacheComplexeRepository tacheComplexeRepository;


    // Ajouter une tâche simple à un projet
    @PostMapping("/{idProjet}/add-simple/{idTacheSimple}")
    public void addTacheSimple(@PathVariable Long idProjet, @PathVariable Long idTacheSimple) {
        Projet projet = projetRepository.findById(idProjet).orElse(null);
        TacheSimple tacheSimple = tacheSimpleRepository.findById(idTacheSimple).orElse(null);

        if (projet != null && tacheSimple != null) {
            projet.addTacheSimple(tacheSimple);
            projetRepository.save(projet);
        }
    }

    // Ajouter une tâche complexe à un projet
    @PostMapping("/{idProjet}/add-complexe/{idTacheComplexe}")
    public void addTacheComplexe(@PathVariable Long idProjet, @PathVariable Long idTacheComplexe) {
        Projet projet = projetRepository.findById(idProjet).orElse(null);
        TacheComplexe tacheComplexe = tacheComplexeRepository.findById(idTacheComplexe).orElse(null);

        if (projet != null && tacheComplexe != null) {
            projet.addTacheComplexe(tacheComplexe);
            projetRepository.save(projet);
        }
    }

    // Récupérer les tâches simples d'un projet
    @GetMapping("/{idProjet}/taches-simples")
    public Set<TacheSimple> getTachesSimples(@PathVariable Long idProjet) {
        Projet projet = projetRepository.findById(idProjet).orElse(null);
        if (projet != null) {
            return projet.getTachesSimples();
        }
        return null;
    }

    // Récupérer les tâches complexes d'un projet
    @GetMapping("/{idProjet}/taches-complexes")
    public Set<TacheComplexe> getTachesComplexes(@PathVariable Long idProjet) {
        Projet projet = projetRepository.findById(idProjet).orElse(null);
        if (projet != null) {
            return projet.getTachesComplexes();
        }
        return null;
    }

    // Supprimer une tâche simple d'un projet
    @DeleteMapping("/{idProjet}/delete-simple/{idTacheSimple}")
    public void deleteTacheSimple(@PathVariable Long idProjet, @PathVariable Long idTacheSimple) {
        Projet projet = projetRepository.findById(idProjet).orElse(null);
        TacheSimple tacheSimple = tacheSimpleRepository.findById(idTacheSimple).orElse(null);

        if (projet != null && tacheSimple != null) {
            projet.deleteTacheSimple(tacheSimple);
            projetRepository.save(projet);
        }
    }

    // Supprimer une tâche complexe d'un projet
    @DeleteMapping("/{idProjet}/delete-complexe/{idTacheComplexe}")
    public void deleteTacheComplexe(@PathVariable Long idProjet, @PathVariable Long idTacheComplexe) {
        Projet projet = projetRepository.findById(idProjet).orElse(null);
        TacheComplexe tacheComplexe = tacheComplexeRepository.findById(idTacheComplexe).orElse(null);

        if (projet != null && tacheComplexe != null) {
            projet.deleteTacheComplexe(tacheComplexe);
            projetRepository.save(projet);
        }
    }
}
