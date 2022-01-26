package com.senai.recuperacao.domain.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private Long    n_Matricula;

    private String  nome;

    private Long    turma;

}
