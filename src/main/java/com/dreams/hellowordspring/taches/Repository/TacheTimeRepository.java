    package com.dreams.hellowordspring.taches.Repository;

    import com.dreams.hellowordspring.taches.Model.TacheTime;
    import org.springframework.data.repository.CrudRepository;
    import org.springframework.data.rest.core.annotation.RepositoryRestResource;

    @RepositoryRestResource(path = "tachetime")
    public interface TacheTimeRepository extends CrudRepository<TacheTime, Long> {

    }
