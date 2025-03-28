package it.immobiliare.immobile.service;


import it.immobiliare.immobile.dto.ImmobileDTO;
import it.immobiliare.immobile.entity.ImmobileEntity;
import it.immobiliare.immobile.mapper.ImmobileMapper;
import it.immobiliare.immobile.repository.ImmobileRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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
            log.debug("Errore nell'inserimento dell'immobile: {}", e.getMessage());
            return false;
        }
    }

    public ArrayList<ImmobileDTO> selectImmobili(ImmobileDTO immobileDTO, int p_max, int p_min, String comune) {
        ArrayList<ImmobileDTO> immobileDTOs = null;
        return immobileDTOs;
    }

    public ArrayList<ImmobileDTO> visualizzaStatistiche(String mail) {
        ArrayList<ImmobileDTO> immobileDTOs = null;
        return immobileDTOs;
    }
}
