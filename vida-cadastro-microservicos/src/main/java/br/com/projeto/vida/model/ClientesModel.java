package br.com.projeto.vida.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity(name="clientes")
public class ClientesModel{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@NotNull @NotEmpty
	private String nome;
	@NotNull @NotEmpty 
	private String cpf;
	private String tipoHabilitacao;
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ClientesModel() {

	}

	public ClientesModel(String nome, String cpf, String tipoHabilitacao, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.tipoHabilitacao = tipoHabilitacao;
		this.email = email;
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

}
