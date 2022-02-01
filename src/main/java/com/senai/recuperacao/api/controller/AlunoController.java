package com.senai.recuperacao.api.controller;

import com.senai.recuperacao.domain.entities.Aluno;
import com.senai.recuperacao.domain.service.AlunoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
@AllArgsConstructor
public class AlunoController {
    private AlunoService alunoService;

    @PostMapping("/cadastrar")
    @ResponseStatus(HttpStatus.CREATED)
    public Aluno cadastrar(@RequestBody Aluno aluno){
        Aluno novoAluno = alunoService.cadastrar(aluno);
        return novoAluno;
    }

    @GetMapping("/listar")
    public List<Aluno> listar(){
        return alunoService.listar();
    }

    @DeleteMapping("/delete/{n_Matricula}")
    public void delete(@PathVariable Long n_Matricula){
         alunoService.remover(n_Matricula);
    }

    @GetMapping("/buscar/{n_Matricula}")
    public Aluno buscar(@PathVariable Long n_Matricula){
        return alunoService.buscar(n_Matricula);
    }

    @PutMapping("/editar/{n_Matricula}")
    public Aluno editar(@PathVariable Long n_Matricula,@RequestBody Aluno aluno ){
        return alunoService.editar(n_Matricula,aluno);
    }

}
