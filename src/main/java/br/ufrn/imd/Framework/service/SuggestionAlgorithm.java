package br.ufrn.imd.Framework.service;

import br.ufrn.imd.Framework.dto.InvestmentDTO;

import java.util.List;

public interface SuggestionAlgorithm {

    public List<InvestmentDTO> run();

}
