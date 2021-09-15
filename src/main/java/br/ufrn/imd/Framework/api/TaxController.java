package br.ufrn.imd.Framework.api;

import br.ufrn.imd.Framework.dto.CalculateTaxDTO;
import br.ufrn.imd.Framework.service.CalculateTaxClass;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/tex")
@AllArgsConstructor
public class TaxController {

    private CalculateTaxClass service;

    @GetMapping
    public CalculateTaxDTO get(@RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") LocalDateTime month,
                               @RequestParam int dependentes){
        return service.getTax(month, dependentes);
    }


}
