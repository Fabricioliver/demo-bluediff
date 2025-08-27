CREATE TABLE pedido (
                        id SERIAL PRIMARY KEY,
                        cliente_id INTEGER NOT NULL,
                        data_pedido TIMESTAMP NOT NULL,
                        valor_total NUMERIC(10, 2) NOT NULL,
                        CONSTRAINT fk_pedido_cliente FOREIGN KEY (cliente_id) REFERENCES cliente(id)
);
