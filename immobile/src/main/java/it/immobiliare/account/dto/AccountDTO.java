package it.immobiliare.account.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class AccountDTO {
    public Long id;
    public String nome;
    public String cognome;
    public String mail;
    public String password;
    public String type;
    public String codice_agente;
}
