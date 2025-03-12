package com.jj.tienda.Models.Entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//La funcion de esta clase + @Entity va a crear la tabla
//Gamas en el SGBD --> Create Table
@Entity
@Table(name = "Productos")
public class Productos {
    
    @Id //primary key
    private String productoid;
    
    @Column(name = "nombre_producto", length=70, nullable = true)
    @NotEmpty
    private String nombre_producto;
    
    @Column(name = "marca", length=200, nullable = true)
    @NotEmpty
    private String marca;
    
    @Column(name = "tipo", length=200, nullable = true)
    @NotEmpty
    private String tipo;
    
    @Column(name = "precio", nullable = true)
    @Min(0)
    private double precio;
    
    @Column(name = "imagen",nullable = true)
    @NotEmpty
    private String imagen;

    @Column(name = "descripcion", length=200, nullable = true)
    @NotEmpty
    private String descripcion;

    public Productos(){}
    public Productos(String productoid, String nombre_producto, String marca, String tipo, double precio, String imagen, String descripcion){
        this.setProductoid(productoid);
        this.setNombre_producto(nombre_producto);
        this.setMarca(marca);
        this.setTipo(tipo);
        this.setPrecio(precio);
        this.setImagen(imagen);
        this.setDescripcion(descripcion);
    }

    public void setProductoid(String id){
        this.productoid = id; 
    }
    public String getProductoid(){
        return this.productoid;
    }

    public void setNombre_producto(String nombre_producto){
        this.nombre_producto = nombre_producto;
    }
    public String getNombre_producto(){
        return this.nombre_producto;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }
    public double getPrecio(){
        return this.precio;
    }

    public void setImagen(String imagen){
        this.imagen = imagen;
    }
    public String getImagen(){
        return this.imagen;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return this.descripcion;
    }

    @Override
    public String toString() {
        return 
                "<" + this.productoid + "," 
                + this.nombre_producto + "," 
                + this.marca + "," 
                + this.tipo + "," 
                + this.precio + "," 
                + this.imagen + "," 
                + this.descripcion + ">";
    }

}