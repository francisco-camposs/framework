package br.ufrn.imd.Framework.service;

import br.ufrn.imd.Framework.dto.CalculateTaxDTO;
import br.ufrn.imd.Framework.interfaces.RegisterTaxRule;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CalculateTaxClass {

    private RegisterTaxRule registerTaxRule;

    public CalculateTaxDTO getTax(){
        return registerTaxRule.calculate();
    }
}
