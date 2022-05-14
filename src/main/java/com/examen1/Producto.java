package com.examen1 ;

public class Producto {
int prod_id;
String prod_nombre;
float prod_precio;
String prod_marca;

    public void set_id(int id) {
        prod_id = id; 
    }

    public int get_id(){
        return prod_id;
    }
    
    public void set_nombre(String nombre) {
        prod_nombre = nombre; 
    }

    public String get_nombre(){
        return prod_nombre;
    }

    
    public void set_precio(float precio) {
        prod_precio = precio; 
    }

    public float get_precio(){
        return prod_precio;
    }

    
    public void set_marca(String marca) {
        prod_marca = marca; 
    }

    public String get_marca(){
        return prod_marca;
    }
    

    
}