package com.eafit.nutrition.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eafit.nutrition.model.Nota;

public interface NotaRepository extends JpaRepository<Nota, Long> {
    
    java.util.List<Nota> findByPacienteId(Long pacienteId);
}
