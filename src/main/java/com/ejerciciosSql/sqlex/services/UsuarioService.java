package com.ejerciciosSql.sqlex.services;

import com.ejerciciosSql.sqlex.models.Usuario;
import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<Usuario> obtenerTodos();
    Usuario guardar(Usuario usuario);
    Optional<Usuario> buscarPorId(Long id);
    Usuario actualizar(Long id, Usuario usuario);
    void eliminar(Long id);
}
