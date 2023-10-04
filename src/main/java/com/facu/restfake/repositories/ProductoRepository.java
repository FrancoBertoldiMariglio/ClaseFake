package com.facu.restfake.repositories;



import com.facu.restfake.entities.Producto;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends BaseRepository<Producto, Long> {

//    Puedes crear una consulta personalizada en tu repositorio ProductoRepository para buscar y
//    filtrar por el campo price en la base de datos, buscando los productos cuyo precio sea mayor a 1000.

    @Query("SELECT p FROM Producto p WHERE p.price > :precioMinimo")
    List<Producto> buscarPorPrecioMenor(@Param("precioMinimo") Double precioMinimo);

    @Query(
            value = "SELECT * FROM Producto WHERE Producto.price > :precioMinimo",
            nativeQuery = true
    )
    List<Producto> buscarPorPrecioMenor1(@Param("precioMinimo") Double precioMinimo);

//    Puedes crear una consulta personalizada en tu repositorio ProductoRepository para buscar y
//    filtrar por el campo price en la base de datos, buscando los productos cuyo precio sea mayor a 1000 y
//    menor que 5000

    @Query("SELECT p FROM Producto p WHERE p.price > :precioMinimo AND p.price < :precioMaximo")
    List<Producto> buscarPorPrecioEntre(@Param("precioMinimo") Double precioMinimo, @Param("precioMaximo") Double precioMaximo);

    @Query(
            value = "SELECT * FROM Producto WHERE Producto.price > :precioMinimo AND Producto.price < :precioMaximo",
            nativeQuery = true
    )
    List<Producto> buscarPorPrecioEntre1(@Param("precioMinimo") Double precioMinimo, @Param("precioMaximo") Double precioMaximo);

}
