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
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = AppUser.ID_COLUMN, nullable = false)
    private UUID id;

    private BigDecimal value;

    @ManyToOne
    @JoinColumn(name = AppUser.ID_COLUMN, nullable = false)
    private AppUser user;
}
