package com.dreams.hellowordspring.taches.Repository;

import com.dreams.hellowordspring.taches.Model.TacheSimple;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "tachesimple")
public interface TacheSimpleRepository extends CrudRepository<TacheSimple, Long> {
}
