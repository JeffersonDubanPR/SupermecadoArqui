package com.example.Supermecado.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToMany(mappedBy = "proveedores")
    private List<Producto> productosSuministrados = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getProductosSuministrados() {
        return productosSuministrados;
    }

    public void setProductosSuministrados(List<Producto> productosSuministrados) {
        this.productosSuministrados = productosSuministrados;
    }


    @Override
    public String toString() {
        return "Proveedor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", productosSuministrados=" + productosSuministrados +
                '}';
    }
}
