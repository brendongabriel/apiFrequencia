package com.senai.recuperacao.domain.service;

import com.senai.recuperacao.domain.entities.Aluno;
import com.senai.recuperacao.domain.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service
public class AlunoService {
    private AlunoRepository alunoRepository;

    @Transactional
    public Aluno cadastrar(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public List<Aluno> listar(){
        return alunoRepository.findAll();
    }

    public void remover(Long n_Matricula){
        alunoRepository.deleteById(n_Matricula);
    }

    public Aluno buscar(Long n_Matricula) {
        return alunoRepository.findById(n_Matricula).orElseThrow();
    }

    public Aluno editar(Long n_Matricula, Aluno aluno){
        Aluno newAluno = aluno;
        newAluno.setN_Matricula(n_Matricula);
        return alunoRepository.save(newAluno);
    }


}
