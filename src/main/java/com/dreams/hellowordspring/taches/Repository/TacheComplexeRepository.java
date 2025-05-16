package com.dreams.hellowordspring.taches.Repository;

import com.dreams.hellowordspring.taches.Model.TacheComplexe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "tachecomplexe")
public interface TacheComplexeRepository extends CrudRepository<TacheComplexe, Long> {
}
