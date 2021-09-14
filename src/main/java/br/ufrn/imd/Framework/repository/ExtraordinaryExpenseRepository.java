package br.ufrn.imd.Framework.repository;

import br.ufrn.imd.Framework.model.ExtraordinaryExpense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ExtraordinaryExpenseRepository extends JpaRepository<ExtraordinaryExpense, UUID> {
}
