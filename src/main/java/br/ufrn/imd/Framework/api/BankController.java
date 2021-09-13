package br.ufrn.imd.Framework.api;

import br.ufrn.imd.Framework.interfaces.ControllerInterface;
import br.ufrn.imd.Framework.model.Bank;
import br.ufrn.imd.Framework.repository.BankRepository;
import br.ufrn.imd.Framework.service.BankService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bank")
@AllArgsConstructor
public class BankController implements ControllerInterface<Bank, BankRepository, BankService> {

    @Getter
    private BankService service;

}
