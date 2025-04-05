package com.example.Supermecado.Servicie;


import com.example.Supermecado.Controller.Empleado;
import com.example.Supermecado.Repositorio.EmpleadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public List<Empleado> listarEmpleados() {
        return empleadoRepository.findAll();
    }

    public Optional<Empleado> obtenerEmpleado(Long id) {
        return empleadoRepository.findById(id);
    }

    public Empleado guardarEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public Optional<Empleado> actualizarEmpleado(Long id, Empleado empleadoActualizado) {
        return empleadoRepository.findById(id).map(empleado -> {
            empleado.crearEmpleado(empleadoActualizado.getNombre());
            empleado.toString(empleadoActualizado.getCargo());
            empleado.getClass(empleadoActualizado.getSalario());
            return empleadoRepository.save(empleado);
        });
    }

    public void eliminarEmpleado(Long id) {
        empleadoRepository.deleteById(id);
    }
}

