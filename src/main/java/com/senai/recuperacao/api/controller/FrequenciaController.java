package com.senai.recuperacao.api.controller;

import com.senai.recuperacao.domain.entities.Frequencia;
import com.senai.recuperacao.domain.service.FrequenciaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/frequencia")
@AllArgsConstructor
public class FrequenciaController {
    private FrequenciaService frequenciaService;

    @PostMapping("/cadastrar")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Frequencia> CadastrarFrequencia(@RequestBody List<Frequencia> frequencias){
        frequencias.forEach(frequencia -> {
            frequenciaService.cadastrar(frequencia);
        });
        return frequencias;
    }

    @GetMapping("/listar")
    public List<Frequencia> Listar(){
        return frequenciaService.listar();
    }
}
