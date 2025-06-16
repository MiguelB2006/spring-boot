package com.ejerciciosSql.sqlex.models;

import jakarta.persistence.*;

@Entity
//Crear o rastear la tabla usuarios
@Table(name = "usuarios")
public class Usuario {
    //Marcamos Id para que se incremente automaticamente el contador
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Empezamos a crear las columnas que va a tener nuestra tabla
    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String apellido;

    @Column(nullable = false, unique = true ,  length = 60)
    private String email;

    @Column(nullable = false, length = 50)
    private String contrasenia;

    //Creacion de getters y setters
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
 
}

