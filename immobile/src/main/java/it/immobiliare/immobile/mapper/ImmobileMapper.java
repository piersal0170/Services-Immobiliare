package it.immobiliare.immobile.mapper;

import it.immobiliare.immobile.dto.ImmobileDTO;
import it.immobiliare.immobile.entity.ImmobileEntity;
import org.springframework.stereotype.Component;

@Component
public class ImmobileMapper {
    public ImmobileEntity toEntity(ImmobileDTO immobileDTO) {
        ImmobileEntity immobileEntity = new ImmobileEntity();
        immobileEntity.setIndirizzo(immobileDTO.getIndirizzo());
        immobileEntity.setComune(immobileDTO.getComune());
        immobileEntity.setZona(immobileDTO.getZona());
        immobileEntity.setPrezzo(immobileDTO.getPrezzo());
        immobileEntity.setPiano(immobileDTO.getPiano());
        immobileEntity.setDimensione(immobileDTO.getDimensione());
        immobileEntity.setN_stanze(immobileDTO.getN_stanze());
        immobileEntity.setCategoria(immobileDTO.getCategoria());
        immobileEntity.setClasse_energetica(immobileDTO.getClasse_energetica());
        immobileEntity.setAscensore(immobileDTO.isAscensore());
        immobileEntity.setPortineria(immobileDTO.isPortineria());
        immobileEntity.setBalcone(immobileDTO.isBalcone());
        immobileEntity.setTerrazzo(immobileDTO.isTerrazzo());
        immobileEntity.setGiardino(immobileDTO.isGiardino());
        immobileEntity.setClimatizzazione(immobileDTO.isClimatizzazione());
        immobileEntity.setRiscaldamento(immobileDTO.isRiscaldamento());
        immobileEntity.setPosto_auto(immobileDTO.isPosto_auto());
        immobileEntity.setAccesso_disabili(immobileDTO.isAccesso_disabili());
        immobileEntity.setDescrizione(immobileDTO.getDescrizione());

        return immobileEntity;
    }

    public ImmobileDTO toDto(ImmobileEntity immobileEntity) {
        ImmobileDTO immobileDTO = new ImmobileDTO();
        immobileDTO.setIndirizzo(immobileEntity.getIndirizzo());
        immobileDTO.setComune(immobileEntity.getComune());
        immobileDTO.setZona(immobileEntity.getZona());
        immobileDTO.setPrezzo(immobileEntity.getPrezzo());
        immobileDTO.setPiano(immobileEntity.getPiano());
        immobileDTO.setDimensione(immobileEntity.getDimensione());
        immobileDTO.setN_stanze(immobileEntity.getN_stanze());
        immobileDTO.setCategoria(immobileEntity.getCategoria());
        immobileDTO.setClasse_energetica(immobileEntity.getClasse_energetica());
        immobileDTO.setAscensore(immobileEntity.isAscensore());
        immobileDTO.setPortineria(immobileEntity.isPortineria());
        immobileDTO.setBalcone(immobileEntity.isBalcone());
        immobileDTO.setTerrazzo(immobileEntity.isTerrazzo());
        immobileDTO.setGiardino(immobileEntity.isGiardino());
        immobileDTO.setClimatizzazione(immobileEntity.isClimatizzazione());
        immobileDTO.setRiscaldamento(immobileEntity.isRiscaldamento());
        immobileDTO.setPosto_auto(immobileEntity.isPosto_auto());
        immobileDTO.setAccesso_disabili(immobileEntity.isAccesso_disabili());
        immobileDTO.setDescrizione(immobileEntity.getDescrizione());
        immobileDTO.setScuole(immobileEntity.isScuole());
        immobileDTO.setParchi(immobileEntity.isParchi());
        immobileDTO.setTrasporti(immobileEntity.isTrasporti());
        immobileDTO.setVisualizzazioni(null);
        immobileDTO.setMail(null);

        return immobileDTO;
    }

    public ImmobileDTO toDto_VisualizzaStatistiche(ImmobileEntity immobileEntity) {
        ImmobileDTO immobileDTO = new ImmobileDTO();
        immobileDTO.setIndirizzo(immobileEntity.getIndirizzo());
        immobileDTO.setComune(immobileEntity.getComune());
        immobileDTO.setZona(immobileEntity.getZona());
        immobileDTO.setPrezzo(immobileEntity.getPrezzo());
        immobileDTO.setVisualizzazioni(immobileEntity.getVisualizzazioni());

        return immobileDTO;
    }

}
