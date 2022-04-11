package com.demo.pol.service;

import com.demo.pol.model.Usuario;

import java.util.ArrayList;
import java.util.Optional;

public interface UsuarioService {
    public Optional<Usuario> obtenerUsuarioPorId(Long id);
    public Usuario guardarUsuario(Usuario usuario);
    public ArrayList<Usuario> obtenerUsuarios();
    public boolean eliminarUsuario(Long id);
}
