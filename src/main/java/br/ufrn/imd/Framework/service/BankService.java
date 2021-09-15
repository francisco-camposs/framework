package br.ufrn.imd.Framework.service;

import br.ufrn.imd.Framework.interfaces.ServiceInterface;
import br.ufrn.imd.Framework.model.Bank;
import br.ufrn.imd.Framework.repository.BankRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Getter
@AllArgsConstructor
@Service
public class BankService implements ServiceInterface<Bank, BankRepository> {

    private AppUserService appUserService;
    private BankRepository repository;

    @Override
    public void prePost(Bank entity) {

    }

    @Override
    public void prePut(Bank entity) {

    }
}
