package com.olivertag.blueidffclean.dto;

import java.math.BigDecimal;

public class ItemPedidoRequest {
    private Long produtoId;
    private Integer quantidade;
    private BigDecimal precoUnitario;

    // Getters e setters
    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
