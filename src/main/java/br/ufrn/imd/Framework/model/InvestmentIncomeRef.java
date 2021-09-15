package br.ufrn.imd.Framework.model;

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
@Table(name = InvestmentIncomeRef.SNAKE_CASE)
public class InvestmentIncomeRef extends Investment {

    public final static String CAMEL_CASE = "investmentIncomeRef";
    public final static String SNAKE_CASE = "investment_income_ref";
    public final static String ID_COLUMN = "id_" + SNAKE_CASE;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = Bank.ID_COLUMN_NAME, nullable = false)
    private UUID id;

}
