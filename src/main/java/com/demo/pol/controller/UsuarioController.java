package com.demo.pol.controller;

import com.demo.pol.model.Dependencia;
import com.demo.pol.model.Perfil;
import com.demo.pol.model.Usuario;
import com.demo.pol.service.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class UsuarioController {

    /*
    Created by: Jonathan Burgos
    Date: 07/04/2022
    * */

    @Autowired
    UsuarioServiceImpl usuarioService;

    @RequestMapping("/all")
    public ArrayList<Usuario> getAllUsers(){
        return (ArrayList<Usuario>) usuarioService.obtenerUsuarios();
    }

    @PostMapping("/user/save")
    public Usuario saveUser(@RequestBody Usuario usuario){
        return usuarioService.guardarUsuario(usuario);
    }

    @RequestMapping("/user/{id}")
    public Optional<Usuario> getUserById(@PathVariable("id") Long id){
        return usuarioService.obtenerUsuarioPorId(id);
    }

    @DeleteMapping("/user/delete/{id}")
    public Boolean deleteUserById(@PathVariable("id") Long id){
        return usuarioService.eliminarUsuario(id);
    }

    @RequestMapping("/dependence")
    public List<Dependencia> getDependence(){
        return Arrays.asList(Dependencia.values());
    }

    @RequestMapping("/profile")
    public List<Perfil> getProfile(){
        return Arrays.asList(Perfil.values());
    }

}
