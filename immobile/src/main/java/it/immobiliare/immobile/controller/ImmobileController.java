package it.immobiliare.immobile.controller;


import it.immobiliare.immobile.dto.ImmobileDTO;
import it.immobiliare.immobile.service.ImmobileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/apiImmobile")
public class ImmobileController{

    @Autowired
    private ImmobileService immobileService;

    @PostMapping("/cerca/{comune}")
    public ResponseEntity<List<ImmobileDTO>> cercaImmobili(@RequestBody ImmobileDTO immobileDTO, @PathVariable String comune,
            @RequestParam( value = "p_max", required = false) int p_max,@RequestParam(value =  "p_min", required = false) int p_min) {
        List<ImmobileDTO> immobileDTOList = immobileService.selectImmobili(immobileDTO, comune, p_max, p_min);
        if(!immobileDTOList.isEmpty()){
            return new ResponseEntity<>(immobileDTOList, HttpStatus.OK);
        } else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/carica")
    public ResponseEntity<Boolean> caricaImmobile(@RequestBody ImmobileDTO immobileDTO) {
        boolean immobileInserito = immobileService.insertImmobile(immobileDTO);
        if (immobileInserito) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/immobiliAgente/{mail}")
    public ResponseEntity<List<ImmobileDTO>> getImmobiliAgente(@PathVariable String mail) {
            List<ImmobileDTO> immobiliDTOList = immobileService.visualizzaStatistiche(mail);
            if(!immobiliDTOList.isEmpty()) {
                return new ResponseEntity<>(immobiliDTOList, HttpStatus.OK);
            } else{
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
    }

}