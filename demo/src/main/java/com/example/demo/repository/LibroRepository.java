package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Libro;

import java.util.Optional;

public interface LibroRepository extends CrudRepository<Libro, Long> {

    Optional<Libro> findByTitulos(String nombres);
    Libro findByTitulo(String correo);
    
}
