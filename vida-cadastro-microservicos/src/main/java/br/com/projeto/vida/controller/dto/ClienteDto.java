package br.com.projeto.vida.controller.dto;

import br.com.projeto.vida.model.ClientesModel;

public class ClienteDto {

	private Long codigo;
	private String nome;
	private String cpf;
	private String tipoHabilitacao;
	private String email;

	public ClienteDto(String nome, String cpf, String tipoHabilitacao, String email) {
		
	}

	public ClienteDto(ClientesModel clientesModel) {
		this.nome = clientesModel.getNome();
		this.cpf = clientesModel.getCpf();
		this.tipoHabilitacao = clientesModel.getTipoHabilitacao();
		this.email = clientesModel.getEmail();
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTipoHabilitacao() {
		return tipoHabilitacao;
	}

	public void setTipoHabilitacao(String tipoHabilitacao) {
		this.tipoHabilitacao = tipoHabilitacao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
