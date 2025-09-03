package com.eafit.nutrition.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eafit.nutrition.model.Medicion;
import com.eafit.nutrition.repository.MedicionRepository;
import com.eafit.nutrition.repository.NutricionistaRepository;
import com.eafit.nutrition.repository.PacienteRepository;
@Service
public class MedicionServiceAutowired {

    // Inyección de dependencias a nivel de campo usando @Autowired
    @Autowired
    private MedicionRepository medicionRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private NutricionistaRepository nutricionistaRepository;

    @Transactional(readOnly = true)
    public List<Medicion> findAll() {
    return medicionRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Medicion> findById(Long id) {
    return medicionRepository.findById(id);
    }


}