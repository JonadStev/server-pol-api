package com.demo.pol.repository;

import com.demo.pol.model.Fila;
import com.demo.pol.model.Tarea;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilaRepository extends CrudRepository<Fila, Long> {
}
