package com.apimarket.config;

import com.apimarket.model.Producto;
import com.apimarket.model.Rol;
import com.apimarket.model.Usuario;
import com.apimarket.service.ProductoService;
import com.apimarket.service.UsuarioService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataLoader {

    @Bean
    public CommandLineRunner initData(UsuarioService usuarioService,
                                      ProductoService productoService,
                                      PasswordEncoder passwordEncoder) {
        return args -> {
            if (!usuarioService.existePorEmail("admin@apimarket.cl")) {
                Usuario admin = new Usuario(
                        "Admin",
                        "Principal",
                        "admin@apimarket.cl",
                        passwordEncoder.encode("admin123"),
                        Rol.ADMIN
                );
                usuarioService.guardar(admin);
            }

            if (productoService.obtenerTodos().isEmpty()) {
                productoService.guardar(new Producto("API Pagos", "Finanzas", 250.0, "PayPlus"));
                productoService.guardar(new Producto("API Clima", "Datos", 120.0, "WeatherX"));
                productoService.guardar(new Producto("API Geolocalización", "Datos", 180.0, "GeoTrack"));
            }
        };
    }
}
