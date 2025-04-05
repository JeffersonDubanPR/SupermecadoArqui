package com.example.Supermecado.Controller;

import com.example.Supermecado.Servicie.EmpleadoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class Empleado {

    private final EmpleadoService empleadoService;

    public Empleado(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping
    public List<Empleado> listarEmpleados() {
        return empleadoService.listarEmpleados();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empleado> obtenerEmpleado(@PathVariable Long id) {
        return ResponseEntity.of(empleadoService.obtenerEmpleado(id));
    }

    @PostMapping
    public Empleado crearEmpleado(@RequestBody Empleado empleado) {
        return empleadoService.guardarEmpleado(empleado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Empleado> actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado empleado) {
        return ResponseEntity.of(empleadoService.actualizarEmpleado(id, empleado));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEmpleado(@PathVariable Long id) {
        empleadoService.eliminarEmpleado(id);
        return ResponseEntity.noContent().build();
    }

   

    public void getClass(Object salario) {
    }

    public void toString(Object cargo) {
    }


    public Empleado getNombre() {
        return null;
    }

    public Object getCargo() {
        return null;
    }

    public Object getSalario() {
        return null;
    }
}

