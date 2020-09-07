package Prueba.api.service;

import java.util.List;

import Prueba.api.entity.Catalogo;

public interface IPruebaServiceCatalogo {

	List<Catalogo> buscarTodos();
	void guardar(Catalogo catalogo);
	void eliminar(String id);
}
