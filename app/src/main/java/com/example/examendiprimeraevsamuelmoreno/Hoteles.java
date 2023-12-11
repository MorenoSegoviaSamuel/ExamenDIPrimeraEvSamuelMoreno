package com.example.examendiprimeraevsamuelmoreno;

public class Hoteles {

    private int ImagenResourceId;
    private String nombre;
    private String localizacion;

    public Hoteles(int imagenResource, String nombre, String localizacion) {
        ImagenResourceId = imagenResource;
        this.nombre = nombre;
        this.localizacion = localizacion;
    }

    public int getImagenResourceId() {
        return ImagenResourceId;
    }

    public void setImagenResourceId(int imagenResourceId) {
        ImagenResourceId = imagenResourceId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
}
