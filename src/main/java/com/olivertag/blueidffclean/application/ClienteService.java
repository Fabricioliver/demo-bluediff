package com.olivertag.blueidffclean.application;

import com.olivertag.blueidffclean.domain.Cliente;
import com.olivertag.blueidffclean.infrastructure.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 * Este é um teste específico para o Diffblue afim de gerar testes específicos tais como "mock de ClienteRepository" e
 * validação de retorno em ".save() ou .findByNome...()" corretamente. O "buscarPorNome()" vai exemplificar isso.
 */

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> buscarPorNome(String nome) {
        return clienteRepository.findByNomeContainingIgnoreCase(nome);
    }

    public Cliente salvar(Cliente cliente) {
        if (cliente.getNome() == null || cliente.getNome().isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório");
        }
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }
}
