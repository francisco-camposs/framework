package br.ufrn.imd.Framework.service;

import br.ufrn.imd.Framework.abstracts.Expense;
import br.ufrn.imd.Framework.model.ExtraordinaryExpense;
import br.ufrn.imd.Framework.repository.ExtraordinaryExpenseRepository;
import br.ufrn.imd.Framework.repository.ExtraordinaryIncomeRepository;
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
public class ExtraordinaryExpenseService implements ExpenseInterface<ExtraordinaryExpense> {

    private final ExtraordinaryExpenseRepository extraordinaryExpenseRepository;

    @Override
    public ExtraordinaryExpense save(ExtraordinaryExpense expense) {
        prePost(expense);
        return extraordinaryExpenseRepository.save(expense);
    }

    @Override
    public void remove(ExtraordinaryExpense expense) {
        prePost(expense);
        extraordinaryExpenseRepository.delete(expense);
    }

    @Override
    public ExtraordinaryExpense edit(ExtraordinaryExpense expense) {
        prePost(expense);
        return extraordinaryExpenseRepository.save(expense);
    }

    @Override
    public ExtraordinaryExpense get(UUID id) {
        return extraordinaryExpenseRepository.getById(id);
    }

    @Override
    public List<ExtraordinaryExpense> list() {
        return extraordinaryExpenseRepository.findAll();
    }

    @Override
    public void prePost(ExtraordinaryExpense entity) {
    }

    @Override
    public void prePut(ExtraordinaryExpense entity) {

    }
}
