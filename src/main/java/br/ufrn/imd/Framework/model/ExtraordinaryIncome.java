package br.ufrn.imd.Framework.model;

import br.ufrn.imd.Framework.abstracts.Income;
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
@Table(name = ExtraordinaryIncome.SNAKE_CASE)
public class ExtraordinaryIncome extends Income {

    public final static String CAMEL_CASE = "extraordinaryIncome";
    public final static String SNAKE_CASE = "extraordinary_income";
    public final static String ID_COLUMN = "id_" + SNAKE_CASE;

    private LocalDateTime date;
}
