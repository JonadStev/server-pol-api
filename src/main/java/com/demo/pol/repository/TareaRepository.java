package com.demo.pol.repository;

import com.demo.pol.model.Tarea;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends CrudRepository<Tarea, Long> {
}
