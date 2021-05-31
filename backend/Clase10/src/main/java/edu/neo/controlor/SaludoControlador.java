package edu.neo.controlor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.neo.entity.PersonaEntity;
import edu.neo.modelo.Persona;
import edu.neo.modelo.RespuestaEntity;
import edu.neo.repository.PersonaRepository;

@CrossOrigin
@RestController
public class SaludoControlador {

	// spring va a darle la instancia ( new Persona();

	@Autowired
	private PersonaRepository repository;
	
	@Autowired
	private RespuestaEntity respuesta;

	@GetMapping("/saludo")
	public String saludo() {
		return "hola mundo";
	}

	@GetMapping("/getAllPersona")
	public ResponseEntity<?> getAllPersona() {

		try {
			return ResponseEntity.ok(this.repository.findAll());
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}

	}

	@GetMapping("/borrarPersona/{id}")
	public ResponseEntity<?> deletePersona(@PathVariable("id") int id) {

		try {
			
			this.repository.deleteById(id);
			this.respuesta.setMensaje("Elemento borrado");
			return ResponseEntity.ok(this.respuesta);
		} catch (Exception e) {
			this.respuesta.setMensaje("No se puede borrar el id " +  id  + ", porque no existe en la base o ya fue borrado");
			return ResponseEntity.ok(this.respuesta);
		}
	}

	@GetMapping("persona/{id}")
	public ResponseEntity<?> getPersona(@PathVariable("id") int id) {
		try {
			
			return ResponseEntity.ok(this.repository.findById(id).get());
		} catch (Exception e) {
			this.respuesta.setMensaje("id " + id +  ", no encontrado");
			return ResponseEntity.ok(this.respuesta);
		}
	}

	/*
	 * nombre: "pepeito", apellido:"mengano", edad:22
	 */
	@PostMapping("/savePersona")
	public ResponseEntity<?> savePersona(@RequestBody() PersonaEntity persona) {

		this.respuesta.setMensaje("Elemento guardado!");
		this.repository.save(persona);
		return ResponseEntity.ok(this.respuesta);
	}

}
