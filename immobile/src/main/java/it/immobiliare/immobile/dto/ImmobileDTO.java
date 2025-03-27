package it.immobiliare.immobile.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

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
    private int visualizzazioni;
    private boolean scuole;
    private boolean parchi;
    private boolean trasporti;

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

    //costruttore necessario per l'inserimento di un immobile da parte di un utente
    public ImmobileDTO(String indirizzo, int prezzo, int piano, int dimensione, int n_stanze, String categoria, char classe_energetica,
                       boolean ascensore, boolean portineria, boolean balcone, boolean terrazzo, boolean giardino, boolean climatizzazione, boolean riscaldamento,
                       boolean posto_auto, boolean accesso_disabili, String descrizione){
        this.indirizzo = indirizzo;
        this.prezzo = prezzo;
        this.piano = piano;
        this.dimensione = dimensione;
        this.n_stanze = n_stanze;
        this.categoria = categoria;
        this.classe_energetica = classe_energetica;
        this.ascensore = ascensore;
        this.portineria = portineria;
        this.balcone = balcone;
        this.terrazzo = terrazzo;
        this.giardino = giardino;
        this.climatizzazione = climatizzazione;
        this.riscaldamento = riscaldamento;
        this.posto_auto = posto_auto;
        this.accesso_disabili = accesso_disabili;
        this.descrizione = descrizione;

    }

    //costruttore necessario per recupare le statistiche degli immobili da parte di uno specifico utente
    public ImmobileDTO(String indirizzo, int prezzo, int visualizzazioni){
        this.indirizzo = indirizzo;
        this.prezzo = prezzo;
        this.visualizzazioni = visualizzazioni;
    }

    //costruttore necessario per mostrare all'utente tutte le informazioni dell'immobile
    public ImmobileDTO(String indirizzo, int prezzo, int piano, int dimensione, int n_stanze, String categoria, char classe_energetica,
                       boolean ascensore, boolean portineria, boolean balcone, boolean terrazzo, boolean giardino, boolean climatizzazione, boolean riscaldamento,
                       boolean posto_auto, boolean accesso_disabili, String descrizione, boolean scuole, boolean parchi, boolean trasporti){
        this.indirizzo = indirizzo;
        this.prezzo = prezzo;
        this.piano = piano;
        this.dimensione = dimensione;
        this.n_stanze = n_stanze;
        this.categoria = categoria;
        this.classe_energetica = classe_energetica;
        this.ascensore = ascensore;
        this.portineria = portineria;
        this.balcone = balcone;
        this.terrazzo = terrazzo;
        this.giardino = giardino;
        this.climatizzazione = climatizzazione;
        this.riscaldamento = riscaldamento;
        this.posto_auto = posto_auto;
        this.accesso_disabili = accesso_disabili;
        this.descrizione = descrizione;
        this.scuole = scuole;
        this.parchi = parchi;
        this.trasporti = trasporti;

    }
}
