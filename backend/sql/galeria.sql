-- Criar banco de dados e usar
CREATE DATABASE IF NOT EXISTS galeria;
USE galeria;

-- Criar tabela artista
CREATE TABLE artista (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    biografia TEXT,
    data_nascimento DATE
);

-- Criar tabela obra
CREATE TABLE obra (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    descricao TEXT,
    data_criacao DATE,
    imagem_url VARCHAR(255),
    artista_id BIGINT,
    CONSTRAINT fk_obra_artista FOREIGN KEY (artista_id) REFERENCES artista(id)
);

-- Criar tabela exposicao
CREATE TABLE exposicao (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    descricao TEXT,
    data DATE
);

-- Criar tabela associativa exposicao_obra
CREATE TABLE exposicao_obra (
    exposicao_id BIGINT NOT NULL,
    obra_id BIGINT NOT NULL,
    PRIMARY KEY (exposicao_id, obra_id),
    FOREIGN KEY (exposicao_id) REFERENCES exposicao(id),
    FOREIGN KEY (obra_id) REFERENCES obra(id)
);
