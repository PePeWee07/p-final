package com.example.demo.infraestructura.repositorio;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer>{
}
