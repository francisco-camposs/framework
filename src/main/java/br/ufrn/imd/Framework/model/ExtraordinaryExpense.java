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

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = ExtraordinaryExpense.SNAKE_CASE)
public class ExtraordinaryExpense extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = RecurrentExpense.ID_COLUMN, nullable = false)
    private UUID id;

    public final static String CAMEL_CASE = "extraordinaryExpense";
    public final static String SNAKE_CASE = "extraordinary_expense";
    public final static String ID_COLUMN = "id_" + SNAKE_CASE;

    private LocalDateTime date;

}
