package com.gym.gymmanager.services;

import com.gym.gymmanager.dto.UsuarioRegistroDTO;
import com.gym.gymmanager.model.Usuario;

public interface UsuarioService {

    public Usuario guardar(UsuarioRegistroDTO registroDTO);
}
