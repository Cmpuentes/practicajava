package Entidades;

import java.util.ArrayList;

public class Cancion {
    private int id;
    private String titulo;
    private String fecha;
    private String duracion;
    private String genero;
    private String caratula;
    private String descripcion;

    public Cancion(int id, String titulo, String fecha, String duracion, String genero, String caratula, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
        this.duracion = duracion;
        this.genero = genero;
        this.caratula = caratula;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public String getCaratula() {
        return caratula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", duracion='" + duracion + '\'' +
                ", genero='" + genero + '\'' +
                ", caratula='" + caratula + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
