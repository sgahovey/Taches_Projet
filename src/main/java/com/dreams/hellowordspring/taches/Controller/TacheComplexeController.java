package com.dreams.hellowordspring.taches.Controller;

import com.dreams.hellowordspring.taches.Model.TacheComplexe;
import com.dreams.hellowordspring.taches.Model.TacheSimple;
import com.dreams.hellowordspring.taches.Repository.TacheComplexeRepository;
import com.dreams.hellowordspring.taches.Repository.TacheRepository;
import com.dreams.hellowordspring.taches.Repository.TacheSimpleRepository;
import com.dreams.hellowordspring.taches.Repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TacheComplexeController {
    @Autowired
    private TacheComplexeRepository tacheComplexeRepository;
    @Autowired
    private TacheSimpleRepository tacheSimpleRepository;

    @PostMapping("/{idTacheComplexe}/add/{idTacheSimple}")
    public void addSousTache(@PathVariable Long idTacheComplexe, @PathVariable Long idTacheSimple) {
        TacheComplexe tacheComplexe = tacheComplexeRepository.findById(idTacheComplexe).orElse(null);
        TacheSimple tacheSimple = tacheSimpleRepository.findById(idTacheSimple).orElse(null);

        if (tacheComplexe != null && tacheSimple != null) {
            tacheComplexe.getSousTaches().add(tacheSimple);
            tacheComplexeRepository.save(tacheComplexe);
        }
    }

    @GetMapping("/{idTacheComplexe}/sous-taches")
    public Set<TacheSimple> getSousTaches(@PathVariable Long idTacheComplexe) {
        Optional<TacheComplexe> tacheComplexeOpt = tacheComplexeRepository.findById(idTacheComplexe);
        if (tacheComplexeOpt.isPresent()) {
            return tacheComplexeOpt.get().getSousTaches();
        }
        return null;
    }


}
