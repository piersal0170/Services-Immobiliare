package it.immobiliare.immobile.service;


import it.immobiliare.immobile.dto.ImmobileDTO;
import it.immobiliare.immobile.entity.ImmobileEntity;
import it.immobiliare.immobile.mapper.ImmobileMapper;
import it.immobiliare.immobile.repository.ImmobileRepository;
import it.immobiliare.immobile.specification.ImmobileSpecifications;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j

@Service
public class ImmobileService {
    @Autowired
    private ImmobileRepository immobileRepository;

    @Autowired
    private ImmobileMapper immobileMapper;

    public boolean insertImmobile(ImmobileDTO immobileDTO) {
        try{
            ImmobileEntity immobileEntity = immobileMapper.toEntity(immobileDTO);
            immobileRepository.save(immobileEntity);
            return true;
        } catch (RuntimeException e){
            log.warn("Errore nell'inserimento dell'immobile: {}", e.getMessage());
            return false;
        }
    }

    public List<ImmobileDTO> selectImmobili(ImmobileDTO immobileDTO, String comune, int p_max, int p_min) {
        try {
            Specification<ImmobileEntity> spec = Specification.where(ImmobileSpecifications.hasComune(comune))
                    .and(ImmobileSpecifications.hasZona(immobileDTO.getZona()))
                    .and(ImmobileSpecifications.hasPrezzoBetween(p_min, p_max))
                    .and(ImmobileSpecifications.hasPiano(immobileDTO.getPiano()))
                    .and(ImmobileSpecifications.hasN_Stanze(immobileDTO.getN_stanze()))
                    .and(ImmobileSpecifications.hasCategoria(immobileDTO.getCategoria()))
                    .and(ImmobileSpecifications.hasClasseEnergetica(immobileDTO.getClasse_energetica()))
                    .and(ImmobileSpecifications.hasAscensore(immobileDTO.isAscensore()))
                    .and(ImmobileSpecifications.hasPortineria(immobileDTO.isPortineria()))
                    .and(ImmobileSpecifications.hasBalcone(immobileDTO.isBalcone()))
                    .and(ImmobileSpecifications.hasTerrazzo(immobileDTO.isTerrazzo()))
                    .and(ImmobileSpecifications.hasGiardino(immobileDTO.isGiardino()))
                    .and(ImmobileSpecifications.hasClimatizzazione(immobileDTO.isClimatizzazione()))
                    .and(ImmobileSpecifications.hasRiscaldamento(immobileDTO.isRiscaldamento()))
                    .and(ImmobileSpecifications.hasPostoAuto(immobileDTO.isPosto_auto()))
                    .and(ImmobileSpecifications.hasAccessoDisabili(immobileDTO.isAccesso_disabili()));
            List<ImmobileEntity> immobileList = immobileRepository.findAll(spec);
            List<ImmobileDTO> immobileDTOList = new ArrayList<>();
            for (ImmobileEntity immobileEntity : immobileList) {
                ImmobileDTO immobileDTO1 = immobileMapper.toDto(immobileEntity);
                immobileDTOList.add(immobileDTO1);
            }
            return immobileDTOList;
        } catch (RuntimeException e){
            log.warn("Errore nella ricerca degli immobili: {}", e.getMessage());
            return null;
        }

    }

    public List<ImmobileDTO> visualizzaStatistiche(String mail) {
        List<ImmobileDTO> immobileDTOs = null;
        return immobileDTOs;
    }
}
