package br.ufrn.imd.Framework.service;

import br.ufrn.imd.Framework.interfaces.ServiceInterface;
import br.ufrn.imd.Framework.model.BankAccount;
import br.ufrn.imd.Framework.repository.BankAccountRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
@AllArgsConstructor
public class BankAccountService implements ServiceInterface<BankAccount, BankAccountRepository> {

    private AppUserService appUserService;
    private BankAccountRepository repository;

    @Override
    public void prePost(BankAccount entity) {

    }

    @Override
    public void prePut(BankAccount entity) {

    }
}
