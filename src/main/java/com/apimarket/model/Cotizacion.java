package com.apimarket.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "cotizaciones")
public class Cotizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private Usuario ejecutivo;

    @ManyToOne(optional = false)
    private Producto producto;

    @Column(nullable = false)
    private Integer meses;

    @Column(nullable = false)
    private Double montoTotal;

    @Column(nullable = false)
    private LocalDateTime fechaCreacion;

    public Cotizacion() {
    }

    public Cotizacion(Usuario ejecutivo, Producto producto, Integer meses, Double montoTotal) {
        this.ejecutivo = ejecutivo;
        this.producto = producto;
        this.meses = meses;
        this.montoTotal = montoTotal;
        this.fechaCreacion = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public Usuario getEjecutivo() {
        return ejecutivo;
    }

    public void setEjecutivo(Usuario ejecutivo) {
        this.ejecutivo = ejecutivo;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getMeses() {
        return meses;
    }

    public void setMeses(Integer meses) {
        this.meses = meses;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
