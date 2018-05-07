package com.nelioalves.cursomc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nelioalves.cursomc.domain.Cidade;
import com.nelioalves.cursomc.domain.Estado;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

	@Transactional(readOnly=true)
	List<Cidade> findByEstado(Estado estado);
}
