package com.jj.tienda.Models.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jj.tienda.Models.Entity.Productos;
import com.jj.tienda.Models.Repository.ProductosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductosServices {
    
    @Autowired
    private ProductosRepository productosRepository;
    
    public List<Productos> getAll() {
        return productosRepository.findAll();
    }
}

