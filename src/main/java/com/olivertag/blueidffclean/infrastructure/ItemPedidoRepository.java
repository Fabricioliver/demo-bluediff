package com.olivertag.blueidffclean.infrastructure;

import com.olivertag.blueidffclean.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {

    //List<ItemPedido> findByNomeContainingIgnoreCase(String nome);

}
