package br.ufrn.imd.Framework.api;

import br.ufrn.imd.Framework.interfaces.ControllerInterface;
import br.ufrn.imd.Framework.model.BankAccount;
import br.ufrn.imd.Framework.repository.BankAccountRepository;
import br.ufrn.imd.Framework.service.BankAccountService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bank")
@AllArgsConstructor
public class BankAccountController implements ControllerInterface<BankAccount, BankAccountRepository, BankAccountService> {

    @Getter
    private BankAccountService service;

}
