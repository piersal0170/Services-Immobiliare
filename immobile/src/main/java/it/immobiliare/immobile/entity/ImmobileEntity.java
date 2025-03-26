package it.immobiliare.immobile.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Immobile")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class ImmobileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_immobile;

    @NotEmpty(message = "Inserisci un indirizzo")
    @Column(nullable = false)
    private String indirizzo;

    @Min(value = 400, message = "Il prezzo minimo deve essere almeno 400")
    @Max(value = 1000000, message = "Il prezzo massimo deve essere massimo 1.000.000")
    private int prezzo;

    @NotEmpty(message = "Questo campo non può essere vuoto")
    @Column(nullable = false)
    private int piano;

    @Min(value = 20, message = "La dimensione minima consentita è 20 metri quadri")
    @Max(value = 5000, message = "La dimensione massima consentita è 5000 metri quadri")
    private int dimensione;

    @NotEmpty(message = "Questo campo non può essere vuoto")
    @Column(nullable = false)
    private int n_stanze;

    @NotEmpty(message = "Questo campo non può essere vuoto")
    @Column(nullable = false)
    private String categoria;

    @NotEmpty(message = "Questo campo non può essere vuoto")
    @Column(nullable = false)
    private char classe_energetica;

    @NotEmpty(message = "Questo campo non può essere vuoto")
    @Column(nullable = false)
    private boolean ascensore;

    @NotEmpty(message = "Questo campo non può essere vuoto")
    @Column(nullable = false)
    private boolean portineria;

    @NotEmpty(message = "Questo campo non può essere vuoto")
    @Column(nullable = false)
    private boolean balcone;

    @NotEmpty(message = "Questo campo non può essere vuoto")
    @Column(nullable = false)
    private boolean terrazzo;

    @NotEmpty(message = "Questo campo non può essere vuoto")
    @Column(nullable = false)
    private boolean giardino;

    @NotEmpty(message = "Questo campo non può essere vuoto")
    @Column(nullable = false)
    private boolean climatizzazione;

    @NotEmpty(message = "Questo campo non può essere vuoto")
    @Column(nullable = false)
    private boolean riscaldamento;

    @NotEmpty(message = "Questo campo non può essere vuoto")
    @Column(nullable = false)
    private boolean posto_auto;

    @NotEmpty(message = "Questo campo non può essere vuoto")
    @Column(nullable = false)
    private boolean accesso_disabili;

    @NotEmpty(message = "Questo campo non può essere vuoto")
    @Column(nullable = false)
    @Size(min = 2, message = "La descrizione deve avere almeno 2 caratteri")
    private String descrizione;

    @Column(columnDefinition = "int default 10", nullable = false)
    private int visualizzazioni;

    @Column(nullable = false)
    private boolean scuole;

    @Column(nullable = false)
    private boolean parchi;

    @Column(nullable = false)
    private boolean trasporti;

}
