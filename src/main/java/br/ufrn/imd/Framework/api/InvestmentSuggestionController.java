package br.ufrn.imd.Framework.api;

import br.ufrn.imd.Framework.dto.InvestmentDTO;
import br.ufrn.imd.Framework.service.SuggestionInvestmentService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/suggestion/investiment")
@AllArgsConstructor
public class InvestmentSuggestionController {

    @Getter
    private SuggestionInvestmentService service;

    @GetMapping
    public List<InvestmentDTO> get(){
        return this.getService().suggestions();
    }

}
