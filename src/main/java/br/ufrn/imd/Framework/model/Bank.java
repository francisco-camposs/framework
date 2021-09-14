package br.ufrn.imd.Framework.model;

import br.ufrn.imd.Framework.abstracts.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = Bank.SNAKE_NAME)
public class Bank extends AbstractEntity {
    public static final String SNAKE_NAME = "bank";
    public static final String CAMEL_NAME = "bank";
    public static final String ID_COLUMN_NAME = SNAKE_NAME + "_id";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = Bank.ID_COLUMN_NAME, nullable = false)
    private UUID id;

    private String name;

    private String code;

}
