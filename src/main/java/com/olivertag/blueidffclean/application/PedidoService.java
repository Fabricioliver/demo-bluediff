package com.olivertag.blueidffclean.application;

import com.olivertag.blueidffclean.domain.Cliente;
import com.olivertag.blueidffclean.domain.ItemPedido;
import com.olivertag.blueidffclean.domain.Pedido;
import com.olivertag.blueidffclean.domain.Produto;
import com.olivertag.blueidffclean.infrastructure.ClienteRepository;
import com.olivertag.blueidffclean.infrastructure.PedidoRepository;
import com.olivertag.blueidffclean.infrastructure.ProdutoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<Pedido> listarTodos() {
        return pedidoRepository.findAll();
    }

    public List<Pedido> buscarPorNomeCliente(String nomeCliente) {
        return pedidoRepository.findByClienteNomeContainingIgnoreCase(nomeCliente);
    }

    public Pedido salvar(Pedido pedido) {
        if (pedido.getCliente() == null || pedido.getCliente().getId() == null) {
            throw new IllegalArgumentException("Cliente inválido.");
        }

        Cliente cliente = clienteRepository.findById(pedido.getCliente().getId())
                .orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado"));
        pedido.setCliente(cliente);

        for (ItemPedido item : pedido.getItens()) {
            Produto produto = produtoRepository.findById(item.getProduto().getId())
                    .orElseThrow(() -> new EntityNotFoundException("Produto não encontrado"));

            item.setProduto(produto);
            item.setPedido(pedido); // vincula o item ao pedido

            item.setPrecoUnitario(produto.getPreco());
            item.setSubtotal(produto.getPreco().multiply(BigDecimal.valueOf(item.getQuantidade())));
        }

        pedido.calcularValorTotal();

        return pedidoRepository.save(pedido);
    }

    public BigDecimal calcularValorTotal(Pedido pedido) {
        return pedido.getItens().stream()
                .map(item -> item.getPrecoUnitario().multiply(BigDecimal.valueOf(item.getQuantidade())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }




}
