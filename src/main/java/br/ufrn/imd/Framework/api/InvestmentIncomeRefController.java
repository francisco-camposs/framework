package br.ufrn.imd.Framework.api;

import br.ufrn.imd.Framework.interfaces.ControllerInterface;
import br.ufrn.imd.Framework.model.InvestmentIncomeRef;
import br.ufrn.imd.Framework.repository.InvestmentIncomeRefRepository;
import br.ufrn.imd.Framework.service.InvestmentIncomeRefService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Getter
@RestController
@RequestMapping("/investment-income")
@AllArgsConstructor
public class InvestmentIncomeRefController implements ControllerInterface<InvestmentIncomeRef, InvestmentIncomeRefRepository, InvestmentIncomeRefService> {

    private InvestmentIncomeRefService service;


}
