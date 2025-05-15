package com.dreams.hellowordspring.taches.Controller;

import com.dreams.hellowordspring.taches.Model.Tache;
import com.dreams.hellowordspring.taches.Model.Utilisateur;
import com.dreams.hellowordspring.taches.Repository.TacheRepository;
import com.dreams.hellowordspring.taches.Repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilisateurController {

    @Autowired
private UtilisateurRepository utilisateurRepository;
    @Autowired
    private TacheRepository tacheRepository;

    // Associe une ou plusieurs tâches à un utilisateur
    @PostMapping("utilisateur/{idUtilisateur}/add/{idTache}")
    public void addTache(@PathVariable Long idUtilisateur, @PathVariable Long idTache) {
        Utilisateur utilisateur = utilisateurRepository.findById(idUtilisateur).get();
        Tache tache = tacheRepository.findById(idTache).get();

        utilisateur.getTaches().add(tache);
        utilisateurRepository.save(utilisateur);
    }
}
