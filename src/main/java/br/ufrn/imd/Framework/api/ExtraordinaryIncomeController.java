package br.ufrn.imd.Framework.api;

import br.ufrn.imd.Framework.model.ExtraordinaryIncome;
import br.ufrn.imd.Framework.model.RecurrentIncome;
import br.ufrn.imd.Framework.service.ExtraordinaryIncomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/ExtraordinaryIncome")
@RequiredArgsConstructor
public class ExtraordinaryIncomeController {

    private final ExtraordinaryIncomeService extraordinaryIncomeService;

    @GetMapping("/expenses")
    public ResponseEntity<List<ExtraordinaryIncome>> getExtraordinaryIncome(){ return ResponseEntity.ok().body(extraordinaryIncomeService.list()); }

    @PostMapping("/save")
    public ResponseEntity<ExtraordinaryIncome> saveExtraordinaryIncome(@RequestBody ExtraordinaryIncome extraordinaryIncome){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/ExtraordinaryIncome/save").toUriString());
        return ResponseEntity.created(uri).body(extraordinaryIncomeService.save(extraordinaryIncome));
    }

    @PostMapping("/edit")
    public ResponseEntity<ExtraordinaryIncome> editExtraordinaryIncome(@RequestBody ExtraordinaryIncome extraordinaryIncome){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/ExtraordinaryIncome/edit").toUriString());
        return ResponseEntity.created(uri).body(extraordinaryIncomeService.edit(extraordinaryIncome));
    }

    @PostMapping("/delete")
    public ResponseEntity<ExtraordinaryIncome> deleteExtraordinaryIncome(@RequestBody ExtraordinaryIncome extraordinaryIncome){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/ExtraordinaryIncome/edit").toUriString());
        extraordinaryIncomeService.remove(extraordinaryIncome);
        return ResponseEntity.created(uri).body(extraordinaryIncome);
    }
}
