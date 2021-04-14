package com.mjv.grupo1.livraria.dto;

import java.time.LocalDate;
import java.util.List;

public class LocacaoDto {
	private LocalDate dataAgendamento;
	private LocalDate dataRetirada;
	private String cpf;
	private List<LocacaoItemDto> itens;
	
	public String getCpfCadastro() {
		return cpf;
	}
	public void setCpfCadastro(String cpfCadastro) {
		this.cpf = cpfCadastro;
	}

	public LocalDate getDataRetirada() {
		return dataRetirada;
	}
	public void setDataRetirada(LocalDate dataRetirada) {
		this.dataRetirada = dataRetirada;
	}
	public LocalDate getDataAgendamento() {
		return dataAgendamento;
	}
	public void setDataAgendamento(LocalDate dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public List<LocacaoItemDto> getItens() {
		return itens;
	}
	public void setItens(List<LocacaoItemDto> itens) {
		this.itens = itens;
	}
	
}
	
