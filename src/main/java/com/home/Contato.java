package com.home;

public class Contato {
	
	private String id;
	
	private String nome;
	
	private String telefone;
	
	private String status;
	
	private String tipo;
	
	private String numero;
	
	private String categoria;
	
	public Contato() {}
	
	public Contato(String id, String nome, String telefone,
			String status, String numero, String tipo, String categoria) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.status = status;
		this.tipo = tipo;
		this.numero = numero;
		this.categoria = categoria;
	}
	
	public boolean isNovo() {
		return id == null;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}