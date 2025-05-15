package com.dreams.hellowordspring.taches.Repository;

import com.dreams.hellowordspring.taches.Model.Tache;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "tache")


public interface TacheRepository extends CrudRepository<Tache, Long> {
}