package br.com.foursys.forum.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.foursys.forum.model.Curso;
import br.com.foursys.forum.repository.CursoRepository;

/**
 * @author João Victor
 * @since 18/05/2021
 * @version 1.0
 */
public class CursoForm {

	@NotNull
	@NotEmpty
	@Length(min = 5)
	private String nome;

	@NotNull
	@NotEmpty
	@Length(min = 5)
	private String categoria;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Curso converter(CursoRepository cursoRepository) {
		return new Curso(nome, categoria);
	}

}
