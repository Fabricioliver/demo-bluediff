package com.olivertag.blueidffclean.controller;

import com.olivertag.blueidffclean.application.ItemPedidoService;
import com.olivertag.blueidffclean.domain.ItemPedido;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ItensPedidos")
public class ItemPedidoController {

    private final ItemPedidoService ItemPedidoService;

    public ItemPedidoController(ItemPedidoService ItemPedidoService) {
        this.ItemPedidoService = ItemPedidoService;
    }

    @GetMapping("/listarTodos")
    public ResponseEntity<List<ItemPedido>> listarTodos() {
        List<ItemPedido> itemPedidos = ItemPedidoService.listarTodos();
        return ResponseEntity.ok(itemPedidos);
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<ItemPedido>> buscarPorNome(@RequestParam String nome) {
        return ResponseEntity.ok(ItemPedidoService.listarTodos());
    }

    @PostMapping("/salvar")
    public ResponseEntity<ItemPedido> salvar(@RequestBody ItemPedido itemPedido) {
        ItemPedido salvo = ItemPedidoService.salvar(itemPedido);
        return ResponseEntity.ok(salvo);
    }
}
