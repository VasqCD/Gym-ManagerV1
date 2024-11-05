package com.gym.gymmanager.controllers;

import com.gym.gymmanager.dto.UsuarioRegistroDTO;
import com.gym.gymmanager.model.Usuario;
import com.gym.gymmanager.services.UsuarioService;
import jakarta.persistence.NamedAttributeNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class RegistroUsuarioController {

    private UsuarioService usuarioService;

    public RegistroUsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @ModelAttribute("usuario")
    public UsuarioRegistroDTO nuevoUsuario() {
        return new UsuarioRegistroDTO();
    }

    @GetMapping
    public String mostrarFormularioRegistro() {
        return "registro";
    }

    @PostMapping
    public String registrarUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO usuarioRegistroDTO) {
        usuarioService.guardar(usuarioRegistroDTO);
        return "redirect:/registro?registrado";
    }
}
