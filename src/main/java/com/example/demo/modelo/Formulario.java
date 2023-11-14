package com.example.demo.modelo;




import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.util.List;

public class Formulario {
    @NotBlank
    private String nombre;
    @Size(min = 6, max = 12)
    @Pattern(regexp = "^(?=.*\\d)(?=.*[A-Z])[A-Za-z\\d]{6,12}$")
    private String clave;
    private String pais;
    @NotBlank
    private String descripcion;
    private String genero;
    private String file;
    @NotEmpty
    private List<String> aficiones, musicas;
    private Float puntuacion;
    private Double pi;
    @Min(value = 18)
    private Integer edad;
    @Past
    private LocalDate fecha;

    public Formulario(String nombre,
                      String clave,
                      String pais,
                      String descripcion,
                      String genero,
                      String file,
                      List<String> aficiones,
                      List<String> musicas,
                      Float puntuacion,
                      Double pi,
                      Integer edad,
                      LocalDate fecha) {
        this.nombre = nombre;
        this.clave = clave;
        this.pais = pais;
        this.descripcion = descripcion;
        this.genero = genero;
        this.file = file;
        this.aficiones = aficiones;
        this.musicas = musicas;
        this.puntuacion = puntuacion;
        this.pi = pi;
        this.edad = edad;
        this.fecha = fecha;
    }

    public Formulario() {

    }
    public Float getPuntuacion() {
        return puntuacion;
    }

    public Integer getEdad() {
        return edad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public Double getPi() {
        return pi;
    }

    public String getPais() {
        return pais;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFile() {
        return file;
    }

    public String getGenero() {
        return genero;
    }

    public List<String> getAficiones() {
        return aficiones;
    }

    public List<String> getMusicas() {
        return musicas;
    }

    public void setPuntuacion(Float puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setPi(Double pi) {
        this.pi = pi;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAficiones(List<String> aficiones) {
        this.aficiones = aficiones;
    }

    public void setMusicas(List<String> musicas) {
        this.musicas = musicas;
    }
}
