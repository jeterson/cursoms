package com.nelioalves.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
import com.nelioalves.cursomc.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id){
		Categoria obj = repo.findOne(id);
		if(obj == null)
			throw new ObjectNotFoundException("Objeto não encontrado id " + id + ", Tipo: " + Categoria.class.getName());
		
		return obj;
	}
	
	public Categoria insert(Categoria categoria) {
		categoria.setId(null);
		return repo.save(categoria);
	}
	
	public Categoria update(Categoria categoria) {	
		find(categoria.getId());
		return repo.save(categoria);
	}
}
