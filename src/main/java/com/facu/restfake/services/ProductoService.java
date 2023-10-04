package com.facu.restfake.services;


import com.facu.restfake.entities.Producto;

import java.util.List;


public interface ProductoService extends BaseService<Producto,Long> {
    List<Producto> buscarPorPrecioMenor(Double precioMinimo) throws Exception;
    List<Producto> buscarPorPrecioMenor1(Double precioMinimo) throws Exception;
    List<Producto> buscarPorPrecioEntre(Double precioMinimo, Double precioMaximo) throws Exception;
    List<Producto> buscarPorPrecioEntre1(Double precioMinimo, Double precioMaximo) throws Exception;

}


