package br.ufrn.imd.Framework.model;

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
@Table(name = RecurrentExpense.SNAKE_CASE)
public class RecurrentExpense {

    public final static String CAMEL_CASE = "recurrentExpense";
    public final static String SNAKE_CASE = "extraordinary_expense";
    public final static String ID_COLUMN = "id_" + SNAKE_CASE;

    private LocalDateTime start;

    private LocalDateTime end;

    private Long period;

    private TimeUnit unit;


}
