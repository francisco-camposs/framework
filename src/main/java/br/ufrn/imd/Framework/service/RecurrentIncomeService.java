package br.ufrn.imd.Framework.service;

import br.ufrn.imd.Framework.model.RecurrentIncome;
import br.ufrn.imd.Framework.repository.AppUserRepository;
import br.ufrn.imd.Framework.repository.RecurrentIncomeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class RecurrentIncomeService implements IncomeInterface<RecurrentIncome> {

    private final RecurrentIncomeRepository recurrentIncomeRepository;

    private final AppUserRepository appUserRepository;

    @Override
    public RecurrentIncome save(RecurrentIncome expense) {
        prePost(expense);
        return recurrentIncomeRepository.save(expense);
    }

    @Override
    public void remove(RecurrentIncome expense) {
        prePost(expense);
        recurrentIncomeRepository.delete(expense);
    }

    @Override
    public RecurrentIncome edit(RecurrentIncome expense) {
        prePut(expense);
        return recurrentIncomeRepository.save(expense);
    }

    @Override
    public RecurrentIncome get(UUID id) {
        return recurrentIncomeRepository.findById(id).orElseThrow(() -> new IllegalStateException("This id not exists"));
    }

    @Override
    public List<RecurrentIncome> list() {
        return recurrentIncomeRepository.findAll();
    }

    @Override
    public void prePost(RecurrentIncome entity) {

    }

    @Override
    public void prePut(RecurrentIncome entity) {

    }
}
