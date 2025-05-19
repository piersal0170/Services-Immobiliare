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

        if(immobileDTO.getAscensore() != null){
            immobileEntity.setAscensore(true);
        }

        if(immobileDTO.getPortineria() != null){
            immobileEntity.setPortineria(true);
        }

        if(immobileDTO.getBalcone() != null){
            immobileEntity.setBalcone(true);
        }

        if(immobileDTO.getTerrazzo() != null){
            immobileEntity.setTerrazzo(true);
        }

        if(immobileDTO.getGiardino() != null){
            immobileEntity.setGiardino(true);
        }

        if(immobileDTO.getClimatizzazione() != null){
            immobileEntity.setClimatizzazione(true);
        }

        if(immobileDTO.getRiscaldamento() != null){
            immobileEntity.setRiscaldamento(true);
        }

        if(immobileDTO.getPosto_auto() != null){
            immobileEntity.setPosto_auto(true);
        }

        if(immobileDTO.getAccesso_disabili() != null){
            immobileEntity.setAccesso_disabili(true);
        }

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
