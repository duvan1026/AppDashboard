package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuaioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){

        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Duvan");
        usuario.setApellido("Castro");
        usuario.setEmail("duvancastro1026@gmail.com");
        usuario.setTelefono("3156802266");
        usuario.setPassword("12345");
        return usuario;

    }

    @RequestMapping(value = "usuario1")
    public Usuario editar(){

        Usuario usuario = new Usuario();
        usuario.setNombre("Duvan");
        usuario.setApellido("Castro");
        usuario.setEmail("duvancastro1026@gmail.com");
        usuario.setTelefono("3156802266");
        usuario.setPassword("12345");
        return usuario;

    }

    @RequestMapping(value = "usuario2")
    public Usuario eliminar(){

        Usuario usuario = new Usuario();
        usuario.setNombre("Duvan");
        usuario.setApellido("Castro");
        usuario.setEmail("duvancastro1026@gmail.com");
        usuario.setTelefono("3156802266");
        usuario.setPassword("12345");
        return usuario;

    }

    @RequestMapping(value = "usuario3")
    public Usuario buscar(){

        Usuario usuario = new Usuario();
        usuario.setNombre("Duvan");
        usuario.setApellido("Castro");
        usuario.setEmail("duvancastro1026@gmail.com");
        usuario.setTelefono("3156802266");
        usuario.setPassword("12345");
        return usuario;

    }
}
