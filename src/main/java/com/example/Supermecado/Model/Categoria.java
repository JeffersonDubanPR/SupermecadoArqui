package com.example.Supermecado.Model;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity

public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private List<Producto> productos = new ArrayList<>();
}

