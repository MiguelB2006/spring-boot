package com.ejerciciosSql.sqlex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejerciciosSql.sqlex.models.Usuario;
@Repository

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}