package com.senai.recuperacao.domain.service;

import com.senai.recuperacao.domain.entities.Turma;
import com.senai.recuperacao.domain.repository.TurmaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TurmaService {
    private TurmaRepository turmaRepository;

    public Turma Cadastrar(Turma turma){
        return turmaRepository.save(turma);
    }
}
