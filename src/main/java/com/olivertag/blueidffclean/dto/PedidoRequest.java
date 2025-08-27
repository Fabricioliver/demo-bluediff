package com.olivertag.blueidffclean.dto;

import java.time.LocalDate;
import java.util.List;

public class PedidoRequest {
    private LocalDate data;
    private Long clienteId;
    private List<ItemPedidoRequest> itens;

    // Getters e setters
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public List<ItemPedidoRequest> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedidoRequest> itens) {
        this.itens = itens;
    }
}
