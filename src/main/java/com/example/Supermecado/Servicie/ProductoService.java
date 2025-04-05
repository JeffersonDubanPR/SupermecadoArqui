package com.example.Supermecado.Servicie;

import com.example.Supermecado.Controller.Producto;
import com.example.Supermecado.Repositorio.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    public Optional<Producto> obtenerProducto(Long id) {
        return productoRepository.findById(id);
    }

    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public Optional<Producto> actualizarProducto(Long id, Producto productoActualizado) {
        return productoRepository.findById(id).map(producto -> {
            producto.obtenerProducto(productoActualizado.getNombre());
            producto.getClass(productoActualizado.getPrecio());
            producto.getClass(productoActualizado.getCantidadStock());
            return productoRepository.save(producto);
        });
    }

    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }
}
