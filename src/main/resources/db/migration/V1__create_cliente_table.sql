CREATE TABLE cliente (
                         id SERIAL PRIMARY KEY,
                         nome VARCHAR(100) NOT NULL,
                         email VARCHAR(100) NOT NULL UNIQUE,
                         telefone VARCHAR(20),
                         criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
