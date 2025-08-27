package com.olivertag.blueidffclean.application;

import com.olivertag.blueidffclean.domain.Cliente;
import com.olivertag.blueidffclean.infrastructure.ClienteRepository;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Collections;

class ClienteServiceTest {

    @Test
    void testSalvar() {
        ClienteRepository repo = mock(ClienteRepository.class);
        ClienteService service = new ClienteService(repo);

        Cliente cliente = new Cliente();
        cliente.setNome("João");

        when(repo.save(cliente)).thenReturn(cliente);

        Cliente result = service.salvar(cliente);
        assertEquals("João", result.getNome());
    }

    @Test
    void testListarTodos() {
        ClienteRepository repo = mock(ClienteRepository.class);
        ClienteService service = new ClienteService(repo);

        List<Cliente> clientes = Collections.singletonList(new Cliente());
        when(repo.findAll()).thenReturn(clientes);

        List<Cliente> result = service.listarTodos();
        assertEquals(1, result.size());
    }
}
