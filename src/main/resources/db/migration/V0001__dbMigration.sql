
CREATE TABLE alunos (

    n_Matricula bigint not null auto_increment,
    nome varchar(100) not null,
    telefone bigint not null,
    idade bigint not null,
    primary key(n_Matricula)
);

CREATE TABLE frequencia (
    id_frequencia bigint not null auto_increment,
    dia DATE not null,
    aluno bigint not null ,
    frequencia boolean not null,
    primary key(id_frequencia)

);

ALTER TABLE frequencia ADD CONSTRAINT fk_alunos_frequencia
FOREIGN KEY (aluno) REFERENCES alunos (n_Matricula);

