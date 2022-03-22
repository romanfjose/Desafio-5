package com.desafio.transacciones.entity;

import javax.persistence.*;

@Entity
@Table(name = "Persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "alias", nullable = false)
    private String alias;

    public Persona() {
        super();
    }


    public Persona(String nombre, Integer edad, String alias) {
        this.nombre = nombre;
        this.edad = edad;
        this.alias = alias;
    }
    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", alias='" + alias + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }




}
