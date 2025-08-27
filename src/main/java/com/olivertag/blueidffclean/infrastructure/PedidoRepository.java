package com.olivertag.blueidffclean.infrastructure;

import com.olivertag.blueidffclean.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    List<Pedido> findByClienteNomeContainingIgnoreCase(String nomeCliente);

}
