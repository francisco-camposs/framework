package br.ufrn.imd.Framework.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = ExtraordinaryExpense.SNAKE_CASE)
public class ExtraordinaryExpense {

    public final static String CAMEL_CASE = "extraordinaryExpense";
    public final static String SNAKE_CASE = "extraordinary_expense";
    public final static String ID_COLUMN = "id_" + SNAKE_CASE;

    private LocalDateTime date;
}
