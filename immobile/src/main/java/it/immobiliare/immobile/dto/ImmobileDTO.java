package it.immobiliare.immobile.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImmobileDTO {
    private String indirizzo;
    private String comune;
    private String zona;
    private Integer prezzo;
    private Integer piano;
    private Integer dimensione;
    private Integer n_stanze;
    private String categoria;
    private Character classe_energetica;
    private Boolean ascensore;
    private Boolean portineria;
    private Boolean balcone;
    private Boolean terrazzo;
    private Boolean giardino;
    private Boolean climatizzazione;
    private Boolean riscaldamento;
    private Boolean posto_auto;
    private Boolean accesso_disabili;
    private String descrizione;

    private Integer visualizzazioni;

    private Boolean scuole;
    private Boolean parchi;
    private Boolean trasporti;

    private String mail;
}
