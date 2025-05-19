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
                    .and(ImmobileSpecifications.hasAscensore(immobileDTO.getAscensore()))
                    .and(ImmobileSpecifications.hasPortineria(immobileDTO.getPortineria()))
                    .and(ImmobileSpecifications.hasBalcone(immobileDTO.getBalcone()))
                    .and(ImmobileSpecifications.hasTerrazzo(immobileDTO.getTerrazzo()))
                    .and(ImmobileSpecifications.hasGiardino(immobileDTO.getGiardino()))
                    .and(ImmobileSpecifications.hasClimatizzazione(immobileDTO.getClimatizzazione()))
                    .and(ImmobileSpecifications.hasRiscaldamento(immobileDTO.getRiscaldamento()))
                    .and(ImmobileSpecifications.hasPostoAuto(immobileDTO.getPosto_auto()))
                    .and(ImmobileSpecifications.hasAccessoDisabili(immobileDTO.getAccesso_disabili()));
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
        try{
            List<ImmobileEntity> immobileEntityList = immobileRepository.findAllByMail(mail);
            List<ImmobileDTO> immobileDTOList = new ArrayList<>();
            for (ImmobileEntity immobileEntity : immobileEntityList) {
                ImmobileDTO immobileDTO1 = immobileMapper.toDto_VisualizzaStatistiche(immobileEntity);
                immobileDTOList.add(immobileDTO1);
            }
            return immobileDTOList;
        } catch (RuntimeException e) {
            log.warn("Errore nella ricerca degli immobili: {}", e.getMessage());
            return null;
        }
    }
}
