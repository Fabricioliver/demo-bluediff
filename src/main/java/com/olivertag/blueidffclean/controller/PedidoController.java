package com.olivertag.blueidffclean.controller;

import com.olivertag.blueidffclean.application.PedidoService;
import com.olivertag.blueidffclean.domain.Pedido;
import com.olivertag.blueidffclean.dto.PedidoRequest;
import com.olivertag.blueidffclean.mapper.PedidoMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping("/listarTodos")
    public ResponseEntity<List<Pedido>> listarTodos() {
        return ResponseEntity.ok(pedidoService.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Pedido> salvar(@RequestBody PedidoRequest pedidoRequest) {
        Pedido pedido = PedidoMapper.toEntity(pedidoRequest); // conversão aqui
        Pedido salvo = pedidoService.salvar(pedido);
        return new ResponseEntity<>(salvo, HttpStatus.CREATED);
    }


}
