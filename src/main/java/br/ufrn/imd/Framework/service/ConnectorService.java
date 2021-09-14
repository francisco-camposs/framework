package br.ufrn.imd.Framework.service;

import br.ufrn.imd.Framework.abstracts.Expense;
import br.ufrn.imd.Framework.abstracts.Income;
import br.ufrn.imd.Framework.model.Investment;

import java.math.BigDecimal;
import java.util.List;

public interface ConnectorService {

    List<Expense> getExpenses();

    List<Income> getIncomes();

    List<Investment> getInvestments();

    BigDecimal getValue();

}
