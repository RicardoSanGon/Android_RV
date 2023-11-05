package com.example.practica_recycle_view.Models;

public class Carros {
    private String Marca;
    private String Kilometraje;
    private String Precio;

    private String img;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Carros(String marca, int kilometraje, double precio, String img) {
        Marca = marca;
        Kilometraje = String.valueOf(kilometraje)+ " Km";
        Precio = "$"+String.valueOf(precio);
        this.img = img;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        Kilometraje = kilometraje;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        Precio = precio;
    }
}
