package com.olivertag.blueidffclean.infrastructure;

import com.olivertag.blueidffclean.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Este método foi incluído especificamente para demonstrar o uso do Diffblue Cover.
 * A ideia é mostrar como a ferramenta consegue gerar testes unitários automaticamente
 * para métodos com lógica de negócio simples, como consultas dinâmicas por nome.
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByNomeContainingIgnoreCase(String nome);
}
