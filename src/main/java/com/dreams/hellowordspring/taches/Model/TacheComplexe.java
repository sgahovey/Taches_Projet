    package com.dreams.hellowordspring.taches.Model;

    import jakarta.persistence.Entity;
    import jakarta.persistence.Table;

    import java.time.LocalDate;

    @Entity
    @Table(name = "tache_complexe")
    public class TacheComplexe extends Tache {
        public TacheComplexe() {}

        public TacheComplexe(Long id, String nom, String description, boolean estComplete, LocalDate dateDebut, LocalDate dateFin) {
            super(id, nom, description, estComplete, dateDebut, dateFin);
        }

    }
