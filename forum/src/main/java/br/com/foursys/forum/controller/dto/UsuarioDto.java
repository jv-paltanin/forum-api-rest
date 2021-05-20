package br.com.foursys.forum.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.foursys.forum.model.Usuario;

/**
 * Classe responsável por armazenar os atributos devolvidos nas requisições
 * 
 * @author João Victor
 * @since 17/05/2021
 * @version 1.0
 */
public class UsuarioDto {

	private Long id;
	private String nome;
	private String email;
	private String senha;

	public UsuarioDto(Usuario usuario) {
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

	public static List<UsuarioDto> converter(List<Usuario> usuarios) {
		return usuarios.stream().map(UsuarioDto::new).collect(Collectors.toList());
	}

}
