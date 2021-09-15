package br.ufrn.imd.Framework.service;

import br.ufrn.imd.Framework.dto.InvestmentDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@AllArgsConstructor
public
class SuggestionInvestmentService {

    private SuggestionAlgorithm algorithm;

    @GetMapping
    public List<InvestmentDTO> suggestions(){
        return algorithm.run();
    }

}
