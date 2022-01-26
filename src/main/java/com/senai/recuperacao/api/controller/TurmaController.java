package com.senai.recuperacao.api.controller;

import com.senai.recuperacao.domain.entities.Aluno;
import com.senai.recuperacao.domain.entities.Frequencia;
import com.senai.recuperacao.domain.entities.Turma;
import com.senai.recuperacao.domain.service.TurmaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turma")
@AllArgsConstructor
public class TurmaController {

    private TurmaService turmaService;

    @PostMapping("/cadastrar")
    @ResponseStatus(HttpStatus.CREATED)
    public Turma cadastrar(@RequestBody Turma turma){
        Turma novaTurma = turmaService.Cadastrar(turma);
        return novaTurma;
    }

}
