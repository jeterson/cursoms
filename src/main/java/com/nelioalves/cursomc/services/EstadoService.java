package com.nelioalves.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Estado;
import com.nelioalves.cursomc.dto.EstadoDTO;
import com.nelioalves.cursomc.repositories.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository estadoRepository;
	
	
	public List<Estado> findAll(){
		return estadoRepository.findAllByOrderByNome();
	}
	
	public Estado find(Integer id) {
		return estadoRepository.findOne(id);
	}
	
	public EstadoDTO toDTO(Estado obj) {
		return new EstadoDTO(obj);
	}
}
