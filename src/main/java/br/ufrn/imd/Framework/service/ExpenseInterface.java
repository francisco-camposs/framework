package br.ufrn.imd.Framework.service;

import java.util.List;
import java.util.UUID;

public interface ExpenseInterface <T> {
    T save(T expense);
    void remove(T expense);
    T edit(T expense);
    T get(UUID id );
    List<T> list();

    void prePost(T entity);

    void prePut(T entity);
}
