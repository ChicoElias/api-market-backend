package com.apimarket.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class CotizacionRequest {

    @NotNull
    private Long productoId;

    @NotNull
    @Min(1)
    private Integer meses;

    public CotizacionRequest() {
    }

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public Integer getMeses() {
        return meses;
    }

    public void setMeses(Integer meses) {
        this.meses = meses;
    }
}
