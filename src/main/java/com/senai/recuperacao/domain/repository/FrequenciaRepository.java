package com.senai.recuperacao.domain.repository;

import com.senai.recuperacao.domain.entities.Frequencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrequenciaRepository extends JpaRepository<Frequencia, Long> {
}
