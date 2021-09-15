package br.ufrn.imd.Framework.service;

import br.ufrn.imd.Framework.dto.InvestmentDTO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class MockSugestionService implements SuggestionAlgorithm {

    @Override
    public List<InvestmentDTO> run() {
        List<InvestmentDTO> investments = new ArrayList<>();
        investments.add(new InvestmentDTO("Investimento em imóveis", "IMOVEL", new BigDecimal(10)));
        investments.add(new InvestmentDTO("Investimento na pretrobrás", "ACAO", new BigDecimal(5)));
        return investments;
    }
}
