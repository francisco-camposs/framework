package br.ufrn.imd.Framework.model;

import br.ufrn.imd.Framework.abstracts.AbstractEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = RecurrentExpense.SNAKE_CASE)
public class RecurrentExpense extends AbstractEntity {

    public final static String CAMEL_CASE = "recurrentExpense";
    public final static String SNAKE_CASE = "extraordinary_expense";
    public final static String ID_COLUMN = "id_" + SNAKE_CASE;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = RecurrentExpense.ID_COLUMN, nullable = false)
    private UUID id;

    private LocalDateTime start;

    private LocalDateTime end;

    private Long period;

    private TimeUnit unit;


}
