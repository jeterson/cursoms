package com.nelioalves.cursomc.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Cidade;
import com.nelioalves.cursomc.domain.Estado;
import com.nelioalves.cursomc.dto.CidadeDTO;
import com.nelioalves.cursomc.dto.EstadoDTO;
import com.nelioalves.cursomc.services.CidadeService;
import com.nelioalves.cursomc.services.EstadoService;

@RestController
@RequestMapping(value="/estados")
public class EstadoResource {

	@Autowired
	private EstadoService service;
	
	@Autowired
	private CidadeService cidadeService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<EstadoDTO>> findAllByOrderByName() {
		List<Estado> obj = service.findAll();
		List<EstadoDTO> listDto = obj.stream().map(o -> new EstadoDTO(o)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	@RequestMapping(value="/{estado_id}/cidades", method=RequestMethod.GET)
	public ResponseEntity<List<CidadeDTO>> findCidades(@PathVariable Integer estado_id) {
		List<Cidade> obj = cidadeService.findCidadesByEstado(estado_id);
		List<CidadeDTO> listDto = obj.stream().map(o -> new CidadeDTO(o)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
}
