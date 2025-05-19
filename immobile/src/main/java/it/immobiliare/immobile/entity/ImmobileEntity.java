package it.immobiliare.immobile.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "Immobile")
@DynamicInsert
@DynamicUpdate
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

    @NotEmpty(message = "Inserisci un comune")
    @Column(nullable = false)
    private String comune;

    @NotEmpty(message = "Inserisci un comune")
    @Column(nullable = false)
    private String zona;

    @Column(nullable = false)
    @Min(value = 400, message = "Il prezzo minimo deve essere almeno 400")
    @Max(value = 1000000, message = "Il prezzo massimo deve essere massimo 1.000.000")
    private int prezzo;

    @Column(nullable = false)
    private int piano;

    @Column(nullable = false)
    @Min(value = 20, message = "La dimensione minima consentita è 20 metri quadri")
    @Max(value = 5000, message = "La dimensione massima consentita è 5000 metri quadri")
    private int dimensione;

    @Positive(message = "Il numero deve essere positivo")
    @Column(nullable = false)
    private int n_stanze;

    @NotEmpty(message = "Questo campo non può essere vuoto")
    @Column(nullable = false)
    private String categoria;

    @Column(columnDefinition = "char default 'C'", nullable = false)
    private Character classe_energetica;

    @Column(columnDefinition = "boolean CHECK (ascensore IN (true, false))", nullable = false)
    private boolean ascensore;

    @Column(columnDefinition = "boolean CHECK (portineria IN (true, false))", nullable = false)
    private boolean portineria;

    @Column(columnDefinition = "boolean CHECK (balcone IN (true, false))", nullable = false)
    private boolean balcone;

    @Column(columnDefinition = "boolean CHECK (terrazzo IN (true, false))", nullable = false)
    private boolean terrazzo;

    @Column(columnDefinition = "boolean CHECK (giardino IN (true, false))", nullable = false)
    private boolean giardino;

    @Column(columnDefinition = "boolean CHECK (climatizzazione IN (true, false))", nullable = false)
    private boolean climatizzazione;

    @Column(columnDefinition = "boolean CHECK (riscaldamento IN (true, false))", nullable = false)
    private boolean riscaldamento;

    @Column(columnDefinition = "boolean CHECK (posto_auto IN (true, false))", nullable = false)
    private boolean posto_auto;

    @Column(columnDefinition = "boolean CHECK (accesso_disabili IN (true, false))", nullable = false)
    private boolean accesso_disabili;

    @NotEmpty(message = "Questo campo non può essere vuoto")
    @Column(nullable = false)
    @Size(min = 2, message = "La descrizione deve avere almeno 2 caratteri")
    private String descrizione;

    @Column(nullable = false)
    private int visualizzazioni;

    @Column(columnDefinition = "boolean CHECK (scuole IN (true, false))", nullable = false)
    private boolean scuole;

    @Column(columnDefinition = "boolean CHECK (parchi IN (true, false))", nullable = false)
    private boolean parchi;

    @Column(columnDefinition = "boolean CHECK (trasporti IN (true, false))", nullable = false)
    private boolean trasporti;

    @Column(columnDefinition = "varchar(255) default 'stringa'", nullable = false)
    private String mail;
}
