package com.senai.recuperacao.api.controller;

import com.senai.recuperacao.domain.entities.Frequencia;
import com.senai.recuperacao.domain.service.FrequenciaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
            Frequencia novaFrequencia = frequencia;
            frequenciaService.cadastrar(frequencia);
        });
        return frequencias;
    }



}
