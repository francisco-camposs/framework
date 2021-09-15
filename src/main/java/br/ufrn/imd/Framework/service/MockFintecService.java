package br.ufrn.imd.Framework.service;

import br.ufrn.imd.Framework.abstracts.Expense;
import br.ufrn.imd.Framework.model.ExtraordinaryIncome;
import br.ufrn.imd.Framework.model.Investment;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class MockFintecService implements ConnectorService{
    @Override
    public List<Expense> getExpenses() {
        return null;
    }

    @Override
    public List<ExtraordinaryIncome> getIncomes() {
        return getIncomesExtraordinary();
    }

    private List<ExtraordinaryIncome> getIncomesExtraordinary(){
        return new ArrayList<>();
    }

    @Override
    public List<Investment> getInvestments() {
        return null;
    }

    @Override
    public BigDecimal getValue() {
        return null;
    }
}
