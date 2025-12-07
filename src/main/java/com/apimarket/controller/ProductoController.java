package com.apimarket.controller;

import com.apimarket.dto.ProductoRequest;
import com.apimarket.model.Producto;
import com.apimarket.service.ProductoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public ResponseEntity<List<Producto>> listar() {
        return ResponseEntity.ok(productoService.obtenerTodos());
    }

    @PostMapping
    public ResponseEntity<Producto> crear(@Valid @RequestBody ProductoRequest request) {
        Producto producto = new Producto(
                request.getNombre(),
                request.getCategoria(),
                request.getPrecioMensual(),
                request.getProveedor()
        );
        return ResponseEntity.ok(productoService.guardar(producto));
    }
}
