package br.ufrn.imd.Framework.repository;

import br.ufrn.imd.Framework.model.RecurrentExpense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RecurrentExpenseRepository extends JpaRepository<RecurrentExpense, UUID> {
}
