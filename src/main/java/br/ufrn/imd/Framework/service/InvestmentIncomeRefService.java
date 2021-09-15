package br.ufrn.imd.Framework.service;

import br.ufrn.imd.Framework.interfaces.ServiceInterface;
import br.ufrn.imd.Framework.model.InvestmentIncomeRef;
import br.ufrn.imd.Framework.repository.InvestmentIncomeRefRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Getter
@AllArgsConstructor
@Service
public class InvestmentIncomeRefService implements ServiceInterface<InvestmentIncomeRef, InvestmentIncomeRefRepository> {

    private AppUserService appUserService;
    private InvestmentIncomeRefRepository repository;

    @Override
    public void prePost(InvestmentIncomeRef entity) {

    }

    @Override
    public void prePut(InvestmentIncomeRef entity) {

    }
}
