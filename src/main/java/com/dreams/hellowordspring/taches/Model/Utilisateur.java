  package com.dreams.hellowordspring.taches.Model;

  import jakarta.persistence.*;

  import java.io.Serializable;
  import java.util.Set;

  @Entity
  @Table(name = "utilisateur")


  public class Utilisateur implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
  private Long id;
    private String nom;
    private String prenom;
    private String login;
    private String email;
    private String mdp;

    @ManyToMany
    private Set<Tache> taches;

    public Set<Tache> getTaches() {
      return taches;
    }

    public void setTaches(Set<Tache> taches) {
      this.taches = taches;
    }

    public Utilisateur() {}
    public Utilisateur(Long id, String nom, String prenom, String login, String email, String mdp) {
      this.id = id;
      this.nom = nom;
      this.prenom = prenom;
      this.login = login;
      this.email = email;
      this.mdp = mdp;
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

    public String getPrenom() {
      return prenom;
    }

    public void setPrenom(String prenom) {
      this.prenom = prenom;
    }

    public String getLogin() {
      return login;
    }

    public void setLogin(String login) {
      this.login = login;
    }

    public String getEmail() {
      return email;
    }

    public void setEmail(String email) {
      this.email = email;
    }

    public String getMdp() {
      return mdp;
    }

    public void setMdp(String mdp) {
      this.mdp = mdp;
    }
  }
