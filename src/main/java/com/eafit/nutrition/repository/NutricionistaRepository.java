package com.eafit.nutrition.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eafit.nutrition.model.Nutricionista;

public interface NutricionistaRepository extends JpaRepository<Nutricionista, Long> {
    
    Nutricionista findByEmail(String email);
}