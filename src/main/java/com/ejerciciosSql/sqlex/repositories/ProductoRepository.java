package com.ejerciciosSql.sqlex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejerciciosSql.sqlex.models.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
