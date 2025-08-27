CREATE TABLE item_pedido (
                        id SERIAL PRIMARY KEY,
                        pedido_id INTEGER NOT NULL,
                        produto_id INTEGER NOT NULL,
                        quantidade INTEGER NOT NULL,
                        preco_unitario NUMERIC(10, 2) NOT NULL,
                        CONSTRAINT fk_item_pedido FOREIGN KEY (pedido_id) REFERENCES pedido(id),
                        CONSTRAINT fk_item_produto FOREIGN KEY (produto_id) REFERENCES produto(id)
);
