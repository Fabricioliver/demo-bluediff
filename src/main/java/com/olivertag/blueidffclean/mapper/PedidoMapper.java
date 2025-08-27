package com.olivertag.blueidffclean.mapper;

import com.olivertag.blueidffclean.domain.Cliente;
import com.olivertag.blueidffclean.domain.ItemPedido;
import com.olivertag.blueidffclean.domain.Pedido;
import com.olivertag.blueidffclean.domain.Produto;
import com.olivertag.blueidffclean.dto.PedidoRequest;

import java.util.List;
import java.util.stream.Collectors;

public class PedidoMapper {

    public static Pedido toEntity(PedidoRequest dto) {
        Pedido pedido = new Pedido();
        pedido.setData(dto.getData());

        Cliente cliente = new Cliente();
        cliente.setId(dto.getClienteId());
        pedido.setCliente(cliente);

        List<ItemPedido> itens = dto.getItens().stream().map(itemDto -> {
            ItemPedido item = new ItemPedido();
            item.setQuantidade(itemDto.getQuantidade());
            item.setPrecoUnitario(itemDto.getPrecoUnitario());

            Produto produto = new Produto();
            produto.setId(itemDto.getProdutoId());
            item.setProduto(produto);

            item.setPedido(pedido); // associa o pedido ao item
            return item;
        }).collect(Collectors.toList());

        pedido.setItens(itens);
        return pedido;
    }
}
