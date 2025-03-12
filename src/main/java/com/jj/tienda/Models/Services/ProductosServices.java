package com.jj.tienda.Models.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jj.tienda.Models.Entity.Productos;
import com.jj.tienda.Models.Repository.ProductosRepository;

@Service
public class ProductosServices {
    @Autowired //inyeccion del codigo del productos Rep
    ProductosRepository productosRep;

    public List<Productos> getAll() {
        //finAll(ORM) = select * from Productos
        List<Productos> productos = this.productosRep.findAll();//5
        return productos;
    }

    public void create(Productos producto){
        this.productosRep.save(producto);
    }

    public void delete (String id){
        this.productosRep.deleteById(id);
    }

    public Productos getId(String id){
        //finByID(ORM) = select * from Productos where productoid=$id
        //el orm transforma el registro devuelto por MYSQL en un objeto Java que
        //se almacena en la variable producto
        Productos producto = this.productosRep.findById(id).get();
        return producto;
    }
}