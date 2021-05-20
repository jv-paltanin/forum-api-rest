package br.com.foursys.forum.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.foursys.forum.model.Usuario;
import br.com.foursys.forum.repository.UsuarioRepository;

/**
 * @author João Victor
 * @since 18/05/2021
 * @version 1.0
 */
public class UsuarioForm {

	@NotNull
	@NotEmpty
	@Length(min = 5)
	private String nome;

	@NotNull
	@NotEmpty
	@Length(min = 15)
	private String email;

	@NotNull
	@NotEmpty
	@Length(min = 10)
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Usuario converter(UsuarioRepository usuarioRepository) {
		return new Usuario(nome, email, senha);
	}

}
