package br.ufrn.imd.Framework.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InvestmentDTO {

    private String description;

    private String type;

    private BigDecimal expected;

}
