package it.immobiliare.account.mapper;


import it.immobiliare.account.dto.AccountDTO;
import it.immobiliare.account.entity.AccountEntity;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public AccountEntity toAccountEntity(AccountDTO accountDTO) {
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setNome(accountEntity.getNome());
        accountEntity.setCognome(accountEntity.getCognome());
        accountEntity.setMail(accountEntity.getMail());
        accountEntity.setPassword(accountDTO.getPassword());
        accountEntity.setType(accountDTO.getType());
        return accountEntity;
    }

    public AccountDTO toAccountDTO(AccountEntity accountEntity) {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setId(accountDTO.getId());
        accountDTO.setNome(accountEntity.getNome());
        accountDTO.setCognome(accountEntity.getCognome());
        accountDTO.setMail(accountEntity.getMail());
        accountDTO.setPassword(accountEntity.getPassword());
        accountDTO.setType(accountEntity.getType());
        accountDTO.setCodice_agente(accountEntity.getCodice_agente());
        return accountDTO;
    }
}
