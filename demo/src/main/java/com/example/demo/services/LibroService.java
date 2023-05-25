package com.example.demo.services;

import com.example.demo.model.Libro;
import com.example.demo.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class LibroService {

    @Autowired
    LibroRepository libroRepository;

    public Libro findById(Long id) {
        return libroRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Libro no encontrado"));
    }

    public Libro save(Libro usuario) {
        return libroRepository.save(usuario);
    }
}
