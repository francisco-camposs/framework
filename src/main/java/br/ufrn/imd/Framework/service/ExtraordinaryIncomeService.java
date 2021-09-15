package br.ufrn.imd.Framework.service;

import br.ufrn.imd.Framework.model.AppUser;
import br.ufrn.imd.Framework.model.ExtraordinaryIncome;
import br.ufrn.imd.Framework.repository.AppUserRepository;
import br.ufrn.imd.Framework.repository.ExtraordinaryIncomeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class ExtraordinaryIncomeService implements IncomeInterface<ExtraordinaryIncome> {

    private final ExtraordinaryIncomeRepository extraordinaryIncomeRepository;

    private final AppUserService appUserService;

    @Override
    public ExtraordinaryIncome save(ExtraordinaryIncome expense) {
        prePost(expense);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        AppUser user = appUserService.getAppUser(authentication.getPrincipal().toString());
        expense.setCreatedBy(user);
        expense.setCreatedAt(LocalDateTime.now());
        return this.extraordinaryIncomeRepository.save(expense);
    }

    @Override
    public void remove(ExtraordinaryIncome expense) {
        prePost(expense);
        extraordinaryIncomeRepository.delete(expense);
    }

    @Override
    public ExtraordinaryIncome edit(ExtraordinaryIncome expense) {
        prePut(expense);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        AppUser user = appUserService.getAppUser(authentication.getPrincipal().toString());
        expense.setEditedBy(user);
        expense.setEditedAt(LocalDateTime.now());
        return extraordinaryIncomeRepository.save(expense);
    }

    @Override
    public ExtraordinaryIncome get(UUID id) { return extraordinaryIncomeRepository.getById(id); }

    @Override
    public List<ExtraordinaryIncome> list() {
        return extraordinaryIncomeRepository.findAll();
    }

    @Override
    public void prePost(ExtraordinaryIncome entity) {

    }

    @Override
    public void prePut(ExtraordinaryIncome entity) {

    }
}
