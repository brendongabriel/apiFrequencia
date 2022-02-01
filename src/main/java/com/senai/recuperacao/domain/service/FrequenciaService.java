package com.senai.recuperacao.domain.service;

import com.senai.recuperacao.domain.entities.Frequencia;
import com.senai.recuperacao.domain.repository.FrequenciaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FrequenciaService {
    private FrequenciaRepository frequenciaRepository;
    public Frequencia cadastrar(Frequencia frequencia) {
        return frequenciaRepository.save(frequencia);
    }

    public List<Frequencia> listar() {
        return frequenciaRepository.findAll();
    }
}
