package com.nelioalves.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Cidade;
import com.nelioalves.cursomc.domain.Estado;
import com.nelioalves.cursomc.dto.CidadeDTO;
import com.nelioalves.cursomc.repositories.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EstadoService estadoService;
	
	public List<Cidade> findCidadesByEstado(Integer idEstado){
		Estado estado = estadoService.find(idEstado);
		List<Cidade> cidades = cidadeRepository.findByEstado(estado);
		return cidades;
	}
	
	public CidadeDTO toDTO(Cidade cidade){
		return new CidadeDTO(cidade);
	}
}
