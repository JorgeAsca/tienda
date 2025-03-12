package com.jj.tienda.Controllers;

import com.jj.tienda.Models.Services.ProductosServices;
import com.jj.tienda.Models.Entity.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ProductosController {
    @Autowired
    private ProductosServices productosService;

    @GetMapping("/productos")
    public String getProductos(Model modelo) {
        List<Productos> productos = this.productosService.getAll();
        modelo.addAttribute("Lproductos", productos);
        return "/www/productos/listar";
    }

}