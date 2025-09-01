package com.eafit.nutrition.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eafit.nutrition.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    
    Paciente findByNombre(String nombre);
}
