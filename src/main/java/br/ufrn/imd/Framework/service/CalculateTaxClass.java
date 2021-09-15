package br.ufrn.imd.Framework.service;

import br.ufrn.imd.Framework.dto.CalculateTaxDTO;
import br.ufrn.imd.Framework.interfaces.RegisterTaxRule;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class CalculateTaxClass {

    private RegisterTaxRule registerTaxRule;

    public CalculateTaxDTO getTax(LocalDateTime month, Integer dependentes){
        return registerTaxRule.calculate(month, dependentes);
    }
}
