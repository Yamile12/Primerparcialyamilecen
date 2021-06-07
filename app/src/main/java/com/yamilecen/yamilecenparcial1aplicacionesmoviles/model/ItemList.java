package com.yamilecen.yamilecenparcial1aplicacionesmoviles.model;

import java.io.Serializable;

public class ItemList implements Serializable {

    private String titulo;
    private String descripcion;
    private int imgResource , imgCaracteristicas;

    public ItemList(String titulo, String descripcion, int imgResource, int imgCaracteristicas){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imgResource = imgResource;
        this.imgCaracteristicas = imgCaracteristicas;

    }

    public String getTitulo(){
        return  titulo;
    }

    public  String getDescripcion(){
        return  descripcion;
    }

    public int getImgResource(){
        return imgResource;
    }

    public int getImgCaracteristicas(){
        return imgCaracteristicas;
    }


}
