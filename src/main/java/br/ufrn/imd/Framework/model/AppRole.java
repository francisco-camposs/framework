package br.ufrn.imd.Framework.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = AppRole.SNAKE_CASE)
public class AppRole {

    public final static String CAMEL_CASE = "app_role";
    public final static String SNAKE_CASE = "appRole";
    public final static String ID_COLUMN = "id_" + SNAKE_CASE;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = AppRole.ID_COLUMN, nullable = false)
    private UUID id;

    private String name;

}
