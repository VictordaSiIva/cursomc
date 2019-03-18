package com.Victor.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Victor.cursomc.domain.Categoria;
import com.Victor.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaSérvice {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id)
	{
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
}
