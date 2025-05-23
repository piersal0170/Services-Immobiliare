package it.immobiliare.account.service;

import it.immobiliare.account.dto.AccountDTO;
import it.immobiliare.account.entity.AccountEntity;
import it.immobiliare.account.mapper.AccountMapper;
import it.immobiliare.account.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;

@Slf4j

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private AccountMapper accountMapper;

    private static final SecureRandom SECURE_RANDOM = new SecureRandom();

    public boolean insertAccount(AccountDTO accountDTO) {
        try{
            AccountEntity accountEntity = accountMapper.toAccountEntity(accountDTO);
            int numeroCasuale = 100000 + SECURE_RANDOM.nextInt(900000);

            if("Gestore".equals(accountEntity.getType())){
                accountEntity.setCodice_agente("01" + numeroCasuale);
            } else if("Agente Immobilaire".equals(accountEntity.getType())) {
                accountEntity.setCodice_agente("02" + numeroCasuale);
            }

            accountRepository.save(accountEntity);
            return true;
        }catch(RuntimeException e){
            log.warn("Errore nell'inserimento dell'account: {}", e.getMessage());
            return false;
        }
    }


}
