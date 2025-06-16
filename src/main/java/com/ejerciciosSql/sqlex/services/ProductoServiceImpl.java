package com.ejerciciosSql.sqlex.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejerciciosSql.sqlex.models.Producto;
import com.ejerciciosSql.sqlex.repositories.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepo;

    @Override
    public List<Producto> obtenerTodos() {
        return productoRepo.findAll();
    }

    @Override
    public Producto guardar(Producto producto) {
        return productoRepo.save(producto);
    }

    @Override
    public Optional<Producto> buscarPorId(Long id) {
        return productoRepo.findById(id);
    }

    @Override
    public Producto actualizar(Long id, Producto producto) {
        Optional<Producto> productoExistente = productoRepo.findById(id);
        if (productoExistente.isPresent()) {
            Producto p = productoExistente.get();
            p.setNombreProducto(producto.getNombreProducto());
            p.setPrecio(producto.getPrecio());
            p.setStock(producto.getStock());
            return productoRepo.save(p);
        } else {
            return null;
        }
    }

    @Override
    public void eliminar(Long id) {
        productoRepo.deleteById(id);
    }
}
