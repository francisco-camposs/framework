package br.ufrn.imd.Framework.service;


import br.ufrn.imd.Framework.model.RecurrentExpense;
import br.ufrn.imd.Framework.repository.RecurrentExpenseRepository;
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
public class RecurrentExpenseService implements ExpenseInterface<RecurrentExpense> {

    private final RecurrentExpenseRepository recurrentExpenseRepository;

    @Override
    public RecurrentExpense save(RecurrentExpense expense) {
        prePost(expense);
        return recurrentExpenseRepository.save(expense);
    }

    @Override
    public void remove(RecurrentExpense expense) {
        prePost(expense);
        recurrentExpenseRepository.delete(expense);
    }

    @Override
    public RecurrentExpense edit(RecurrentExpense expense) {
        prePost(expense);
        return recurrentExpenseRepository.save(expense);
    }

    @Override
    public RecurrentExpense get(UUID id) {
        return recurrentExpenseRepository.getById(id);
    }

    @Override
    public List<RecurrentExpense> list() {
        return recurrentExpenseRepository.findAll();
    }

    @Override
    public void prePost(RecurrentExpense entity) {

    }

    @Override
    public void prePut(RecurrentExpense entity) {

    }
    public void validateLogic(){

    }
}
