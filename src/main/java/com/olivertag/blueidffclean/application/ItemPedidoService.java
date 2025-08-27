package com.olivertag.blueidffclean.application;

import com.olivertag.blueidffclean.domain.ItemPedido;
import com.olivertag.blueidffclean.infrastructure.ItemPedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemPedidoService {

    private final ItemPedidoRepository itemPedidoRepository;

    public ItemPedidoService(ItemPedidoRepository itemPedidoRepository) {
        this.itemPedidoRepository = itemPedidoRepository;
    }

    public ItemPedido salvar(ItemPedido itemPedido) {
        return itemPedidoRepository.save(itemPedido);
    }

    public List<ItemPedido> listarTodos() {
        return itemPedidoRepository.findAll();
    }


}
