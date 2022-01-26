CREATE TABLE turmas (

    n_Turma bigint not null ,
    primary key (n_Turma)
);

CREATE TABLE alunos (

    n_Matricula bigint not null auto_increment,
    nome varchar(100) not null,
    turma bigint not null,
    primary key(n_Matricula)
);

CREATE TABLE frequencia (
    id_frequencia bigint not null auto_increment,
    dia DATE not null,
    aluno bigint not null ,
    frequencia boolean not null,
    primary key(id_frequencia)

);

ALTER TABLE alunos ADD CONSTRAINT fk_alunos_turma
FOREIGN KEY (turma) REFERENCES turmas (n_Turma);

ALTER TABLE frequencia ADD CONSTRAINT fk_alunos_frequencia
FOREIGN KEY (aluno) REFERENCES alunos (n_Matricula);

INSERT INTO turmas VALUES ("1");
INSERT INTO turmas VALUES ("2");
