package entidades;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import dtos.DisciplinaDtos; 

public class Disciplina {
	private static long proximoId = 0;
	private Long id;
	private String nome;
	private int likes;
	private double [] notas;
	private ArrayList<String> comentarios = new ArrayList<String>();
	private boolean visibilidade = true;
	
	public Disciplina() {
		super();
	}
	
	public Disciplina (String nome, double [] notas) {
		super();
		this.id = proximoId++;
		this.nome = nome;
		this.likes = 0;
		this.notas = notas;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public double [] getNotas() {
		return notas;
	}

	public void setNotas(double [] notas) {
		this.notas = notas;
	}
	
	public static Disciplina criaDisciplina(DisciplinaDtos disciplina) {
		return new Disciplina(disciplina.getNome(), disciplina.getNotas());
	}

	public String toString() {
		return "Disciplina [id=" + id + ", nome=" + nome + ", likes=" + likes + ", nota=" + "]";
	}

	public boolean getVisibilidade() {
		return visibilidade;
	}

	public Disciplina setVisibilidade(boolean visibilidade) {
		this.visibilidade = visibilidade;
		return null;
	}

	public ArrayList<String> getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentario) {
		this.comentarios.add(comentario);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
