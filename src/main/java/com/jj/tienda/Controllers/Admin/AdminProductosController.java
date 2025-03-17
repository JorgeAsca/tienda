package com.jj.tienda.Controllers.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jj.tienda.Models.Entity.Productos;
import com.jj.tienda.Models.Services.ProductosServices;

@Controller
@RequestMapping("/admin/productos")
public class AdminProductosController {

   

    @Autowired
    private ProductosServices productosService;

    
    @ResponseBody
    public ResponseEntity<?> guardarProducto(@RequestBody Productos producto) {
        try {
            Productos nuevoProducto = productosService.guardarProducto(producto); 
            return ResponseEntity.ok(nuevoProducto);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al guardar el producto: " + e.getMessage());
        }
    }

    @GetMapping("/from")
    public String mostrarFormulario(Model model) {
        model.addAttribute("producto", new Productos()); // Producto vacío para el formulario
        return "admin/productos/from"; // Redirige a la vista correcta
    }
}
