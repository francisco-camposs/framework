package br.ufrn.imd.Framework.model;

import br.ufrn.imd.Framework.abstracts.Income;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = RecurrentIncome.SNAKE_CASE)
public class RecurrentIncome extends Income {

    public final static String CAMEL_CASE = "recurrentIncome";
    public final static String SNAKE_CASE = "recurrent_income";
    public final static String ID_COLUMN = "id_" + SNAKE_CASE;

    private LocalDateTime start;

    private LocalDateTime end;

    private Long period;

    private TimeUnit unit;

}
