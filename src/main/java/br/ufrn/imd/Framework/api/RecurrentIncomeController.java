package br.ufrn.imd.Framework.api;


import br.ufrn.imd.Framework.model.RecurrentIncome;
import br.ufrn.imd.Framework.service.RecurrentIncomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/recurrentIncome")
@RequiredArgsConstructor
public class RecurrentIncomeController {

    private final RecurrentIncomeService recurrentIncomeService;

    @GetMapping("/expenses")
    public ResponseEntity<List<RecurrentIncome>> getRecurrentIncome(){ return ResponseEntity.ok().body(recurrentIncomeService.list()); }


    @PostMapping("/save")
    public ResponseEntity<RecurrentIncome> saveRecurrentIncome(@RequestBody RecurrentIncome recurrentIncome){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/recurrentIncome/save").toUriString());
        return ResponseEntity.created(uri).body(recurrentIncomeService.save(recurrentIncome));
    }

    @PostMapping("/edit")
    public ResponseEntity<RecurrentIncome> editRecurrentIncome(@RequestBody RecurrentIncome recurrentIncome){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/recurrentIncome/edit").toUriString());
        return ResponseEntity.created(uri).body(recurrentIncomeService.edit(recurrentIncome));
    }

    @PostMapping("/delete")
    public ResponseEntity<RecurrentIncome> deleteRecurrentIncome(@RequestBody RecurrentIncome recurrentIncome){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/recurrentIncome/edit").toUriString());
        recurrentIncomeService.remove(recurrentIncome);
        return ResponseEntity.created(uri).body(recurrentIncome);
    }



}
