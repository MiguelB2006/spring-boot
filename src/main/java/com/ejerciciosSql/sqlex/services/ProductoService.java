package com.ejerciciosSql.sqlex.services;

import java.util.List;
import java.util.Optional;

import com.ejerciciosSql.sqlex.models.Producto;

public interface ProductoService {
    List<Producto> obtenerTodos();
    Producto guardar(Producto producto);
    Optional<Producto> buscarPorId(Long id);
    Producto actualizar(Long id, Producto producto);
    void eliminar(Long id);
}
