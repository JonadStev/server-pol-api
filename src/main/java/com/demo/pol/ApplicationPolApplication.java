package com.demo.pol;

import com.demo.pol.model.*;
import com.demo.pol.repository.FilaRepository;
import com.demo.pol.repository.TareaRepository;
import com.demo.pol.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class ApplicationPolApplication /*implements CommandLineRunner*/ {

	@Autowired
	UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApplicationPolApplication.class, args);
	}


	//@Override
	public void run(String... args) throws Exception {

		/*Tarea tarea = new Tarea();
		tarea.setNombre("Tarea 1");
		Tarea tarea2 = new Tarea();
		tarea2.setNombre("Tarea 2");
		//tareaRepository.save(tarea);
		//tareaRepository.save(tarea2);

		Fila f = new Fila();
		f.setTarea(tarea);
		f.setDuracion(10);
		Fila f2 = new Fila();
		f2.setTarea(tarea2);
		f2.setDuracion(20);

		//filaRepository.save(f);
		//filaRepository.save(f2);

		Usuario u = new Usuario();
		SimpleDateFormat s = new SimpleDateFormat("");
		Date date1=new SimpleDateFormat("yyyy-MM-dd").parse("1995-06-03");
		u.setFechaNacimiento(date1);
		u.setDependencia(Dependencia.DESARROLLO);
		u.setActivo(true);
		//String[] roles = {};
		u.setPerfiles(new String[]{Perfil.ADMINISTRADOR.toString(),Perfil.OPERADOR.toString()});
		List<Fila> filas = new ArrayList<>();
		filas.add(f);
		filas.add(f2);
		u.setFilas(filas);
		usuarioRepository.save(u);*/
		/*
		Long id = 1L;
		Optional<Usuario> u = usuarioRepository.findById(id);
		usuarioRepository.delete(u.get());
		 */

	}


}
