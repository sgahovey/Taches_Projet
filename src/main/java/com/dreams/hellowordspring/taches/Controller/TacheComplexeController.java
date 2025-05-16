package com.dreams.hellowordspring.taches.Controller;

import com.dreams.hellowordspring.taches.Model.TacheComplexe;
import com.dreams.hellowordspring.taches.Model.TacheSimple;
import com.dreams.hellowordspring.taches.Repository.TacheComplexeRepository;
import com.dreams.hellowordspring.taches.Repository.TacheSimpleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController

public class TacheComplexeController {
    @Autowired
    private TacheComplexeRepository tacheComplexeRepository;

    @Autowired
    private TacheSimpleRepository tacheSimpleRepository;

    // Ajouter une sous-tâche à une tâche complexe
    @PostMapping("/{idTacheComplexe}/add/{idTacheSimple}")
    public void addSousTache(@PathVariable Long idTacheComplexe, @PathVariable Long idTacheSimple) {
        TacheComplexe tacheComplexe = tacheComplexeRepository.findById(idTacheComplexe).orElse(null);
        TacheSimple tacheSimple = tacheSimpleRepository.findById(idTacheSimple).orElse(null);

        if (tacheComplexe != null && tacheSimple != null) {
            tacheComplexe.addSousTache(tacheSimple);
            tacheSimple.getTacheComplexes().add(tacheComplexe);
            tacheComplexeRepository.save(tacheComplexe);

        }
    }
    // Récupérer les sous-tâches d'une tâche complexe
    @GetMapping("/{idTacheComplexe}/sous-taches")
    public Set<TacheSimple> getSousTaches(@PathVariable Long idTacheComplexe) {
        TacheComplexe tacheComplexe = tacheComplexeRepository.findById(idTacheComplexe).orElse(null);
        if (tacheComplexe != null) {
            return tacheComplexe.getSousTaches();
        }
        return null;
    }

    // Supprimer une sous-tâche d'une tâche complexe
    @DeleteMapping("/{idTacheComplexe}/delete/{idTacheSimple}")
    public void removeSousTache(@PathVariable Long idTacheComplexe, @PathVariable Long idTacheSimple) {
        TacheComplexe tacheComplexe = tacheComplexeRepository.findById(idTacheComplexe).orElse(null);
        TacheSimple tacheSimple = tacheSimpleRepository.findById(idTacheSimple).orElse(null);

        if (tacheComplexe != null && tacheSimple != null) {
            tacheComplexe.deleteSousTache(tacheSimple);
            tacheComplexeRepository.save(tacheComplexe);
        }
    }

}
