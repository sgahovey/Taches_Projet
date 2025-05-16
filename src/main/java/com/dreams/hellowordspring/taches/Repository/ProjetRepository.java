package com.dreams.hellowordspring.taches.Repository;

import com.dreams.hellowordspring.taches.Model.Projet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "projet")
public interface ProjetRepository extends CrudRepository<Projet, Long> {
}
