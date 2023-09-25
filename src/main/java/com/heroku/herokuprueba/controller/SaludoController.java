package com.heroku.herokuprueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.heroku.herokuprueba.service.SaludoService;

@RestController
public class SaludoController {
	
	@Autowired
	private SaludoService saludoService;
	
	@RequestMapping(value = "saludos", method = RequestMethod.GET)
	public ResponseEntity<String> saludar(@RequestParam(name = "nombre") String nombre){
		return saludoService.saludo(nombre);
	}

}
