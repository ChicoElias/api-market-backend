package com.apimarket.service;

import com.apimarket.dto.CotizacionRequest;
import com.apimarket.model.Cotizacion;
import com.apimarket.model.Producto;
import com.apimarket.model.Usuario;
import com.apimarket.repository.CotizacionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CotizacionService {

    private final CotizacionRepository cotizacionRepository;
    private final ProductoService productoService;
    private final UsuarioService usuarioService;

    public CotizacionService(CotizacionRepository cotizacionRepository,
                             ProductoService productoService,
                             UsuarioService usuarioService) {
        this.cotizacionRepository = cotizacionRepository;
        this.productoService = productoService;
        this.usuarioService = usuarioService;
    }

    @Transactional
    public Cotizacion crearCotizacion(Long ejecutivoId, CotizacionRequest request) {
        Usuario ejecutivo = usuarioService.obtenerUsuarioPorId(ejecutivoId);
        Producto producto = productoService.obtenerPorId(request.getProductoId());

        Double montoTotal = producto.getPrecioMensual() * request.getMeses();

        Cotizacion cotizacion = new Cotizacion(ejecutivo, producto, request.getMeses(), montoTotal);
        return cotizacionRepository.save(cotizacion);
    }

    @Transactional(readOnly = true)
    public List<Cotizacion> obtenerTodas() {
        return cotizacionRepository.findAll();
    }
}
