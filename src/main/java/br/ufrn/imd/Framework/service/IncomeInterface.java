package br.ufrn.imd.Framework.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface IncomeInterface<T> {
    T save(T expense);
    void remove(T expense);
    T edit(T expense);
    T get(UUID id );
    List<T> list();

    void prePost(T entity);

    void prePut(T entity);

}
