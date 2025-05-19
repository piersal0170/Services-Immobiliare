package it.immobiliare.immobile.repository;

import it.immobiliare.immobile.entity.ImmobileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImmobileRepository extends JpaRepository<ImmobileEntity, Long>, JpaSpecificationExecutor<ImmobileEntity> {

    List<ImmobileEntity> findAllByMail(String mail);
}
