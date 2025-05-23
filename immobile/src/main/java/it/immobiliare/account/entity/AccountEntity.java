package it.immobiliare.account.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "Account")
@Getter
@Setter
@NoArgsConstructor

public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_immobile;

    @NotEmpty(message = "Inserisci un nome")
    @Column(nullable = false)
    private String nome;

    @NotEmpty(message = "Inserisci un cognome")
    @Column(nullable = false)
    private String cognome;

    @NotEmpty(message = "Inserisci una mail")
    @Column(nullable = false)
    private String mail;

    @NotEmpty(message = "Inserisci una password")
    @Column(nullable = false)
    private String password;

    @NotEmpty(message = "Questo campo non può essere vuoto")
    @Column(nullable = false)
    private String type;

    private String codice_agente;
}
