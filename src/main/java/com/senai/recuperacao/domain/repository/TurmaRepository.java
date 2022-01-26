package com.senai.recuperacao.domain.repository;


import com.senai.recuperacao.domain.entities.Frequencia;
import com.senai.recuperacao.domain.entities.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long>{
}
