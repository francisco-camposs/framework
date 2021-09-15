package br.ufrn.imd.Framework.interfaces;

import br.ufrn.imd.Framework.dto.CalculateTaxDTO;

import java.time.LocalDateTime;

public interface RegisterTaxRule {
    public CalculateTaxDTO calculate(LocalDateTime month, Integer dependentes);

}
