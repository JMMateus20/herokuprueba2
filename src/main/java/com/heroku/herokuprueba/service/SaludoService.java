package com.heroku.herokuprueba.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SaludoService {
	
	public ResponseEntity<String> saludo(String nombre){
		return ResponseEntity.ok("hola, " + nombre);
	}
	

	
	
}
