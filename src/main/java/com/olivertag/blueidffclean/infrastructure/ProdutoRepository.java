package com.olivertag.blueidffclean.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olivertag.blueidffclean.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    //List<Produto> findByNomeContainingIgnoreCase(String nome);

}