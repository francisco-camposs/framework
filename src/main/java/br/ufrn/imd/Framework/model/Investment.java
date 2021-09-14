package br.ufrn.imd.Framework.model;

import br.ufrn.imd.Framework.abstracts.AbstractEntity;
import br.ufrn.imd.Framework.enuns.InvestimentType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class Investment extends AbstractEntity {

    private BigDecimal value;

    private String Description;

    private LocalDateTime start;

    private LocalDateTime end;

    private String type;

}
