package it.immobiliare.immobile.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ImmobileDTO {
    private String indirizzo;
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

    //costruttore necessario per la ricerca generica degli immobili da parte di un utente
    public ImmobileDTO(int piano, int n_stanze, String categoria, char classe_energetica, boolean ascensore, boolean portineria, boolean posto_auto,
                       boolean accesso_disabili, boolean balcone, boolean terrazzo, boolean giardino, boolean climatizzazione, boolean riscaldamento) {
        this.piano = piano;
        this.n_stanze = n_stanze;
        this.categoria = categoria;
        this.classe_energetica = classe_energetica;
        this.ascensore = ascensore;
        this.portineria = portineria;
        this.posto_auto = posto_auto;
        this.accesso_disabili = accesso_disabili;
        this.balcone = balcone;
        this.terrazzo = terrazzo;
        this.giardino = giardino;
        this.climatizzazione = climatizzazione;
        this.riscaldamento = riscaldamento;
    }

}
