package br.ufrn.imd.Framework.service;

import br.ufrn.imd.Framework.dto.InvestmentDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceSugestionClass {

    private SugestionAlgorithm algorithm;

    public List<InvestmentDTO> suggestions(){
        return algorithm.run();
    }

}
