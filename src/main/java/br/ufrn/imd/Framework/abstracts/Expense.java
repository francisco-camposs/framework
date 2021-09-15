package br.ufrn.imd.Framework.abstracts;


import br.ufrn.imd.Framework.model.AppUser;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
@EqualsAndHashCode
public abstract class Expense extends AbstractEntity{

    private BigDecimal value;

}
