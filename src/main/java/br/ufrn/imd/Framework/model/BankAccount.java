package br.ufrn.imd.Framework.model;

import br.ufrn.imd.Framework.abstracts.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = BankAccount.SNAKE_NAME)
public class BankAccount extends AbstractEntity {
    public static final String SNAKE_NAME = "bank_account";
    public static final String CAMEL_NAME = "bankAccount";
    public static final String ID_COLUMN_NAME = SNAKE_NAME + "_id";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = AppUser.ID_COLUMN, nullable = false)
    private UUID id;

    private String number;

    private String agency;

    @ManyToOne
    @JoinColumn(name = Bank.ID_COLUMN_NAME)
    private Bank bank;

}
