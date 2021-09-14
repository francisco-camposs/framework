package br.ufrn.imd.Framework.api;

import br.ufrn.imd.Framework.interfaces.ControllerInterface;
import br.ufrn.imd.Framework.model.Wallet;
import br.ufrn.imd.Framework.repository.WalletRepository;
import br.ufrn.imd.Framework.service.WalletService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/wallet")
@AllArgsConstructor
public class WalletController implements ControllerInterface<Wallet, WalletRepository, WalletService> {

    @Getter
    private WalletService service;

}
