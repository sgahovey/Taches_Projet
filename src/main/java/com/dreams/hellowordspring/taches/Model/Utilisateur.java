  package com.dreams.hellowordspring.taches.Model;

  import jakarta.persistence.Column;
  import jakarta.persistence.Entity;
  import jakarta.persistence.Id;
  import jakarta.persistence.Table;

  @Entity
  @Table(name = "utilisateur")
  public class Utilisateur {
    @Id
    @Column(name = "id", nullable = false)
  private Long id;
    private String nom;
    private String prenom;
    private String login;
    private String email;
    private String mdp;


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
