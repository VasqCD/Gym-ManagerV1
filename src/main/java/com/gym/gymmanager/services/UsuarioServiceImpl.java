package com.gym.gymmanager.services;

import com.gym.gymmanager.dto.UsuarioRegistroDTO;
import com.gym.gymmanager.model.Rol;
import com.gym.gymmanager.model.Usuario;
import com.gym.gymmanager.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario guardar(UsuarioRegistroDTO registroDTO) {
        Usuario usuario = new Usuario(
                registroDTO.getNombre(),
                registroDTO.getApellido(),
                registroDTO.getEmail(),
                registroDTO.getPassword(), Arrays.asList(new Rol("ROLE_USER")));
        return usuarioRepository.save(usuario);
    }

}
