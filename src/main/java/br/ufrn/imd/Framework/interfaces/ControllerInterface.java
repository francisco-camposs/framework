package br.ufrn.imd.Framework.interfaces;

import br.ufrn.imd.Framework.abstracts.AbstractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

public interface ControllerInterface<
        E extends AbstractEntity,
        R extends JpaRepository<E, UUID>,
        S extends ServiceInterface<E, R>> {

    S getService();

    @GetMapping("/{id}")
    default E get(@PathVariable UUID id){ return this.getService().findById(id);
    }

    @GetMapping("page/{id}")
    default List<E> getPagedContent(@PathVariable Long id){ return this.getService().findPagedContent(id); }

    @GetMapping
    default List<E> get(){
        return this.getService().findAll();
    }

    @PostMapping
    default E post(@RequestBody E entity){
       return this.getService().post(entity);
    }

    @PutMapping
    default E put(@RequestBody E entity){
        return this.getService().put(entity);
    }

    @DeleteMapping
    default void delete(@RequestParam UUID id){
        this.getService().delete(id);
    }

}
