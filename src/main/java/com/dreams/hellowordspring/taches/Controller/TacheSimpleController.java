    package com.dreams.hellowordspring.taches.Controller;

    import com.dreams.hellowordspring.taches.Model.TacheSimple;
    import com.dreams.hellowordspring.taches.Repository.TacheSimpleRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RestController;

    import java.util.List;
    @RestController

    public class TacheSimpleController {
        @Autowired
        private TacheSimpleRepository tacheSimpleRepository;

        // Récupérer toutes les tâches simples en cours (non terminées)
        @GetMapping("/en-cours")
        public List<TacheSimple> findByEstCompleteFalse() {
            return tacheSimpleRepository.findByEstCompleteFalse();
        }

        // Récupérer toutes les tâches simples terminées
        @GetMapping("/terminees")
        public List<TacheSimple> findByEstCompleteTrue() {
            return tacheSimpleRepository.findByEstCompleteTrue();
        }

    }
