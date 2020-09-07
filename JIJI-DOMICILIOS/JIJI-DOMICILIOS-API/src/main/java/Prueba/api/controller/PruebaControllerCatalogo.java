package Prueba.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Prueba.api.entity.Catalogo;
import Prueba.api.service.IPruebaServiceCatalogo;

@RestController
@RequestMapping("/jiji")
public class PruebaControllerCatalogo {
	
	@Autowired
	private IPruebaServiceCatalogo servicePrueba;
	
	
	@GetMapping("/catalogo")
	public List<Catalogo> buscarTodos(){
		return servicePrueba.buscarTodos();
	}
	
	@PostMapping("/catalogo") 
	public Catalogo guardar(@RequestBody Catalogo catalogo) {
		System.out.println("ingreso");
		servicePrueba.guardar(catalogo);
		return catalogo;
	}
	

}
