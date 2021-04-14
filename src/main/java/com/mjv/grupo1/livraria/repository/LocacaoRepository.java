package com.mjv.grupo1.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjv.grupo1.livraria.model.rental.Locacao;

public interface LocacaoRepository extends JpaRepository<Locacao, Integer>{
	
	Locacao findByCadastroCpf(String cpf);
	
}
