package dtos;

public class DisciplinaDtos {
	
	private String nome;
	private int likes;
	private double[] notas;
	
	public DisciplinaDtos() {
		super();
	}
	
	public DisciplinaDtos(String nome, double [] notas) {
		super();
		this.nome = nome;
		this.likes = 0;
		this.notas = notas;
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

	public void setNotas(double [] notas) {
		this.notas = notas;
	}
	
	public double[] getNotas() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

}
