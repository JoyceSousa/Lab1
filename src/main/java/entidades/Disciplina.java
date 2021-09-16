package entidades;

import dtos.DisciplinaDtos; 

public class Disciplina {
	private static long proximoId = 0;
	private Long id;
	private String nome;
	private int likes;
	private double [] notas;
	
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
}
