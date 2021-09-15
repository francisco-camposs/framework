package br.ufrn.imd.Framework.repository;

import br.ufrn.imd.Framework.model.AppUser;
import br.ufrn.imd.Framework.model.ExtraordinaryIncome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Repository
public interface ExtraordinaryIncomeRepository extends JpaRepository<ExtraordinaryIncome, UUID> {

    @Query(value = "SELECT ei FROM ExtraordinaryIncome ei WHERE ei.createdBy = ?1 and ei.date >= ?2 and ei.date <= ?3")
    List<ExtraordinaryIncome> findAllByUserAndDateBetween(AppUser appUser, LocalDateTime inicio, LocalDateTime fim);

}
