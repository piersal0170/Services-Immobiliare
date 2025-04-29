package it.immobiliare.immobile.repository;

import it.immobiliare.immobile.entity.ImmobileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ImmobileRepository extends JpaRepository<ImmobileEntity, Long>, JpaSpecificationExecutor<ImmobileEntity> {

}
