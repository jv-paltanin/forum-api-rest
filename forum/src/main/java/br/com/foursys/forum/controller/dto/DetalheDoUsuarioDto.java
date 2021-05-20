package br.com.foursys.forum.controller.dto;

import br.com.foursys.forum.model.Usuario;

public class DetalheDoUsuarioDto {

	private Long id;
	private String nome;
	private String email;
	private String senha;

	public DetalheDoUsuarioDto(Usuario usuario) {
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.senha = usuario.getSenha();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

}
