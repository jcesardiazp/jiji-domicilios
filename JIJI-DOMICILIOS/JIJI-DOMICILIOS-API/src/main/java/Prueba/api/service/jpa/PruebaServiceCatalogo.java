package Prueba.api.service.jpa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Prueba.api.entity.Catalogo;
import Prueba.api.repository.PruebaRepositoryCatalogo;
import Prueba.api.service.IPruebaServiceCatalogo;

@Service
public class PruebaServiceCatalogo implements IPruebaServiceCatalogo {

	@Autowired
	private PruebaRepositoryCatalogo repoPrueba;
	
	public List<Catalogo> buscarTodos() {
	
		
		
		return repoPrueba.findAll();
		
	
	}

	public void guardar(Catalogo catalogo) {
	
		
		if(catalogo.getTitulo() == null) {
			
		}
		repoPrueba.save(catalogo);
	}

	public void eliminar(String id) {
		repoPrueba.deleteById(id);
		
	}

}
