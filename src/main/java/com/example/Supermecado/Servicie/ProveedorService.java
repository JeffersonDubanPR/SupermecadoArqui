package com.example.Supermecado.Servicie;

import com.example.Supermecado.Controller.Proveedor;
import com.example.Supermecado.Repositorio.ProveedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProveedorService {

    private final ProveedorRepository proveedorRepository;

    public ProveedorService(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    public List<Proveedor> listarProveedores() {
        return proveedorRepository.findAll();
    }

    public Optional<Proveedor> obtenerProveedor(Long id) {
        return proveedorRepository.findById(id);
    }

    public Proveedor guardarProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    public Optional<Proveedor> actualizarProveedor(Long id, Proveedor proveedorActualizado) {
        return proveedorRepository.findById(id).map(proveedor -> {
            proveedor.clone(proveedorActualizado.getNombre());
            return proveedorRepository.save(proveedor);
        });
    }

    public void eliminarProveedor(Long id) {
        proveedorRepository.deleteById(id);
    }
}
