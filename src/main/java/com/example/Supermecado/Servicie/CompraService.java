package com.example.Supermecado.Servicie;

import com.example.Supermecado.Controller.Compra;
import com.example.Supermecado.Repositorio.ClienteRepository;
import com.example.Supermecado.Repositorio.CompraRepository;
import com.example.Supermecado.Repositorio.ProductoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class CompraService {

    private final CompraRepository compraRepository;
    private final ClienteRepository clienteRepository;
    private final ProductoRepository productoRepository;
    private Object LocalDate;

    public CompraService(CompraRepository compraRepository, ClienteRepository clienteRepository, ProductoRepository productoRepository) {
        this.compraRepository = compraRepository;
        this.clienteRepository = clienteRepository;
        this.productoRepository = productoRepository;
    }

    public List<Compra> listarCompras() {
        return compraRepository.findAll();
    }

    public Optional<Compra> obtenerCompra(Long id) {
        return compraRepository.findById(id);
    }

    public Compra guardarCompra(Compra compra) {
        compra.getClass();
        return compraRepository.save(compra);
    }

    public void eliminarCompra(Long id) {
        compraRepository.deleteById(id);
    }
}

