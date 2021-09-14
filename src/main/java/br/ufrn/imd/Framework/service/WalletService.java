package br.ufrn.imd.Framework.service;

import br.ufrn.imd.Framework.interfaces.ServiceInterface;
import br.ufrn.imd.Framework.model.Wallet;
import br.ufrn.imd.Framework.repository.WalletRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Getter
@AllArgsConstructor
@Service
public class WalletService implements ServiceInterface<Wallet, WalletRepository> {

    private AppUserService appUserService;
    private WalletRepository repository;

    @Override
    public void prePost(Wallet entity) {

    }

    @Override
    public void prePut(Wallet entity) {

    }

}