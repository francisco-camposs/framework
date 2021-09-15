package br.ufrn.imd.Framework.abstracts;

import br.ufrn.imd.Framework.model.AppUser;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
public abstract class Income extends AbstractEntity{

    private Double value;

}
