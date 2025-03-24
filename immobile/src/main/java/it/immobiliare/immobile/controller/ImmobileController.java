package it.immobiliare.immobile.controller;


import it.immobiliare.immobile.dto.ImmobileDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/apiImmobile")
public class ImmobileController{
    @GetMapping("/cerca/{comune}")
    public ResponseEntity<ArrayList<ImmobileDTO>> cercaImmobili(
            @PathVariable String comune,
            @RequestParam( value = "categoria", required = false) String categoria,
            @RequestParam( value = "p_max", required = false) int p_max,
            @RequestParam(value =  "p_min", required = false) int p_min,
            @RequestParam(value = "n_stanze", required = false) int n_stanze,
            @RequestParam( value = "piano", required = false) int piano,
            @RequestParam( value = "classe_energetica", required = false) char classe_energetica,
            @RequestParam( value = "posto_auto", required = false, defaultValue = "false") boolean posto_auto,
            @RequestParam( value = "accesso_disabili", required = false, defaultValue = "false") boolean accesso_disabili,
            @RequestParam( value = "clima", required = false, defaultValue = "false") boolean clima,
            @RequestParam( value = "riscaldamento", required = false, defaultValue = "false") boolean riscaldamento,
            @RequestParam( value = "ascensore", required = false, defaultValue = "false") boolean ascensore,
            @RequestParam( value = "portineria", required = false, defaultValue = "false") boolean portineria,
            @RequestParam( value = "balcone", required = false, defaultValue = "false") boolean balcone,
            @RequestParam( value = "terrazzo", required = false, defaultValue = "false") boolean terrazzo,
            @RequestParam( value = "giardino", required = false, defaultValue = "false") boolean giardino
    ) {
        ImmobileDTO immobileDTO = new ImmobileDTO(piano, n_stanze, categoria, classe_energetica, ascensore, portineria, posto_auto,
                    accesso_disabili, balcone, terrazzo, giardino, clima, riscaldamento);
        ArrayList<ImmobileDTO> immobileDTOList = selectImmobili(immobileDTO, p_max, p_min, comune); //metodo che va ancora scritto all'interno della classe Service per la ricerca degli immobili
        if(!(immobileDTOList.isEmpty())){
            return new ResponseEntity<>(immobileDTOList, HttpStatus.OK);
        } else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/carica/{indirizzo}/{prezzo}/{piano}/{dimensioni}/{n_stanze}/{cl_ener}/{categoria}/{descrizione}")
    public ResponseEntity<Boolean> caricaImmobile(
            @PathVariable String indirizzo,
            @PathVariable int prezzo,
            @PathVariable int piano,
            @PathVariable int dimensioni,
            @PathVariable int n_stanze,
            @PathVariable("cl_ener") char classe_energetica,
            @PathVariable String categoria,
            @PathVariable String descrizione,
            @RequestParam( value = "posto_auto", required = false, defaultValue = "false") boolean posto_auto,
            @RequestParam( value = "accesso_disabili", required = false, defaultValue = "false") boolean accesso_disabili,
            @RequestParam( value = "clima", required = false, defaultValue = "false") boolean clima,
            @RequestParam( value = "riscaldamento", required = false, defaultValue = "false") boolean riscaldamento,
            @RequestParam( value = "ascensore", required = false, defaultValue = "false") boolean ascensore,
            @RequestParam( value = "portineria", required = false, defaultValue = "false") boolean portineria,
            @RequestParam( value = "balcone", required = false, defaultValue = "false") boolean balcone,
            @RequestParam( value = "terrazzo", required = false, defaultValue = "false") boolean terrazzo,
            @RequestParam( value = "giardino", required = false, defaultValue = "false") boolean giardino
            ) {
        ImmobileDTO immobileDTO = new ImmobileDTO(indirizzo, prezzo, piano, dimensioni, n_stanze, categoria,
                classe_energetica, ascensore, portineria, balcone, terrazzo, giardino, clima, riscaldamento,
                posto_auto, accesso_disabili, descrizione);
        boolean immobileInserito = insertImmobile(immobileDTO);
        if (immobileInserito) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(false, HttpStatus.OK);
        }

    }

    @GetMapping("/immobiliAgente/{mail}")
    public ResponseEntity<List<ImmobileDTO>> getImmobiliAgente(@PathVariable String mail) {
            ArrayList<ImmobileDTO> immobiliDTOList = selectImmobili(mail);
            if(!immobiliDTOList.isEmpty()) {
                return new ResponseEntity<>(immobiliDTOList, HttpStatus.OK);
            } else{
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
    }

}