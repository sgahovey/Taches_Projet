    package com.dreams.hellowordspring.taches.Model;

    import com.fasterxml.jackson.annotation.JsonIgnore;
    import jakarta.persistence.Entity;
    import jakarta.persistence.ManyToMany;
    import jakarta.persistence.Table;

    import java.time.LocalDate;
    import java.util.HashSet;
    import java.util.Set;

    @Entity
    @Table(name = "tache_complexe")
    public class TacheComplexe extends Tache {

        @ManyToMany
        @JsonIgnore

        private Set<TacheSimple> sousTaches = new HashSet<>();

        public TacheComplexe() {}

        public TacheComplexe(Long id, String nom, String description, boolean estComplete, LocalDate dateDebut, LocalDate dateFin) {
            super(id, nom, description, estComplete, dateDebut, dateFin);
        }

        public Set<TacheSimple> getSousTaches() {
            return sousTaches;
        }

        public void setSousTaches(Set<TacheSimple> sousTaches) {
            this.sousTaches = sousTaches;
        }

        public void addSousTache(TacheSimple tacheSimple) {
            this.sousTaches.add(tacheSimple);
        }

        public void deleteSousTache(TacheSimple tacheSimple) {
            this.sousTaches.remove(tacheSimple);
        }
    }
