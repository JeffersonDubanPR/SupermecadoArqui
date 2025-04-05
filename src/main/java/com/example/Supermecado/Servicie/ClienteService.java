package com.example.Supermecado.Servicie;

import com.example.Supermecado.Controller.Cliente;
import com.example.Supermecado.Repositorio.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> obtenerCliente(Long id) {
        return clienteRepository.findById(id);
    }

    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> actualizarCliente(Long id, Cliente clienteActualizado) {
        return clienteRepository.findById(id).map(cliente -> {
            cliente.setEmail(clienteActualizado.getNombre());
            cliente.setEmail(clienteActualizado.getEmail());
            return clienteRepository.save(cliente);
        });
    }



    public void eliminarCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
