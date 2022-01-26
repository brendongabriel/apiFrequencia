package com.senai.recuperacao.domain.service;

import com.senai.recuperacao.domain.entities.Aluno;
import com.senai.recuperacao.domain.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class AlunoService {
    private AlunoRepository alunoRepository;

    @Transactional
    public Aluno cadastrar(Aluno aluno) {
        return alunoRepository.save(aluno);
    }
}
