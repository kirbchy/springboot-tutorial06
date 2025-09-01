package com.eafit.nutrition.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eafit.nutrition.model.Medicion;


@Repository
public interface MedicionRepository extends JpaRepository<Medicion, Long> {

 List<Medicion> findByPacienteIdOrderByFechaDesc(Long pacienteId);

 Optional<Medicion> findFirstByPacienteIdOrderByFechaDesc(Long pacienteId);
}
