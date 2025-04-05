package com.example.Supermecado.Controller;

import com.example.Supermecado.Servicie.CompraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compras")
public class Compra {

    private final CompraService compraService;

    public Compra(CompraService compraService) {
        this.compraService = compraService;
    }

    @GetMapping
    public List<Compra> listarCompras() {
        return compraService.listarCompras();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Compra> obtenerCompra(@PathVariable Long id) {
        return ResponseEntity.of(compraService.obtenerCompra(id));
    }

    @PostMapping
    public Compra registrarCompra(@RequestBody Compra compra) {
        return compraService.guardarCompra(compra);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCompra(@PathVariable Long id) {
        compraService.eliminarCompra(id);
        return ResponseEntity.noContent().build();
    }
}
