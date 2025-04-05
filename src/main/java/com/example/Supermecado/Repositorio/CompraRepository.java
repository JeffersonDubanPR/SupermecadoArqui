package com.example.Supermecado.Repositorio;

import com.example.Supermecado.Controller.Cliente;
import com.example.Supermecado.Controller.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long> {
    List<Compra> findByClienteId(Long clienteId);
}


