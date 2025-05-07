package it.immobiliare.immobile.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class ImmobileDTO {
    private String indirizzo;
    private String comune;
    private String zona;
    private int prezzo;
    private int piano;
    private int dimensione;
    private int n_stanze;
    private String categoria;
    private char classe_energetica;
    private boolean ascensore;
    private boolean portineria;
    private boolean balcone;
    private boolean terrazzo;
    private boolean giardino;
    private boolean climatizzazione;
    private boolean riscaldamento;
    private boolean posto_auto;
    private boolean accesso_disabili;
    private String descrizione;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer visualizzazioni;

    private boolean scuole;
    private boolean parchi;
    private boolean trasporti;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String mail;
}
