    package com.dreams.hellowordspring.taches.Model;

    import jakarta.persistence.*;

    import java.time.LocalDate;

    @Entity
    @Table(name = "tache")
    @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

    public class Tache {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id", nullable = false)
        private Long id;

        private String nom;
        private String description;
        private boolean estComplete;
        private LocalDate dateDebut;
        private LocalDate dateFin;

        public Tache() {}

        public Tache(Long id, String nom, String description, boolean estComplete, LocalDate dateDebut, LocalDate dateFin) {
            this.id = id;
            this.nom = nom;
            this.description = description;
            this.estComplete = estComplete;
            this.dateDebut = dateDebut;
            this.dateFin = dateFin;
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

        public boolean isEstComplete() {
            return estComplete;
        }

        public void setEstComplete(boolean estComplete) {
            this.estComplete = estComplete;
        }

        public LocalDate getDateDebut() {
            return dateDebut;
        }

        public void setDateDebut(LocalDate dateDebut) {
            this.dateDebut = dateDebut;
        }

        public LocalDate getDateFin() {
            return dateFin;
        }

        public void setDateFin(LocalDate dateFin) {
            this.dateFin = dateFin;
        }
    }