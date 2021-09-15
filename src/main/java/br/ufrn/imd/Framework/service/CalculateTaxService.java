package br.ufrn.imd.Framework.service;

import br.ufrn.imd.Framework.dto.CalculateTaxDTO;
import br.ufrn.imd.Framework.interfaces.RegisterTaxRule;
import br.ufrn.imd.Framework.model.AppUser;
import br.ufrn.imd.Framework.model.ExtraordinaryIncome;
import br.ufrn.imd.Framework.repository.AppUserRepository;
import br.ufrn.imd.Framework.repository.ExtraordinaryIncomeRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CalculateTaxService implements RegisterTaxRule {

    @Autowired
    private AppUserService appUserService;

    @Autowired
    private ExtraordinaryIncomeRepository repository;

    @Autowired
    private MockFintecService mockFintecService;


    @Override
    public CalculateTaxDTO calculate(LocalDateTime month, Integer dependentes) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        AppUser user = appUserService.getAppUser(authentication.getPrincipal().toString());

        LocalDateTime inicio = month.withDayOfMonth(1).withDayOfMonth(1);
        LocalDateTime fim = month.plusMonths(1).withDayOfMonth(1).minusDays(1);

        List<ExtraordinaryIncome> incomes = repository.findAllByUserAndDateBetween(user, inicio, fim);
        incomes.addAll(mockFintecService.getIncomes().stream().filter(income -> income.getDate().isAfter(inicio) || income.getDate().isBefore(fim)).collect(Collectors.toList()));

        Double valor = (double) 0;

        for (ExtraordinaryIncome income: incomes)
            valor += income.getValue();

        if ( valor <= 1100.00) {
            valor -= valor * 0.075;
        } else if (valor <= 2203.48) {
            valor -= valor * 0.09;
        } else if (valor <= 3305.22) {
            valor -= valor * 0.12;
        } else if (valor <= 6433.57) {
            valor -= valor * 0.14;
        } else {
            valor -= 751.99;
        }

        valor -= dependentes * 189.59;

        if (valor <= 1903.98){
            return new CalculateTaxDTO(.0);
        } else if (valor <= 2826.66) {
            return new CalculateTaxDTO(valor * 0.075 - 142.8);
        } else if (valor <= 3751.05){
            return new CalculateTaxDTO(valor * 0.15 - 354.8);
        } else if (valor <= 4664.68){
            return new CalculateTaxDTO(valor * 0.225 - 636.13);
        }  else {
            return new CalculateTaxDTO(valor * 0.27 -869.36);
        }
    }
}
