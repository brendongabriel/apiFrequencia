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
        Date hoje = new Date();
        frequencias.forEach(frequencia -> {
            Frequencia novaFrequencia = frequencia;
            novaFrequencia.setDia(hoje);
            frequenciaService.cadastrar(frequencia);
        });
        return frequencias;
    }
}
