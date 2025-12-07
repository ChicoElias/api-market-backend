package com.apimarket.controller;

import com.apimarket.dto.CotizacionRequest;
import com.apimarket.model.Cotizacion;
import com.apimarket.service.CotizacionService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cotizaciones")
@CrossOrigin
public class CotizacionController {

    private final CotizacionService cotizacionService;

    public CotizacionController(CotizacionService cotizacionService) {
        this.cotizacionService = cotizacionService;
    }

    @PostMapping
    public ResponseEntity<Cotizacion> crear(Authentication authentication,
                                            @Valid @RequestBody CotizacionRequest request) {
        String email = authentication.getName();
        // En un caso real se buscaría el ejecutivo por email,
        // aquí para simplificar se asume id 1L si no se expone endpoint para eso.
        Long ejecutivoId = 1L;
        Cotizacion cotizacion = cotizacionService.crearCotizacion(ejecutivoId, request);
        return ResponseEntity.ok(cotizacion);
    }

    @GetMapping
    public ResponseEntity<List<Cotizacion>> listar() {
        return ResponseEntity.ok(cotizacionService.obtenerTodas());
    }
}
